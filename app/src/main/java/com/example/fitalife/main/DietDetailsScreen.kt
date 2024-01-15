package com.example.fitalife.main

import android.view.Gravity
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
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.fitalife.AppViewModel
import com.example.fitalife.DestinationScreen
import com.example.fitalife.R
import com.example.fitalife.data.WorkoutsPrograms
import com.example.fitalife.data.getDiets
import com.example.fitalife.data.getPrograms
import com.example.fitalife.ui.theme.robotoregular

@Composable
fun DietDetailsScreen(navController: NavController, vm: AppViewModel, dietId: String) {

    val listOfDiets = getDiets()
    val diet = listOfDiets.find { it.id == dietId }

    Surface(
        modifier = Modifier.fillMaxSize(),
        color = Color(0xFF225555)
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(vertical = 10.dp, horizontal = 22.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {

            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 10.dp, bottom = 42.dp),
                horizontalArrangement = Arrangement.Start
            ) {
                // backtohome
                Card(
                    modifier = Modifier
                        .clickable {
                            // navController.popBackStack()
                            navigateTo(navController = navController, dest = DestinationScreen.Home)
                        }
                        .padding(8.dp)
                        .size(45.dp)
                        .border(
                            width = 2.dp,
                            color = Color(0xFFF5F5F5),
                            shape = CircleShape
                        ),
                    colors = CardDefaults.cardColors(containerColor = Color.Transparent),
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.ic_home_flat),
                        contentDescription = "arrow left",
                        modifier = Modifier
                            .padding(10.dp)
                            .fillMaxSize()
                            .clip(CircleShape),
                        colorFilter = ColorFilter.tint(Color.White)
                    )
                }

            }

            Text(
                text = "${diet!!.title} Diet",
                style = TextStyle(
                    fontSize = 36.sp,
                    fontFamily = robotoregular,
                    fontWeight = FontWeight(500),
                    color = Color(red = 219, green = 255,blue = 0),
                    letterSpacing = 0.1.sp,
                )
            )

            Spacer(modifier = Modifier.height(48.dp))


            // Workout Description
            Card(
                modifier = Modifier
                    .fillMaxWidth()
                    .wrapContentHeight()
                    .border(
                        width = 2.dp,
                        color = Color(0x599CABC2),
                        shape = RoundedCornerShape(size = 40.dp)
                    ),
                shape = RoundedCornerShape(size = 40.dp),
                colors = CardDefaults.cardColors(Color.White),
            ) {
                diet?.let {
                    Column(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(20.dp),
                        horizontalAlignment = Alignment.CenterHorizontally,
                    ) {
                        Spacer(modifier = Modifier.height(30.dp))
                        Text(text = it.description, fontSize = 16.sp, fontFamily = robotoregular, color = Color.Black,
                            modifier = Modifier
                                .padding(start = 20.dp, bottom = 10.dp)
                                .align(Alignment.Start)
                        )
                    }
                }
            }
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 10.dp),
                horizontalArrangement = Arrangement.End
            ) {

                // Accept
                Card(
                    modifier = Modifier
                        .clickable {
                            navController.navigate("dietdayselect/$dietId")
                        }
                        .padding(8.dp)
                        .size(45.dp)
                        .border(
                            width = 2.dp,
                            color = Color(0xFFF5F5F5),
                            shape = CircleShape
                        ),
                    colors = CardDefaults.cardColors(containerColor = Color.Transparent),
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.ic_accept),
                        contentDescription = "arrow left",
                        modifier = Modifier
                            .padding(10.dp)
                            .fillMaxSize()
                            .clip(CircleShape)
                    )
                }

            }
        }
    }
}