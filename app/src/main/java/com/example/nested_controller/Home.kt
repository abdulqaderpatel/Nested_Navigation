package com.example.nested_controller

import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import com.example.nested_controller.Navigation.AuthScreen
import com.example.nested_controller.Navigation.Graph

@Composable
fun Home(nestedNavController: NavController) {
Button(onClick = { nestedNavController.navigate(Graph.DETAILS) }) {
    Text(text = "See product details")
}

}