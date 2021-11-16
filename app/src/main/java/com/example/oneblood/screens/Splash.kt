package com.example.oneblood.scre

import android.view.animation.OvershootInterpolator
import androidx.compose.animation.Animatable
import androidx.compose.animation.core.tween
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.scale
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.oneblood.R
import kotlinx.coroutines.delay


//@Preview(showBackground = true)
@Composable
fun Splash(navController: NavController){
    val scale=remember{
        androidx.compose.animation.core.Animatable(0f)
    }
    LaunchedEffect(key1 = true ){
        scale.animateTo(targetValue = 1f,animationSpec = tween(
            durationMillis =   500,
            easing={
                OvershootInterpolator(2f)
                    .getInterpolation(it)
            }
        ))
        delay(1000L)
        navController.navigate("Login")
    }
    Box(modifier = Modifier
        .fillMaxSize()
        .background(MaterialTheme.colors.background)){
        Image(painter = painterResource(id = R.drawable.logo), contentDescription = "Splash image"
        ,contentScale = ContentScale.Inside,
            modifier = Modifier
                .height(200.dp)
                .width(200.dp)
                .scale(scale.value)
                .align(alignment = Alignment.Center)
                .graphicsLayer(alpha = 5F))



            
        }


}

