package com.example.orderfood.data.model

import java.io.Serializable

data class FoodsModel(
    val feed: List<Feed>,
    val seo: SeoX
): Serializable