package com.studycorn.udemychallenge

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.LinearProgressIndicator
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableFloatStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun MyProgressBarAdvance() {
    var progressBar by rememberSaveable { mutableFloatStateOf(0f) }

    Column(
        Modifier
            .fillMaxSize()
            .padding(24.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally

    ) {
        CircularProgressIndicator(
            progress = progressBar
        )

        Row(
            Modifier
                .fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceEvenly

        ) {
            Button(onClick = {progressBar += 0.1f}) {
                Text(text = "Increase")
            }

            Button(onClick = {progressBar -= 0.1f}) {
                Text(text = "Decrease")
            }
        }

    }
}


@Composable
fun MyProgressBar() {
    var showLoading by rememberSaveable { mutableStateOf( false) }
    var btnText by rememberSaveable {
        mutableStateOf(
            "Show Loading"
        )
    }

    Column(
        Modifier
            .fillMaxSize()
            .padding(24.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally

    ) {

        if (showLoading) {
            CircularProgressIndicator(
                color = Color.Red,
                strokeWidth = 5.dp
            )
            LinearProgressIndicator(
                modifier = Modifier.padding(top = 24.dp)
            )

            btnText = "Hide Loading"

        } else {
            btnText = "Show Loading"
        }


        Button ( onClick = { showLoading = !showLoading }) {
            Text(text = btnText)
        }
    }
}