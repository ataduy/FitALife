package com.example.fitalife.main

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowDropDown
import androidx.compose.material3.AlertDialog
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardColors
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Outline
import androidx.compose.ui.graphics.Path
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Density
import androidx.compose.ui.unit.LayoutDirection
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.fitalife.AppViewModel
import com.example.fitalife.R
import com.example.fitalife.data.DietLists
import com.example.fitalife.data.getDiets
import com.example.fitalife.ui.theme.robotoregular
import java.lang.Math.PI
import java.lang.Math.cos
import java.lang.Math.sin

@Composable
fun DietScreen(navController: NavController, vm: AppViewModel) {

    val dietList = getDiets()

    Surface(
        modifier = Modifier.fillMaxSize(),
        color = Color(0xFF225555)
    ) {

        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(24.dp)
        ) {

            Header(navController)

            KetoCard()






        }

    }


}

@Composable
private fun Header(navController: NavController) {
    Row(
        modifier = Modifier.fillMaxWidth(),
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
fun KetoCard() {
    // Assuming you have a hexagonal drawable as the background
    val hexagonDrawable = painterResource(id = R.drawable.frame_hexagon)
    val ketoImage = painterResource(id = R.drawable.ic_keto)

    Box(
        contentAlignment = Alignment.Center,
        modifier = Modifier
            .padding(16.dp)
            .size(width = 100.dp, height = 120.dp) // Adjust size as needed
            .background(
                brush = Brush.linearGradient(
                    colors = listOf(Color(0xFFD8E8E4), Color(0xFFD8E8E4))
                ),
                shape = RectangleShape
            )
            .clip(RoundedCornerShape(16.dp)) // Adjust the corner radius as needed
    ) {
        // Hexagon background
        Image(
            painter = hexagonDrawable,
            contentDescription = null,
            modifier = Modifier.matchParentSize()
        )

        // Keto Image
        Image(
            painter = ketoImage,
            contentDescription = "Keto",
            modifier = Modifier
                .size(64.dp) // Adjust the image size as needed
                .align(Alignment.TopCenter)
                .offset(y = 10.dp) // Adjust the offset as needed
        )

        // Keto Text
        Text(
            text = "Keto",
            color = Color.White,
            textAlign = TextAlign.Center,
            modifier = Modifier
                .align(Alignment.BottomCenter)
                .offset(y = (-10).dp) // Adjust the offset as needed
        )
    }
}


