package com.studycorn.udemychallenge

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.constraintlayout.compose.ChainStyle
import androidx.constraintlayout.compose.ConstraintLayout
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
fun ConstrainExampleGuide() {
    ConstraintLayout (
        Modifier.fillMaxSize()
    ) {
        val redBox = createRef()
        val topGuide = createGuidelineFromTop(0.1f) // 10% from top, float
        val startGuide = createGuidelineFromStart(0.25f) // 25% from start, float
        Box (
            Modifier
                .size(125.dp)
                .background(Color.Red)
                .constrainAs(redBox) {
                    top.linkTo(topGuide)
                    start.linkTo(startGuide)

                }
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
//        MyComplexLayout()
//        MyConstrainLayout()
//        ConstrainExampleGuide()
//        ConstrainExampleBarrier()
//        ConstrainExampleChain()
    }
}

