package com.studycorn.udemychallenge

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.constraintlayout.compose.ChainStyle
import androidx.constraintlayout.compose.ConstraintLayout

@Composable
fun MyButtonExample() {
    var enabled by rememberSaveable {
        mutableStateOf(true)
    }

    ConstraintLayout (
        Modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {
        val (button1, button2, button3) = createRefs()

        Button(
            modifier = Modifier.constrainAs(button1) { // constraint layout
                top.linkTo(parent.top) // link to parent top
                start.linkTo(parent.start) // link to parent start
                end.linkTo(parent.end) // link to parent end
            },
            onClick = {enabled = false}, // on click listener
            enabled = enabled, // enabled or disabled
            colors = ButtonDefaults.buttonColors( // button colors
                contentColor = Color.White, // content color
                containerColor = Color.Red // container color
            ),
            border = BorderStroke(2.dp, Color.Black),
        ) {
            Text(text = "Normal Button")
        }

        OutlinedButton(
            modifier = Modifier.constrainAs(button2) {
                top.linkTo(button1.bottom)
                start.linkTo(parent.start)
                end.linkTo(parent.end)
            },
            onClick = {enabled = false},
            enabled = enabled,
            colors = ButtonDefaults.buttonColors(
                contentColor = Color.White,
                containerColor = Color.Red,
                disabledContainerColor = Color.Gray
            ),
            border = BorderStroke(2.dp, Color.Black),
        ) {
            Text(text = "Outlined Button")
        }

        TextButton(
            modifier = Modifier.constrainAs(button3) {
                top.linkTo(button2.bottom)
                start.linkTo(parent.start)
                end.linkTo(parent.end)
            },
            onClick = {enabled = false},
            enabled = enabled,
            colors = ButtonDefaults.buttonColors(
                contentColor = Color.White,
                containerColor = Color.Red
            ),
            border = BorderStroke(2.dp, Color.Black),
        ) {
            Text(text = "Text Button")
        }

        createVerticalChain(button1, button2, button3, chainStyle = ChainStyle.Spread)
    }
}
