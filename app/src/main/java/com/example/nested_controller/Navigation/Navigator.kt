package com.example.nested_controller.Navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.bottomnavbardemo.screens.home.UserNavigation
import com.example.nested_controller.Login

@Composable
fun Navigator(navController: NavHostController,startingPage:String) {
    NavHost(
        navController = navController,
        route = Graph.ROOT,
        startDestination = startingPage
    ) {
        authNavGraph(navController = navController)
        composable(route = Graph.HOME) {
            UserNavigation()
        }

    }
}

object Graph {
    const val ROOT = "root_graph"
    const val AUTHENTICATION = "auth_graph"
    const val HOME = "home_graph"
    const val DETAILS = "details_graph"
}