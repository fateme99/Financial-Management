package com.example.financialmanagement.navigation

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountBox
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import com.example.financialmanagement.R
import com.example.financialmanagement.screen.Screen
import com.example.financialmanagement.ui.theme.BlueTopBar
import com.example.financialmanagement.ui.theme.GreenTopBar
import com.example.financialmanagement.ui.theme.RedTopBar

sealed class BottomNavItem(
    val name: Int,
    val route: String,
    val icon: ImageVector,
    val color: Color
) {
    data object Home : BottomNavItem(
        name = R.string.home_name,
        route = Screen.HomeScreen.route,
        icon = Icons.Filled.Home,
        color = BlueTopBar
    )

    data object Cost : BottomNavItem(
        name = R.string.cost_name,
        route = Screen.CostScreen.route,
        icon = Icons.Filled.ShoppingCart,
        color = RedTopBar
    )

    data object Salary : BottomNavItem(
        name = R.string.salary_name,
        route = Screen.SalaryScreen.route,
        icon = Icons.Filled.AccountBox,
        color = GreenTopBar
    )
}