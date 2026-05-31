package com.example.cuida.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.example.cuida.components.FollowUpCard
import com.example.cuida.components.HeaderSection
import com.example.cuida.components.ImportantWarningsCard
import com.example.cuida.components.NearestHealthPostCard
import com.example.cuida.components.utils.ServicesGrid

@Composable
fun HomeScreen() {
    LazyColumn(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFFF4F6F8)),
        contentPadding = PaddingValues(bottom = 16.dp)
    ) {
        item { HeaderSection() }

        item { Spacer(modifier = Modifier.height(32.dp)) }

        item { FollowUpCard() }

        item { Spacer(modifier = Modifier.height(32.dp)) }

        item { ServicesGrid() }

        item { Spacer(modifier = Modifier.height(24.dp)) }

        item { ImportantWarningsCard() }

        item { Spacer(modifier = Modifier.height(24.dp)) }

        item { NearestHealthPostCard() }
    }
}