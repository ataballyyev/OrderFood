package com.example.orderfood.data.model

import java.io.Serializable

data class IngredientLineX(
    val amount: AmountX,
    val category: String,
    val categoryId: String,
    val id: String,
    val ingredient: String,
    val ingredientId: String,
    val quantity: Float,
    val relatedRecipeSearchTerm: List<RelatedRecipeSearchTerm>,
    val remainder: String,
    val unit: String,
    val wholeLine: String
): Serializable