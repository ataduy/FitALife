package com.example.fitalife.main

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
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.fitalife.AppViewModel
import com.example.fitalife.R
import com.example.fitalife.data.WorkoutsPrograms
import com.example.fitalife.data.getPrograms
import com.example.fitalife.ui.theme.robotoregular

@Composable
fun WorkoutDetailsScreen(navController: NavController, vm: AppViewModel, workoutId: String) {

    val listOfWorkouts = getPrograms()
    val workout = listOfWorkouts.find { it.id == workoutId }

    Surface(
        modifier = Modifier.fillMaxSize(),
        color = Color(0xFF225555)
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(vertical = 62.dp, horizontal = 22.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                text = "Workout Program",
                style = TextStyle(
                    fontSize = 24.sp,
                    fontFamily = robotoregular,
                    fontWeight = FontWeight(500),
                    color = Color(0xFFFFFFFF),

                    letterSpacing = 0.1.sp,
                )
            )
            
            Spacer(modifier = Modifier.height(14.dp))
            
            Text(
                text = workoutId,
                style = TextStyle(
                    fontSize = 48.sp,
                    fontFamily = robotoregular,
                    fontWeight = FontWeight(500),
                    color = Color(0xFFFFFFFF),
                    letterSpacing = 0.1.sp,
                )
            )

            Spacer(modifier = Modifier.height(48.dp))


            // Workout Description
            Card(
                modifier = Modifier
                    .fillMaxWidth()
                    .border(
                        width = 2.dp,
                        color = Color(0x599CABC2),
                        shape = RoundedCornerShape(size = 40.dp)
                    ),
                shape = RoundedCornerShape(size = 40.dp),
                colors = CardDefaults.cardColors(Color(0x599CABC2)),
            ) {
                workout?.let {
                    Column(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(20.dp),
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {
                        Text(text = it.title, style = MaterialTheme.typography.bodyLarge, color = Color.White)
                        Spacer(modifier = Modifier.height(10.dp))
                        it.description.split("\n").forEach { line ->
                            Text(text = line, style = MaterialTheme.typography.bodyMedium, color = Color.White)
                        }
                    }
                }
            }
            Row(
                modifier = Modifier.fillMaxWidth().padding(top = 50.dp),
                horizontalArrangement = Arrangement.SpaceAround
            ) {

                // Reject
                Card(
                    modifier = Modifier
                        .clickable { navController.popBackStack() }
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
                        painter = painterResource(id = R.drawable.ic_reject),
                        contentDescription = "arrow left",
                        modifier = Modifier
                            .padding(10.dp)
                            .fillMaxSize()
                            .clip(CircleShape)
                    )
                }

                // Accept
                Card(
                    modifier = Modifier
                        .clickable { /* TODO */ }
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
                        contentDescription = "check",
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