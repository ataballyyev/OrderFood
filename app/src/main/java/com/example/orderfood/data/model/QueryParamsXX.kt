package com.example.orderfood.data.model

import java.io.Serializable

data class QueryParamsXX(
    val apiFeedType: String,
    val id: String,
    val relatedContentType: String,
    val start: Int
): Serializable