package com.studycorn.udemychallenge

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier

@Composable
fun MyStateExample() {
    // la funcion remember es para que no se pierda el valor de la variable
    // by en la variable counter es para que se pueda modificar el valor de la variable
    var counter by rememberSaveable() {
        // mutableStateOf es para que el valor de la variable pueda cambiar
        mutableStateOf(0)
    }

    Column (
        Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Button(onClick = { counter++ }) {
            Text(text = "Click me")
        }
        Text(text = "The button was clicked $counter times")
    }
}