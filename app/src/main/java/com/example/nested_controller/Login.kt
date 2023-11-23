package com.example.nested_controller

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import com.example.nested_controller.Navigation.AuthScreen
import com.example.nested_controller.Navigation.Graph

@Composable
fun Login(navController: NavController) {
Text(text = "login page")
    Column {


        Button(onClick = { navController.navigate(AuthScreen.SignUp.route)}) {
            Text(text = "Go to signup")
        }

        Button(onClick = {
            navController.popBackStack()
            navController.navigate(Graph.HOME)}) {

            Text(text = "Login")
        }

    }
}