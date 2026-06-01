package com.example.cuida.ui.screens.healthpost

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.KeyboardArrowLeft
import androidx.compose.material.icons.automirrored.filled.Send
import androidx.compose.material.icons.filled.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun HealthPostsScreen(onBackClick: () -> Unit = {}) {
    val posts = listOf(
        HealthPost(
            name = "UBS Centro",
            status = "Aberto agora",
            address = "Rua Principal, 123 - Centro",
            phone = "(11) 3456-7890",
            hours = "7h às 19h"
        ),
        HealthPost(
            name = "UBS Vila Nova",
            status = "Aberto agora",
            address = "Av. das Flores, 456 - Vila Nova",
            phone = "(11) 3456-7891",
            hours = "7h às 19h"
        ),
        HealthPost(
            name = "UBS Jardim América",
            status = "Aberto agora",
            address = "Rua das Palmeiras, 789 - Jardim América",
            phone = "(11) 3456-7892",
            hours = "7h às 19h"
        ),
        HealthPost(
            name = "UBS Birnin Zana",
            status = "Aberto agora",
            address = "Avenida Rei T'Challa, 1966 - Cidade Dourada",
            phone = "(11) 3456-7893",
            hours = "Atendimento 24h"
        )
    )

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFFF8F9FE))
    ) {
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .background(Color(0xFF1C54F2))
                .padding(top = 48.dp, bottom = 24.dp, start = 8.dp, end = 16.dp)
        ) {
            Row(verticalAlignment = Alignment.CenterVertically) {
                IconButton(onClick = onBackClick) {
                    Icon(Icons.AutoMirrored.Filled.KeyboardArrowLeft, "Voltar", tint = Color.White)
                }
                Surface(
                    shape = CircleShape,
                    color = Color.White.copy(alpha = 0.2f),
                    modifier = Modifier.size(40.dp)
                ) {
                    Box(contentAlignment = Alignment.Center) {
                        Icon(Icons.Default.Home, null, tint = Color.White, modifier = Modifier.size(20.dp))
                    }
                }
                Spacer(modifier = Modifier.width(12.dp))
                Text(
                    text = "Postos de Saúde",
                    color = Color.White,
                    fontSize = 20.sp,
                    fontWeight = FontWeight.Bold
                )
            }
        }

        LazyColumn(
            modifier = Modifier.fillMaxSize(),
            contentPadding = PaddingValues(16.dp),
            verticalArrangement = Arrangement.spacedBy(16.dp)
        ) {
            items(posts.size) { index ->
                HealthPostCard(posts[index])
            }
        }
    }
}

@Composable
fun HealthPostCard(post: HealthPost) {
    Card(
        shape = RoundedCornerShape(24.dp),
        colors = CardDefaults.cardColors(containerColor = Color.White),
        elevation = CardDefaults.cardElevation(defaultElevation = 2.dp),
        modifier = Modifier.fillMaxWidth()
    ) {
        Column(modifier = Modifier.padding(20.dp)) {
            Row(verticalAlignment = Alignment.CenterVertically) {
                Surface(
                    shape = RoundedCornerShape(12.dp),
                    color = Color(0xFF1C54F2),
                    modifier = Modifier.size(56.dp)
                ) {
                    Box(contentAlignment = Alignment.Center) {
                        Icon(Icons.Default.Home, null, tint = Color.White, modifier = Modifier.size(28.dp))
                    }
                }
                Spacer(modifier = Modifier.width(16.dp))
                Column {
                    Text(post.name, fontSize = 20.sp, fontWeight = FontWeight.Bold)
                    Spacer(modifier = Modifier.height(4.dp))

                    Surface(shape = RoundedCornerShape(12.dp), color = Color(0xFFE8F5E9)) {
                        Row(
                            modifier = Modifier.padding(horizontal = 8.dp, vertical = 4.dp),
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            Box(
                                modifier = Modifier
                                    .size(6.dp)
                                    .background(Color(0xFF4CAF50), CircleShape)
                            )
                            Spacer(modifier = Modifier.width(6.dp))
                            Text(post.status, color = Color(0xFF4CAF50), fontSize = 12.sp, fontWeight = FontWeight.Bold)
                        }
                    }
                }
            }

            Spacer(modifier = Modifier.height(20.dp))

            PostDetailRow(icon = Icons.Default.LocationOn, text = post.address, iconTint = Color(0xFF1C54F2))
            Spacer(modifier = Modifier.height(8.dp))
            PostDetailRow(icon = Icons.Default.Phone, text = post.phone, iconTint = Color(0xFF4CAF50))
            Spacer(modifier = Modifier.height(8.dp))
            PostDetailRow(icon = Icons.Default.Info, text = post.hours, iconTint = Color(0xFFFF9800))

            Spacer(modifier = Modifier.height(20.dp))

            Row(
                modifier = Modifier.fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Button(
                    onClick = {},
                    modifier = Modifier.weight(1f).height(48.dp),
                    colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF1C54F2)),
                    shape = RoundedCornerShape(12.dp)
                ) {
                    Icon(Icons.AutoMirrored.Filled.Send, contentDescription = null, modifier = Modifier.size(18.dp))
                    Spacer(modifier = Modifier.width(8.dp))
                    Text("Direções", fontWeight = FontWeight.Bold, fontSize = 15.sp)
                }

                Spacer(modifier = Modifier.width(12.dp))

                OutlinedButton(
                    onClick = {},
                    modifier = Modifier.size(48.dp),
                    shape = RoundedCornerShape(12.dp),
                    contentPadding = PaddingValues(0.dp),
                    border = BorderStroke(1.dp, Color(0xFFE0E0E0)),
                    colors = ButtonDefaults.outlinedButtonColors(contentColor = Color.Gray)
                ) {
                    Icon(Icons.Default.FavoriteBorder, contentDescription = "Favoritar", modifier = Modifier.size(22.dp))
                }
            }
        }
    }
}

@Composable
fun PostDetailRow(icon: ImageVector, text: String, iconTint: Color) {
    Surface(
        shape = RoundedCornerShape(12.dp),
        color = Color(0xFFF8F9FE),
        modifier = Modifier.fillMaxWidth()
    ) {
        Row(
            modifier = Modifier.padding(12.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Icon(icon, contentDescription = null, tint = iconTint, modifier = Modifier.size(18.dp))
            Spacer(modifier = Modifier.width(12.dp))
            Text(text, fontSize = 13.sp, color = Color(0xFF44474E), fontWeight = FontWeight.Medium)
        }
    }
}