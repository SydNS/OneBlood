package com.example.oneblood.screens


import androidx.compose.animation.ExperimentalAnimationApi
import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Phone
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.oneblood.R
import com.example.oneblood.ui.theme.Purple500
import com.example.oneblood.ui.theme.oneblod
import com.example.oneblood.ui.theme.oneblod2
import com.example.oneblood.ui.theme.onewhite

@ExperimentalAnimationApi
//@Preview
@Composable
fun LoginScreen(navController: NavController) {
    var visible = remember { mutableStateOf(true) }
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(color = Color.White, shape = RectangleShape)

    ) {

        Column {
            LoginContent(navController)
            UsefulLinks(navController)
        }


    }


}

@Composable
fun LoginContent(navController: NavController) {
    Column(
        modifier = Modifier
            .fillMaxWidth(1f)
            .padding(1.dp, 140.dp, 1.dp, 10.dp)
            .wrapContentHeight(align = Alignment.CenterVertically)
            .background(

                brush = Brush.verticalGradient(
                    colors = listOf(
                        oneblod2, oneblod
                    ),
                )
//                color = colorResource(R.color.oneblood),
                , shape = RoundedCornerShape(
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

        Button(
            shape = RoundedCornerShape(10.dp),
            onClick = {
                navController.navigate("Register")
            },
            elevation = ButtonDefaults.elevation(3.dp),
            colors = ButtonDefaults.buttonColors(
                backgroundColor = colorResource(R.color.loginbtn),
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


//@Preview
@Composable
fun UsefulLinks(navController: NavController) {
    Column(
        modifier = Modifier
            .wrapContentHeight()
            .padding(20.dp, 10.dp)
            .wrapContentWidth()
    ) {
        Registerlink(navController)
        SocialRegister()
    }

}

//@Preview
@Composable
fun Registerlink(navController: NavController) {
    Text(
        modifier = Modifier
            .fillMaxWidth()
            .clickable(enabled = true, onClick = {
                navController.navigate("Register")
            }),
        text = stringResource(id = R.string.registerLink),
        fontStyle = FontStyle(R.font.cavdreams),
        textAlign = TextAlign.Center,
        fontSize = 15.sp,
        fontWeight = FontWeight.Light
    )
    Divider(
        modifier = Modifier.padding(15.dp, 10.dp, 15.dp, 10.dp),
        color = Color.Gray,
        thickness = 1.dp
    )

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
        shape = RoundedCornerShape(10.dp),
        onClick = {}, modifier = Modifier
            .padding(1.dp)
            .size(120.dp, 50.dp), colors = ButtonDefaults.buttonColors(
            backgroundColor = colorResource(id = R.color.phone),
            contentColor = Color.White
        )

    ) {
        Row {
            Icon(
                imageVector = Icons.Default.Phone,
                contentDescription = null,
                modifier = Modifier.padding(end = 0.dp)
            )
            Text(
                text = "Phone",
                fontSize = 20.sp,
                fontWeight = FontWeight.Light
            )
        }
    }

}

@Preview
@Composable
fun GoogleSignUp() {
    // Icon Button
    // Icon on the Right of text
    Button(
        shape = RoundedCornerShape(12.dp),
        onClick = {},
        modifier = Modifier
            .padding(1.dp)
            .size(120.dp, 50.dp),

        colors = ButtonDefaults.buttonColors(
            backgroundColor = colorResource(id = R.color.oneblood),
            contentColor = Color.White
        )
    ) {
        Text(
            text = "Gmail",
            color = Color.White,
            fontSize = 20.sp,
            fontWeight = FontWeight.Light
        )
        Icon(
            imageVector = Icons.Default.Email,
            contentDescription = null,
            modifier = Modifier.padding(start = 4.dp)
        )
    }
}
