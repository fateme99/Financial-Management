package com.example.financialmanagement.screen

sealed class Screen(val route: String) {
    data object HomeScreen : Screen("home_screen")
    data object SalaryScreen : Screen("salary_screen")
    data object CostScreen : Screen("cost_screen")
}