package com.example.albumproject.components

import androidx.annotation.DrawableRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp

@Composable
fun ProjectComponent(@DrawableRes image: Int, onPictureClick: () -> Unit){
    Box(modifier = Modifier
        .padding(5.dp).clickable { onPictureClick.invoke() },
        contentAlignment = Alignment.Center){
        Image(
            painter = painterResource(id = image),
            contentDescription = "Project",
            modifier = Modifier.size(150.dp)
        )

//        Text(text = str, modifier = Modifier, color = Color.White)
    }
}