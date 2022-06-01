package com.example.orderfood.data.model

import java.io.Serializable

data class NutritionEstimate(
    val attribute: String,
    val display: Display,
    val unit: UnitXXXX,
    val value: Float
): Serializable