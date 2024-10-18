package com.example.lasalleapp.ui.screens

import android.util.Log
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.sizeIn
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.lasalleapp.R
import com.example.lasalleapp.ui.components.PayItem
import com.example.lasalleapp.ui.components.SubjectItem
import com.example.lasalleapp.ui.theme.LasalleAppTheme
import com.example.lasalleapp.ui.utils.Logout
import com.example.lasalleapp.ui.utils.Screens
import com.example.lasalleapp.ui.utils.payments
import com.example.lasalleapp.ui.utils.subjects

@Composable
fun PayScreen(innerPadding : PaddingValues, paymentsId : Int, navController: NavController){
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(innerPadding)
            .background(MaterialTheme.colorScheme.background),

        horizontalAlignment = Alignment.CenterHorizontally

    ) {
//Header
        Box(
            modifier = Modifier
                .background(MaterialTheme.colorScheme.primary)
                .sizeIn(minWidth = 90.dp, minHeight = 90.dp)
        ) {
            Row(
                modifier = Modifier
                    .fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically
            ) {

                Image(
                    painter = painterResource(id = R.drawable.logo),
                    contentDescription = "Logo",
                    modifier = Modifier.size(70.dp)
                )
                Text(
                    text = "Pagos",
                    color = Color.White,
                    fontSize = 24.sp,
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier
                        .padding(top = 15.dp)
                        .weight(1f)
                )
                Icon(
                    imageVector = Logout,
                    contentDescription = "Logout",
                    modifier = Modifier
                        .size(45.dp)
                        .clickable {
                            Log.i("HomeScreen", "Cerrando sesion")
                        },
                    tint = Color.White
                )
            }
        }

        Text(
            text = "Consulta de pagos",
            style = MaterialTheme.typography.headlineSmall
            )

        LazyColumn(
            verticalArrangement = Arrangement.spacedBy(16.dp)
        ) {
            items(payments){ payments ->
                PayItem(payment = payments) {
                    navController.navigate(Screens.PaymentDetail.route + "/${payments.id}")
                }
            }
        }
    }//column
}

/*@Preview(
    showBackground = true,
    showSystemUi = true
)

@Composable
fun PayScreenPreview(){
    LasalleAppTheme {
        PayScreen(innerPadding = PaddingValues(0.dp), 1, navController = )
    }
}*/