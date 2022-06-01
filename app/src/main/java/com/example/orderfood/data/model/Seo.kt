package com.example.orderfood.data.model

import java.io.Serializable

data class Seo(
    val firebase: Firebase,
    val spotlightSearch: SpotlightSearch,
    val web: Web
): Serializable