package com.example.oneblood.scre

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.oneblood.R


@Preview(showBackground = true)
@Composable
fun Splash(){
    Box(modifier = Modifier
        .fillMaxSize()
        .background(MaterialTheme.colors.background)){
        Image(painter = painterResource(id = R.drawable.logo), contentDescription = "Splash image"
        ,contentScale = ContentScale.Inside,
            modifier = Modifier.height(200.dp).width(200.dp)
                .align(alignment = Alignment.Center)
                .graphicsLayer(alpha = 5F))

            
        }


}

