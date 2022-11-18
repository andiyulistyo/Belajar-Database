package com.qxy.belajardatabase.screen.add

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.runtime.livedata.observeAsState
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
        ContentAdd(viewModel = viwModel)
    }
}

@Composable
private fun ContentAdd(modifier: Modifier = Modifier, viewModel: AddViewModel) {

    val title by viewModel.title.observeAsState("")
    val content by viewModel.content.observeAsState("")

    Column(modifier.fillMaxWidth()) {
        OutlinedTextField(
            value = title,
            onValueChange = { newValue ->
                viewModel.setDataTitle(newValue)
            },
            label = { Text(text = "Title") })

        OutlinedTextField(
            value = content,
            onValueChange = { newValueContent ->
                viewModel.setDataContent(newValueContent)
            },
            label = { Text(text = "Content") })

        Button(onClick = {
            viewModel.submit()
        }) {
            Text(text = "Simpan")
        }
    }
}
