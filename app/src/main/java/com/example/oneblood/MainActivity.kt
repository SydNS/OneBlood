package com.example.oneblood

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.animation.*
import androidx.compose.animation.core.AnimationState
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.oneblood.dataclasses.OnBoardingData
import com.example.oneblood.scre.Splash
import com.example.oneblood.screens.LoginScreen
import com.example.oneblood.screens.OnBoardingScreen
import com.example.oneblood.screens.SignupScreen
import com.example.oneblood.screens.rememberPagerState
import com.example.oneblood.ui.theme.OneBloodTheme
import com.google.accompanist.pager.ExperimentalPagerApi

class MainActivity : ComponentActivity() {
    @ExperimentalPagerApi
    @ExperimentalAnimationApi
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            OneBloodTheme {
                // A surface container using the 'background' color from the theme
                Surface(color = MaterialTheme.colors.background) {
                    Navigation()
                }
            }
        }
    }
}

@Composable
fun Greeting() {
    DefaultPreview()
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    OneBloodTheme {

    }
}

@ExperimentalPagerApi
@ExperimentalAnimationApi
@Composable
fun Navigation() {
//
//    val items=ArrayList<OnBoardingData>()
//    items.add(
//        OnBoardingData(
//            R.drawable.blood2,
//            "Welcome To OneBlood",
//            "help medical personnel and patients in need of blood donation to look up for someone with the same blood type"
//        )
//    )
//    items.add(
//        OnBoardingData(
//            R.drawable.blood4,
//            "Lend a helping hand",
//            "having a list of donors to select from provides comfort and assurance that the patients in question shall be attended to"
//        )
//    )
//    items.add(
//        OnBoardingData(
//            R.drawable.blood6,
//            "All Efforts are notices",
//            "Donors will recieve points from the recipients which they can always redeem and use to acquire health services or even reduce their health services bills"
//        )
//    )


    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = "splash") {

        composable("onboarding") { OnBoardingScreen() }
        composable("splash") { Splash(navController) }
        composable("Login") { LoginScreen(navController) }
        composable("Register") { SignupScreen(navController) }


    }


}


