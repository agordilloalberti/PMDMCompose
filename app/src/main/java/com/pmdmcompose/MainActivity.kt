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
import androidx.compose.ui.unit.dp
import com.pmdmcompose.ui.theme.PMDMComposeTheme
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.size
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.sp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            PMDMComposeTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    val nombres = listOf("Roberto","Luih","Adrián","Álvaro","Raul","Hugo","Emilia","Lucia")
                    WhatsApp(modifier = Modifier.padding(innerPadding),nombres)
                }
            }
        }
    }
}

@Composable
fun WhatsApp(modifier: Modifier = Modifier, contactos: List<String>) {
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
            }
            Spacer(modifier = Modifier.weight(1f))
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

        for (contacto in contactos){
            AddContacto(contacto,modifier.fillMaxWidth().weight(1f))
        }

        Row(modifier = modifier.fillMaxWidth()
            .weight(1f)
            .border(BorderStroke(1.dp, colorResource(R.color.black)))) {
            Column(modifier = modifier.fillMaxHeight().weight(1f).alignByBaseline()){
                val imgModifier = Modifier
                Image(modifier =  imgModifier.size(55.dp).align(Alignment.CenterHorizontally),
                    painter = painterResource(R.drawable.chats),
                    contentDescription = "")
                Text(modifier = Modifier.align(Alignment.CenterHorizontally),
                    text = "Chats",
                    color = Color.White)
            }
            Column(modifier = modifier.fillMaxHeight().weight(1f).alignByBaseline()){
                val imgModifier = Modifier
                Image(modifier =  imgModifier.size(55.dp).align(Alignment.CenterHorizontally),
                    painter = painterResource(R.drawable.updates),
                    contentDescription = "")
                Text(modifier = Modifier.align(Alignment.CenterHorizontally),
                    text = "Updates",
                    color = Color.White)
            }
            Column(modifier = modifier.fillMaxHeight().weight(1f).alignByBaseline()){
                val imgModifier = Modifier
                Image(modifier =  imgModifier.size(50.dp).align(Alignment.CenterHorizontally),
                    painter = painterResource(R.drawable.communities),
                    contentDescription = "")
                Text(modifier = Modifier.align(Alignment.CenterHorizontally),
                    text = "Communities",
                    color = Color.White)
            }

            Column(modifier = modifier.fillMaxHeight().weight(1f).alignByBaseline()){
                val imgModifier = Modifier
                Image(modifier =  imgModifier.size(50.dp).align(Alignment.CenterHorizontally),
                    painter = painterResource(R.drawable.calls),
                    contentDescription = "")
                Text(modifier = Modifier.align(Alignment.CenterHorizontally),
                    text = "Calls",
                    color = Color.White,
                    textAlign = TextAlign.Center)
            }
        }
    }
}

@Composable
fun AddContacto(contacto: String,modifier: Modifier) {
    Row(modifier = modifier) {

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
            Text(text = contacto,
                color = Color.White)
        }
    }
}
