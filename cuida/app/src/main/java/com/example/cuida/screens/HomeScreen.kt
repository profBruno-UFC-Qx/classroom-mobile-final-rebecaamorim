package com.example.cuida.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.example.cuida.components.FollowUpCard
import com.example.cuida.components.HeaderSection
import com.example.cuida.components.ServicesGrid

@Composable
fun HomeScreen() {

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFFF4F6F8))
    ) {

        HeaderSection()

        Spacer(modifier = Modifier.height(24.dp))

        FollowUpCard()

        Spacer(modifier = Modifier.height(24.dp))

        ServicesGrid()
    }
}