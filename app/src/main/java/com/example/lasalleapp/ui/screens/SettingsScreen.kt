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
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.sizeIn
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Edit
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draganddrop.DragAndDropModifierNode
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import coil.compose.AsyncImage
import coil.compose.rememberImagePainter
import com.example.lasalleapp.R
import com.example.lasalleapp.ui.components.ScreenTemplate
import com.example.lasalleapp.ui.theme.LasalleAppTheme
import com.example.lasalleapp.ui.utils.Colors
import com.example.lasalleapp.ui.utils.Logout
import com.example.lasalleapp.ui.utils.Password
import com.example.lasalleapp.ui.utils.Screens
import com.example.lasalleapp.ui.utils.newsList
import com.example.lasalleapp.ui.utils.students
import org.intellij.lang.annotations.JdkConstants.HorizontalAlignment

@Composable
fun SettingsScreen(studentsId: Int,innerPadding : PaddingValues, navController: NavController){
    val students = students.first{ it.id == studentsId}
//boddy
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(innerPadding)
            .background(MaterialTheme.colorScheme.background)
            .verticalScroll(
                rememberScrollState()
            ),
        horizontalAlignment = Alignment.CenterHorizontally

    ){
//Header
        Box(
            modifier = Modifier
                .background(MaterialTheme.colorScheme.primary)
                .sizeIn(minWidth = 90.dp, minHeight = 90.dp)
        ){
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
                    text = "Configuración",
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
// Student Card
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .background(Color.White)
                .padding(10.dp) // Espacio interno (padding) dentro de la Box
        ) {
            Row(
                modifier = Modifier.fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically
            ){
                AsyncImage(model = students.image,
                    contentDescription = "Imagen de alumno",
                    modifier = Modifier
                        .height(200.dp)
                        .padding(end = 10.dp)
                        .clip(CircleShape)
                )

                Text(
                    text =
                    "Nombre: "+students.name
                    +"\nFecha de nacimiento: " +students.brithDate
                    +"\nCorreo institucional: "+students.mail,
                    modifier = Modifier,
                    style = MaterialTheme.typography.bodySmall
                )
            }
        }

        Column(
            modifier = Modifier
                .fillMaxWidth().padding(15.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ){
            //boton de cambio de contrasena
            Box(
                modifier = Modifier
                    .padding(10.dp)
                    .clip(RoundedCornerShape(10.dp))
                    .background(MaterialTheme.colorScheme.primary)
                    .fillMaxWidth()
                    .clickable {
                        navController.navigate(Screens.ChangePassword.route)
                    }
            ){
                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    modifier = Modifier
                        .padding(15.dp)
                        //.background(MaterialTheme.colorScheme.primary)
                        .height(50.dp)
                )
                {
                    Icon(imageVector = Password,
                        contentDescription = "Password",
                        modifier = Modifier.padding(end = 5.dp),
                        tint = Color.White
                    )

                    Text(text = "Cambio de contraseña",
                        color = Color.White)
                }
            }

            //boton de cambio de tema
            Box(
                modifier = Modifier
                    .padding(10.dp)
                    .clip(RoundedCornerShape(10.dp))
                    .background(MaterialTheme.colorScheme.primary)
                    .fillMaxWidth()
                    .clickable {
                        navController.navigate(Screens.ChangeTheme.route)
                    }
            ){
                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    modifier = Modifier
                        .padding(15.dp)
                        .height(50.dp)
                )
                {
                    Icon(imageVector = Colors,
                        contentDescription = "ThemeChanger",
                        modifier = Modifier.padding(end = 5.dp),
                        tint = Color.White
                    )

                    Text(text = "Cambio de Tema",
                        color = Color.White)
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
        SettingsScreen(1,innerPadding = PaddingValues(0.dp, ))
    }
}
*/