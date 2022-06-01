package com.example.orderfood.data.model

import java.io.Serializable

data class Nutrition(
    val mobileSectionName: String,
    val nutritionEstimates: List<NutritionEstimate>
): Serializable