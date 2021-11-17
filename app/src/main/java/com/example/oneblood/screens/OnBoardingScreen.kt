package com.example.oneblood.screens

import androidx.compose.runtime.Composable
import com.example.oneblood.R
import com.example.oneblood.dataclasses.OnBoardingData
import java.util.ArrayList


val items = ArrayList<OnBoardingData>()

@Composable
fun OnBoardingScreen() {
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
}