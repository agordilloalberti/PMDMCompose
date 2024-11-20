package com.pmdmcompose.navegacion

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.pmdmcompose.screens.Home
import com.pmdmcompose.screens.Chat

@Composable
fun AppNavigation(modifier: Modifier) {
    val navControlador = rememberNavController()
    NavHost(navController = navControlador, startDestination = AppScreen.Home.route){
        composable(AppScreen.Home.route) {
            Home(navControlador,modifier)
        }
        composable(
            AppScreen.Chat.route)
        {
            Chat(navControlador,modifier)
        }
    }
}