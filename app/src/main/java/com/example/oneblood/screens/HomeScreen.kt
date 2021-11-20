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
import androidx.compose.ui.text.style.TextDecoration
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

        Column(
            modifier = Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.SpaceEvenly
        ) {
            Topsecetiontext()
            TopsectionRow()

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
                color = Color.White,
                fontStyle = FontStyle(R.font.cavdreams),
                fontWeight = FontWeight.Light,
                fontSize = 34.sp
            )
        ) {
            append(
                "GIVE THE GIFT OF LIFE\n"
            )

        }
        //add text with your different color/style
        withStyle(
            style = SpanStyle(
                color = Color.White,
                fontFamily = cavdreams,
                fontSize = 43.sp,
                fontWeight = FontWeight.Bold,
                textDecoration = TextDecoration.Underline

            )

        ) {
            append("DONATE")
        }
        //add text with your different color/style
        withStyle(
            style = SpanStyle(
                color = oneblod,
                background = Color.White,
                fontFamily = cavdreams,
                fontSize = 43.sp,
                fontWeight = FontWeight.Bold
            )

        ) {
            append(" BLOOD ")
        }

    }

    Text(
        text = annotatedText,
        color = Color.White,
        modifier = Modifier.padding(start = 20.dp, end = 20.dp, bottom = 1.dp, top = 30.dp),
        fontFamily = cavdreams,
        style = Typography.h5,
        softWrap = true
    )

}


@Preview
@Composable
fun TopsectionRow(): Unit {

    Row(
        modifier = Modifier
            .padding(start = 20.dp, end = 20.dp, bottom = 10.dp, top = 1.dp)
            .background(Color.Blue)
            .fillMaxWidth()
            .height(150.dp)
    ) {

    }

}


@Preview
@Composable
fun Topstats(): Unit {

    Column(
        modifier = Modifier.wrapContentSize()
    ) {
        Row(modifier = Modifier
            .width(100.dp)
            .height(90.dp)) {


        }

    }

}