package com.example.orderfood.data.model

import java.io.Serializable

data class Image(
    val hostedLargeUrl: String,
    val resizableImageHeight: Int,
    val resizableImageUrl: String,
    val resizableImageWidth: Int
): Serializable