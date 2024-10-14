package com.example.lasalleapp.models

import androidx.compose.ui.graphics.vector.ImageVector
import com.example.lasalleapp.ui.utils.Screens

data class BottomNavigattionItem (
    val title : String,
    val icon : ImageVector,
    val route : String
)