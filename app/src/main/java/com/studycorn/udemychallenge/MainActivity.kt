package com.studycorn.udemychallenge

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.LinearProgressIndicator
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableFloatStateOf
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
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


                }
            }
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
//        MyStateExample()
//        MyText()
//        MyTextField()
//        MyTextFieldAdvance()
//        MyTextFieldOutlined()
//        fun MyTextFieldFather()
//        MyButtonExample()
//        MyImage()
//        MyImageAdvanced()
//        MyIcon()
//        MyProgressBar()
        MyProgressBarAdvance()
    }
}

