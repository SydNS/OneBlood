package com.example.oneblood.screens

import androidx.annotation.FloatRange
import androidx.compose.animation.core.animateDpAsState
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.material.Typography
import androidx.compose.runtime.Composable
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ImageBitmap
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.viewpager2.widget.ViewPager2
import com.example.oneblood.R
import com.example.oneblood.dataclasses.OnBoardingData
import com.example.oneblood.ui.theme.Typography
import java.util.ArrayList

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
        currentPageOffset = initialOffscreenLimit,
        infiniteLoop = infiniteLoop
    )

}

@ExperimentalPagerApi
@Composable
fun OnBoardingScreen(
    items: ArrayList<OnBoardingData>,
    modifier: Modifier = Modifier

) {
    items.add(
        OnBoardingData(
            R.drawable.blood2,
            "Welcome To OneBlood",
            "help medical personnel and patients in need of blood donation to look up for someone with the same blood type"
        )
    )
    items.add(
        OnBoardingData(
            R.drawable.blood4,
            "Lend a helping hand",
            "having a list of donors to select from provides comfort and assurance that the patients in question shall be attended to"
        )
    )
    items.add(
        OnBoardingData(
            R.drawable.blood6,
            "All Efforts are notices",
            "Donors will recieve points from the recipients which they can always redeem and use to acquire health services or even reduce their health services bills"
        )
    )
    val pagerState = rememberPagerState(
        pageCount = items.size,
        initialOffscreenLimit = 2,
        infiniteLoop = false,
        initialPage = 0
    )

    Box(
        modifier = modifier
    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            HorizontalPager(state = pagerState) { page ->
                Column(
                    modifier = modifier
                        .padding(top = 60.dp)
                        .fillMaxWidth(), horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Image(
                        painter = painterResource(id = items[page].image),
                        contentDescription = items[page].title,
                        modifier
                            .fillMaxWidth()
                            .height(250.dp)
                    )

                    Text(
                        text = items[page].title,
                        modifier.padding(top = 50.dp),
                        color = Color.Black,
                        style = Typography.body1,
                        fontSize = 25.sp,
                        textAlign = TextAlign.Center
                    )
                    Text(
                        text = items[page].description,
                        modifier.padding(top = 50.dp),
                        color = Color.Black,
                        style = Typography.body1,
                        fontSize = 18.sp,
                        textAlign = TextAlign.Center
                    )
                }

            }
        }


    }

}

@Composable
fun PageIndicator(
    size: Int, currentPage: Int
) {
    Row(
        horizontalArrangement = Arrangement.SpaceBetween,
        modifier = Modifier.padding(top = 60.dp)
    ) {

    }
}

@Composable
fun Indicators(isSelected: Boolean) {
    val width = animateDpAsState(targetValue = if (isSelected) 25.dp else 10.dp)

    Box(modifier = Modifier
        .padding(1.dp)
        .height(10.dp)
        .width(width.value)
        .clip(CircleShape)
        .background(if (isSelected) Color.Black else Color.Red)
    )

}
