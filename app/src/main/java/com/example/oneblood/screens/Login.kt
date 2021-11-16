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
            .padding(0.dp, 140.dp, 0.dp, 10.dp)
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

        OutlinedTextField(
            value = "",
            colors = TextFieldDefaults.outlinedTextFieldColors(
                focusedBorderColor = Color.Red,
                focusedLabelColor = Color.Red,
                cursorColor = Color.Red
            ),
            placeholder = { Text(text = "Email Address") },
            textStyle = TextStyle(color = Color.White),
            onValueChange = {},
            modifier = Modifier
                .align(alignment = Alignment.CenterHorizontally)
                .padding(0.dp, 5.dp),
            label = { Text(text = "Email Address") },

            singleLine = true
        )
        OutlinedTextField(
            value = "",
            colors = TextFieldDefaults.outlinedTextFieldColors(
                focusedBorderColor = Color.Red,
                focusedLabelColor = Color.Red,
                cursorColor = Color.Red
            ),
            placeholder = { Text(text = "Password") },
            onValueChange = {},
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
            .padding(10.dp, 0.dp)
            .fillMaxWidth()
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
        onClick = {}, modifier = Modifier
            .padding(1.dp)
            .wrapContentSize(align = Alignment.CenterEnd)
    ) {
        Row {
            Icon(
                imageVector = Icons.Default.Phone,
                contentDescription = null,
                modifier = Modifier.padding(end = 4.dp)
            )
            Text(text = "Phone")
        }
    }

}

@Preview
@Composable
fun GoogleSignUp() {
    // Icon Button
    // Icon on the Right of text
    Button(
        onClick = {}, modifier = Modifier.padding(1.dp), colors = ButtonDefaults.buttonColors(
            backgroundColor = Color.Red
        )
    ) {
        Text(text = "Gmail", color = Color.White)
        Icon(
            imageVector = Icons.Default.Email,
            contentDescription = null,
            modifier = Modifier.padding(start = 4.dp)
        )
    }
}
