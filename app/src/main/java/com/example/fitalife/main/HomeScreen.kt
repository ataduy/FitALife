package com.example.fitalife.main

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
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
import com.example.fitalife.navigation.BottomNavigationItem
import com.example.fitalife.navigation.BottomNavigationMenu
import com.example.fitalife.ui.theme.robotoregular

@Composable
fun HomeScreen(navController: NavController, vm: AppViewModel) {

    val isLoading = vm.inProgress.value
    if (isLoading) {
        CommonProgressSpinner()
    } else {
        val userData = vm.userData.value
        var name by rememberSaveable { mutableStateOf(userData?.name ?: "") }
        var surname by rememberSaveable { mutableStateOf(userData?.surname ?: "") }

        HomeContent(name = name, surname = surname, navController = navController, vm = vm)
    }
}

@Composable
private fun HomeContent(
    name: String,
    surname: String,
    navController: NavController,
    vm: AppViewModel
) {
    Surface(modifier = Modifier.fillMaxSize(), color = Color(0xFF225555)) {

        Column(
            modifier = Modifier
                .fillMaxSize()
        ) {

            Column(
                modifier = Modifier
                    .padding(12.dp)
                    .weight(1f)
            ) {

                // Header
                HeaderContent(name = name, surname = surname, vm = vm, navController = navController)

                //Cards - 3
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(12.dp),
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {
                    Card(
                        modifier = Modifier
                            .padding(top = 50.dp, start = 12.dp, end = 12.dp)
                            .width(140.dp)
                            .size(110.dp),

                        colors = CardDefaults.cardColors(containerColor = Color.LightGray),

                        ) {
                        Image(
                            painter = painterResource(R.drawable.ic_calpng),
                            contentDescription = "CAL BURN",
                            contentScale = ContentScale.Crop,
                            modifier = Modifier
                                .align(Alignment.CenterHorizontally)
                                .size(60.dp)
                        )


                        Text(
                            modifier = Modifier
                                .align(Alignment.CenterHorizontally),

                            text = " 3100  ",
                            style = TextStyle(
                                fontSize = 15.sp,
                                fontFamily = robotoregular,
                                fontWeight = FontWeight(600),
                                color = Color.Gray,
                                letterSpacing = 0.1.sp,

                                )
                        )

                        Text(
                            modifier = Modifier
                                .align(Alignment.CenterHorizontally),

                            text = " CAL BURN  ",
                            style = TextStyle(
                                fontSize = 15.sp,
                                fontFamily = robotoregular,
                                fontWeight = FontWeight(600),
                                color = Color.Black,
                                letterSpacing = 0.1.sp,

                                )
                        )
                    }

                    Card(
                        modifier = Modifier
                            .padding(top = 50.dp, start = 12.dp, end = 12.dp)
                            .width(140.dp)
                            .size(110.dp),

                        colors = CardDefaults.cardColors(containerColor = Color.LightGray),

                        ) {
                        Image(
                            painter = painterResource(R.drawable.ic_heart),
                            contentDescription = "HEARTBEAT",
                            contentScale = ContentScale.Crop,
                            modifier = Modifier
                                .align(Alignment.CenterHorizontally)
                                .size(60.dp)
                                .padding(5.dp)
                        )


                        Text(
                            modifier = Modifier
                                .align(Alignment.CenterHorizontally),

                            text = " 123 BPM  ",
                            style = TextStyle(
                                fontSize = 16.sp,
                                fontFamily = robotoregular,
                                fontWeight = FontWeight(600),
                                color = Color.Gray,
                                letterSpacing = 0.1.sp,

                                )
                        )

                        Text(
                            modifier = Modifier
                                .align(Alignment.CenterHorizontally),

                            text = " HEARTBEAT  ",
                            style = TextStyle(
                                fontSize = 16.sp,
                                fontFamily = robotoregular,
                                fontWeight = FontWeight(600),
                                color = Color.Black,
                                letterSpacing = 0.1.sp,

                                )
                        )
                    }


                }


                // Body
                Column(
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(start = 8.dp, end = 8.dp)
                ) {


                    Card(
                        modifier = Modifier
                            .padding(top = 16.dp, start = 12.dp, end = 12.dp)
                            .fillMaxWidth()
                            .size(150.dp),

                        colors = CardDefaults.cardColors(containerColor = Color.LightGray),

                        ) {
                        Image(
                            painter = painterResource(R.drawable.ic_walk),
                            contentDescription = "STEPS",
                            contentScale = ContentScale.Crop,
                            modifier = Modifier
                                .align(Alignment.CenterHorizontally)
                                .size(90.dp)
                                .padding(5.dp)
                        )


                        Text(
                            modifier = Modifier
                                .align(Alignment.CenterHorizontally),

                            text = " 6500  ",
                            style = TextStyle(
                                fontSize = 15.sp,
                                fontFamily = robotoregular,
                                fontWeight = FontWeight(600),
                                color = Color.Gray,
                                letterSpacing = 0.1.sp,

                                )
                        )

                        Text(
                            modifier = Modifier
                                .align(Alignment.CenterHorizontally),

                            text = " STEPS  ",
                            style = TextStyle(
                                fontSize = 15.sp,
                                fontFamily = robotoregular,
                                fontWeight = FontWeight(600),
                                color = Color.Black,
                                letterSpacing = 0.1.sp,

                                )
                        )
                    }

                    Spacer(modifier = Modifier.height(16.dp))

                    // Image Card
                    Card(
                        modifier = Modifier
                            .padding(top = 20.dp, start = 12.dp, end = 12.dp)
                            .fillMaxWidth()
                            .height(273.dp)
                            .border(
                                width = 2.dp,
                                color = Color(0xFFF5F5F5),
                                shape = RoundedCornerShape(size = 10.dp)
                            ),
                        colors = CardDefaults.cardColors(
                            containerColor = Color(
                                red = 156,
                                green = 171,
                                blue = 194,
                                alpha = 35
                            )
                        ),
                    ) {

                        Image(
                            painter = painterResource(id = getRandomBanner()),
                            contentDescription = "No Pain No Gain",
                            contentScale = ContentScale.Crop,
                            modifier = Modifier.align(Alignment.CenterHorizontally)
                        )
                    }


                }

            }

            BottomNavigationMenu(
                selectedItem = BottomNavigationItem.HOME,
                navController = navController
            )

        }

    }


}


