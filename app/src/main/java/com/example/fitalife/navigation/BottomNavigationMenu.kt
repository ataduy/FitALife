package com.example.fitalife.navigation

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.fitalife.DestinationScreen
import com.example.fitalife.R
import com.example.fitalife.main.navigateTo

enum class BottomNavigationItem(val icon: Int, val navDestination: DestinationScreen) {
    HOME(R.drawable.ic_home, DestinationScreen.Home),
    NOTE(R.drawable.ic_note, DestinationScreen.Home),
    MEAL(R.drawable.ic_meal, DestinationScreen.Home),
    CART(R.drawable.ic_cart, DestinationScreen.Home),
}


@Composable
fun BottomNavigationMenu(selectedItem: BottomNavigationItem, navController: NavController) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .wrapContentHeight()
            .padding(top = 26.dp)
            .border(
                width = 2.dp,
                color = Color(0xFF000000),
                shape = RoundedCornerShape(size = 40.dp)
            )
            .background(color = Color(0xFFECF0F3), shape = RoundedCornerShape(size = 40.dp)),
        horizontalArrangement = Arrangement.Center
    ) {

        Row(Modifier.padding(horizontal = 5.dp ,vertical = 8.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceEvenly
        ) {

            for (item in BottomNavigationItem.values()) {
                    Image(painter = painterResource(id = item.icon),
                        contentDescription = null,
                        modifier = Modifier
                            .padding(10.dp)
                            .clip(CircleShape)
                            .size(45.dp)
                            .weight(1f)
                            .clickable {
                                navigateTo(navController, item.navDestination)
                            },
                        colorFilter = if (item == selectedItem) ColorFilter.tint(Color.Blue)
                        else ColorFilter.tint(Color.Gray)
                    )

            }

        }


    }
}