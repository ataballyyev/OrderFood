package com.example.orderfood.data.model

import java.io.Serializable

data class Details(
    val attribution: Attribution,
    val brand: Any,
    val directionsUrl: String,
    val displayName: String,
    val globalId: String,
    val id: String,
    val images: List<Image>,
    val keywords: List<String>,
    val name: String,
    val numberOfServings: Int,
    val rating: Float,
    val recipeId: String,
    val title: String,
    val totalTime: String,
    val totalTimeInSeconds: Int
): Serializable