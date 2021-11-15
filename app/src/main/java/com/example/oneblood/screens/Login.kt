package com.example.oneblood.screens

import android.graphics.Paint
import androidx.compose.animation.ExperimentalAnimationApi
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.Button
import androidx.compose.material.OutlinedTextField
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.scale
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.oneblood.R

@ExperimentalAnimationApi
@Preview
@Composable
fun LoginScreen() {
    var visible = remember { mutableStateOf(true) }
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(color = Color.White, shape = RectangleShape)

    ) {

        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(20.dp, 40.dp)
                .background(color = Color.Red, shape = RoundedCornerShape(0.dp, 0.dp, 90.dp, 90.dp))

        ) {


            Image(
                painter = painterResource(id = R.drawable.logo),
                contentDescription = "Splash image",
                contentScale = ContentScale.Inside,
                modifier = Modifier
                    .height(300.dp)
                    .width(300.dp)
                    .align(alignment = Alignment.CenterHorizontally)
                    .graphicsLayer(alpha = 5F)
            )

            OutlinedTextField(
                value = "",
                placeholder = { Text(text = "Email Address") },
                onValueChange = {},
                modifier = Modifier.align(alignment = Alignment.CenterHorizontally),
//                label = { Text(text = "Email Address") },

                singleLine = true
            )
            OutlinedTextField(
                value = "",
                placeholder = { Text(text = "Password") },
                onValueChange = {},
                modifier = Modifier.align(alignment = Alignment.CenterHorizontally),
//                label = { Text(text = "Email Address") },

                singleLine = true
            )
        }


    }


}

@Preview
@Composable
fun SignIn() {
    Button(
        onClick = {}, modifier = Modifier
            .padding(top = 1.dp)
            .requiredWidth(177.dp)
    ) {
        Text(text = "Sign In")
    }
}
