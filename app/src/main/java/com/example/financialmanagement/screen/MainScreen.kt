package com.example.financialmanagement.screen

import android.annotation.SuppressLint
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.financialmanagement.navigation.BottomNavGraph
import com.example.financialmanagement.navigation.BottomNavigationView

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun MainScreen(navController: NavHostController = rememberNavController()) {
    Scaffold(
        bottomBar = { BottomNavigationView(navController = navController) }
    ) {
        BottomNavGraph(navController = navController)
    }
}