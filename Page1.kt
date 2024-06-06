package com.example.testassigment01

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Add
import androidx.compose.material.icons.rounded.DarkMode
import androidx.compose.material.icons.rounded.Maximize
import androidx.compose.material.icons.rounded.Remove
import androidx.compose.material.icons.rounded.Settings
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.TextUnit

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun FirstPage(nc: NavController) {
    val isButtonClicked = remember { mutableStateOf(false) } // State variable

    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text(text = "First Page") },
                actions = {
                    IconButton(
                        onClick = {
                            isButtonClicked.value = !isButtonClicked.value
                        },
                        content = { Icon(Icons.Rounded.Maximize, contentDescription = null) },
                    )

                }
            )
        }
    ) {
        Box(
            modifier = Modifier
                .padding(it),
        ) {
            Column(
                modifier = Modifier
                    .verticalScroll(rememberScrollState())
                    .padding(10.dp),
            ) {
                val fontSize: TextUnit = if (isButtonClicked.value) 12.dp else 16.dp,// Font size of 20 density pixels

                Text(
                    "Hello there, my fellow Kotlin enthusiasts! ...",
                    style = TextStyle(
                        fontSize = fontSize
//                        fontSize =  // Adjust font sizes as needed
                    ),
                )

            }
        }
    }
}

