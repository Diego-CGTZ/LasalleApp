package com.example.lasalleapp.ui.screens

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.size
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import com.example.lasalleapp.ui.components.ScreenTemplate
import com.example.lasalleapp.ui.utils.Screens

@Composable
fun ChangePassword(innerPadding : PaddingValues){
    ScreenTemplate(innerPadding = innerPadding, header = {
        Text(text = "Cambio de contraseña",
            modifier = Modifier,
            color = Color.White,
            style = MaterialTheme.typography.titleLarge
        )
    }, body = {
        Text(text = "Contenido de cambio de contraseña")
    })
}