package com.pmdmcompose

data class Mensaje(
    val name:String,
    //val user:User,
    val icon: Int? = R.drawable.icon,
    val mensage: String
)