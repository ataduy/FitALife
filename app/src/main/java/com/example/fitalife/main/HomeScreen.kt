package com.example.fitalife.main

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Divider
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.fitalife.AppViewModel
import com.example.fitalife.DestinationScreen
import com.example.fitalife.R
import com.example.fitalife.ui.theme.robotoregular

@Composable
fun HomeScreen(navController: NavController, vm: AppViewModel) {

    val isLoading = vm.inProgress.value
    if (isLoading) {
        CommonProgressSpinner()
    } else {
        val userData = vm.userData.value
        var username by rememberSaveable { mutableStateOf(userData?.username ?: "") }

        HomeContent(name = username, navController = navController)
    }
}

@Composable
private fun HomeContent(
    name: String,
    navController: NavController
) {
    Surface(modifier = Modifier.fillMaxSize(), color = Color(0xFF225555)) {

        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(12.dp)
        ) {

            // Header
            HeaderContent(name = name)

            //Cards - 3
            Row(modifier = Modifier
                .fillMaxWidth()
                .padding(14.dp),
                horizontalArrangement = Arrangement.SpaceBetween) {

                Card(
                    modifier = Modifier
                        .clickable {
                            navigateTo(navController = navController, dest = DestinationScreen.Workouts)
                        }
                        .padding(8.dp)
                        .size(75.dp)
                        .border(
                            width = 2.dp,
                            color = Color(0xFFF5F5F5),
                            shape = RoundedCornerShape(size = 20.dp)
                        ),
                    colors = CardDefaults.cardColors(containerColor = Color.Transparent),
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.ic_dumbell),
                        contentDescription = "Dumbbell",
                        modifier = Modifier
                            .padding(10.dp)
                            .fillMaxSize()
                    )
                }

                Card(
                    modifier = Modifier
                        .clickable { }
                        .padding(8.dp)
                        .size(75.dp)
                        .border(
                            width = 2.dp,
                            color = Color(0xFFF5F5F5),
                            shape = RoundedCornerShape(size = 20.dp)
                        ),
                    colors = CardDefaults.cardColors(containerColor = Color.Transparent),
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.ic_run),
                        contentDescription = "Dumbbell",
                        modifier = Modifier
                            .padding(10.dp)
                            .fillMaxSize()
                    )
                }

                Card(
                    modifier = Modifier
                        .clickable {
                            navigateTo(navController = navController, DestinationScreen.Profile)
                        }
                        .padding(8.dp)
                        .size(75.dp)
                        .border(
                            width = 2.dp,
                            color = Color(0xFFF5F5F5),
                            shape = RoundedCornerShape(size = 20.dp)
                        ),
                    colors = CardDefaults.cardColors(containerColor = Color.Transparent),
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.ic_apple),
                        contentDescription = "Dumbbell",
                        modifier = Modifier
                            .padding(10.dp)
                            .fillMaxSize()
                    )
                }


            }
            
            // Welcome Text and Banner
            Column(modifier = Modifier
                .fillMaxWidth()
                .padding(14.dp),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {

                Card(
                    modifier = Modifier
                        .padding(8.dp)
                        .width(295.dp)
                        .border(
                            width = 2.dp,
                            color = Color(0xFFF5F5F5),
                            shape = RoundedCornerShape(size = 10.dp)
                        ),
                    colors = CardDefaults.cardColors(containerColor = Color.Transparent),
                ) {
                    Text(modifier = Modifier.padding(12.dp),
                        text = "Embark on a transformative fitness journey with FIT A LIFE " +
                                "We're thrilled to be a part of your quest for a healthier, happier you.",
                        style = TextStyle(
                            fontSize = 20.sp,
                            fontFamily = robotoregular,
                            fontWeight = FontWeight(500),
                            color = Color(0xFFFFFFFF),
                            letterSpacing = 0.1.sp,
                        )
                    )
                }

                Card(
                    modifier = Modifier
                        .padding(8.dp)
                        .width(295.dp)
                        .height(183.dp)
                        .border(
                            width = 2.dp,
                            color = Color(0xFFF5F5F5),
                            shape = RoundedCornerShape(size = 10.dp)
                        ),
                    colors = CardDefaults.cardColors(containerColor = Color.Transparent),
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.banner),
                        contentDescription = "banner",
                        contentScale = ContentScale.FillBounds,
                        modifier = Modifier.fillMaxSize()
                    )
                }

                Card(
                    modifier = Modifier
                        .padding(8.dp)
                        .width(295.dp)
                        .height(183.dp)
                        .border(
                            width = 2.dp,
                            color = Color(0xFFF5F5F5),
                            shape = RoundedCornerShape(size = 10.dp)
                        ),
                    colors = CardDefaults.cardColors(containerColor = Color(red = 156, green = 171, blue = 194, alpha = 35)),
                    ) {
                    Text(modifier = Modifier.padding(12.dp),
                        text = "......",
                        style = TextStyle(
                            fontSize = 20.sp,
                            fontFamily = robotoregular,
                            fontWeight = FontWeight(500),
                            color = Color(0xFFFFFFFF),
                            letterSpacing = 0.1.sp,
                        )
                    )
                }

                
            }


        }


    }
}

@Composable
private fun HeaderContent(name: String) {

    val formattedName = name.split(' ').mapIndexed { index, s ->
        if (index == 0) s.replaceFirstChar { if (it.isLowerCase()) it.titlecase() else it.toString() }
        else s.uppercase()
    }.joinToString(" ")

    Row(
        Modifier
            .fillMaxWidth()
            .padding(top = 20.dp)
    ) {

        // ProfilePic
        Column(modifier = Modifier.padding(12.dp)) {
            Card(
                modifier = Modifier.wrapContentSize(),
                shape = CircleShape,
                border = BorderStroke(3.dp, Color.Black)
            ) {
                Image(
                    painter = painterResource(id = R.drawable.pp_default),
                    contentDescription = "Profile Pic",
                    modifier = Modifier
                        .clip(CircleShape)
                        .width(60.dp)
                )
            }
        }

        // Name
        Column() {
            Text(
                text = formattedName,
                modifier = Modifier.padding(bottom = 10.dp),
                color = Color(0xFFF5F5F5),
                style = TextStyle(
                    fontSize = 14.sp,
                    fontFamily = FontFamily.SansSerif,
                    fontWeight = FontWeight(500),
                    letterSpacing = 0.1.sp
                )
            )

            Divider(
                color = Color.LightGray,
                thickness = 5.dp,
                modifier = Modifier
                    .width(135.dp)
                    .background(color = Color(0xFFF5F5F5))
            )

            Text(
                text = "WELCOME!",
                modifier = Modifier.padding(top = 10.dp, bottom = 10.dp),
                color = Color(0xFFF5F5F5),
                style = TextStyle(
                    fontSize = 16.sp,
                    fontFamily = FontFamily.SansSerif,
                    fontWeight = FontWeight(500),
                    letterSpacing = 0.1.sp
                )
            )

            Divider(
                color = Color.LightGray,
                thickness = 5.dp,
                modifier = Modifier
                    .width(105.dp)
                    .background(color = Color(0xFFF5F5F5))
            )
        }

        // Applogo
        Column(
            modifier = Modifier.fillMaxWidth(),
            verticalArrangement = Arrangement.Top,
            horizontalAlignment = Alignment.End
        ) {
            Image(
                painter = painterResource(id = R.drawable.logo),
                contentDescription = "Logo",
                modifier = Modifier.width(40.dp)
            )
        }

    }
}