package com.example.orderfood.data.model

import java.io.Serializable

data class IngredientLine(
    val amount: Amount,
    val category: String,
    val ingredient: String,
    val ingredientId: String,
    val remainder: String,
    val sortOrder: Int
): Serializable