package com.example.jcasd.ui

import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.jcasd.data.local.ScreenEvent
import com.example.jcasd.data.local.UiState

@Composable
fun Navigation(
    state: UiState,
    onEvent: (ScreenEvent) -> Unit,
    navController: NavHostController = rememberNavController()
) {

}