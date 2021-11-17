package com.example.oneblood.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.oneblood.R

@Preview
@Composable
fun Personitem() {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(3.dp)
    ) {
        Image(
            modifier = Modifier
                .height(150.dp)
                .width(150.dp)
                .clip(CircleShape),
            contentScale = ContentScale.Crop,
            painter = painterResource(id = R.drawable.blood2),
            contentDescription = "image to display"
        )

    }

}