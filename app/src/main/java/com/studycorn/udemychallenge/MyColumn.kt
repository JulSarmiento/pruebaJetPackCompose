package com.studycorn.udemychallenge

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun MyColumn(name: String) {
    Column(
        Modifier
            .fillMaxSize()
            .padding(top = 54.dp)
            .verticalScroll(
                rememberScrollState()
            ),
        verticalArrangement = Arrangement.SpaceEvenly,

        ) {
        Text(
            text = "This is a column1",
            modifier = Modifier
                .background(Color.Red)
                .fillMaxWidth()
                .height(150.dp)
        )
        Text(
            text = "This is a column2",
            modifier = Modifier
                .background(Color.Green)
                .fillMaxWidth()
                .height(150.dp)
        )
        Text(
            text = "This is a column3",
            modifier = Modifier
                .background(Color.Blue)
                .fillMaxWidth()
                .height(150.dp)
        )
        Text(
            text = "This is a column4",
            modifier = Modifier
                .background(Color.Yellow)
                .fillMaxWidth()
                .height(150.dp)
        )
        Text(
            text = "This is a column5",
            modifier = Modifier
                .background(Color.Red)
                .fillMaxWidth()
                .height(150.dp)
        )
        Text(
            text = "This is a column6",
            modifier = Modifier
                .background(Color.Green)
                .fillMaxWidth()
                .height(150.dp)
        )
        Text(
            text = "This is a column7",
            modifier = Modifier
                .background(Color.Blue)
                .fillMaxWidth()
                .height(150.dp)
        )
        Text(
            text = "This is a column8",
            modifier = Modifier
                .background(Color.Yellow)
                .fillMaxWidth()
                .height(150.dp)
        )
    }
}