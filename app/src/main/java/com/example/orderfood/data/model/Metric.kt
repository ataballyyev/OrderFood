package com.example.orderfood.data.model

import java.io.Serializable

data class Metric(
    val quantity: Float,
    val unit: UnitX
): Serializable