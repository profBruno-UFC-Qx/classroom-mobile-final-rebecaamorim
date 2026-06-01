package com.example.cuida

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material3.MaterialTheme
import com.example.cuida.ui.screens.home.HomeScreen
import com.example.cuida.ui.screens.vaccines.VaccinesScreen
import com.example.cuida.ui.screens.healthpost.HealthPostsScreen

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            MaterialTheme {
                HealthPostsScreen()
            }
        }
    }
}