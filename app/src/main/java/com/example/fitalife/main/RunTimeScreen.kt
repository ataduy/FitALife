package com.example.fitalife.main

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Divider
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.fitalife.AppViewModel
import com.example.fitalife.ui.theme.nunitoregular
import com.example.fitalife.ui.theme.robotoregular



@Composable
fun RunTimeScreen(navController: NavController, vm:AppViewModel){
    Surface(
        modifier = Modifier.fillMaxSize(),
        color = Color(0xFF225555)
    )  {

        var isRunning by remember { mutableStateOf(false) }

        Spacer(modifier = Modifier.height(51.dp))
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(24.dp)

        ){
            Divider(
                color = Color(red=30,green=30,blue=30),
                thickness = 5.dp,
                modifier = Modifier
                    .width(150.dp)
                    .background(color = Color(0xFFF5F5F5))
            )

            Spacer(modifier = Modifier.height(8.dp))

            Divider(
                color = Color(red=30,green=30,blue=30),
                thickness = 5.dp,
                modifier = Modifier
                    .width(135.dp)
                    .background(color = Color(0xFFF5F5F5))
            )

        Column(modifier = Modifier
            .fillMaxSize()
            .padding(top = 240.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.SpaceEvenly){


                Text(text = "00:00,00",
                    fontFamily = nunitoregular,
                    fontSize = 40.sp,
                    fontWeight = FontWeight.W900,
                   letterSpacing = 1.sp,
                )

                Spacer(modifier = Modifier.height(100.dp))
                
            Row(
                modifier = Modifier
                    .padding(top =0.dp, start = 24.dp, bottom = 5.dp, end = 24.dp),
                horizontalArrangement = Arrangement.Center,
            ) {
                // LAP
               OutlinedButton(
                   onClick = { /*TODO*/},
                   modifier = Modifier
                       .width(130.dp)
                       .height(60.dp)
                       .border(
                           width = 2.dp,
                           color = Color(0xFFF5F5F5),
                           shape = RoundedCornerShape(size = 30.dp)
                       ),
                   colors = ButtonDefaults.buttonColors(
                       containerColor = Color.Transparent
                   ),
               ) {
                    Text(text = "Lap",
                        fontFamily = robotoregular,
                        fontSize = 16.sp,
                    )

               }

                Spacer(modifier = Modifier.width(24.dp))

                // START
                Button(
                    onClick = { },
                    modifier = Modifier
                        .width(130.dp)
                        .height(60.dp),
                    colors = ButtonDefaults.buttonColors(
                        containerColor = Color.White
                    ),
                    shape = RoundedCornerShape(41.dp),
                ) {
                    Text(text = if (isRunning) "Stop" else "Start",
                        color = Color.Black,
                        fontFamily = robotoregular,
                        fontSize = 16.sp
                    )
                }




            }

        }
        }
    }


}

