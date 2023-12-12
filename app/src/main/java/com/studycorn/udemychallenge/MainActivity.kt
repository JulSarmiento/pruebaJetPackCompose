package com.studycorn.udemychallenge

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.animation.fadeIn
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.studycorn.udemychallenge.ui.theme.UdemychallengeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            UdemychallengeTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background
                ) {
                    Greeting("Juliet")
                }
            }
        }
    }
}

@Composable //component
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello, $name!", modifier = modifier
    )
}

@Composable
fun MyComplexLayout() {
    Column(
        Modifier
            .fillMaxSize(),
    ) {
        Box(
            Modifier
                .fillMaxWidth()
                .weight(1f)
                .background(Color.DarkGray)
        ) {

        }
        Row(
            Modifier
                .fillMaxWidth()
                .weight(1f)
                .background(Color.Gray)
        ) {
            Box (
                Modifier
                    .weight(1f)
                    .fillMaxHeight()
                    .background(Color.Red)
            ) {

            }
            Box (
                Modifier
                    .weight(1f)
                    .fillMaxHeight()
                    .background(Color.Green),
                contentAlignment = Alignment.Center
            ) {
                Text(text = "Hello, Im StudyCorn Dev")
            }

        }
        Box(
            Modifier
                .fillMaxWidth()
                .weight(1f)
                .background(Color.Magenta)
        ) {

        }
    }
}

@Preview(showBackground = true, name = "Default Preview")
@Composable
fun GreetingPreview() {
    UdemychallengeTheme {
//        MySuperText(name = "StudyCorn Dev is awesome!")
//        MyBox(name = "Box 1")
//        MyColumn(name = "Column 1")
//        MyRow(name = "Row 1")
        MyComplexLayout()
    }
}

