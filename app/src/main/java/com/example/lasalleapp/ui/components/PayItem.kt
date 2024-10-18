package com.example.lasalleapp.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Check
import androidx.compose.material.icons.filled.Close
import androidx.compose.material.icons.filled.Warning
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.layout.ModifierLocalBeyondBoundsLayout
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.lasalleapp.models.Payment
import com.example.lasalleapp.models.Subject
import com.example.lasalleapp.ui.theme.GreenCheck
import com.example.lasalleapp.ui.theme.LasalleAppTheme
import com.example.lasalleapp.ui.theme.YellowWarning
import com.example.lasalleapp.ui.utils.Attach_money

@Composable 
fun PayItem(payment: Payment, onClick : (Payment)->Unit){

    val fondo = if (payment.isPaid) GreenCheck else MaterialTheme.colorScheme.secondary
    val icono = if (payment.isPaid) Icons.Default.Check else Icons.Default.Warning

    Row(
        modifier = Modifier
        .height(120.dp)
        .clickable {onClick(payment)},
        verticalAlignment = Alignment.CenterVertically
    ){
        Column(modifier = Modifier
            .background(MaterialTheme.colorScheme.primary)
            .weight(1f)
            .fillMaxHeight()
            .padding(5.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        )
        {
            Text(
                text = payment.titulo,
                color = Color.White,
                style = MaterialTheme.typography.headlineMedium,
                modifier = Modifier.padding(5.dp)
            )
            Row(modifier = Modifier
                .padding(5.dp),
                verticalAlignment = Alignment.CenterVertically
            ){
                Text(text = payment.mes,
                    color = Color.White,
                    style = MaterialTheme.typography.bodyLarge,
                    modifier = Modifier
                        .weight(1f)
                        .padding(5.dp)
                )

                Text(text = "Total: "+payment.monto,
                    color = Color.White,
                    style = MaterialTheme.typography.bodyLarge
                )
            }
        }
        Box(modifier = Modifier
            .background(fondo)
            .fillMaxHeight(),
            contentAlignment = Alignment.Center
        ) {
            Icon(imageVector = icono,
                contentDescription = "Pago",
                modifier = Modifier
                    .width(70.dp)
                    .size(50.dp),
                tint = Color.White
            )
        }
    }
}
/*
@Preview(
    showBackground = true
)

@Composable
fun PayItemPreview(){
    LasalleAppTheme{
        PayItem()
    }
}*/
