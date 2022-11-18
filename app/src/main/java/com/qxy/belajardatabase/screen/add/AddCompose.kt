package com.qxy.belajardatabase.screen.add

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.hilt.navigation.compose.hiltViewModel

@Composable
fun AddNewsCompose(
    viwModel: AddViewModel = hiltViewModel()
) {
    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    Text(text = "Add News")
                },
            )
        }
    ) {
        Column(modifier = Modifier.fillMaxWidth()) {
            OutlinedTextField(value = "", onValueChange = {}, label = { Text(text = "Title") })
            OutlinedTextField(value = "", onValueChange = {}, label = { Text(text = "Content") })
            Button(onClick = {}) {
                Text(text = "Simpan")
            }
        }
    }
}
