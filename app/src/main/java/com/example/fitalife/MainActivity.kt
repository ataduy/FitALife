package com.example.fitalife

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.fitalife.auth.LoginScreen
import com.example.fitalife.auth.SetupProfileScreen
import com.example.fitalife.auth.SignupScreen
import com.example.fitalife.auth.WelcomeScreen
import com.example.fitalife.main.HomeScreen
import com.example.fitalife.main.NotificationMessage
import com.example.fitalife.ui.theme.FitALifeTheme
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            FitALifeTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    FitALife()
                }
            }
        }
    }
}

sealed class DestinationScreen(val route: String) {
    object Welcome: DestinationScreen("welcome")
    object Signup: DestinationScreen("signup")
    object Login: DestinationScreen("login")
    object SetupProfile: DestinationScreen("setup")
    object Home: DestinationScreen("home")
}

@Composable
fun FitALife() {
    val vm = hiltViewModel<AppViewModel>()
    val navController = rememberNavController()

    NotificationMessage(vm = vm)

    NavHost(navController = navController, startDestination = DestinationScreen.Welcome.route) {
        composable(DestinationScreen.Welcome.route) {
            WelcomeScreen(navController = navController, vm = vm)
        }
        composable(DestinationScreen.Signup.route) {
            SignupScreen(navController = navController, vm = vm)
        }
        composable(DestinationScreen.Login.route) {
            LoginScreen(navController = navController, vm = vm)
        }
        composable(DestinationScreen.SetupProfile.route) {
            SetupProfileScreen(navController = navController, vm = vm)
        }
        composable(DestinationScreen.Home.route) {
            HomeScreen(navController = navController, vm = vm)
        }
    }
}