package com.example.orderfood.data.model

import java.io.Serializable

data class Reviews(
    val averageRating: Double,
    val mobileSectionName: String,
    val reviews: List<Any>,
    val sortBy: String,
    val thisUserReview: Any,
    val totalReviewCount: Int
): Serializable