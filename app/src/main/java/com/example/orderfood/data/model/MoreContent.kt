package com.example.orderfood.data.model

import java.io.Serializable

data class MoreContent(
    val feed: List<Any>,
    val mobileSectionName: String,
    val queryParams: QueryParams
): Serializable