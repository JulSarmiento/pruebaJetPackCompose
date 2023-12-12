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
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
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
        text = "Hello, $name!",
        modifier = modifier
    )
}

@Composable
fun MySuperText(name: String, modifier: Modifier = Modifier) {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .background(MaterialTheme.colorScheme.primary)
            .clickable {
                fadeIn()
            }
    ) {
        Text(
            text = "Hello $name!",
            modifier = Modifier
                .align(Alignment.CenterHorizontally)
                .padding(16.dp),
            fontSize = 16.sp,
            textAlign = TextAlign.Center
        )
    }
}


@Composable
fun MyBox(name: String) {
    Box(
        modifier = Modifier
            .fillMaxSize(),
        contentAlignment = Alignment.Center,
    ) {
        Box(
            modifier = Modifier
                .height(100.dp)
                .width(300.dp)
                .background(Color.Cyan)
                .verticalScroll(
                    rememberScrollState()
                ),
            contentAlignment = Alignment.Center
        ) {
            Text(
                text = "This is an example of a box",
                modifier = Modifier
                    .align(Alignment.Center)
                    .padding(16.dp)
            )
        }
    }
}

/*@Composable
fun MyColumn(name: String){
    Column (
        Modifier
            .fillMaxSize(),
    ){
        Text(text = "This is a column1", modifier = Modifier.background(Color.Red).weight(1f))
        Text(text = "This is a column2", modifier = Modifier.background(Color.Green).weight(1f))
        Text(text = "This is a column3", modifier = Modifier.background(Color.Blue).weight(1f))
        Text(text = "This is a column4", modifier = Modifier.background(Color.Yellow).weight(1f))
    }
}*/

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

@Preview(showBackground = true, name = "Default Preview")
@Composable
fun GreetingPreview() {
    UdemychallengeTheme {
        MySuperText(name = "StudyCorn Dev is awesome!")
        /*MyBox(name = "Box 1")*/
        MyColumn(name = "Column 1")
    }
}

