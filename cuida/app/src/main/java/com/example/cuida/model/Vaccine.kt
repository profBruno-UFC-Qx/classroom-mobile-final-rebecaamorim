package com.example.cuida.model

data class Vaccine(
    val name: String,
    val description: String,
    val status: String,
    val ageRange: String,
    val locations: List<String>
)