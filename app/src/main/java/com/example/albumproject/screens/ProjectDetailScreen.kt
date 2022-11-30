package com.example.albumproject.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.runtime.Composable
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.albumproject.data.projectsImages


@Composable
fun ProjectDetailScreen(navController: NavController, id: Int) {

    var projectId by remember() {
        mutableStateOf(projectsImages[id])
    }
    Scaffold(
        topBar = {
            TopAppBar( title = { Text(text = "My Projects") }, navigationIcon = {
                IconButton(onClick = {
                    navController.popBackStack()
                }) {
                    Icon(imageVector = Icons.Default.ArrowBack, contentDescription = "BackMenu")
                }
            })
        }
    ) { inner ->
        Surface(modifier = Modifier
            .fillMaxSize()
            .padding(inner),
//        color=Color(0xDCF3ECEC)
        ) {
            Column() {
                Box(
                    contentAlignment = Alignment.Center,
                    modifier = Modifier
//                    .weight(.3f)
                        .fillMaxWidth(), ){
                    Card(modifier = Modifier
                        .padding(vertical = 10.dp, horizontal = 5.dp), elevation = 10.dp) {
                        Image(painter = painterResource(id = projectId),
                            contentDescription = "Portfolio picture", modifier = Modifier.size(300.dp))
                    }
                }

                Spacer(modifier = Modifier.height(30.dp))

                Card(modifier = Modifier
                    .weight(.65f)
                    .padding(horizontal = 40.dp), elevation = 5.dp) {
                    Column(modifier = Modifier.padding(5.dp)) {
                        Text(text = "Project Name",
                            style = MaterialTheme.typography.h4)
                        Text(text = "Lorem ipsum dolor dolores delafbhcyuvbuygufybsuydbisudvhisdnuvsdvngs " +
                                "sdhyuvsvbsdin sufhi" +
                                "dshvdsuente")
                    }
                }
            }


        }
    }
}




