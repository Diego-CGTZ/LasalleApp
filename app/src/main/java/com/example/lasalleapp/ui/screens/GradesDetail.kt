package com.example.lasalleapp.ui.screens

import android.util.Log
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.sizeIn
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.AsyncImage
import com.example.lasalleapp.R
import com.example.lasalleapp.ui.utils.Logout
import com.example.lasalleapp.ui.utils.subjects

@Composable
fun GradesDetail(gradesId: Int, innerPadding : PaddingValues){
    val subjects = subjects.first{ it.id == gradesId}
//Header
    Column (modifier = Modifier
                .fillMaxSize()
                .padding(innerPadding)
                .background(MaterialTheme.colorScheme.background)
                .verticalScroll(
            rememberScrollState()
        ),){
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
                    text = "Parciales",
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
        //Body

        Text(text = subjects.name,
            modifier = Modifier
                .padding(15.dp),
            style = MaterialTheme.typography.bodyLarge)

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 15.dp)
                .padding(bottom = 15.dp),
            //horizontalArrangement = Arrangement.SpaceEvenly
        ){
            Column(modifier = Modifier
                .weight(1f),
                horizontalAlignment = Alignment.CenterHorizontally
            ){
                Box(modifier = Modifier
                    .fillMaxWidth()
                    .border(
                        width = 2.dp,
                        color = Color.Black
                    ),
                    contentAlignment = Alignment.Center)
                {
                    Text(text = subjects.p1.toString(),
                        modifier = Modifier.padding(10.dp))
                }
                Text(text = "Parcial 1")
            }

            Column(modifier = Modifier
                .weight(1f),
                horizontalAlignment = Alignment.CenterHorizontally
            ){
                Box(modifier = Modifier
                    .fillMaxWidth()
                    .border(
                        width = 2.dp,
                        color = Color.Black
                    ),
                    contentAlignment = Alignment.Center)
                {
                    Text(text = subjects.p2.toString(),
                        modifier = Modifier.padding(10.dp))
                }
                Text(text = "Parcial 2")
            }

            Column(modifier = Modifier
                .weight(1f),
                horizontalAlignment = Alignment.CenterHorizontally
            ){
                Box(modifier = Modifier
                    .fillMaxWidth()
                    .border(
                        width = 2.dp,
                        color = Color.Black
                    ),
                    contentAlignment = Alignment.Center)
                {
                    Text(text = subjects.p3.toString(),
                        modifier = Modifier.padding(10.dp))
                }
                Text(text = "Parcial 3")
            }
        }
    }
}