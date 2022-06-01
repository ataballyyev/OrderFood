package com.example.orderfood.data.model

import java.io.Serializable

data class QueryParamsX(
    val apiFeedType: String,
    val id: String,
    val start: Int
): Serializable