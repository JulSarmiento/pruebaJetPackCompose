package com.studycorn.udemychallenge

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Star
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.painterResource
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

@Composable
fun MyImage() {
    // general image
    Image(
        painter = painterResource(id = R.drawable.ic_launcher_background), // ImageBitmap
        contentDescription = "My Image", // for accessibility
        alpha = 0.5f, // opacity
    )
}

@Composable
fun MyImageAdvanced() {
    // Advance image
    Image(
        painter = painterResource(id = R.drawable.ic_launcher_background), // ImageBitmap
        contentDescription = "My Image", // for accessibility
        alpha = 0.5f, // opacity
        modifier = Modifier
            .clip(CircleShape)
            .border(5.dp, Color.Blue)
    )
}

@Composable
fun MyIcon() {
    Icon(
        imageVector = Icons.Rounded.Star,
        contentDescription = "My Icon",
    )


}

@Preview(showBackground = true, name = "Default Preview", showSystemUi = true)
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
        MyIcon()
    }
}

