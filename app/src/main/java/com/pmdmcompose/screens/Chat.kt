package com.pmdmcompose.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import com.pmdmcompose.navegacion.AppScreen

@Composable
fun Chat(navControlador: NavController,modifier: Modifier) {
    ChatBody(navControlador,modifier)
}

@Composable
fun ChatBody(navControlador: NavController, modifier: Modifier){
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text("Adios")
        Button(onClick = {navControlador.navigate(route = AppScreen.Home.route)}){
            Text("Ir a la otra pantalla")
        }
    }
}