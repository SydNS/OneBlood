package com.example.oneblood.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.oneblood.R
import com.example.oneblood.dataclasses.BloodCategory
import com.example.oneblood.dataclasses.bloodCategory

@Composable
fun homeScreen() {

}

@Composable
fun ListScreen() {
    MyList()

}

@Composable
fun MyList() {
    LazyColumn {
        items(items) { item -> ListItem(item) }
    }
}

@Composable
fun ListItem(
    bloodCategory: BloodCategory,
    modifier: Modifier =
        Modifier
) {
    Column(modifier = Modifier.padding(8.dp)) {
        Text(
            text = bloodCategory.bldname,
            fontSize = 22.sp,
            fontWeight = FontWeight.Bold,
            color = colorResource(id = R.color.oneblood)
        )
        Spacer(modifier = modifier.height(8.dp))

    }
}