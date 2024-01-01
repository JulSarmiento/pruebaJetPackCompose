package com.studycorn.udemychallenge

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
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


                }
            }
        }
    }
}

@Composable
fun MyTextFieldFather() {
    var myText by rememberSaveable { mutableStateOf("Hello") }
    MyTextField(myText) { myText = it }
}

@Composable
fun MyButtonExample() {
    Column {

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
        MyButtonExample()

    }
}

