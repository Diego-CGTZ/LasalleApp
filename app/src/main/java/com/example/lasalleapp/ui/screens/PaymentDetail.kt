package com.example.lasalleapp.ui.screens

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.lasalleapp.ui.utils.Attach_money
import com.example.lasalleapp.ui.utils.Password

@Composable
fun PaymentDetail(){
    Box(
        modifier = Modifier
            .fillMaxSize(),
        contentAlignment = Alignment.Center

    ){
        Icon(
            imageVector = Attach_money,
            contentDescription = "Password",
            modifier = Modifier.size(200.dp),
            tint = (MaterialTheme.colorScheme.primary)
        )
    }
}