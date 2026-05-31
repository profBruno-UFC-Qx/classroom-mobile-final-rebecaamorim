package com.example.cuida.ui.screens.home

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.example.cuida.ui.screens.home.components.FollowUpCard
import com.example.cuida.ui.screens.home.components.HeaderSection
import com.example.cuida.ui.screens.home.components.ImportantWarningsCard
import com.example.cuida.ui.screens.home.components.NearestHealthPostCard
import com.example.cuida.ui.screens.home.components.ServicesGrid

@Composable
fun HomeScreen(
    onNavigateToVaccines: () -> Unit = {},
    onNavigateToHealthPosts: () -> Unit = {},
    onNavigateToDoctors: () -> Unit = {},
    onNavigateToRemedies: () -> Unit = {}
) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFFF8F9FE))
    ) {
        LazyColumn(
            modifier = Modifier.fillMaxSize(),
            contentPadding = PaddingValues(bottom = 32.dp)
        ) {
            item { HeaderSection() }

            item { Spacer(modifier = Modifier.height(32.dp)) }

            item { FollowUpCard() }

            item { Spacer(modifier = Modifier.height(32.dp)) }

            item { 
                // Grid de serviços. Quando atualizarmos o ServiceGrid, passaremos os onClicks.
                ServicesGrid() 
            }

            item { Spacer(modifier = Modifier.height(24.dp)) }

            item { ImportantWarningsCard() }

            item { Spacer(modifier = Modifier.height(24.dp)) }

            item { NearestHealthPostCard() }
        }
    }
}
