@file:JvmName("WelcomeScreenKt")

package com.example.fitalife.auth

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalFocusManager
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.fitalife.AppViewModel
import com.example.fitalife.DestinationScreen
import com.example.fitalife.R
import com.example.fitalife.main.navigateTo
import com.example.fitalife.ui.theme.nunitobold
import com.example.fitalife.ui.theme.robotoregular

@Composable
fun WelcomeScreen(navController: NavController, vm: AppViewModel) {

    Surface(modifier = Modifier.fillMaxSize()) {

        Column {

            // Branding
            Box(
                modifier = Modifier
                    .background(color = Color(0xFF225555))
                    .weight(5f)
                    .fillMaxWidth(),
                contentAlignment = Alignment.Center
            ) {
                Column {
                    Image(painter = painterResource(id = R.drawable.logo),
                        contentDescription = "Logo")

                Spacer(modifier = Modifier.height(15.dp))
                    
                    Text(text = "Fit a Life", fontSize = 20.sp, fontFamily = nunitobold,color = Color.White)
                }

                

            }


            // Auth components
            Box(
                modifier = Modifier
                    .background(color = Color.White)
                    .weight(2f)
                    .fillMaxWidth(),
                contentAlignment = Alignment.Center
            ) {

                Column {
                    Button(
                        onClick = {
                            navigateTo(navController = navController, DestinationScreen.Signup)
                          },
                        modifier = Modifier
                            .width(136.dp)
                            .height(38.dp),
                        colors = ButtonDefaults.buttonColors(
                            containerColor = Color(0xFF225555)
                        ),
                        shape = RoundedCornerShape(41.dp),
                    ) {
                        Text(text = "Sign Up",
                            fontFamily = robotoregular,
                            fontSize = 16.sp,
                            fontWeight = FontWeight(600)
                        )
                    }

                    Spacer(modifier = Modifier.height(7.dp))

                    Button(
                        onClick = {
                            navigateTo(navController = navController, DestinationScreen.Login)
                            //debug
                            //navigateTo(navController = navController, DestinationScreen.Home)
                        },
                        modifier = Modifier
                            .width(136.dp)
                            .height(38.dp),
                        colors = ButtonDefaults.buttonColors(
                            containerColor = Color(0xFF225555)
                        ),
                        shape = RoundedCornerShape(41.dp),
                    ) {
                        Text(text = "Login",
                            fontFamily = robotoregular,
                            fontSize = 16.sp,
                            fontWeight = FontWeight(600)
                        )
                    }
                }



            }


        }


    }


}