package com.example.lasalleapp.ui.screens

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.example.lasalleapp.ui.components.ScreenTemplate
import com.example.lasalleapp.ui.utils.Colors
import com.example.lasalleapp.ui.utils.Password
import com.example.lasalleapp.ui.utils.Screens

@Composable
fun ChangeTheme(innerPadding : PaddingValues){
    Box(
        modifier = Modifier
            .fillMaxSize(),
        contentAlignment = Alignment.Center

    ){
        Icon(
            imageVector = Colors,
            contentDescription = "Theme",
            modifier = Modifier.size(200.dp),
            tint = (MaterialTheme.colorScheme.primary)
        )
    }
}