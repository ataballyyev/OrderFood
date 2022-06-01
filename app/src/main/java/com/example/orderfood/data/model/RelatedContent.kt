package com.example.orderfood.data.model

import java.io.Serializable

data class RelatedContent(
    val feed: List<Any>,
    val mobileSectionName: String,
    val queryParams: QueryParamsX
): Serializable