package com.example.lasalleapp.ui.screens

import android.util.Log
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
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
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.lasalleapp.R
import com.example.lasalleapp.ui.components.CardImage
import com.example.lasalleapp.ui.components.ScreenTemplate
import com.example.lasalleapp.ui.components.SubjectItem
import com.example.lasalleapp.ui.theme.LasalleAppTheme
import com.example.lasalleapp.ui.utils.Logout
import com.example.lasalleapp.ui.utils.Screens
import com.example.lasalleapp.ui.utils.newsList
import com.example.lasalleapp.ui.utils.subjects

@Composable
fun GradesScreen(studentsId : Int,innerPadding : PaddingValues, navController: NavController){
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
                    text = "Calificaciónes",
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
        Text(text = "Diego Camarena Gutiérrez",
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
                    Text(text = "ISSC",
                        modifier = Modifier.padding(10.dp))
                }
                Text(text = "Carrera")
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
                    Text(text = "5",
                        modifier = Modifier.padding(10.dp))
                }
                Text(text = "Semestre")
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
                    Text(text = "9.2",
                        modifier = Modifier.padding(10.dp))
                }
                Text(text = "Promedio")
            }
        }

        Column(
            modifier = Modifier
                .fillMaxWidth()
                .background(MaterialTheme.colorScheme.primary)
                .padding(15.dp)
        ){
            Text(text = "Materias",
                style = MaterialTheme.typography.titleLarge,
                modifier = Modifier
                    .fillMaxWidth()
                    .wrapContentWidth(Alignment.CenterHorizontally)
                    .padding(5.dp),
                color = Color.White)

            LazyColumn(
                verticalArrangement = Arrangement.spacedBy(16.dp)
            ) {
                items(subjects){ subjects ->
                    SubjectItem(subject = subjects) {
                        navController.navigate(Screens.GradesDetail.route + "/${subjects.id}")
                    }
                }
            }
        }
    }
}

/*@Preview(
    showBackground = true,
    showSystemUi = true
)

@Composable
fun SettingScreenPreview(){
    LasalleAppTheme {
        GradesScreen(1,innerPadding = PaddingValues(0.dp))
    }
}*/