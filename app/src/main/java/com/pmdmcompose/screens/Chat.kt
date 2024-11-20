package com.pmdmcompose.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.pmdmcompose.R
import com.pmdmcompose.navegacion.AppScreen

@Composable
fun Chat(navControlador: NavController,modifier: Modifier
//         ,contacto: String
) {
    ChatBody(navControlador,modifier
//        ,contacto
    )
}

@Composable
fun ChatBody(navControlador: NavController, modifier: Modifier
//             ,contacto:String
){
    Box(modifier = Modifier.background(colorResource(R.color.darkGreen))) {
        Column(
            modifier = modifier
                .fillMaxSize()
        ) {
            Row(modifier = Modifier.fillMaxWidth().align(Alignment.CenterHorizontally).background(Color.Black), verticalAlignment = Alignment.CenterVertically) {
                Image(modifier = Modifier.clickable { navControlador.navigate(route = AppScreen.Home.route) }
                    .size(30.dp).padding(5.dp),
                    painter = painterResource(R.drawable.arrow),
                    contentDescription = "",
                    contentScale = ContentScale.Crop
                )
                Image(modifier = Modifier.size(30.dp).padding(5.dp),
                    painter = painterResource(R.drawable.icon),
                    contentDescription = "",
                    contentScale = ContentScale.Crop)
                Text(text = "Contacto", color = Color.White)
                Spacer(modifier = Modifier.size(50.dp))
                Image(modifier = Modifier.size(30.dp).padding(5.dp),
                    painter = painterResource(R.drawable.triple_point),
                    contentDescription = "",
                    contentScale = ContentScale.Crop)
            }
            Column(){
                Text("Hola", color = Color.White)
                Text("Hola, ¿como estas?", color = Color.White)
                Text("Mejor que la ultima vez", color = Color.White)
            }
            //TODO Make it so when i click a contact the name of it gets to the "Chat" Screen
        }
    }
}