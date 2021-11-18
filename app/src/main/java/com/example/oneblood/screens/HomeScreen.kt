package com.example.oneblood.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.BottomNavigation
import androidx.compose.material.Text
import androidx.compose.material.Typography
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.oneblood.R
import com.example.oneblood.ui.theme.Typography
import com.example.oneblood.ui.theme.oneblod
import com.example.oneblood.ui.theme.oneblod2

@Preview
@Composable
fun HomeScreen() {

    Column(
        modifier = Modifier
            .background(
                color = Color.White, shape = RectangleShape
            )
            .fillMaxSize(),
    ) {
        Topsection()
    }
}

val cavdreams = FontFamily(
    Font(R.font.cavdreams, FontWeight.Light)
)

@Preview
@Composable
fun Topsection(): Unit {
    Box(
        modifier = Modifier
            .background(
                brush = Brush.verticalGradient(
                    colors = listOf(
                        oneblod, oneblod2
                    ), startY = 260.0f, endY = 1900.0f
                ),
                shape = RoundedCornerShape(
                    bottomEnd = 90.dp,
                    bottomStart = 90.dp
                )
            )
            .height(350.dp)
            .fillMaxWidth(),

        ) {

        Column(modifier = Modifier.fillMaxSize()) {
            Topsecetiontext()

        }

    }
}

@Preview
@Composable
fun Topsecetiontext(): Unit {
    val annotatedText = buildAnnotatedString {
        //append your initial text
        withStyle(

            style = SpanStyle(
                color = Color.Gray,
                fontStyle = FontStyle(R.font.cavdreams),
                fontSize = 15.sp,
                fontWeight = FontWeight.Light
            )
        ) {
            append(
                "GIVE THE GIFT OF LIFE"
            )

        }

        //add text with your different color/style
        withStyle(
            style = SpanStyle(
                color = Color.Red,
                fontSize = 15.sp,
                background = Color.White,
                fontFamily = cavdreams
            )
        ) {
            append("Sign Up")
        }

    }

    Text(
        text = annotatedText,
        color = Color.White,
        modifier = Modifier.padding(20.dp, 50.dp),
        fontFamily = cavdreams
    )

}