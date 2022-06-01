package com.example.orderfood.data.model

import java.io.Serializable

data class GuidedVariation(
    val actions: List<Action>,
    val applianceUnitTypeCode: String,
    val connected: Boolean,
    val default: Boolean,
    val id: String,
    val variationAttributes: List<Any>
): Serializable