package com.example.oneblood.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.oneblood.R
import com.example.oneblood.ui.theme.Typography


@Preview
@Composable
fun Grid(){
    Column(modifier = Modifier.fillMaxWidth().wrapContentHeight()
        .padding(20.dp,10.dp)) {
       Row (horizontalArrangement = Arrangement.SpaceEvenly){
           Personitem()
           Personitem()
       }
        Row (horizontalArrangement = Arrangement.SpaceEvenly){
           Personitem()
           Personitem()
       }
    }
}

@Preview
@Composable
fun Personitem() {
    Column(
        modifier = Modifier
            .height(200.dp)
            .width(180.dp)
            .padding(2.dp)
            .wrapContentSize()
    ) {
        Card(elevation = 5.dp) {
            Column(modifier = Modifier.padding(10.dp)) {
                Image(
                    modifier = Modifier
                        .height(150.dp)
                        .width(150.dp)
                        .align(Alignment.CenterHorizontally)
                        .clip(CircleShape),
                    contentScale = ContentScale.Crop,
                    painter = painterResource(id = R.drawable.blood2),
                    contentDescription = "image to display"
                )
                Box(modifier = Modifier.wrapContentSize()) {
                    userdinforow()
                }
            }
        }


    }

}


@Preview
@Composable
fun userdinforow() {
    Column(
        modifier = Modifier
            .padding(2.dp)
            .wrapContentSize()
    ) {
        Text(
            text = "Sydney's Sydney",
            Modifier.padding(top = 0.dp),
            color = Color.Black,
            style = Typography.h4,
            fontSize = 15.sp,
            textAlign = TextAlign.Left
        )
//        Text(
//            text = "Sydney's Sydney Sydney's Sydney" +
//                    " Sydney's Sydney Sydney's Sydney" ,
//            Modifier.padding(top = 5.dp),
//            color = Color.Black,
//            style = Typography.h4,
//            fontSize = 12.sp,
//            textAlign = TextAlign.Left
//        )
    }
}
