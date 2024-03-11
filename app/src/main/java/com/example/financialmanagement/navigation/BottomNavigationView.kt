package com.example.financialmanagement.navigation

import androidx.compose.material.BottomNavigation
import androidx.compose.material.BottomNavigationItem
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.currentBackStackEntryAsState
import com.example.financialmanagement.ui.theme.GrayBackGround

@Composable
fun BottomNavigationView(navController: NavHostController) {
    val navItems = listOf(BottomNavItem.Home, BottomNavItem.Salary, BottomNavItem.Cost)
    BottomNavigation(backgroundColor = GrayBackGround) {
        val navBackStackEntry by navController.currentBackStackEntryAsState()
        val currentRow = navBackStackEntry?.destination?.route
        navItems.forEach { item ->
            BottomNavigationItem(
                selected = currentRow == item.route,
                icon = {
                    Icon(
                        imageVector = item.icon,
                        contentDescription = stringResource(id = item.name)
                    )
                },
                label = {
                    Text(
                        text = stringResource(item.name),
                        fontWeight = FontWeight.Bold,
                        fontSize = 12.sp
                    )
                },
                selectedContentColor = item.color,
                unselectedContentColor = Color.White.copy(0.4f),
                onClick = {
                    navController.popBackStack()
                    navController.navigate(item.route)
                }
            )
        }
    }
}