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
import com.example.fitalife.data.getPrograms
import com.example.fitalife.ui.theme.robotoregular

@Composable
fun WorkoutsScreen(navController: NavController, vm: AppViewModel) {

    val listOfWorkouts = getPrograms()

    Surface(
        modifier = Modifier.fillMaxSize(),
        color = Color(0xFF225555)
    ) {

        Column {

            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 10.dp),
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

            Column(modifier = Modifier
                .fillMaxSize()
                .padding(vertical = 1.dp, horizontal = 24.dp),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.SpaceEvenly) {

                for (workout in listOfWorkouts) {
                    val workoutId = workout.id
                    val workoutTitle = workout.title

                    WorkoutCard(navController, workoutId, workoutTitle)

                }

            }

        }


    }

}

@Composable
fun WorkoutCard(
    navController: NavController,
    workoutId: String,
    workoutTitle: String
) {

    Card(
        modifier = Modifier
            .clickable {
                navController.navigate("workout-details/$workoutId")
            }
            .padding(1.dp)
            .width(295.dp)
            .height(95.dp)
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
                .padding(14.dp)
                .background(Color.Transparent),
            verticalAlignment = Alignment.CenterVertically) {

            // Antrenman numarasi
            Box(
                modifier = Modifier
                    .width(70.dp)
                    .height(70.dp)
                    .border(
                        width = 2.dp, color = Color(0xFFFFFFFF),
                        shape = RoundedCornerShape(size = 20.dp)
                    )
                    .height(60.dp)
                    .background(
                        color = Color(0x599CABC2),
                        shape = RoundedCornerShape(size = 20.dp)
                    ),
                contentAlignment = Alignment.Center
            ) {
                Text(text = workoutId,
                    style = TextStyle(
                        fontFamily = robotoregular,
                        fontSize = 16.sp,
                        fontWeight = FontWeight(800),
                        color = Color(red = 219, green = 255,blue = 0),
                        letterSpacing = 0.1.sp,
                    ))
            }

            // Antrenman aciklamasi
            Column(modifier = Modifier
                .height(70.dp)
                .padding(start = 14.dp, top = 6.dp)) {
                Divider(
                    color = Color.LightGray,
                    thickness = 3.dp,
                    modifier = Modifier
                        .width(135.dp)
                        .background(color = Color(0xFFF5F5F5))
                )

                Spacer(modifier = Modifier.height(10.dp))

                Divider(
                    color = Color.LightGray,
                    thickness = 3.dp,
                    modifier = Modifier
                        .width(105.dp)
                        .background(color = Color(0xFFF5F5F5))
                )

                Spacer(modifier = Modifier.height(8.dp))

                Text(
                    text = workoutTitle,
                    style = TextStyle(
                        fontFamily = robotoregular,
                        fontSize = 12.sp,
                        fontWeight = FontWeight(500),
                        color = Color(0xFFFFFFFF),
                        letterSpacing = 0.1.sp,
                    )
                )


            }

        }


    }
    
}