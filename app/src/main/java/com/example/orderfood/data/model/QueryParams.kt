package com.example.orderfood.data.model

import java.io.Serializable

data class QueryParams(
    val apiFeedType: String,
    val authorId: String,
    val id: String,
    val start: Int
): Serializable