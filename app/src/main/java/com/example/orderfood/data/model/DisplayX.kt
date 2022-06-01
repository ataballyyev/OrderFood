package com.example.orderfood.data.model

import java.io.Serializable

data class DisplayX(
    val callToActionText: Any,
    val cardType: String,
    val collections: List<Any>,
    val description: Any,
    val displayName: String,
    val displayPrepStepsInline: Any,
    val flag: String,
    val iconImage: Any,
    val images: List<String>,
    val profiles: List<Profile>,
    val source: Source,
    val textLocation: String,
    val title: String,
    val url: String
): Serializable