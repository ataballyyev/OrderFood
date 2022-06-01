package com.example.orderfood.data.model

import java.io.Serializable

data class Videos(
    val createTime: String,
    val originalVideoUrl: String,
    val snapshotUrl: String,
    val videoDetails: VideoDetails,
    val videoUrls: VideoUrlsX
): Serializable