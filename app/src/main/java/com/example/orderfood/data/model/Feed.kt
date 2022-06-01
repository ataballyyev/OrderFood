package com.example.orderfood.data.model

import java.io.Serializable

data class Feed(
    val content: Content,
    val display: DisplayX,
    val proRecipe: Boolean,
    val promoted: Boolean,
    val recipeType: List<String>,
    val seo: Seo,
    val `tracking-id`: String,
    val type: String
): Serializable