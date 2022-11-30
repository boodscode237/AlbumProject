package com.example.albumproject.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.grid.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import com.example.albumproject.components.ProjectComponent
import com.example.albumproject.R
import com.example.albumproject.data.projectsImages
import com.example.albumproject.navigation.AppScreen

@Composable
fun HomeScreen(navController: NavController) {
    val projects = mutableListOf<String>("E-commerce With React", "Comfy House",
        "Calculator With TKinter", "Weather App JS", "Hotel Web App .Net", "SignIn Form React")


    Surface(
        modifier = Modifier.fillMaxSize(),
        color = MaterialTheme.colors.background
    ) {
        Column(modifier = Modifier, horizontalAlignment = Alignment.CenterHorizontally) {
            Row(verticalAlignment = Alignment.CenterVertically) { // Header avec de la photo, nom et job
                Box(modifier = Modifier){
                    Image(
                        painter = painterResource(id = R.drawable.logo),
                        contentDescription = "Ma photo",
                        modifier = Modifier
                            .size(150.dp)
                            .clip(shape = CircleShape)
                    )
                }
                Column(modifier = Modifier.padding(20.dp)) {
                    Spacer(modifier = Modifier.height(10.dp))
                    Text(text = "@BoodsCode",
                        fontWeight = FontWeight.SemiBold,
                        style= MaterialTheme.typography.h5)
                    Spacer(modifier = Modifier.height(5.dp))
                    Text(text = "FrontEnd Developer",
                        fontStyle = FontStyle.Italic,
                        fontWeight = FontWeight.SemiBold,
                        color = Color(0xFF3F51B5)
                    )
                }
            }
            Spacer(modifier = Modifier.height(40.dp))

//            PictureComponent("Photo")
//            LazyRow(content = {
//                items(projects){ project ->
//                    ProjectComponent(str = project)
//                }
//            })
            LazyVerticalGrid(columns = GridCells.Adaptive(150.dp), content = {
                item (span = { GridItemSpan(3) }){
                    Text(text = "Liste de mes Projets: ",
                        fontWeight = FontWeight.SemiBold,
                        style= MaterialTheme.typography.h5)
                }
                itemsIndexed(projectsImages){ index, image ->
                    Card(modifier = Modifier
                        .padding(vertical = 10.dp, horizontal = 5.dp), elevation = 10.dp) {
                        ProjectComponent(image){
                            navController.navigate(AppScreen.ProjectDetailScreen.name + "/$index")
                        }
                    }
                }
            })


        }
    }
}
