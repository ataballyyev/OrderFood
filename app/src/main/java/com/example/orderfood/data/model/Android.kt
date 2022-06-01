package com.example.orderfood.data.model

import java.io.Serializable

data class Android(
    val hasAudio: Boolean,
    val videoTypeCode: String,
    val videoUrl: String
): Serializable