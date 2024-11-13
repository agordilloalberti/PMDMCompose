package com.pmdmcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
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
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.pmdmcompose.ui.theme.PMDMComposeTheme
import java.text.Normalizer.Form

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
fun WhatsApp(modifier: Modifier = Modifier) {
    Column(modifier = Modifier
        .fillMaxSize()) {
        Row(modifier = modifier.fillMaxWidth().weight(1f)) {
            Box(modifier = modifier.fillMaxHeight().weight(1f)){
                R.string.title
            }
            Box(modifier = modifier.fillMaxHeight().weight(1f)){
                Text(text = "Camara")
            }
            Box(modifier = modifier.fillMaxHeight().weight(1f)){
                Text(text = "lupa")
            }
            Box(modifier = modifier.fillMaxHeight().weight(1f)){
                Text(text = "tres puntos")
            }
        }
        Row(modifier = modifier.fillMaxWidth().weight(1f)) {
            Box(modifier = modifier.fillMaxHeight().weight(1f)){
                Text(text = "Imagen")
            }
            Box(modifier = modifier.fillMaxHeight().weight(1f)){
                R.string.name_1
            }
        }
        Row(modifier = modifier.fillMaxWidth().weight(1f)) {
            Box(modifier = modifier.fillMaxHeight().weight(1f)){
                Text(text = "Imagen")
            }
            Box(modifier = modifier.fillMaxHeight().weight(1f)){
                R.string.name_2
            }
        }
        Row(modifier = modifier.fillMaxWidth().weight(1f)) {
            Box(modifier = modifier.fillMaxHeight().weight(1f)){
                Text(text = "Imagen")
            }
            Box(modifier = modifier.fillMaxHeight().weight(1f)){
               R.string.name_3
            }
        }
        Row(modifier = modifier.fillMaxWidth().weight(1f)) {
            Box(modifier = modifier.fillMaxHeight().weight(1f)){
                Text(text = "Imagen")
            }
            Box(modifier = modifier.fillMaxHeight().weight(1f)){
                R.string.name_4
            }
        }
    }
}