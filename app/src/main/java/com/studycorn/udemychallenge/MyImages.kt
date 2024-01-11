package com.studycorn.udemychallenge

import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Star
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp

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