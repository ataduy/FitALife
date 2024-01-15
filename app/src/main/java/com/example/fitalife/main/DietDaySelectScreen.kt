package com.example.fitalife.main

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.CornerSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Divider
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
import com.example.fitalife.data.getDiets
import com.example.fitalife.data.getPrograms
import com.example.fitalife.ui.theme.robotoregular

@Composable
fun DietDaySelectScreen(navController: NavController, dietId: String) {

    val listOfDiets = getDiets()
    val diet = listOfDiets.find { it.id == dietId }

    Surface(
        modifier = Modifier.fillMaxSize(),
        color = Color(0xFF225555)
    ) {

        Column {

            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 10.dp, start = 5.dp),
                horizontalArrangement = Arrangement.Start
            ) {
                // backtohome
                Card(
                    modifier = Modifier
                        .clickable {
                            navController.popBackStack()
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
                        painter = painterResource(id = R.drawable.ic_arrow_left),
                        contentDescription = "arrow left",
                        modifier = Modifier
                            .padding(10.dp)
                            .fillMaxSize()
                            .clip(CircleShape),
                        colorFilter = ColorFilter.tint(Color.White)
                    )
                }

            }

            Column(modifier = Modifier
                .fillMaxSize()
                .padding(vertical = 1.dp, horizontal = 24.dp),
                horizontalAlignment = Alignment.CenterHorizontally)
            {

                Text(
                    text = "${diet!!.title} Diet",
                    style = TextStyle(
                        fontSize = 24.sp,
                        fontFamily = robotoregular,
                        fontWeight = FontWeight(500),
                        color = Color(red = 219, green = 255,blue = 0),
                        letterSpacing = 0.1.sp,
                    )
                )

                val daysOfWeek = listOf("Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday")

                Column {
                    for (day in daysOfWeek) {
                        DayCard(navController, day, dietId)
                    }
                }


            }

        }


    }

}

@Composable
fun DayCard(
    navController: NavController,
    dayName: String,
    dietId: String
) {

    Card(
        modifier = Modifier
            .clickable {
                navController.navigate("dietplan/$dietId/$dayName")
            }
            .padding(6.dp)
            .width(295.dp)
            .height(75.dp)
            .border(
                width = 2.dp, color = Color(0xFFFFFFFF),
                shape = RoundedCornerShape(size = 30.dp)
            ),
        shape = RoundedCornerShape(corner = CornerSize(8.dp)),
        colors = CardDefaults.cardColors(Color.Transparent)
    ) {

        Row(
            modifier = Modifier
                .fillMaxSize()
                .padding(1.dp)
                .background(Color.Transparent),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Center) {

            // Gun
            Column(modifier = Modifier
                .height(70.dp)
                .width(220.dp)
                .padding(start = 14.dp, top = 6.dp))
            {

                Text(
                    text = dayName,
                    style = TextStyle(
                        fontFamily = robotoregular,
                        fontSize = 36.sp,
                        fontWeight = FontWeight(500),
                        color = Color(0xFFFFFFFF),
                        letterSpacing = 0.1.sp,
                    )
                )
            }

            Text(
                text = "+",
                style = TextStyle(
                    fontFamily = robotoregular,
                    fontSize = 30.sp,
                    fontWeight = FontWeight.ExtraLight,
                    color = Color(0xFFFFFFFF),
                    letterSpacing = 0.1.sp,
                ),
                modifier = Modifier.padding(start = 2.dp, bottom = 5.dp)
            )

        }


    }

}