package com.example.orderfood.data.model

import java.io.Serializable

data class LinkTag(
    val href: String,
    val hreflang: String,
    val rel: String
): Serializable