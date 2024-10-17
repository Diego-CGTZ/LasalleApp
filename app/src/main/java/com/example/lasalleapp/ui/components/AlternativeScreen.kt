package com.example.lasalleapp.ui.components

import android.graphics.Paint.Align
import android.util.Log
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.sizeIn
import androidx.compose.foundation.layout.wrapContentSize
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
import coil.compose.AsyncImage
import com.example.lasalleapp.R
import com.example.lasalleapp.ui.theme.LasalleAppTheme
import com.example.lasalleapp.ui.utils.Logout

/*@Composable
fun AlternativeScreen(alternativeScreenId: Int, innerPadding : PaddingValues){
    val alternativeScreens = alternativeScreen.first{ it.id == alternativeScreenId}

    Box(
        modifier = Modifier
            .fillMaxWidth()
            .wrapContentSize()
            .sizeIn(minWidth = 100.dp, minHeight = 100.dp)
            .background(MaterialTheme.colorScheme.primary)
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically
        ) {

            AsyncImage(model = alternativeScreens.image,
                contentDescription = alternativeScreens.title,
                modifier = Modifier
                    .fillMaxWidth()
                    .height(70.dp)
            )
            Text(
                text = alternativeScreens.title,
                color = Color.White,
                fontSize = 24.sp,
                fontWeight = FontWeight.Bold,
                modifier = Modifier.padding(top = 15.dp).weight(1f)
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
}

@Preview(
    showBackground = true,
    showSystemUi = true
)

@Composable
fun SettingScreenPreview() {
    LasalleAppTheme {
        AlternativeScreen(alternativeScreenId = 1, innerPadding = PaddingValues(0.dp)) // Proporciona un ID aquí
    }
}*/