package com.example.jcasd.ui

import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.jcasd.data.local.ScreenEvent
import com.example.jcasd.data.local.UiState

enum class NavScreen {
    Home,
    Add,
    Detail
}

@Composable
fun StudentScreenNavigation(
    state: UiState,
    onEvent: (ScreenEvent) -> Unit,
    navController: NavHostController = rememberNavController()
) {
    NavHost(
        navController = navController,
        startDestination = NavScreen.Home.name
    ) {
        composable(NavScreen.Home.name) {
            HomeScreen(state = state, onEvent = onEvent, onClick = {
                navController.navigate(NavScreen.Add.name)
            })
        }
        composable(NavScreen.Add.name) {
            AddScreen(state = state, onEvent = onEvent,
                saveClick = { navController.navigate(NavScreen.Detail.name) },
                cancelClick = {navController.navigateUp()})
        }
        composable(NavScreen.Detail.name){
            DetailScreen(
                navigateToEditItem = { /*TODO*/ },
                uiState = state,
                onEvent = onEvent
            )
        }

    }
}
