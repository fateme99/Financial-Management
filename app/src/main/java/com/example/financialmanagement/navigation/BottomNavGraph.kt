package com.example.financialmanagement.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.financialmanagement.screen.CostScreen
import com.example.financialmanagement.screen.HomeScreen
import com.example.financialmanagement.screen.SalaryScreen
import com.example.financialmanagement.screen.Screen

@Composable
fun BottomNavGraph(navController: NavHostController) {
    NavHost(navController = navController, startDestination = Screen.HomeScreen.route) {
        composable(Screen.HomeScreen.route) {
            HomeScreen()
        }
        composable(Screen.SalaryScreen.route) {
            SalaryScreen()
        }
        composable(Screen.CostScreen.route) {
            CostScreen()
        }
    }
}