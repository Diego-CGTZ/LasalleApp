package com.example.lasalleapp.ui.utils

import android.graphics.Bitmap.Config
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.DateRange
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Settings
import com.example.lasalleapp.models.AlternativeScreen
import com.example.lasalleapp.models.BottomNavigattionItem
import com.example.lasalleapp.models.Community
import com.example.lasalleapp.models.News
import com.example.lasalleapp.models.Payment
import com.example.lasalleapp.models.Student
import com.example.lasalleapp.models.Subject

val newsList = listOf(
    News(
        id = 1,
        title = "Evento de Construcción de la Paz",
        description = "La Salle Bajío realiza un foro para fomentar la construcción de la paz en la comunidad estudiantil.",
        image =  "https://www.lasallebajio.edu.mx/noticias/images/4701_1.jpg"
    ),
    News(
        id = 2,
        title = "Conferencia de Liderazgo",
        description = "Una conferencia que destaca la importancia del liderazgo en la comunidad universitaria.",
        image = "https://www.lasallebajio.edu.mx/noticias/images/4701_2.jpg"
    ),
    News(
        id = 3,
        title = "Semana Cultural 2024",
        description = "Celebración anual de la Semana Cultural con diversas actividades artísticas y deportivas.",
        image = "https://www.lasallebajio.edu.mx/noticias/images/4701_3.jpg"
    )
)

val bottomNavBarItems = listOf(
    BottomNavigattionItem(
        title = "Inicio",
        icon = Icons.Default.Home,
        route = Screens.Home.route
    ),
    BottomNavigattionItem(
        title = "Calificaciónes",
        icon = Icons.Default.Menu,
        route = Screens.Grades.route
    ),
    BottomNavigattionItem(
        title = "Calendario",
        icon = Icons.Default.DateRange,
        route = Screens.Calendar.route
    ),
    BottomNavigattionItem(
        title = "Configuracion",
        icon = Icons.Default.Settings,
        route = Screens.Settings.route
    ),
)

val communities = listOf(
    Community(1,"https://www.lasallebajio.edu.mx/comunidad/images/tile_documentos_inspiradores.jpg"),
    Community(2,"https://www.lasallebajio.edu.mx/comunidad/images/tile_boletin.jpg"),
    Community(3,"https://www.lasallebajio.edu.mx/comunidad/images/tile_cat_souv_22.jpg"),
    Community(4,"https://www.lasallebajio.edu.mx/comunidad/images/tile_tramites.jpg"),
    Community(5,"https://www.lasallebajio.edu.mx/comunidad/images/tile_blog.jpg"),
    )

val students = listOf(
    Student(1,"Diego Camarena Gutiérrez",
        "20/04/2004",
        "https://img.freepik.com/free-photo/portrait-confident-asian-businessman_1262-1555.jpg",
        "dcg78026@lasalle.edu.mx")
)
val subjects = listOf(
    Subject(1,"Administración de bases de datos",8.5,8.0,7.5,10.0),
    Subject(2,"Modelado de imagenes",8.5,8.0,7.5,10.0),
    Subject(3,"Taller de desarrollo movil para plataforma Android",10.0,10.0,10.0,10.0),
    Subject(4,"Front end",8.3,7.5,9.5,8.0),
    Subject(5,"Modelos abstractos",9.0,10.0,10.0,7.0)
)

val payments = listOf(
    Payment(1,"Octubre","Colegiatura",10000.0,true),
    Payment(2,"Noviembre","Colegiatura",10000.0,false),
    Payment(3,"Diciembre","Colegiatura",10000.0,false),
    Payment(4,"Diciembre","Festival de la cancion",150.0,true),
)
