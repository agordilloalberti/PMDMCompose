package com.pmdmcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.pmdmcompose.ui.theme.PMDMComposeTheme
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.size
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.sp
import androidx.constraintlayout.widget.ConstraintLayout

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            PMDMComposeTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    WhatsApp(modifier = Modifier.padding(innerPadding))
                }
            }
        }
    }
}

@Composable
@Preview(showBackground = true)
fun WhatsApp(modifier: Modifier = Modifier) {
    Column(modifier = Modifier
        .fillMaxSize()
        .background(colorResource(R.color.darkGreen))) {
        Row(modifier = modifier.fillMaxWidth()
            .weight(0.5f)
            .border(BorderStroke(1.dp, colorResource(R.color.black)))
            ) {
            Box(modifier = modifier.fillMaxHeight().weight(4f),
                contentAlignment = Alignment.Center){
                Text(
                    text = "WhatsApp",
                    color = Color.White,
                    fontSize = 40.sp
                )
                //R.string.title
            }
            Box(modifier = modifier.fillMaxHeight().weight(1f))
            Box(modifier = modifier.fillMaxHeight().weight(1f),
                contentAlignment = Alignment.Center){
                val imgModifier = Modifier
                Image(modifier = imgModifier.size(40.dp),
                    painter = painterResource(R.drawable.camera),
                    contentDescription = "Image of a camera",
                    contentScale = ContentScale.Fit
                )
            }
            Box(modifier = modifier.fillMaxHeight().weight(1f),
                contentAlignment = Alignment.Center){
                val imgModifier = Modifier
                Image(modifier = imgModifier.size(20.dp),
                    painter = painterResource(R.drawable.magnifying_glass),
                    contentDescription = "Image of a camera",
                    contentScale = ContentScale.Fit
                )

            }
            Box(modifier = modifier.fillMaxHeight().weight(1f),
                contentAlignment = Alignment.Center){
                val imgModifier = Modifier
                Image(modifier = imgModifier.size(20.dp),
                    painter = painterResource(R.drawable.triple_point),
                    contentDescription = "Image of a camera",
                    contentScale = ContentScale.Fit
                )
            }
        }
        Row(modifier = modifier.fillMaxWidth().weight(1f)) {
            Box(modifier = modifier.fillMaxHeight().weight(1f),
                contentAlignment = Alignment.Center){
                val imgModifier = Modifier
                Image(modifier =  imgModifier.size(75.dp),
                    painter = painterResource(R.drawable.icon),
                    contentDescription = ""
                    )
            }
            Box(modifier = modifier.fillMaxHeight().weight(1f),
                contentAlignment = Alignment.CenterStart){
                Text(text = stringResource(R.string.name_1),
                    color = Color.White)
            }
        }
        Row(modifier = modifier.fillMaxWidth().weight(1f)) {
            Box(modifier = modifier.fillMaxHeight().weight(1f),
                contentAlignment = Alignment.Center){
                val imgModifier = Modifier
                Image(modifier =  imgModifier.size(75.dp),
                    painter = painterResource(R.drawable.icon),
                    contentDescription = ""
                )
            }
            Box(modifier = modifier.fillMaxHeight().weight(1f),
                contentAlignment = Alignment.CenterStart){
                Text(text = stringResource(R.string.name_2),
                    color = Color.White)
            }
        }
        Row(modifier = modifier.fillMaxWidth().weight(1f)) {
            Box(modifier = modifier.fillMaxHeight().weight(1f),
                contentAlignment = Alignment.Center){
                val imgModifier = Modifier
                Image(modifier =  imgModifier.size(75.dp),
                    painter = painterResource(R.drawable.icon),
                    contentDescription = ""
                )
            }
            Box(modifier = modifier.fillMaxHeight().weight(1f),
                contentAlignment = Alignment.CenterStart){
                Text(text = stringResource(R.string.name_3),
                    color = Color.White)
            }
        }
        Row(modifier = modifier.fillMaxWidth().weight(1f)) {
            Box(modifier = modifier.fillMaxHeight().weight(1f),
                contentAlignment = Alignment.Center){
                val imgModifier = Modifier
                Image(modifier =  imgModifier.size(75.dp),
                    painter = painterResource(R.drawable.icon),
                    contentDescription = ""
                )
            }
            Box(modifier = modifier.fillMaxHeight().weight(1f),
                contentAlignment = Alignment.CenterStart){
                Text(text = stringResource(R.string.name_4),
                    color = Color.White)
            }
        }
        Row(modifier = modifier.fillMaxWidth().weight(1f)) {
            Box(modifier = modifier.fillMaxHeight().weight(1f),
                contentAlignment = Alignment.Center){
                val imgModifier = Modifier
                Image(modifier =  imgModifier.size(75.dp),
                    painter = painterResource(R.drawable.icon),
                    contentDescription = ""
                )
            }
            Box(modifier = modifier.fillMaxHeight().weight(1f),
                contentAlignment = Alignment.CenterStart){
                Text(text = stringResource(R.string.name_5),
                    color = Color.White)
            }
        }
        Row(modifier = modifier.fillMaxWidth().weight(1f)) {
            Box(modifier = modifier.fillMaxHeight().weight(1f),
                contentAlignment = Alignment.Center){
                val imgModifier = Modifier
                Image(modifier =  imgModifier.size(75.dp),
                    painter = painterResource(R.drawable.icon),
                    contentDescription = ""
                )
            }
            Box(modifier = modifier.fillMaxHeight().weight(1f),
                contentAlignment = Alignment.CenterStart){
                Text(text = stringResource(R.string.name_6),
                    color = Color.White)
            }
        }
        Row(modifier = modifier.fillMaxWidth().weight(1f)) {
            Box(modifier = modifier.fillMaxHeight().weight(1f),
                contentAlignment = Alignment.Center){
                val imgModifier = Modifier
                Image(modifier =  imgModifier.size(75.dp),
                    painter = painterResource(R.drawable.icon),
                    contentDescription = ""
                )
            }
            Box(modifier = modifier.fillMaxHeight().weight(1f),
                contentAlignment = Alignment.CenterStart){
                Text(text = stringResource(R.string.name_7),
                    color = Color.White)
            }
        }
        Row(modifier = modifier.fillMaxWidth().weight(1f)) {
            Box(modifier = modifier.fillMaxHeight().weight(1f),
                contentAlignment = Alignment.Center){
                val imgModifier = Modifier
                Image(modifier =  imgModifier.size(75.dp),
                    painter = painterResource(R.drawable.icon),
                    contentDescription = ""
                )
            }
            Box(modifier = modifier.fillMaxHeight().weight(1f),
                contentAlignment = Alignment.CenterStart){
                Text(text = stringResource(R.string.name_8),
                    color = Color.White)
            }
        }

        Row(modifier = modifier.fillMaxWidth()
            .weight(1f)
            .border(BorderStroke(1.dp, colorResource(R.color.black)))) {
            Column(modifier = modifier.fillMaxHeight().weight(1f)){
                val imgModifier = Modifier
                Image(modifier =  imgModifier.size(55.dp),
                    painter = painterResource(R.drawable.chats),
                    contentDescription = "")
                Text(text = "Chats",
                    color = Color.White)
            }
            Column(modifier = modifier.fillMaxHeight().weight(1f)){
                val imgModifier = Modifier
                Image(modifier =  imgModifier.size(55.dp),
                    painter = painterResource(R.drawable.updates),
                    contentDescription = "")
                Text(text = "Updates",
                    color = Color.White)
            }
            Column(modifier = modifier.fillMaxHeight().weight(1f)){
                val imgModifier = Modifier
                Image(modifier =  imgModifier.size(50.dp),
                    painter = painterResource(R.drawable.communities),
                    contentDescription = "")
                Text(text = "Communities",
                    color = Color.White)
            }

            //modifier = modifier.fillMaxSize()) {
            //                val (img, text) = createRefs()
            //                Box() {
            //                    val imgModifier = Modifier
            //                    Image(
            //                        modifier = imgModifier.size(55.dp),
            //                        painter = painterResource(R.drawable.calls),
            //                        contentDescription = ""
            //                    )
            //                }
            //                Box() { Text (text = "Calls",
            //                color = Color.White)
            //                }
            //ConstraintLayout
        }
    }
}