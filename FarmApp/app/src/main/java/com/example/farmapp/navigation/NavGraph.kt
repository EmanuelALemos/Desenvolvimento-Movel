package com.example.farmapp.navigation

import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.farmapp.ui.screens.AnimalScreen
import com.example.farmapp.ui.screens.HomeScreen
import com.example.farmapp.models.farmAnimals

@ExperimentalMaterial3Api
@Composable
fun NavGraph() {
    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = "home") {
        composable("home") {
            HomeScreen(onAnimalSelected = { animal ->
                navController.navigate("animal/${animal.name}")
            })
        }
        composable("animal/{animal}") { backStackEntry ->
            val animalName = backStackEntry.arguments?.getString("animal")
            val selectedAnimal = farmAnimals.first { it.name == animalName }
            AnimalScreen(selectedAnimal, onBack = { navController.popBackStack() })
        }
    }
}
