package com.qxy.belajardatabase.screen.home

import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.hilt.navigation.compose.hiltViewModel

@Composable
fun HomeCompose(
    homeViewModel: HomeViewModel,
    onAddAction: () -> Unit
) {
    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    Text(text = "Belajar Database")
                },
                actions = {
                    IconButton(onClick = { onAddAction() }) {
                        Icon(
                            imageVector = Icons.Filled.Add,
                            contentDescription = "New News",
                            tint = Color.White
                        )
                    }
                }
            )
        }
    ) {

    }
}