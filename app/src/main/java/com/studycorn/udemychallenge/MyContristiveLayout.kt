package com.studycorn.udemychallenge

import androidx.compose.ui.graphics.Color
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

import androidx.compose.ui.unit.dp
import androidx.constraintlayout.compose.ChainStyle
import androidx.constraintlayout.compose.ConstraintLayout

@Composable
fun MyConstrainLayout() {
    ConstraintLayout(
        Modifier
            .fillMaxSize()
    ) {

        val (redBox, blueBox, yellowBox, magentaBox, blackBox) = createRefs()

        Box(
            Modifier
                .size(125.dp)
                .background(Color.Red)
                .constrainAs(redBox) {
                    top.linkTo(parent.top)
                    start.linkTo(parent.start)
                    end.linkTo(parent.end)
                    bottom.linkTo(parent.bottom)
                }
        )
        Box(
            Modifier
                .size(125.dp)
                .background(Color.Blue)
                .constrainAs(blueBox) {
                    top.linkTo(redBox.bottom)
                    end.linkTo(redBox.start)
                }
        )
        Box(
            Modifier
                .size(125.dp)
                .background(Color.Yellow)
                .constrainAs(yellowBox) {
                    bottom.linkTo(redBox.top)
                    end.linkTo(redBox.start)
                }
        )
        Box(
            Modifier
                .size(125.dp)
                .background(Color.Magenta)
                .constrainAs(magentaBox) {
                    bottom.linkTo(redBox.top)
                    start.linkTo(redBox.end)

                }
        )
        Box(
            Modifier
                .size(125.dp)
                .background(Color.Black)
                .constrainAs(blackBox) {
                    top.linkTo(redBox.bottom)
                    start.linkTo(redBox.end)
                }
        )
    }
}

@Composable
fun ConstrainExampleBarrier() {
    ConstraintLayout(
        Modifier
            .fillMaxSize()
    ) {
        val (redBox, blueBox, yellowBox) = createRefs()
        val barrier = createEndBarrier(blueBox, redBox)

        Box(
            Modifier
                .size(125.dp)
                .background(Color.Red)
                .constrainAs(redBox) {
                    start.linkTo(parent.start, margin = 16.dp)
                }
        ){}
        Box(
            Modifier
                .size(125.dp)
                .background(Color.Blue)
                .constrainAs(blueBox) {
                    top.linkTo(redBox.bottom,)
                    start.linkTo(parent.start, margin = 16.dp)
                }
        ){}
        Box(
            Modifier
                .size(50.dp)
                .background(Color.Yellow)
                .constrainAs(yellowBox) {
                    start.linkTo(barrier)
                }
        ){}

    }
}

@Composable
fun ConstrainExampleChain () {
    ConstraintLayout (
        Modifier
            .fillMaxSize()
    ) {
        val (redBox, blueBox, yellowBox) = createRefs()


        Box(
            Modifier
                .size(75.dp)
                .background(Color.Red)
                .constrainAs(redBox) {
                    start.linkTo(parent.start)
                    end.linkTo(blueBox.start)
                }
        ){}
        Box(
            Modifier
                .size(75.dp)
                .background(Color.Blue)
                .constrainAs(blueBox) {
                    start.linkTo(redBox.end)
                    end.linkTo(yellowBox.start)
                }
        ){}
        Box(
            Modifier
                .size(75.dp)
                .background(Color.Yellow)
                .constrainAs(yellowBox) {
                    start.linkTo(blueBox.end)
                    end.linkTo(parent.end)
                }
        ){}

        createHorizontalChain(redBox, blueBox, yellowBox, chainStyle = ChainStyle.Spread)
    }
}
