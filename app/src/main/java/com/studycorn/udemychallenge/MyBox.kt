package com.studycorn.udemychallenge

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun MyBox(name: String) {
    Box(
        modifier = Modifier
            .fillMaxSize(), // fill the entire screen
        contentAlignment = Alignment.Center,
    ) {
        Box(
            modifier = Modifier
                .height(100.dp) // height of the box
                .width(300.dp) // width of the box
                .background(Color.Cyan) // background color of the box
                .verticalScroll( // vertical scroll
                    rememberScrollState()
                ),
            contentAlignment = Alignment.Center
        ) {
            Text(
                text = "This is an example of a box",
                modifier = Modifier
                    .align(Alignment.Center) // align the text to the center
                    .padding(16.dp) // padding
            )
        }
    }
}