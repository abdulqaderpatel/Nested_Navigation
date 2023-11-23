package com.example.nested_controller.Navigation


import com.example.nested_controller.Home
import com.example.nested_controller.Profile
import com.example.nested_controller.Settings


import androidx.compose.runtime.Composable
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import com.example.nested_controller.Details
import com.example.nested_controller.Login
import com.example.nestednavigationbottombardemo.BottomBarScreen


@Composable
fun HomeNavGraph(navController: NavHostController) {
    NavHost(
        navController = navController,
        route = Graph.HOME,
        startDestination = BottomBarScreen.Home.route
    ) {
        composable(route = BottomBarScreen.Home.route) {
            Home(nestedNavController = navController)
        }
        composable(route = BottomBarScreen.Profile.route) {
            Profile()
        }
        composable(route = BottomBarScreen.Settings.route) {
            Settings()
        }
        composable(route = Graph.AUTHENTICATION) {
            Login(navController = navController)
        }
        detailsNavGraph(navController = navController)
    }
}

fun NavGraphBuilder.detailsNavGraph(navController: NavHostController) {
    navigation(
        route = Graph.DETAILS,
        startDestination = DetailsScreen.Information.route
    ) {
        composable(route = DetailsScreen.Information.route)
        {
            Details(navController)
        }
    }
}

sealed class DetailsScreen(val route: String) {
    object Information : DetailsScreen(route="INFORMATION")
    object Overview : DetailsScreen(route = "OVERVIEW")
}