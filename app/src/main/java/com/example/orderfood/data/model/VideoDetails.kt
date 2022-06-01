package com.example.orderfood.data.model

import java.io.Serializable

data class VideoDetails(
    val android: List<Android>,
    val ios: List<Io>
): Serializable