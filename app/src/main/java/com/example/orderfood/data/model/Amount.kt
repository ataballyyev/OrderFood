package com.example.orderfood.data.model

import java.io.Serializable

data class Amount(
    val imperial: Imperial,
    val metric: Metric
): Serializable