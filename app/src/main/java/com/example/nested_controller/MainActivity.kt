package com.example.nested_controller

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.navigation.compose.rememberNavController
import com.example.nested_controller.Navigation.Graph
import com.example.nested_controller.Navigation.Navigator
import com.example.nested_controller.ui.theme.Nested_controllerTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Nested_controllerTheme {
                var loggedIn = false
                Navigator(
                    navController = rememberNavController(),
                    if (loggedIn) Graph.HOME else (Graph.AUTHENTICATION)
                )
            }
        }
    }
}
