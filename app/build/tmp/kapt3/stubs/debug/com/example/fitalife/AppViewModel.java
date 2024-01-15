package com.example.fitalife;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\f\b\u0007\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\\\u0010#\u001a\u00020$2\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010&\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\'\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010(\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010)\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010*\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010+\u001a\u0004\u0018\u00010\u000bH\u0002J\u000e\u0010,\u001a\u00020\u000b2\u0006\u0010-\u001a\u00020\bJ\u0010\u0010\"\u001a\u00020$2\u0006\u0010.\u001a\u00020\u000bH\u0002J\u001e\u0010/\u001a\u00020$2\n\b\u0002\u00100\u001a\u0004\u0018\u0001012\n\b\u0002\u00102\u001a\u0004\u0018\u00010\u000bJ\u0016\u00103\u001a\u00020$2\u0006\u00104\u001a\u00020\u000b2\u0006\u00105\u001a\u00020\u000bJ\u0006\u00106\u001a\u00020$J.\u00107\u001a\u00020$2\u0006\u0010%\u001a\u00020\u000b2\u0006\u0010&\u001a\u00020\u000b2\u0006\u0010\'\u001a\u00020\u000b2\u0006\u00104\u001a\u00020\u000b2\u0006\u00105\u001a\u00020\u000bJ\u0006\u00108\u001a\u00020$J\u0006\u00109\u001a\u00020$J&\u0010:\u001a\u00020$2\u0006\u0010(\u001a\u00020\u000b2\u0006\u0010)\u001a\u00020\u000b2\u0006\u0010*\u001a\u00020\u000b2\u0006\u0010+\u001a\u00020\u000bJ\u000e\u0010;\u001a\u00020$2\u0006\u0010<\u001a\u00020\bR\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u000e\u001a\u00020\b8F\u00a2\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8F\u00a2\u0006\u0006\u001a\u0004\b\u0019\u0010\u001aR\u001f\u0010\u001b\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u001c0\u0014\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0017R\u0017\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0017R\u0019\u0010 \u001a\n\u0012\u0006\u0012\u0004\u0018\u00010!0\u0014\u00a2\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u0017\u00a8\u0006="}, d2 = {"Lcom/example/fitalife/AppViewModel;", "Landroidx/lifecycle/ViewModel;", "auth", "Lcom/google/firebase/auth/FirebaseAuth;", "db", "Lcom/google/firebase/firestore/FirebaseFirestore;", "(Lcom/google/firebase/auth/FirebaseAuth;Lcom/google/firebase/firestore/FirebaseFirestore;)V", "_currentTime", "", "_laps", "", "", "getAuth", "()Lcom/google/firebase/auth/FirebaseAuth;", "currentTime", "getCurrentTime", "()J", "getDb", "()Lcom/google/firebase/firestore/FirebaseFirestore;", "inProgress", "Landroidx/compose/runtime/MutableState;", "", "getInProgress", "()Landroidx/compose/runtime/MutableState;", "laps", "getLaps", "()Ljava/util/List;", "popupNotification", "Lcom/example/fitalife/data/Event;", "getPopupNotification", "signedIn", "getSignedIn", "userData", "Lcom/example/fitalife/data/UserData;", "getUserData", "createOrUpdateProfile", "", "username", "name", "surname", "gender", "weight", "height", "age", "formatTime", "timeInMillis", "uid", "handleException", "exception", "Ljava/lang/Exception;", "customMessage", "onLogin", "email", "pass", "onLogout", "onSignup", "startTimer", "stopTimer", "updateProfileData", "updateTime", "elapsedTime", "app_debug"})
public final class AppViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull
    private final com.google.firebase.auth.FirebaseAuth auth = null;
    @org.jetbrains.annotations.NotNull
    private final com.google.firebase.firestore.FirebaseFirestore db = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.compose.runtime.MutableState<java.lang.Boolean> signedIn = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.compose.runtime.MutableState<java.lang.Boolean> inProgress = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.compose.runtime.MutableState<com.example.fitalife.data.UserData> userData = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.compose.runtime.MutableState<com.example.fitalife.data.Event<java.lang.String>> popupNotification = null;
    
    /**
     * ************************ RUN TIME VIEWMODEL
     */
    private long _currentTime = 0L;
    private java.util.List<java.lang.String> _laps;
    
    @javax.inject.Inject
    public AppViewModel(@org.jetbrains.annotations.NotNull
    com.google.firebase.auth.FirebaseAuth auth, @org.jetbrains.annotations.NotNull
    com.google.firebase.firestore.FirebaseFirestore db) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.google.firebase.auth.FirebaseAuth getAuth() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.google.firebase.firestore.FirebaseFirestore getDb() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.compose.runtime.MutableState<java.lang.Boolean> getSignedIn() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.compose.runtime.MutableState<java.lang.Boolean> getInProgress() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.compose.runtime.MutableState<com.example.fitalife.data.UserData> getUserData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.compose.runtime.MutableState<com.example.fitalife.data.Event<java.lang.String>> getPopupNotification() {
        return null;
    }
    
    public final void onSignup(@org.jetbrains.annotations.NotNull
    java.lang.String username, @org.jetbrains.annotations.NotNull
    java.lang.String name, @org.jetbrains.annotations.NotNull
    java.lang.String surname, @org.jetbrains.annotations.NotNull
    java.lang.String email, @org.jetbrains.annotations.NotNull
    java.lang.String pass) {
    }
    
    private final void createOrUpdateProfile(java.lang.String username, java.lang.String name, java.lang.String surname, java.lang.String gender, java.lang.String weight, java.lang.String height, java.lang.String age) {
    }
    
    public final void updateProfileData(@org.jetbrains.annotations.NotNull
    java.lang.String gender, @org.jetbrains.annotations.NotNull
    java.lang.String weight, @org.jetbrains.annotations.NotNull
    java.lang.String height, @org.jetbrains.annotations.NotNull
    java.lang.String age) {
    }
    
    private final void getUserData(java.lang.String uid) {
    }
    
    public final void onLogin(@org.jetbrains.annotations.NotNull
    java.lang.String email, @org.jetbrains.annotations.NotNull
    java.lang.String pass) {
    }
    
    public final void onLogout() {
    }
    
    public final void handleException(@org.jetbrains.annotations.Nullable
    java.lang.Exception exception, @org.jetbrains.annotations.Nullable
    java.lang.String customMessage) {
    }
    
    public final long getCurrentTime() {
        return 0L;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<java.lang.String> getLaps() {
        return null;
    }
    
    public final void startTimer() {
    }
    
    public final void stopTimer() {
    }
    
    public final void updateTime(long elapsedTime) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String formatTime(long timeInMillis) {
        return null;
    }
}