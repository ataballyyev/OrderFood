package com.example.orderfood.data.model

import java.io.Serializable

data class SpotlightSearch(
    val keywords: List<String>,
    val noindex: Boolean
): Serializable