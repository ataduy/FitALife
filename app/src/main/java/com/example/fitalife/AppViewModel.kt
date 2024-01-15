package com.example.fitalife

import android.util.Log
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import com.example.fitalife.data.Event
import com.example.fitalife.data.UserData
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.firestore.FirebaseFirestore
import com.google.firebase.firestore.toObject
import com.google.firebase.storage.FirebaseStorage
import dagger.hilt.android.lifecycle.HiltViewModel
import java.lang.Exception
import javax.inject.Inject

const val USERS = "users"
@HiltViewModel
class AppViewModel @Inject constructor(
    val auth: FirebaseAuth,
    val db: FirebaseFirestore
): ViewModel() {

    val signedIn = mutableStateOf(false)
    val inProgress = mutableStateOf(false)
    val userData = mutableStateOf<UserData?>(null)
    val popupNotification = mutableStateOf<Event<String>?>(null)


    init {
        //auth.signOut()  // auto-logout for debug
        val currentUser = auth.currentUser
        signedIn.value = currentUser !=  null
        currentUser?.uid?.let {uid ->
            getUserData(uid)
        }
    }


    fun onSignup(username: String, name: String, surname: String, email: String, pass: String) {
        if (email.isEmpty() || pass.isEmpty() || name.isEmpty() || surname.isEmpty()) {
            handleException(customMessage = "Please fill in all fields!")
            return
        }

        inProgress.value = true
        db.collection(USERS).whereEqualTo("username", username).get()
            .addOnSuccessListener { documents ->
                if (documents.size() > 0) {
                    handleException(customMessage = "Username already exists!")
                    inProgress.value = false
                } else {
                    auth.createUserWithEmailAndPassword(email, pass)
                        .addOnCompleteListener { task ->
                            if (task.isSuccessful) {
                                signedIn.value = true
                                // Create profile
                                createOrUpdateProfile(username = username, name = name, surname = surname)
                            } else {
                                handleException(task.exception, "Signup failed!")
                            }
                            inProgress.value = false
                        }
                }

            }
            .addOnFailureListener {}

    }


    private fun createOrUpdateProfile(
        username: String? = null,
        name: String? = null,
        surname: String? = null,
        gender: String? = null,
        weight: String? = null,
        height: String? = null,
        age: String? = null,
    ) {
        val uid = auth.currentUser?.uid
        val userData = UserData(
            userId = uid,
            username = username ?: userData.value?.username,
            name = name ?: userData.value?.name,
            surname = surname ?: userData.value?.surname,
            gender = gender ?: userData.value?.gender,
            weight = weight ?: userData.value?.weight,
            height = height ?: userData.value?.height,
            age = age ?: userData.value?.age
        )

        uid?.let { uid ->
            inProgress.value = true
            db.collection(USERS).document(uid).get()
                .addOnSuccessListener {
                    if (it.exists()) {
                        it.reference.update(userData.toMap())
                            .addOnSuccessListener {
                                this.userData.value = userData
                                inProgress.value = false
                            }
                            .addOnFailureListener {
                                handleException(it, "Can not update user")
                                inProgress.value = false
                            }
                    } else {
                        db.collection(USERS).document(uid).set(userData)
                        getUserData(uid)
                    }
                }
                .addOnFailureListener {
                    handleException(it, "Can not create user")
                    inProgress.value = false
                }
        }
    }

    fun updateProfileData(gender: String, weight: String, height: String, age: String) {
        createOrUpdateProfile(username = null, name = null, surname = null, gender, weight, height, age)
    }


    private fun getUserData(uid: String) {
        inProgress.value = true
        db.collection(USERS).document(uid).get()
            .addOnSuccessListener {
                val user = it.toObject<UserData>()
                userData.value = user
                inProgress.value = false
            }
            .addOnFailureListener { exc ->
                handleException(exc, "Can not retrieve user data")
                inProgress.value = false
            }

    }

    fun onLogin(email: String, pass: String) {
        if (email.isEmpty() || pass.isEmpty()) {
            handleException(customMessage = "Please fill in all fields")
            return
        }

        inProgress.value = true
        auth.signInWithEmailAndPassword(email, pass)
            .addOnCompleteListener { task ->
                if(task.isSuccessful) {
                    signedIn.value = true
                    inProgress.value = false
                    auth.currentUser?.uid?.let { uid ->
                        handleException(customMessage = "Login Success")
                        getUserData(uid)
                    }
                } else {
                    handleException(task.exception, "Login failed")
                    inProgress.value = false
                }
            }
            .addOnFailureListener {exc ->
                handleException(exc, "Login failed")
                inProgress.value = false
            }
    }

    fun onLogout() {
        auth.signOut()
        signedIn.value = false
        userData.value = null
        popupNotification.value = Event("Logged out")
    }


    fun handleException(exception: Exception? = null, customMessage: String? = "") {
        exception?.printStackTrace()
        val errorMsg = exception?.localizedMessage ?: ""
        val message = if (customMessage!!.isEmpty()) errorMsg else "$customMessage $errorMsg"
        popupNotification.value = Event(message)
    }


    /************************** RUN TIME VIEWMODEL ******************************/

    private var _currentTime = 0L
    val currentTime: Long get() = _currentTime

    private var _laps = listOf<String>()
    val laps: List<String> get() = _laps
    fun startTimer() {
        _currentTime = System.currentTimeMillis()

    }

    fun stopTimer() {
        _currentTime = 0L
    }

    fun updateTime(elapsedTime: Long) {
        _currentTime = elapsedTime
    }

    fun formatTime(timeInMillis: Long): String {
        val minutes = (timeInMillis / (1000 * 60)) % 60
        val seconds = (timeInMillis / 1000) % 60
        val milliseconds = timeInMillis % 100

        return String.format(
            "%02d:%02d,%02d",
            minutes,
            seconds,
            milliseconds
        )
    }
    /************************** RUN TIME VIEWMODEL ******************************/

}