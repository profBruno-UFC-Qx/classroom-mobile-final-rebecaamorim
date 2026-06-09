package com.example.cuida.ui.screens.home.components

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun ImportantWarningsCard() {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 24.dp),
        shape = RoundedCornerShape(20.dp),
        colors = CardDefaults.cardColors(containerColor = Color.White),
        elevation = CardDefaults.cardElevation(4.dp)
    ) {
        Column(
            modifier = Modifier.padding(20.dp)
        ) {
            Text(
                text = "Avisos Importantes",
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold,
                color = Color(0xFF081225)
            )

            Spacer(modifier = Modifier.height(16.dp))

            Text("Campanha de Vacinação")
            Text("Gripe - Disponível em todos os postos até 30/04")

            Spacer(modifier = Modifier.height(14.dp))

            Text("Horário Especial")
            Text("Sábado (23/03): Atendimento das 8h às 12h")
        }
    }
}