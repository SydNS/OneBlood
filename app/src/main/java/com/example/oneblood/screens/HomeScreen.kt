package com.example.oneblood.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.BottomNavigation
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
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
        Box(
            modifier = Modifier
                .background(
                    brush = Brush.verticalGradient(
                        colors = listOf(
                            oneblod, oneblod2
                        ),
                    ),
                    shape = RoundedCornerShape(
                        bottomEnd = 90.dp,
                        bottomStart = 90.dp
                    )
                )
                .height(350.dp)
                .fillMaxWidth(),


            ) {

        }
    }
}