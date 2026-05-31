package com.example.cuida.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.cuida.components.utils.CircleIcon

@Composable
fun HeaderSection() {

    Box(
        modifier = Modifier
            .fillMaxWidth()
            .height(170.dp)
            .clip(
                RoundedCornerShape(
                    bottomStart = 28.dp,
                    bottomEnd = 28.dp
                )
            )
            .background(Color(0xFF1F55F0))
            .statusBarsPadding()
            .padding(24.dp)
    ) {

        Column {

            Row(
                verticalAlignment = Alignment.CenterVertically
            ) {
                Column(
                    modifier = Modifier.weight(1f)
                ) {
                    Text(
                        text = "Cuida+",
                        color = Color.White,
                        fontSize = 26.sp,
                        fontWeight = FontWeight.Bold
                    )
                    Text(
                        text = "Bem-vindo!",
                        color = Color.White,
                        fontSize = 12.sp
                    )
                }

                CircleIcon(
                    icon = Icons.Default.Notifications,
                    background = Color(0xFF3F73F4)
                )
                Spacer(modifier = Modifier.width(12.dp))
                CircleIcon(
                    icon = Icons.Default.Settings,
                    background = Color(0xFF3F73F4)
                )
            }

            Spacer(modifier = Modifier.height(24.dp))

            Text(
                text = "Acesse aqui os serviços de saúde da sua cidade",
                color = Color.White,
                fontSize = 14.sp
            )
        }
    }
}