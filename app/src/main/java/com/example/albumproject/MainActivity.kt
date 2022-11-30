package com.example.albumproject

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.rememberNavController
import com.example.albumproject.navigation.MyPortfolioNavigation
import com.example.albumproject.screens.HomeScreen
import com.example.albumproject.screens.ProjectDetailScreen
import com.example.albumproject.ui.theme.AlbumProjectTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AlbumProjectTheme {
//                HomeScreen()
                val navController = rememberNavController()
                Surface() {
                    Text(text = "")
                    MyPortfolioNavigation(navHostController = navController)
                }
            }
        }
    }
}




@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    AlbumProjectTheme {
//        HomeScreen()
//        ProjectDetailScreen()
    }
}