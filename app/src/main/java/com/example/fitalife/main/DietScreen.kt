package com.example.fitalife.main

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.fitalife.AppViewModel
import com.example.fitalife.R
import com.example.fitalife.data.getDiets
import com.example.fitalife.ui.theme.robotoregular

@Composable
fun DietScreen(navController: NavController, vm: AppViewModel) {

    val dietList = getDiets()

    val selectedDietId = remember { mutableStateOf("") }
    val selectedDietColor = remember { mutableStateOf(Color.Transparent) }

    Surface(
        modifier = Modifier.fillMaxSize(),
        color = Color(0xFF225555)
    ) {

        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(vertical = 24.dp ,horizontal = 24.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {

            // Header
            Header(navController)

            // List of Diets
            val rows = arrayOf(3, 3) // Her satırdaki kart sayısını tanımlar
            var currentDietIndex = 0

            Column(
                modifier = Modifier.fillMaxWidth().wrapContentHeight(),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                for (count in rows) {
                    // Yeterli kart varsa bir Row oluştur
                    if (currentDietIndex + count <= dietList.size) {
                        Row {
                            for (i in 0 until count) {
                                val diet = dietList[currentDietIndex]
                                DietCard(
                                    navController = navController,
                                    dietId = diet.id,
                                    dietTitle = diet.title,
                                    dietImg = diet.imageResource,
                                    isSelected = selectedDietId.value == diet.id, // Duruma göre isSelected değeri
                                    onDietSelected = {
                                        selectedDietId.value = diet.id  // Tıklandığında dietId'yi güncelle
                                        selectedDietColor.value = Color.Red // Arka plan rengini güncelle
                                    }
                                )
                                currentDietIndex++ // Sonraki kart için indeksi güncelle
                            }
                        }
                    }
                }

            }

            // Button Continue
            Button(
                onClick = {
                    navController.navigate("diet-details/${selectedDietId.value}")
                },
                modifier = Modifier
                    .padding(top= 10.dp)
                    .border(
                        width = 2.dp,
                        color = Color(0xFFFFFFFF),
                        shape = RoundedCornerShape(size = 30.dp)
                    )
                    .width(255.dp)
                    .height(60.dp)
                    .background(
                        color = Color(0x599CABC2),
                        shape = RoundedCornerShape(size = 30.dp)
                    ),
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color(0x34FFFFFF)
                )
            ) {
                Text(text = "Continue",fontFamily = robotoregular,color = Color.White,
                    fontSize = 24.sp)
            }




        }

    }


}

@Composable
private fun Header(navController: NavController) {
    Row(
        modifier = Modifier.fillMaxWidth().padding(bottom = 22.dp),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically
    ) {
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
                painter = painterResource(id = R.drawable.ic_arrow_left),
                contentDescription = "arrow left",
                modifier = Modifier
                    .padding(10.dp)
                    .fillMaxSize()
                    .clip(CircleShape)
            )
        }

        Card(
            modifier = Modifier
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
                painter = painterResource(id = R.drawable.logo),
                contentDescription = "Logo",
                modifier = Modifier
                    .padding(5.dp)
                    .fillMaxSize()
                    .clip(CircleShape)
            )
        }

    }
}

@Composable
fun DietCard(
    navController: NavController,
    dietId: String,
    dietTitle: String,
    dietImg: Int,
    isSelected: Boolean, // Bu card seçili mi?
    onDietSelected: () -> Unit // Card seçildiğinde çalışacak fonksiyon
) {

    val hexagonDrawable = painterResource(id = R.drawable.frame_hexagon)
    val dietImage = painterResource(id = dietImg)

    val textColor = if (isSelected) Color.Red else Color.White

    Column(
        modifier = Modifier
            .wrapContentSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        Box(
            contentAlignment = Alignment.Center,
            modifier = Modifier
                .clickable { onDietSelected() }
                .padding(16.dp)
                .size(width = 88.dp, height = 121.dp)
                .background(Color.Transparent)
                .clip(RoundedCornerShape(16.dp))
        ) {
            // Hexagon background
            Image(
                painter = hexagonDrawable,
                contentDescription = null,
                modifier = Modifier.matchParentSize()
            )

            // Keto Image
            Image(
                painter = dietImage,
                contentDescription = "Keto",
                modifier = Modifier
                    .size(49.dp) // 15% bigger
                    .align(Alignment.TopCenter)
                    .offset(y = 34.dp)
            )
        }
        // Keto Text
        Text(
            text = dietTitle,
            color = textColor,
            textAlign = TextAlign.Center,
            style = TextStyle(
                fontSize = 16.sp,
                fontFamily = robotoregular,
                fontWeight = FontWeight(500),
                letterSpacing = 0.1.sp
            ),
            modifier = Modifier
                .offset(y = (-24).dp)
        )

    }


}


