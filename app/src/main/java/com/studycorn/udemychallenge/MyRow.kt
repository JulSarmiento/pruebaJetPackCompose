package com.studycorn.udemychallenge

import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.rememberScrollState
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

@Composable
fun MyRow(name: String) {
    Row(
        Modifier
            .fillMaxSize()
            .horizontalScroll(
                rememberScrollState()
            ),
        horizontalArrangement = Arrangement.SpaceEvenly,
    ) {
        Text(text = "row1", Modifier.weight(1f))
        Text(text = "row2", Modifier.weight(1f))
        Text(text = "row3", Modifier.weight(1f))
        Text(text = "row4", Modifier.weight(1f))
        Text(text = "row5", Modifier.weight(1f))
        Text(text = "row6", Modifier.weight(1f))
        Text(text = "row7", Modifier.weight(1f))
        Text(text = "row8", Modifier.weight(1f))
    }
}