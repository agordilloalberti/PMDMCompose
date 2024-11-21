package com.pmdmcompose.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Button
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.constraintlayout.compose.ConstraintLayout
import androidx.navigation.NavController
import com.pmdmcompose.Mensaje
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
    var value by rememberSaveable { mutableStateOf("")}
    Box(modifier = Modifier.background(colorResource(R.color.darkGreen))) {
        ConstraintLayout(
            modifier = modifier
                .fillMaxSize()
        ) {
            val (toolBar,messagesBox,footer) = createRefs()
            val mensages = listOf(Mensaje("Roberto",null,"hola"),
                Mensaje("Yo",null,"Hola,como estas?"),
                Mensaje("Roberto",null,"Mejor que antes"))

            ToolBar(Modifier.constrainAs(toolBar){
                top.linkTo(parent.top)
                start.linkTo(parent.start)
            },navControlador)

            val (m1,m2,m3) = createRefs()

            ConstraintLayout(modifier = Modifier.constrainAs(messagesBox){
                top.linkTo(toolBar.bottom)
            }){
                Message(mensages[0].mensage,Modifier.constrainAs(m1){
                    top.linkTo(parent.top)
                    start.linkTo(parent.start)
                })
                MyMessage(mensages[1].mensage,Modifier.constrainAs(m2){
                    top.linkTo(m1.bottom)
                    end.linkTo(parent.end)
                })
                Message(mensages[2].mensage,Modifier.constrainAs(m3){
                    top.linkTo(m2.bottom)
                    start.linkTo(parent.start)
                })
            }
            /*
            val l = listOf(m1,m2,m3)
            ConstraintLayout(modifier = Modifier.constrainAs(messagesBox){
                top.linkTo(toolBar.bottom)
                bottom.linkTo(footer.top)
            }) {
                for(i in 0..mensages.size){
                    if (i==0){
                        if (mensages[0].name=="Yo"){
                            MyMessage(mensages[i].mensage,Modifier.constrainAs(l[0]){
                                top.linkTo(parent.top)
                                end.linkTo(parent.end)
                            })
                        }else{
                            Message(mensages[0].mensage,Modifier.constrainAs(l[0]){
                                top.linkTo(parent.top)
                                start.linkTo(parent.start)
                            })
                        }
                    }else{
                        if (mensages[i].name=="Yo"){
                            MyMessage(mensages[i].mensage,Modifier.constrainAs(l[i]){
                                top.linkTo(l[i-1].bottom)
                                end.linkTo(parent.end)
                            })
                        }else{
                            Message(mensages[i].mensage,Modifier.constrainAs(l[i]) {
                                top.linkTo(l[i-1].bottom)
                                start.linkTo(parent.start)
                            })
                        }
                    }
                }
            }
*/
            Footer(value,{value=it},Modifier.constrainAs(footer){
                bottom.linkTo(parent.bottom)
            })
        }
    }
}

@Composable
fun Footer(value:String,onValueChange:(String)->Unit, modifier: Modifier){
    val img1 = Image(modifier = Modifier
        .size(30.dp),
        painter = painterResource(R.drawable.arrow),
        contentDescription = "",
        contentScale = ContentScale.Fit)
    val img2 = Image(modifier = Modifier
        .size(30.dp),
        painter = painterResource(R.drawable.arrow),
        contentDescription = "",
        contentScale = ContentScale.Fit)
    val img3 = Image(modifier = Modifier
        .size(30.dp),
        painter = painterResource(R.drawable.arrow),
        contentDescription = "",
        contentScale = ContentScale.Fit)
    Row(modifier=modifier.fillMaxHeight()){
        OutlinedTextField(
            value =value,
            onValueChange = {onValueChange},
            modifier = Modifier,
            textStyle = TextStyle(color = Color.White),
            placeholder = {"Message"},
            shape = CircleShape,
            colors = OutlinedTextFieldDefaults.colors(
                focusedTextColor = Color.White,
                unfocusedTextColor = Color.White,
                focusedContainerColor = Color.Black,
                unfocusedContainerColor = Color.Black,
                cursorColor = colorResource(id=R.color.lightGreen)
            )
        ){
        }
        //Button(){ }
    }
}

@Composable
fun ToolBar(modifier: Modifier, navControlador: NavController){
    Row(modifier = modifier
        .height(50.dp)
        .fillMaxWidth()
        .background(Color.Black), verticalAlignment = Alignment.CenterVertically) {
        Image(modifier = Modifier
            .clickable { navControlador.navigate(route = AppScreen.Home.route) }
            .size(30.dp)
            .weight(1f),
            painter = painterResource(R.drawable.arrow),
            contentDescription = "",
            contentScale = ContentScale.Fit
        )
        Image(modifier = Modifier
            .size(50.dp)
            .padding(5.dp)
            .weight(1f).background(Color.White, CircleShape),
            painter = painterResource(R.drawable.icon),
            contentDescription = "",
            contentScale = ContentScale.Fit)
        Text(modifier = Modifier.weight(2f),text = "Contacto", color = Color.White, fontSize = 20.sp)
        Spacer(modifier = Modifier.weight(3f))
        Image(modifier = Modifier
            .size(30.dp)
            .padding(5.dp)
            .weight(1f),
            painter = painterResource(R.drawable.triple_point),
            contentDescription = "",
            contentScale = ContentScale.Fit)
    }
}

@Composable
fun Message(value:String,modifier: Modifier){
    Row(modifier = modifier
        .fillMaxWidth()
        .padding(5.dp))
    {
        Image(modifier = Modifier
            .size(30.dp)
            .padding(5.dp).background(Color.White, CircleShape),
            painter = painterResource(R.drawable.icon),
            contentDescription = "",
            contentScale = ContentScale.Crop)
        Box(modifier= Modifier.background(Color.Black, RoundedCornerShape(0.dp,20.dp,20.dp,20.dp)).padding(5.dp)) {
            Text(
                text = value, color = Color.White, fontSize = 14.sp
            )
        }
    }
}

@Composable
fun MyMessage(value: String,modifier: Modifier){
    Row(modifier=modifier.fillMaxWidth())
    {
        Box(modifier= Modifier.background(colorResource(R.color.lightGreen), RoundedCornerShape(20.dp,0.dp,20.dp,20.dp)).padding(5.dp)) {
            Text(
                text = value, color = Color.White, fontSize = 14.sp
            )
        }
    }
}