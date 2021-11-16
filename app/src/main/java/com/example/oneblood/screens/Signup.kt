package com.example.oneblood.screens

import android.graphics.Paint
import android.util.Log
import android.widget.Toast
import androidx.compose.animation.ExperimentalAnimationApi
import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.ClickableText
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Warning
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.scale
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.oneblood.R
import com.example.oneblood.ui.theme.oneblod
import com.example.oneblood.ui.theme.oneblod2
import org.intellij.lang.annotations.JdkConstants

@ExperimentalAnimationApi
//@Preview
@Composable
fun SignupScreen(navController: NavController) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(color = Color.White, shape = RectangleShape)

    ) {

        Column {
            SignupContent(navController)
            LoginLinks()
        }


    }


}

@Composable
fun SignupContent(navController: NavController) {
    Column(
        modifier = Modifier
            .fillMaxWidth(1f)
            .padding(1.dp, 100.dp, 1.dp, 10.dp)
            .wrapContentHeight(align = Alignment.CenterVertically)
            .background(
                brush = Brush.verticalGradient(
                    colors = listOf(
                        oneblod2, oneblod
                    ),
                ),
                shape = RoundedCornerShape(
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
                unfocusedBorderColor = Color.White,
                unfocusedLabelColor = Color.White
            ),
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
            visualTransformation = PasswordVisualTransformation(),
            onValueChange = { textPassd.value = it },
            colors = TextFieldDefaults.outlinedTextFieldColors(
                focusedBorderColor = Color.White,
                focusedLabelColor = Color.White,
                cursorColor = Color.White,
                unfocusedBorderColor = Color.White,
                unfocusedLabelColor = Color.White,
                placeholderColor = Color.White
            ),
            textStyle = TextStyle(color = Color.White),
            modifier = Modifier
                .align(alignment = Alignment.CenterHorizontally)
                .padding(0.dp, 5.dp),
            label = { Text(text = "Password") },
            singleLine = true
        )

        val textPassd2 = remember { mutableStateOf("") }

        OutlinedTextField(
            value = textPassd2.value,
            visualTransformation = PasswordVisualTransformation(),
            onValueChange = { textPassd2.value = it },
            colors = TextFieldDefaults.outlinedTextFieldColors(
                focusedBorderColor = Color.White,
                focusedLabelColor = Color.White,
                cursorColor = Color.White,
                unfocusedBorderColor = Color.White,
                unfocusedLabelColor = Color.White,
                placeholderColor = Color.White
            ),
            textStyle = TextStyle(color = Color.White),
            modifier = Modifier
                .align(alignment = Alignment.CenterHorizontally)
                .padding(0.dp, 5.dp),
            label = { Text(text = "Confirm Password") },
            singleLine = true
        )


        Box(modifier = Modifier.align(alignment = Alignment.CenterHorizontally)) {
            loginbutton(navController)
        }

    }
}


@Composable
fun loginbutton(navController: NavController) {
    Button(
        shape = RoundedCornerShape(10.dp),
        onClick = {
            navController.navigate("Login")
        },
        colors = ButtonDefaults.buttonColors(
            backgroundColor = colorResource(R.color.loginbtn),
        ),
        modifier = Modifier
            .padding(0.dp, 10.dp)
            .width(280.dp)
            .height(50.dp),

        ) {
        Text(
            text = stringResource(id = R.string.login), color = Color.White
        )

    }
}

@Preview
@Composable
fun SignUp() {
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
fun LoginLinks() {
    Column(
        modifier = Modifier
            .wrapContentHeight()
            .padding(20.dp, 10.dp)
            .wrapContentWidth()
    ) {
        Signinlink()
        SocialRegister()
    }

}

@Preview
@Composable
fun Signinlink() {
    Text(
        modifier = Modifier
            .fillMaxWidth()
            .clickable {

            },
        text = stringResource(id = R.string.loginLink),
        fontStyle = FontStyle(R.font.cavdreams),
        textAlign = TextAlign.Center,
        fontSize = 15.sp,
        fontWeight = FontWeight.Light
    )
//    AnnotatedClickableText()
    Divider(
        modifier = Modifier.padding(15.dp, 10.dp, 15.dp, 10.dp),
        color = Color.Gray,
        thickness = 1.dp
    )

}

@Preview
@Composable
fun AnnotatedClickableText() {
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
                "Already Have an account ?"
            )

        }

        //Start of the pushing annotation which you want to color and make them clickable later
        pushStringAnnotation(
            tag = "SignUp",// provide tag which will then be provided when you click the text
            annotation = "SignUp"
        )
        //add text with your different color/style
        withStyle(
            style = SpanStyle(
                color = Color.Red,
            )
        ) {
            append("Sign Up")
        }
        // when pop is called it means the end of annotation with current tag
        pop()
    }

    ClickableText(
        text = annotatedText,
        onClick = { offset ->
            annotatedText.getStringAnnotations(
                tag = "SignUp",// tag which you used in the buildAnnotatedString
                start = offset,
                end = offset
            )[0].let { annotation ->
                //do your stuff when it gets clicked

            }
        }
    )
}

