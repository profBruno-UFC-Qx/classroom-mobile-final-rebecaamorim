package com.example.cuida.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Info
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.cuida.model.ServiceItem

@Composable
fun ServicesGrid() {

    val services = listOf(
        ServiceItem(
            title = "Postos de Saúde",
            description = "Encontre os postos próximos",
            icon = Icons.Default.Home,
            backgroundColor = Color(0xFFDCEBFF),
            iconColor = Color(0xFF1463FF)
        ),
        ServiceItem(
            title = "Médicos",
            description = "Veja médicos disponíveis",
            icon = Icons.Default.Person,
            backgroundColor = Color(0xFFD8FBE6),
            iconColor = Color(0xFF00A84F)
        ),
        ServiceItem(
            title = "Vacinas",
            description = "Consulte vacinas disponíveis",
            icon = Icons.Default.Favorite,
            backgroundColor = Color(0xFFF0DFFF),
            iconColor = Color(0xFF9C27FF)
        ),
        ServiceItem(
            title = "Remédios",
            description = "Verifique estoque de remédios",
            icon = Icons.Default.Info,
            backgroundColor = Color(0xFFFFEBD2),
            iconColor = Color(0xFFFF5A1F)
        )
    )

    LazyVerticalGrid(
        columns = GridCells.Fixed(2),
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 24.dp),
        verticalArrangement = Arrangement.spacedBy(16.dp),
        horizontalArrangement = Arrangement.spacedBy(16.dp)
    ) {
        items(services) { service ->
            ServiceCard(service)
        }
    }
}

@Composable
fun ServiceCard(service: ServiceItem) {

    Card(
        modifier = Modifier
            .fillMaxWidth()
            .height(180.dp),
        shape = RoundedCornerShape(18.dp),
        colors = CardDefaults.cardColors(
            containerColor = Color.White
        ),
        elevation = CardDefaults.cardElevation(4.dp)
    ) {

        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(16.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {

            Box(
                modifier = Modifier
                    .size(70.dp)
                    .clip(RoundedCornerShape(18.dp))
                    .background(service.backgroundColor),
                contentAlignment = Alignment.Center
            ) {

                Icon(
                    imageVector = service.icon,
                    contentDescription = null,
                    tint = service.iconColor,
                    modifier = Modifier.size(36.dp)
                )
            }

            Spacer(modifier = Modifier.height(16.dp))

            Text(
                text = service.title,
                fontSize = 16.sp,
                fontWeight = FontWeight.Bold,
                textAlign = TextAlign.Center
            )

            Spacer(modifier = Modifier.height(8.dp))

            Text(
                text = service.description,
                fontSize = 13.sp,
                color = Color.Gray,
                textAlign = TextAlign.Center
            )
        }
    }
}