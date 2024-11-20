package com.pmdmcompose.navegacion

sealed class AppScreen(val route: String) {
    object Home: AppScreen("Home")
    object Chat: AppScreen("Chat")
}