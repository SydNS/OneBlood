package com.example.oneblood.screens

import androidx.annotation.FloatRange
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.ImageBitmap
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.viewpager2.widget.ViewPager2
import com.example.oneblood.R
import com.example.oneblood.dataclasses.OnBoardingData
import java.util.ArrayList

@ExperimentalPagerApi
@Composable
fun OnBoardingScreen(
    items: ArrayList<OnBoardingData>,
    pagerstate: PagerState,
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

    Box(
        modifier = Modifier
    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            HorizontalPager(state = PagerState) { page ->
                Column(
                    modifier = Modifier
                        .padding(top = 60.dp)
                        .fillMaxWidth(), horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Image(
                        painter = painterResource(id = items[page].image),
                        contentDescription = items[page].title
                    )
                }

            }
        }


    }


}

@Composable
fun rememberPagerState(
    @androidx.annotation.IntRange(from=0) pageCount:Int,
    @androidx.annotation.IntRange(from=0) initialPage:Int=0,
    @FloatRange(from = 0.0,to=1.0) initialPageOffset: Float =0f,
    @androidx.annotation.IntRange(from = 1) initialOffscreenLimit: Int=1,
    infiniteLoop: Boolean=false
):PagerState= rememberSaveable(saver = PagerState.Saver) {



}
