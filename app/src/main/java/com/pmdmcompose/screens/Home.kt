package com.pmdmcompose.screens

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.pmdmcompose.R
import com.pmdmcompose.navegacion.AppScreen

@Composable
fun Home(navControlador: NavController,modifier: Modifier) {
    WhatsApp(navControlador,modifier)
}

@Composable
fun WhatsApp(navControlador: NavController,modifier: Modifier = Modifier) {
    val nombres = listOf("Roberto","Luih","Adrián","Álvaro","Raul","Hugo","Emilia","Lucia")
    Box(modifier = Modifier.background(colorResource(R.color.darkGreen))) {
        Column(
            modifier = modifier
                .fillMaxSize()
        ) {
            Row(
                modifier = Modifier.fillMaxWidth()
                    .weight(0.5f)
                    .border(BorderStroke(1.dp, colorResource(R.color.black)))
            ) {
                Box(
                    modifier = Modifier.fillMaxHeight().weight(4f),
                    contentAlignment = Alignment.Center
                ) {
                    Text(
                        text = "WhatsApp",
                        color = Color.White,
                        fontSize = 40.sp
                    )
                }
                Spacer(modifier = Modifier.weight(1f))
                Box(
                    modifier = Modifier.fillMaxHeight().weight(1f),
                    contentAlignment = Alignment.Center
                ) {
                    val imgModifier = Modifier
                    Image(
                        modifier = imgModifier.size(40.dp),
                        painter = painterResource(R.drawable.camera),
                        contentDescription = "",
                        contentScale = ContentScale.Fit
                    )
                }
                Box(
                    modifier = Modifier.fillMaxHeight().weight(1f),
                    contentAlignment = Alignment.Center
                ) {
                    val imgModifier = Modifier
                    Image(
                        modifier = imgModifier.size(20.dp),
                        painter = painterResource(R.drawable.magnifying_glass),
                        contentDescription = "",
                        contentScale = ContentScale.Fit
                    )

                }
                Box(
                    modifier = Modifier.fillMaxHeight().weight(1f),
                    contentAlignment = Alignment.Center
                ) {
                    val imgModifier = Modifier
                    Image(
                        modifier = imgModifier.size(20.dp),
                        painter = painterResource(R.drawable.triple_point),
                        contentDescription = "",
                        contentScale = ContentScale.Fit
                    )
                }
            }
            for (contacto in nombres) {
                AddContacto(contacto, Modifier.fillMaxWidth().weight(1f),navControlador)
            }

            Row(
                modifier = Modifier.fillMaxWidth()
                    .weight(1f)
                    .border(BorderStroke(1.dp, colorResource(R.color.black)))
            ) {
                Column(modifier = Modifier.fillMaxHeight().weight(1f).alignByBaseline()) {
                    val imgModifier = Modifier
                    Image(
                        modifier = imgModifier.size(55.dp).align(Alignment.CenterHorizontally),
                        painter = painterResource(R.drawable.chats),
                        contentDescription = ""
                    )
                    Text(
                        modifier = Modifier.align(Alignment.CenterHorizontally),
                        text = "Chats",
                        color = Color.White
                    )
                }
                Column(modifier = Modifier.fillMaxHeight().weight(1f).alignByBaseline()) {
                    val imgModifier = Modifier
                    Image(
                        modifier = imgModifier.size(55.dp).align(Alignment.CenterHorizontally),
                        painter = painterResource(R.drawable.updates),
                        contentDescription = ""
                    )
                    Text(
                        modifier = Modifier.align(Alignment.CenterHorizontally),
                        text = "Updates",
                        color = Color.White
                    )
                }
                Column(modifier = Modifier.fillMaxHeight().weight(1f).alignByBaseline()) {
                    val imgModifier = Modifier
                    Image(
                        modifier = imgModifier.size(50.dp).align(Alignment.CenterHorizontally),
                        painter = painterResource(R.drawable.communities),
                        contentDescription = ""
                    )
                    Text(
                        modifier = Modifier.align(Alignment.CenterHorizontally),
                        text = "Communities",
                        color = Color.White
                    )
                }

                Column(modifier = Modifier.fillMaxHeight().weight(1f).alignByBaseline()) {
                    val imgModifier = Modifier
                    Image(
                        modifier = imgModifier.size(50.dp).align(Alignment.CenterHorizontally),
                        painter = painterResource(R.drawable.calls),
                        contentDescription = ""
                    )
                    Text(
                        modifier = Modifier.align(Alignment.CenterHorizontally),
                        text = "Calls",
                        color = Color.White,
                        textAlign = TextAlign.Center
                    )
                }
            }
        }
    }
}

@Composable
fun AddContacto(contacto: String,modifier: Modifier,navControlador: NavController) {
    Row(modifier = modifier.clickable {navControlador.navigate(route = AppScreen.Chat.route)}) {
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