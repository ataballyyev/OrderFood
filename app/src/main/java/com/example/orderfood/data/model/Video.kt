package com.example.orderfood.data.model

import java.io.Serializable

data class Video(
    val createTime: String,
    val hasAudio: Boolean,
    val originalVideoUrl: String,
    val snapshotUrl: String,
    val videoTypeCode: String,
    val videoUrls: VideoUrls
): Serializable