package com.example.oneblood.screens


import android.widget.Toast
import androidx.compose.animation.ExperimentalAnimationApi
import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
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
fun ResetpasswordScreen(navController: NavController) {
    var visible = remember { mutableStateOf(true) }
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(color = Color.White, shape = RectangleShape)

    ) {

        Column {
            ReseContent(navController)
            UsefulLinks(navController)
        }


    }


}

@Composable
fun ReseContent(navController: NavController) {
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
            trailingIcon = {
                IconButton(
                    onClick = {
                    },
                ) {
                    Icon(
                        Icons.Default.Email,
                        contentDescription = "Localized description",
                        tint = Color.White
                    )
                }
            },
            textStyle = TextStyle(color = Color.White),
            modifier = Modifier
                .align(alignment = Alignment.CenterHorizontally)
                .padding(0.dp, 5.dp),
            label = { Text(text = "Email Address") },
            singleLine = true
        )


        Button(
            shape = RoundedCornerShape(10.dp),
            onClick = {
                navController.navigate("Register")
            },
            elevation = ButtonDefaults.elevation(5.dp),
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





