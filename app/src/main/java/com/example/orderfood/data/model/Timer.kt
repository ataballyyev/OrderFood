package com.example.orderfood.data.model

import java.io.Serializable

data class Timer(
    val durationSeconds: Int,
    val finishMessage: String,
    val id: String,
    val mappingNotificationId: String,
    val maxRepeat: Int,
    val priority: String,
    val repeatable: Boolean,
    val timerName: String
): Serializable