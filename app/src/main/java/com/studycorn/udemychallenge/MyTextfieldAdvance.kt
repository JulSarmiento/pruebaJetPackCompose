package com.studycorn.udemychallenge

import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MyTextFieldAdvance() {
    var myText by remember { mutableStateOf("") }

    TextField(
        value = myText,
        onValueChange = {
            if (it.contains("a"))   {
                myText = it.replace("a", "@")
            } else {
                myText = it
            }
        },
        label = {
            Text(text = "Enter your name")
        },

    )
}