@Composable
private fun HeaderContent(name: String, surname: String, vm: AppViewModel, navController: NavController) {

    val fullName = "$name $surname"

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
                        .width(45.dp)
                        .clickable {
                            navigateTo(navController = navController, dest = DestinationScreen.Profile)
                        }
                )
            }
            Text(
                text = "Sign Out",
                style = TextStyle(
                    fontSize = 12.sp,
                    fontFamily = robotoregular,
                    fontWeight = FontWeight(500),
                    color = Color.White,
                    letterSpacing = 0.1.sp,
                ),
                modifier = Modifier.clickable {
                    vm.onLogout()
                    navigateTo(navController = navController, DestinationScreen.Welcome)
                }
            )
        }

        // Name
        Column() {
            Text(
                text = fullName,
                modifier = Modifier.padding(bottom = 10.dp),
                color = Color(0xFFF5F5F5),
                style = TextStyle(
                    fontSize = 14.sp,
                    fontFamily = FontFamily.SansSerif,
                    fontWeight = FontWeight(500),
                    letterSpacing = 0.1.sp
                ),
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
                    fontFamily = robotoregular,
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

val banners = listOf(
    R.drawable.ic_banner,
    R.drawable.banner,
    R.drawable.banner2,
    R.drawable.banner3,
    R.drawable.banner4,
    R.drawable.banner5
)

fun getRandomBanner(): Int {
    return banners.random()
}
