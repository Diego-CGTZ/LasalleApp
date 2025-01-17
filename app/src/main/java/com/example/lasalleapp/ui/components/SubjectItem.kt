package com.example.lasalleapp.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.lasalleapp.models.News
import com.example.lasalleapp.models.Subject

@Composable
fun SubjectItem(subject: Subject, onClick : (Subject)->Unit){
    Row (modifier = Modifier
            .padding(10.dp)
            .clickable {onClick(subject)},
        verticalAlignment = Alignment.CenterVertically){
        Text(text = subject.name,
            modifier = Modifier.weight(1f),
            Color.White)

        Text(text = subject.promedio.toString(),
            modifier = Modifier
                .clip(RoundedCornerShape(5.dp))
                .background(MaterialTheme.colorScheme.secondary)
                .padding(5.dp),
            Color.White)
    }
}

/*@Preview
@Composable
fun SubjectItemPreview(){
    SubjectItem()
}*/