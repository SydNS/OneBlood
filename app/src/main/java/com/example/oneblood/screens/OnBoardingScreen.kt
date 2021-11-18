package com.example.oneblood.screens

import androidx.annotation.FloatRange
import androidx.compose.animation.core.animateDpAsState
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowForward
import androidx.compose.material.icons.filled.Email
import androidx.compose.runtime.Composable
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ImageBitmap
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.fontResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.viewpager2.widget.ViewPager2
import com.example.oneblood.R
import com.example.oneblood.dataclasses.OnBoardingData
import com.example.oneblood.ui.theme.Purple200
import com.example.oneblood.ui.theme.Typography
import com.example.oneblood.ui.theme.oneblod
import com.example.oneblood.ui.theme.oneblod2
import com.google.accompanist.pager.ExperimentalPagerApi
import com.google.accompanist.pager.HorizontalPager
import com.google.accompanist.pager.PagerState
import java.util.ArrayList


@ExperimentalPagerApi
@Composable
fun OnBoardingScreen(
    navController: NavController
) {


    val items = ArrayList<OnBoardingData>()
    items.add(
        OnBoardingData(
            R.drawable.blood6,
            "Welcome To OneBlood",
            "help medical personnel and patients in need of blood donation to look up for someone with the same blood type"
        )
    )
    items.add(
        OnBoardingData(
            R.drawable.blood2,
            "Lend a helping hand",
            "having a list of donors to select from provides comfort and assurance that the patients in question shall be attended to"
        )
    )
    items.add(
        OnBoardingData(
            R.drawable.blood8,
            "All Efforts are notices",
            "Donors will recieve points from the recipients which they can always redeem and use to acquire health services or even reduce their health services bills"
        )
    )

    val pagerState = rememberPagerState(
        pageCount = items.size,
        initialOffscreenLimit = 2,
        infiniteLoop = false,
        initialPage = 0,
    )

    val cavdreams = FontFamily(
        Font(R.font.cavdreams, FontWeight.Light)
    )

    Box(modifier = Modifier.padding(bottom = 10.dp)) {
        Column(horizontalAlignment = Alignment.CenterHorizontally) {
            HorizontalPager(state = pagerState) { page ->
                Column(
                    modifier = Modifier
                        .padding(top = 60.dp)
                        .fillMaxWidth(), horizontalAlignment = Alignment.CenterHorizontally
                ) {

                    Image(
                        painter = painterResource(id = items[page].image),
                        contentDescription = items[page].title,
                        modifier = Modifier
                            .height(250.dp)
                            .fillMaxWidth()
                    )

                    Text(
                        text = items[page].title,
                        modifier = Modifier.padding(top = 10.dp), color = Color.Black,
                        style = Typography.h3,
                        fontWeight = FontWeight.SemiBold,
                        textAlign = TextAlign.Center,
                        fontFamily = cavdreams

                    )

                    Text(
                        text = items[page].desc,
                        modifier = Modifier.padding(top = 30.dp, start = 10.dp, end = 10.dp,bottom = 20.dp),
                        color = Color.Black,
                        style = Typography.body1,
                        fontSize = 20.sp,
                        textAlign = TextAlign.Center,
                        fontFamily = cavdreams

                    )

                }
            }

            PagerIndicator(items.size, pagerState.currentPage)
        }

        Box(modifier = Modifier.align(Alignment.BottomCenter)) {
            BottomSection(pagerState.currentPage, navController)
        }
    }
}

@ExperimentalPagerApi
@Composable
fun rememberPagerState(
    @androidx.annotation.IntRange(from = 0) pageCount: Int,
    @androidx.annotation.IntRange(from = 0) initialPage: Int = 0,
    @FloatRange(from = 0.0, to = 1.0) initialPageOffset: Float = 0f,
    @androidx.annotation.IntRange(from = 1) initialOffscreenLimit: Int = 1,
    infiniteLoop: Boolean = false
): PagerState = rememberSaveable(saver = PagerState.Saver) {
    PagerState(
        pageCount = pageCount,
        currentPage = initialPage,
        currentPageOffset = initialPageOffset,
        offscreenLimit = initialOffscreenLimit,
        infiniteLoop = infiniteLoop
    )
}

@Composable
fun PagerIndicator(size: Int, currentPage: Int) {
    Row(

        horizontalArrangement = Arrangement.SpaceBetween,
        modifier = Modifier.padding(top = 90.dp)
    ) {
        repeat(size) {
            Indicator(isSelected = it == currentPage)
        }
    }
}

@Composable
fun Indicator(isSelected: Boolean) {
    val width = animateDpAsState(targetValue = if (isSelected) 25.dp else 10.dp)

    Box(
        modifier = Modifier
            .padding(1.dp)
            .height(10.dp)
            .width(width.value)
            .clip(CircleShape)
            .background(
                if (isSelected) Color.Red else Color.DarkGray.copy(alpha = 0.5f)
            )
    )
}

@Composable
fun BottomSection(currentPager: Int, navController: NavController) {
    Row(
        modifier = Modifier
            .padding(bottom = 20.dp)
            .fillMaxWidth(),
        horizontalArrangement = if (currentPager != 2) Arrangement.SpaceBetween else Arrangement.Center
    ) {

        if (currentPager == 2) {
            Button(
                onClick = {
                    navController.navigate("Login")
                },
                elevation = ButtonDefaults.elevation(5.dp),
                colors = ButtonDefaults.buttonColors(
                    backgroundColor =
                    colorResource(id = R.color.oneblood)
                ),
                shape = RoundedCornerShape(50), // = 40% percent
            ) {
                Text(
                    text = "Get Started",
                    modifier = Modifier.padding(vertical = 8.dp, horizontal = 40.dp),
                    color = Color.White
                )
            }
        } else if (currentPager == 0) {

            SkipNextButton("", Modifier.padding(end = 20.dp))
            SkipNextButton(
                "Next",
                Modifier
                    .padding(end = 20.dp)
                    .clickable(enabled = true, onClick = {
                        currentPager == 1
                    })
            )
        } else {
            SkipNextButton("Prev", Modifier.padding(start = 20.dp))
            SkipNextButton("Next", Modifier.padding(end = 20.dp))
        }

    }
}

@Composable
fun SkipNextButton(text: String, modifier: Modifier) {
    Text(
        text = text, color = oneblod, modifier = modifier, fontSize = 18.sp,
        style = Typography.body1,
        fontWeight = FontWeight.Medium
    )

}
