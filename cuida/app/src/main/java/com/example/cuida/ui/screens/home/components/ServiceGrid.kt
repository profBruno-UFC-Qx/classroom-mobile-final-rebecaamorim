package com.example.cuida.ui.screens.home.components

import androidx.compose.foundation.layout.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Info
import androidx.compose.material.icons.filled.Person
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.example.cuida.ui.screens.home.components.ServiceItem

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

    // Substituímos o LazyVerticalGrid por Column + Row para evitar conflito de rolagem
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 18.dp),
        verticalArrangement = Arrangement.spacedBy(8.dp)
    ) {
        services.chunked(2).forEach { rowItems ->
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(16.dp)
            ) {
                rowItems.forEach { service ->
                    Box(modifier = Modifier.weight(1f)) {
                        ServiceCard(service)
                    }
                }
                // Se a linha tiver apenas 1 item, adiciona um espaço vazio para manter o alinhamento
                if (rowItems.size < 2) {
                    Spacer(modifier = Modifier.weight(1f))
                }
            }
        }
    }
}