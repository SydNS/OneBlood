package com.example.oneblood.screens

import android.graphics.Paint
import androidx.compose.animation.ExperimentalAnimationApi
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.FavoriteBorder
import androidx.compose.material.icons.filled.Phone
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
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
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

        Column {
            LoginContent()
            UsefulLinks()
        }


    }


}

@Composable
fun LoginContent() {
    Column(
        modifier = Modifier
            .fillMaxWidth(1f)
            .padding(1.dp, 140.dp, 1.dp, 10.dp)
            .wrapContentHeight(align = Alignment.CenterVertically)
            .background(
                color = Color.Red, shape = RoundedCornerShape(
                    250.dp,
                    0.dp, 250.dp, 250.dp
                )
            )

    ) {

        Image(
            painter = painterResource(id = R.drawable.logo),
            contentDescription = "Splash image",
            contentScale = ContentScale.Inside,
            modifier = Modifier
                .height(200.dp)
                .width(200.dp)
                .align(alignment = Alignment.CenterHorizontally)
                .graphicsLayer(alpha = 5F)
        )
        val textEmail = remember { mutableStateOf("") }
        OutlinedTextField(
            value = textEmail.value,
            onValueChange = { textEmail.value = it },
            colors = TextFieldDefaults.outlinedTextFieldColors(
                focusedBorderColor = Color.White,
                focusedLabelColor = Color.White,
                cursorColor = Color.White,
                unfocusedBorderColor = Color.White
            ),
            placeholder = { Text(text = "Email Address") },
            textStyle = TextStyle(color = Color.White),
            modifier = Modifier
                .align(alignment = Alignment.CenterHorizontally)
                .padding(0.dp, 5.dp),
            label = { Text(text = "Email Address") },

            singleLine = true
        )

        val textPassd = remember { mutableStateOf("") }
        OutlinedTextField(
            value = textPassd.value,
            onValueChange = { textPassd.value = it },
            colors = TextFieldDefaults.outlinedTextFieldColors(
                focusedBorderColor = Color.White,
                focusedLabelColor = Color.White,
                cursorColor = Color.White,
                unfocusedBorderColor = Color.White
            ),
            placeholder = { Text(text = "Password") },
            modifier = Modifier
                .align(alignment = Alignment.CenterHorizontally)
                .padding(0.dp, 5.dp),
            label = { Text(text = "Password") },

            singleLine = true
        )

        OutlinedButton(
            onClick = { /*TODO*/ },
            colors = ButtonDefaults.buttonColors(
                backgroundColor = Color.Blue,
            ),
            modifier = Modifier
                .padding(0.dp, 10.dp)
                .align(alignment = Alignment.CenterHorizontally)
                .width(280.dp)
                .height(50.dp),

            ) {
            Text(
                text = stringResource(id = R.string.login), color = Color.White
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
            .requiredWidth(200.dp)
    ) {
        Text(text = "Sign In")
    }
}


@Preview
@Composable
fun UsefulLinks() {
    Column(
        modifier = Modifier
            .wrapContentHeight()
            .padding(20.dp, 10.dp)
            .wrapContentWidth()
    ) {
        Registerlink()
        SocialRegister()
    }

}

@Preview
@Composable
fun Registerlink() {
    Text(
        modifier = Modifier.fillMaxWidth(),
        text = stringResource(id = R.string.registerLink),
        fontStyle = FontStyle(R.font.cavdreams),
        textAlign = TextAlign.Center
    )
    Divider(color = Color.Gray, thickness = 1.dp)

}

@Preview
@Composable
fun SocialRegister() {
    Row(
        modifier = Modifier
            .padding(1.dp, 10.dp)
            .fillMaxWidth(),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceEvenly
    ) {
        GoogleSignUp()
        FacebookSignUp()

    }
}

@Preview
@Composable
fun FacebookSignUp() {
    // Icon Button
    // Icon on the left of text
    Button(
        shape = RoundedCornerShape(30.dp),
        onClick = {}, modifier = Modifier
            .padding(1.dp)
            .size(120.dp, 50.dp), colors = ButtonDefaults.buttonColors(
            backgroundColor = Color.Red,
            contentColor = Color.White
        )

    ) {
        Row {
            Icon(
                imageVector = Icons.Default.Phone,
                contentDescription = null,
                modifier = Modifier.padding(end = 4.dp)
            )
            Text(text = "Phone", fontSize = 20.sp)
        }
    }

}

@Preview
@Composable
fun GoogleSignUp() {
    // Icon Button
    // Icon on the Right of text
    Button(
        shape = RoundedCornerShape(30.dp),
        onClick = {},
        modifier = Modifier
            .padding(1.dp)
            .size(120.dp, 50.dp),

        colors = ButtonDefaults.buttonColors(
            backgroundColor = Color.Red,
            contentColor = Color.White
        )
    ) {
        Text(text = "Gmail", color = Color.White, fontSize = 20.sp)
        Icon(
            imageVector = Icons.Default.Email,
            contentDescription = null,
            modifier = Modifier.padding(start = 4.dp)
        )
    }
}
