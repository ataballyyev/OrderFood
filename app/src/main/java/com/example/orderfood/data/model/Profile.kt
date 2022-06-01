package com.example.orderfood.data.model

import java.io.Serializable

data class Profile(
    val description: String,
    val displayName: String,
    val pageUrl: String,
    val pictureUrl: String,
    val profileName: String,
    val profileUrl: String,
    val siteUrl: String,
    val type: String
): Serializable