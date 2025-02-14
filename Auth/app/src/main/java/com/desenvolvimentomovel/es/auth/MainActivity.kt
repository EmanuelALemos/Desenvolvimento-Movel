package com.desenvolvimentomovel.es.auth

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.desenvolvimentomovel.es.auth.data.AuthRepository
import com.desenvolvimentomovel.es.auth.ui.theme.AuthTheme
import com.desenvolvimentomovel.es.auth.ui.view.ForgotPasswordScreen
import com.desenvolvimentomovel.es.auth.ui.view.HomeScreen
import com.desenvolvimentomovel.es.auth.ui.view.LoginScreen
import com.desenvolvimentomovel.es.auth.ui.view.RegisterScreen
import com.desenvolvimentomovel.es.auth.viewmodel.AuthViewModel
import com.desenvolvimentomovel.es.auth.viewmodel.AuthViewModelFactory

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val repository = AuthRepository()
        val authViewModel = ViewModelProvider(this, AuthViewModelFactory(repository)).get(
            AuthViewModel::class.java)

        setContent {
            val navController: NavHostController = rememberNavController()

            NavHost(navController = navController, startDestination = "login") {
                composable("login") { LoginScreen(authViewModel, navController) }
                composable("register") { RegisterScreen(authViewModel, navController) }
                composable("forgotPassword") { ForgotPasswordScreen(authViewModel, navController) }
                composable("home") { HomeScreen(authViewModel, navController) }
            }
        }
    }
}
