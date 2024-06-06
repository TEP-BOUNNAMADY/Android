package com.example.testassigment01

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MultiplePageApp()
        }
    }
}


@Preview(showSystemUi = true)
@Composable
fun MultiplePageApp(){
    val nc = rememberNavController()

    NavHost(navController = nc, startDestination = "first" ){
        composable("first"){
            FirstPage(nc)
        }
        composable("second"){
            SecondPage(nc)
        }
    }
}

