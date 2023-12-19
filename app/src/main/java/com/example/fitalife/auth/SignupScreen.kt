package com.example.fitalife.auth

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
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
import androidx.compose.material3.Divider
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
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
import com.example.fitalife.main.navigateTo


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SignupScreen(navController: NavController, vm: AppViewModel) {

    checkSignedIn(vm = vm, navController = navController)

    val focus = LocalFocusManager.current
    val usernameState = remember { mutableStateOf(TextFieldValue()) }
    val emailState = remember { mutableStateOf(TextFieldValue()) }
    val passState = remember { mutableStateOf(TextFieldValue()) }

    Surface(modifier = Modifier.fillMaxSize()) {

        Column(
            modifier = Modifier
                .background(color = Color(0xFF225555))
                .fillMaxSize()
        ) {

            // Branding
            Column(
                modifier = Modifier
                    .weight(1f)
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

            // Auth Fields
            Column(modifier = Modifier
                .weight(1.2f)
                .fillMaxWidth(),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {

                OutlinedTextField(
                    value = emailState.value,
                    onValueChange = { emailState.value = it},
                    modifier = Modifier
                        .padding(8.dp)
                        .width(285.dp)
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

                Spacer(modifier = Modifier.height(8.dp))
                SpecialDivider()

                Text(
                    text = "Email Adress",
                    style = TextStyle(
                        fontSize = 20.sp,
                        fontFamily = FontFamily.SansSerif,
                        fontWeight = FontWeight(700),
                        color = Color(0xFFF5F5F5),
                        letterSpacing = 0.1.sp,
                    )
                )

                Spacer(modifier = Modifier.height(8.dp))


                OutlinedTextField(
                    value = passState.value,
                    onValueChange = { passState.value = it},
                    visualTransformation = PasswordVisualTransformation(),
                    modifier = Modifier
                        .padding(8.dp)
                        .width(285.dp)
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
                        fontFamily = FontFamily.SansSerif,
                        fontWeight = FontWeight(700),
                        color = Color(0xFFF5F5F5),
                        letterSpacing = 0.1.sp,
                    )
                )

                SpecialDivider()
                SpecialDivider()

            }

            // Auth Button
            Column(
                modifier = Modifier
                    .weight(0.8f)
                    .fillMaxWidth(),
                verticalArrangement = Arrangement.Bottom,
                horizontalAlignment = Alignment.CenterHorizontally) {

                Button(
                    onClick = {
                        focus.clearFocus(force = true)
                        vm.onSignup(
                            usernameState.value.text,
                            emailState.value.text,
                            passState.value.text
                        )
                    },
                    modifier = Modifier
                        .width(285.dp),
                    colors = ButtonDefaults.buttonColors(
                        containerColor = Color.White
                    ),
                    shape = RoundedCornerShape(30.dp),
                ) {
                    Text(text = "Continue", color = Color.Black)
                }
                Spacer(modifier = Modifier.height(20.dp))

            }


        }


    }

}

@Composable
private fun SpecialDivider() {
    Spacer(modifier = Modifier.height(10.dp))
    Divider(
        color = Color.LightGray,
        thickness = 3.dp,
        modifier = Modifier
            .width(165.dp)
            .background(color = Color(0xFFF5F5F5))
    )
    Spacer(modifier = Modifier.height(16.dp))
}