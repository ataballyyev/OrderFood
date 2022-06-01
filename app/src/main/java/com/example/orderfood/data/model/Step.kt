package com.example.orderfood.data.model

import java.io.Serializable

data class Step(
    val displayText: String,
    val equipment: List<Equipment>,
    val imageUrl: String,
    val ingredientLines: List<IngredientLine>,
    val timers: List<Timer>,
    val video: Video
): Serializable