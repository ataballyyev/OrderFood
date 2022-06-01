package com.example.orderfood.data.model

import java.io.Serializable

data class Web(
    val `canonical-term`: String,
    val `image-url`: String,
    val `link-tags`: List<LinkTag>,
    val `meta-tags`: MetaTags,
    val noindex: Boolean
): Serializable