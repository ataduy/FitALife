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
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowDropDown
import androidx.compose.material3.AlertDialog
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
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
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.fitalife.AppViewModel
import com.example.fitalife.R
import com.example.fitalife.ui.theme.robotoregular

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ProfileScreen(navController: NavController, vm: AppViewModel) {

    val isLoading = vm.inProgress.value
    if (isLoading) {
        CommonProgressSpinner()
    } else {
        val userData = vm.userData.value
        var gender by rememberSaveable { mutableStateOf(userData?.gender ?: "") }
        var weight by rememberSaveable { mutableStateOf(userData?.weight ?: "") }
        var height by rememberSaveable { mutableStateOf(userData?.height ?: "") }
        var age by rememberSaveable { mutableStateOf(userData?.age ?: "") }

        ProfileContent(
            navController = navController,
            gender = gender,
            weight = weight,
            height = height,
            age = age,
            onGenderChange = { gender = it },
            onWeightChange = { weight = it },
            onHeightChange = { height = it },
            onAgeChange = { age = it },
            onSave = { vm.updateProfileData(gender, weight, height, age) }
        )
    }


}

@Composable
@OptIn(ExperimentalMaterial3Api::class)
private fun ProfileContent(
    navController: NavController,
    gender: String,
    weight: String,
    height: String,
    age: String,
    onGenderChange: (String) -> Unit,
    onWeightChange: (String) -> Unit,
    onHeightChange: (String) -> Unit,
    onAgeChange: (String) -> Unit,
    onSave: () -> Unit
) {

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

            // Profile Settings Fields
            Column(
                modifier = Modifier.fillMaxSize(),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {

                // Sex
                Box(
                    modifier = Modifier
                        .border(
                            width = 2.dp,
                            color = Color(0xFFFFFFFF),
                            shape = RoundedCornerShape(size = 20.dp)
                        )
                        .width(295.dp)
                        .height(60.dp)
                        .background(
                            color = Color(0x269CABC2),
                            shape = RoundedCornerShape(size = 20.dp)
                        )
                ) {
                    Row(
                        modifier = Modifier
                            .fillMaxSize()
                            .padding(vertical = 8.dp, horizontal = 28.dp),
                        horizontalArrangement = Arrangement.SpaceBetween,
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Text(
                            text = "Sex",
                            style = TextStyle(
                                fontFamily = robotoregular,
                                fontSize = 18.sp,
                                fontWeight = FontWeight(500),
                                color = Color(0xFFFFFFFF),
                                letterSpacing = 0.1.sp,
                            )
                        )

                        GenderSelector(
                            selectedGender = gender,
                            onGenderChange = onGenderChange
                        )
                    }
                }
                // Weight
                Box(
                    modifier = Modifier
                        .padding(top= 24.dp)
                        .border(
                            width = 2.dp,
                            color = Color(0xFFFFFFFF),
                            shape = RoundedCornerShape(size = 20.dp)
                        )
                        .width(295.dp)
                        .height(60.dp)
                        .background(
                            color = Color(0x269CABC2),
                            shape = RoundedCornerShape(size = 20.dp)
                        )
                ) {
                    Row(
                        modifier = Modifier
                            .fillMaxSize()
                            .padding(vertical = 8.dp, horizontal = 28.dp),
                        horizontalArrangement = Arrangement.SpaceBetween,
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Text(
                            text = "Weight",
                            style = TextStyle(
                                fontFamily = robotoregular,
                                fontSize = 18.sp,
                                fontWeight = FontWeight(500),
                                color = Color(0xFFFFFFFF),
                                letterSpacing = 0.1.sp,
                            )
                        )

                        OutlinedTextField(
                            value = weight,
                            onValueChange = onWeightChange,
                            modifier = Modifier
                                .width(85.dp)
                                .height(50.dp)
                                .border(
                                    width = 2.dp,
                                    color = Color(0xFFF5F5F5),
                                    shape = RoundedCornerShape(size = 28.dp)
                                ),
                            shape = RoundedCornerShape(10.dp),
                            colors = TextFieldDefaults.textFieldColors(
                                containerColor = Color(0xFF225555),
                                cursorColor = Color.White,
                                textColor = Color.White,
                                focusedIndicatorColor = Color.Transparent,
                                unfocusedIndicatorColor = Color.Transparent
                            ),
                            singleLine = true,
                            textStyle = TextStyle(
                                fontSize = 10.sp
                            )
                        )
                    }
                }

                // Height
                Box(
                    modifier = Modifier
                        .padding(top= 24.dp)
                        .border(
                            width = 2.dp,
                            color = Color(0xFFFFFFFF),
                            shape = RoundedCornerShape(size = 20.dp)
                        )
                        .width(295.dp)
                        .height(60.dp)
                        .background(
                            color = Color(0x269CABC2),
                            shape = RoundedCornerShape(size = 20.dp)
                        )
                ) {
                    Row(
                        modifier = Modifier
                            .fillMaxSize()
                            .padding(vertical = 8.dp, horizontal = 28.dp),
                        horizontalArrangement = Arrangement.SpaceBetween,
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Text(
                            text = "Height",
                            style = TextStyle(
                                fontFamily = robotoregular,
                                fontSize = 18.sp,
                                fontWeight = FontWeight(500),
                                color = Color(0xFFFFFFFF),
                                letterSpacing = 0.1.sp,
                            )
                        )

                        OutlinedTextField(
                            value = height,
                            onValueChange = onHeightChange,
                            modifier = Modifier
                                .width(85.dp)
                                .height(50.dp)
                                .border(
                                    width = 2.dp,
                                    color = Color(0xFFF5F5F5),
                                    shape = RoundedCornerShape(size = 28.dp)
                                ),
                            shape = RoundedCornerShape(10.dp),
                            colors = TextFieldDefaults.textFieldColors(
                                containerColor = Color(0xFF225555),
                                cursorColor = Color.White,
                                textColor = Color.White,
                                focusedIndicatorColor = Color.Transparent,
                                unfocusedIndicatorColor = Color.Transparent
                            ),
                            singleLine = true,
                            textStyle = TextStyle(
                                fontSize = 10.sp
                            )
                        )
                    }
                }
                // Age
                Box(
                    modifier = Modifier
                        .padding(top= 24.dp)

                        .border(
                            width = 2.dp,
                            color = Color(0xFFFFFFFF),
                            shape = RoundedCornerShape(size = 20.dp)
                        )
                        .width(295.dp)
                        .height(60.dp)
                        .background(
                            color = Color(0x269CABC2),
                            shape = RoundedCornerShape(size = 20.dp)
                        )
                ) {
                    Row(
                        modifier = Modifier
                            .fillMaxSize()
                            .padding(vertical = 8.dp, horizontal = 28.dp),
                        horizontalArrangement = Arrangement.SpaceBetween,
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Text(
                            text = "Age",
                            style = TextStyle(
                                fontFamily = robotoregular,
                                fontSize = 18.sp,
                                fontWeight = FontWeight(500),
                                color = Color(0xFFFFFFFF),
                                letterSpacing = 0.1.sp,
                            )
                        )

                        OutlinedTextField(
                            value = age,
                            onValueChange = onAgeChange,
                            modifier = Modifier
                                .width(85.dp)
                                .height(50.dp)
                                .border(
                                    width = 2.dp,
                                    color = Color(0xFFF5F5F5),
                                    shape = RoundedCornerShape(size = 28.dp)
                                ),
                            shape = RoundedCornerShape(10.dp),
                            colors = TextFieldDefaults.textFieldColors(
                                containerColor = Color(0xFF225555),
                                cursorColor = Color.White,
                                textColor = Color.White,
                                focusedIndicatorColor = Color.Transparent,
                                unfocusedIndicatorColor = Color.Transparent
                            ),
                            singleLine = true,
                            textStyle = TextStyle(
                                fontSize = 10.sp
                            )
                        )
                    }
                }
                //

                Button(
                    onClick = { onSave.invoke() },
                    modifier = Modifier
                        .padding(top= 128.dp)
                        .border(
                            width = 2.dp,
                            color = Color(0xFFFFFFFF),
                            shape = RoundedCornerShape(size = 30.dp)
                        )
                        .width(255.dp)
                        .height(50.dp)
                        .background(
                            color = Color(0x599CABC2),
                            shape = RoundedCornerShape(size = 30.dp)
                        ),
                    colors = ButtonDefaults.buttonColors(
                        containerColor = Color(0x34FFFFFF)
                    )
                ) {
                    Text(text = "Continue",fontFamily = robotoregular,color = Color.Black)
                }




            }


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
                .size(50.dp)
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
                .size(50.dp)
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
                    .padding(10.dp)
                    .fillMaxSize()
                    .clip(CircleShape)
            )
        }

    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun GenderSelector(
    selectedGender: String,
    onGenderChange: (String) -> Unit
) {
    var showDialog by remember { mutableStateOf(false) }
    val genderOptions = listOf("Male", "Female")

    OutlinedTextField(
        value = selectedGender,
        onValueChange = { },
        readOnly = true,
        modifier = Modifier
            .width(100.dp)
            .height(50.dp)
            .border(
                width = 2.dp,
                color = Color(0xFFF5F5F5),
                shape = RoundedCornerShape(size = 28.dp)
            )
            .clickable { showDialog = true },
        trailingIcon = {
            Icon(
                imageVector = Icons.Default.ArrowDropDown,
                contentDescription = "Dropdown",
                modifier = Modifier.clickable { showDialog = true },
                tint = Color.White
            )
        },
        colors = TextFieldDefaults.textFieldColors(
            containerColor = Color(0xFF225555),
            cursorColor = Color.White,
            textColor = Color.White,
            focusedIndicatorColor = Color.Transparent,
            unfocusedIndicatorColor = Color.Transparent
        ),
        textStyle = TextStyle(
            fontSize = 10.sp
        )
    )

    if (showDialog) {
        AlertDialog(
            onDismissRequest = { showDialog = false },
            title = { Text("Select Gender") },
            text = {
                Column {
                    genderOptions.forEach { gender ->
                        TextButton(
                            onClick = {
                                onGenderChange(gender)
                                showDialog = false
                            }
                        ) {
                            Text(gender)
                        }
                    }
                }
            },
            confirmButton = {
                TextButton(
                    onClick = { showDialog = false }
                ) {
                    Text("Cancel")
                }
            }
        )
    }
}