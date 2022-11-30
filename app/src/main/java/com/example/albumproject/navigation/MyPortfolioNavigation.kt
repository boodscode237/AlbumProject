package com.example.albumproject.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.albumproject.screens.HomeScreen
import com.example.albumproject.screens.ProjectDetailScreen

@Composable
fun MyPortfolioNavigation(navHostController: NavHostController) {

    NavHost(navController = navHostController, startDestination = AppScreen.HomeScreen.name){
        composable(route = AppScreen.HomeScreen.name){
            HomeScreen(navController = navHostController)
        }
        composable(route = AppScreen.ProjectDetailScreen.name+"/{id}"){ entry ->
            val id = entry.arguments?.getString("id")!!.toInt()
            ProjectDetailScreen(navController = navHostController, id = id)
        }
    }
}