package com.qxy.belajardatabase.screen

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.qxy.belajardatabase.screen.add.AddNewsCompose
import com.qxy.belajardatabase.screen.home.HomeCompose
import com.qxy.belajardatabase.screen.home.HomeViewModel
import com.qxy.belajardatabase.ui.theme.BelajarDatabaseTheme
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BelajarDatabaseTheme {
                // A surface container using the 'background' color from the them
                Scaffold {
                    val navController = rememberNavController()
                    NavigationScreen(navController = navController)
                }
            }
        }
    }
}

@Composable
private fun NavigationScreen(navController: NavHostController) {
    NavHost(navController = navController, startDestination = "home") {
        composable("home") {
            val viewModel = hiltViewModel<HomeViewModel>()
            HomeCompose(
                homeViewModel = viewModel,
                onAddAction = {
                    navController.navigate("add-new")
                }
            )
        }
        composable("add-new") {
            AddNewsCompose()
        }
    }

}

@Composable
fun Greeting(name: String) {
    Text(text = "Hello $name!")
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    BelajarDatabaseTheme {
        Greeting("Android")
    }
}