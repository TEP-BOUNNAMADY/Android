package com.example.testassigment01


import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Add
import androidx.compose.material.icons.rounded.ArrowBackIosNew
import androidx.compose.material.icons.rounded.DarkMode
import androidx.compose.material.icons.rounded.Maximize
import androidx.compose.material.icons.rounded.Remove
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SecondPage(nc: NavController) {
    Scaffold(
        topBar = {
            TopAppBar(
                navigationIcon = {
                    IconButton(onClick = {
                        nc.popBackStack()
                    }) {
                        Icon(Icons.Rounded.ArrowBackIosNew, contentDescription = null)
                    }
                },
                title = { Text(text = "Second Page") },
                actions = {
                    IconButton(onClick = {

                    }) {
                        Icon(Icons.Rounded.Maximize, contentDescription = null)
                    }
                    IconButton(onClick = {  }) {
                        Icon(Icons.Rounded.Add, contentDescription = null)
                    }
                    IconButton(onClick = {  }) {
                        Icon(Icons.Rounded.DarkMode, contentDescription = null)
                    }
                }
            )
        }
    ) {
        Box(
            modifier = Modifier
                .padding(it),
        ) {
            Column(
                modifier = Modifier.verticalScroll(rememberScrollState()).padding(10.dp),
            ) {
                Text("Kotlin is a cross-platform, statically typed, general-purpose high-level programming language with type inference. Kotlin is designed to interoperate fully with Java, and the JVM version of Kotlin's standard library depends on the Java Class Library, but type inference allows its syntax to be more concise.")
            }
        }
    }
}