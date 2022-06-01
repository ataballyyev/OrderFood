package com.example.orderfood.data.model

import java.io.Serializable

data class Tags(
    val `allergy-preference`: List<AllergyPreference>,
    val course: List<Course>,
    val cuisine: List<Cuisine>,
    val `diet-preference`: List<DietPreference>,
    val difficulty: List<Difficulty>,
    val dish: List<Dish>,
    val equipment: List<EquipmentX>,
    val holiday: List<Holiday>,
    val nutrition: List<NutritionX>,
    val pro: List<Pro>,
    val `seo-tag`: List<Any>,
    val technique: List<Technique>
): Serializable