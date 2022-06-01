package com.example.orderfood.data.model

import java.io.Serializable

data class SeoX(
    val firebase: FirebaseX,
    val spotlightSearch: SpotlightSearchX,
    val web: WebX
): Serializable