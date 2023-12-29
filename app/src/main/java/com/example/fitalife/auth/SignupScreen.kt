package com.example.fitalife.auth

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalFocusManager
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.capitalize
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.fitalife.AppViewModel
import com.example.fitalife.R.*
import com.example.fitalife.main.checkSignedIn
import com.example.fitalife.ui.theme.nunitobold
import com.example.fitalife.ui.theme.robotoregular
import java.util.Locale


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SignupScreen(navController: NavController, vm: AppViewModel) {

    checkSignedIn(vm = vm, navController = navController)

    val focus = LocalFocusManager.current
    val nameState = remember { mutableStateOf(TextFieldValue()) }
    val surnameState = remember { mutableStateOf(TextFieldValue()) }
    val emailState = remember { mutableStateOf(TextFieldValue()) }
    val passState = remember { mutableStateOf(TextFieldValue()) }
    val usernameState = remember { mutableStateOf("") }

    LaunchedEffect(nameState.value, surnameState.value) {
        usernameState.value = "${nameState.value.text}${surnameState.value.text}".lowercase(Locale.getDefault())
    }

    Surface(modifier = Modifier.fillMaxSize()) {

        Column(
            modifier = Modifier
                .background(color = Color(0xFF225555))
                .fillMaxSize()
        ) {

            Text(
                text = "Username: ${usernameState.value}",
                // Text stilinizi burada belirleyebilirsiniz.
            )

            // Branding
            Column(
                modifier = Modifier
                    .weight(0.3f)
                    .fillMaxWidth(),
                verticalArrangement = Arrangement.Top,
                horizontalAlignment = Alignment.CenterHorizontally) {

                Image(painter = painterResource(id = drawable.logo),
                    contentDescription = "Logo",
                    modifier = Modifier
                        .width(50.dp)
                        .padding(top = 16.dp)
                        .padding(8.dp)
                        .clip(CircleShape)
                        .shadow(elevation = 6.dp)
                )
            }

                    // ToDo: Geçici UI Kısmı yapıldı. nameState ve surnameState eklenecek, usernameState = nameState + surnameState olacak

            // Auth Fields
            Column(modifier = Modifier
                .weight(2f)
                .fillMaxWidth(),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center
            ) {

                OutlinedTextField(
                    value = nameState.value,
                    onValueChange = { nameState.value = it},
                    modifier = Modifier
                        .padding(20.dp)
                        .width(285.dp)
                        .height(50.dp)
                        .border(
                            width = 2.dp,
                            color = Color(0xFFF5F5F5),
                            shape = RoundedCornerShape(size = 10.dp)
                        ),
                    shape = RoundedCornerShape(10.dp),
                    colors = TextFieldDefaults.textFieldColors(
                        containerColor = Color(0xFF225555),
                        cursorColor = Color.White,
                        textColor = Color.White,
                        focusedIndicatorColor = Color.Transparent,
                        unfocusedIndicatorColor = Color.Transparent
                    ),
                    singleLine = true,
                )


                Text(
                    text = "Name",
                    style = TextStyle(
                        fontSize = 20.sp,
                        fontFamily = nunitobold,
                        fontWeight = FontWeight(900),
                        color = Color(0xFFF5F5F5),
                        letterSpacing = 0.4.sp,
                    )
                )




                OutlinedTextField(
                    value = surnameState.value,
                    onValueChange = { surnameState.value = it},
                    modifier = Modifier
                        .padding(20.dp)
                        .width(285.dp)
                        .height(50.dp)
                        .border(
                            width = 2.dp,
                            color = Color(0xFFF5F5F5),
                            shape = RoundedCornerShape(size = 10.dp)
                        ),
                    shape = RoundedCornerShape(10.dp),
                    colors = TextFieldDefaults.textFieldColors(
                        containerColor = Color(0xFF225555),
                        cursorColor = Color.White,
                        textColor = Color.White,
                        focusedIndicatorColor = Color.Transparent,
                        unfocusedIndicatorColor = Color.Transparent
                    ),
                    singleLine = true,
                )

                Text(
                    text = "Surname",
                    style = TextStyle(
                        fontSize = 20.sp,
                        fontFamily = nunitobold,
                        fontWeight = FontWeight(900),
                        color = Color(0xFFF5F5F5),
                        letterSpacing = 0.4.sp,
                    )
                )

                OutlinedTextField(
                    value = emailState.value,
                    onValueChange = { emailState.value = it},
                    modifier = Modifier
                        .padding(20.dp)
                        .width(285.dp)
                        .height(50.dp)
                        .border(
                            width = 2.dp,
                            color = Color(0xFFF5F5F5),
                            shape = RoundedCornerShape(size = 10.dp)
                        ),
                    shape = RoundedCornerShape(10.dp),
                    colors = TextFieldDefaults.textFieldColors(
                        containerColor = Color(0xFF225555),
                        cursorColor = Color.White,
                        textColor = Color.White,
                        focusedIndicatorColor = Color.Transparent,
                        unfocusedIndicatorColor = Color.Transparent
                    ),
                    singleLine = true,
                )


                Text(
                    text = "Email Address",
                    style = TextStyle(
                        fontSize = 20.sp,
                        fontFamily = nunitobold,
                        fontWeight = FontWeight(900),
                        color = Color(0xFFF5F5F5),
                        letterSpacing = 0.4.sp,
                    )
                )




                OutlinedTextField(
                    value = passState.value,
                    onValueChange = { passState.value = it},
                    visualTransformation = PasswordVisualTransformation(),
                    modifier = Modifier
                        .padding(20.dp)
                        .width(285.dp)
                        .height(50.dp)
                        .border(
                            width = 2.dp,
                            color = Color(0xFFF5F5F5),
                            shape = RoundedCornerShape(size = 10.dp)
                        ),
                    shape = RoundedCornerShape(10.dp),
                    colors = TextFieldDefaults.textFieldColors(
                        containerColor = Color(0xFF225555),
                        cursorColor = Color.White,
                        textColor = Color.White,
                        focusedIndicatorColor = Color.Transparent,
                        unfocusedIndicatorColor = Color.Transparent
                    ),
                    singleLine = true,
                )

                Text(
                    text = "Password",
                    style = TextStyle(
                        fontSize = 20.sp,
                        fontFamily = nunitobold,
                        fontWeight = FontWeight(900),
                        color = Color(0xFFF5F5F5),
                        letterSpacing = 0.4.sp,
                    )
                )



            }

            // Auth Button
            Row(
                modifier = Modifier
                    .weight(0.7f)
                    .padding(top = 20.dp)
                    .fillMaxWidth(),
                horizontalArrangement = Arrangement.Center

            ) {

                Button(onClick = { navController.popBackStack() },
                    modifier = Modifier
                        .border(
                            width = 2.dp,
                            color = Color(0xFFFFFFFF),
                            shape = RoundedCornerShape(size = 30.dp)
                        )
                        .width(130.dp)
                        .height(60.dp)
                        .background(
                            color = Color.Transparent,
                            shape = RoundedCornerShape(size = 30.dp)
                        ),
                    colors = ButtonDefaults.buttonColors(
                        containerColor = Color.Transparent)
                ) {
                    Text(text = "Cancel", color = Color.White,
                        fontSize = 20.sp,
                        fontFamily = robotoregular,
                        fontWeight = FontWeight.ExtraBold)

                }

                Spacer(modifier = Modifier.width(20.dp))

                Button(
                    onClick = {
                        focus.clearFocus(force = true)
                        vm.onSignup(
                            usernameState.value,
                            nameState.value.text.capitalize(),
                            surnameState.value.text.capitalize(),
                            emailState.value.text,
                            passState.value.text
                        )
                    },
                    modifier = Modifier
                        .width(130.dp)
                        .height(60.dp),
                    colors = ButtonDefaults.buttonColors(
                        containerColor = Color.White
                    ),
                    shape = RoundedCornerShape(30.dp),
                ) {
                    Text(text = "Sign Up", color = Color.Black,
                        fontSize = 20.sp,
                        fontFamily = robotoregular,
                        fontWeight = FontWeight.ExtraBold
                    )
                }


            }


        }


    }

}

