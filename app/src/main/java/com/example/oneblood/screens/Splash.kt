package com.example.oneblood.scre

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.oneblood.R


@Preview(showBackground = true)
@Composable
fun Splash(){
    Box(modifier = Modifier
        .fillMaxSize()
        .background(MaterialTheme.colors.background)){
        Image(painter = painterResource(id = R.drawable.logo), contentDescription = "Splash image"
        ,contentScale = ContentScale.Inside)

            
        }


}

