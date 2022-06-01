package com.example.orderfood.data.model

import java.io.Serializable

data class Firebase(
    val appUrl: String,
    val description: String,
    val name: String,
    val noindex: Boolean,
    val webUrl: String
): Serializable