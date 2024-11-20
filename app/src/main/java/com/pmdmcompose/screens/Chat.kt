package com.pmdmcompose.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.pmdmcompose.R
import com.pmdmcompose.navegacion.AppScreen

@Composable
fun Chat(navControlador: NavController,modifier: Modifier) {
    ChatBody(navControlador,modifier)
}

@Composable
fun ChatBody(navControlador: NavController, modifier: Modifier){
    Box(modifier = Modifier.background(colorResource(R.color.darkGreen))) {
        Column(
            modifier = modifier
                .fillMaxSize()
        ) {
            val imgModifier = Modifier
            Image(
                modifier = imgModifier.size(40.dp),
                painter = painterResource(R.drawable.arrow),
                contentDescription = "",
                contentScale = ContentScale.Fit
            )

            //TODO Make the header of WhatsApp, make the arrow go back as well as a minimal chat
        }
    }
}