package com.example.orderfood.data.model

import java.io.Serializable

data class RelatedProducts(
    val feed: List<Any>,
    val mobileSectionName: String,
    val queryParams: QueryParamsXX
): Serializable