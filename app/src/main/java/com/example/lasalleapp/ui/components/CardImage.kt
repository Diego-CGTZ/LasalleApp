package com.example.lasalleapp.ui.components

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage
import coil.request.ImageRequest
import com.example.lasalleapp.R
import org.intellij.lang.annotations.JdkConstants.HorizontalAlignment
import org.jetbrains.annotations.Async

@Composable
fun CardImage(image:String){
    Card(
        modifier = Modifier
            .fillMaxWidth()
    )
    {
            AsyncImage(
                model = ImageRequest.Builder(LocalContext.current)
                    .placeholder(R.drawable.news_1)
                    .data(image)
                    .build(),
                contentDescription = "CardImage",
                modifier = Modifier.fillMaxWidth().height(200.dp),
                contentScale = ContentScale.Crop
            )
        }
}

@Preview
@Composable
fun CardImagePreview(){
    CardImage(image = "https://www.lasallebajio.edu.mx/noticias/images/4719_1.jpg")
}