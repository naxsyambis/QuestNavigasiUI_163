package com.example.questnavigasiui_163

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.questnavigasiui_163.view.FormIsian
import com.example.questnavigasiui_163.view.TampilData

enum class Navigasi {
    Formulirku,
    Detail
}

@Composable
fun DataApp(
    navController: NavHostController = rememberNavController()
) {

}

private fun cancelAndBackToFormulir(
    navController: NavHostController
) {
    navController.popBackStack(
        route = Navigasi.Formulirku.name,
        inclusive = false
    )
}