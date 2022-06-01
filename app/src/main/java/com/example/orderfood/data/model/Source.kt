package com.example.orderfood.data.model

import java.io.Serializable

data class Source(
    val eyebrowText: Any,
    val introVideo: IntroVideo,
    val marketingCopy: Any,
    val marketingImage: Any,
    val proSource: Any,
    val sourceDisplayName: String,
    val sourceFaviconUrl: String,
    val sourceHttpOk: Boolean,
    val sourceHttpsOk: Boolean,
    val sourceInFrame: Boolean,
    val sourcePageUrl: String,
    val sourceRecipeUrl: String,
    val sourceSiteUrl: String
): Serializable