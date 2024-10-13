package com.example.lasalleapp.ui.utils

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import com.example.lasalleapp.models.BottomNavigattionItem
import com.example.lasalleapp.models.News

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
        title = "Inicio",
        icon = Icons.Default.Home,
        route = Screens.Home.route
    ),
    BottomNavigattionItem(
        title = "Inicio",
        icon = Icons.Default.Home,
        route = Screens.Home.route
    ),
    BottomNavigattionItem(
        title = "Inicio",
        icon = Icons.Default.Home,
        route = Screens.Home.route
    ),

)