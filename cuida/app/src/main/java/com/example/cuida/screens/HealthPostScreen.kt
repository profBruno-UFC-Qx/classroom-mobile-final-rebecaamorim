package com.example.cuida.screens

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.cuida.model.HealthPost

@Composable
fun HealthPostsScreen() {

    val posts = listOf(
        HealthPost(
            "UBS Centro",
            "Rua Principal, 123",
            "(88) 99999-9999",
            "07h às 19h"
        ),
        HealthPost(
            "UBS Vila Nova",
            "Av. Brasil, 456",
            "(88) 98888-8888",
            "07h às 19h"
        ),
        HealthPost(
            "UBS São José",
            "Rua das Flores, 789",
            "(88) 97777-7777",
            "07h às 19h"
        )
    )

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {

        Text(
            text = "Postos de Saúde",
            style = MaterialTheme.typography.headlineMedium
        )

        Spacer(
            modifier = Modifier.height(16.dp)
        )

        LazyColumn(
            verticalArrangement = Arrangement.spacedBy(12.dp)
        ) {

            items(posts) { post ->

                Card(
                    modifier = Modifier.fillMaxWidth()
                ) {

                    Column(
                        modifier = Modifier.padding(16.dp)
                    ) {

                        Text(
                            text = post.name,
                            style = MaterialTheme.typography.titleMedium
                        )

                        Spacer(
                            modifier = Modifier.height(8.dp)
                        )

                        Text(post.address)
                        Text(post.phone)
                        Text(post.hours)

                        Spacer(
                            modifier = Modifier.height(12.dp)
                        )

                        Button(
                            onClick = { }
                        ) {
                            Text("Direções")
                        }
                    }
                }
            }
        }
    }
}