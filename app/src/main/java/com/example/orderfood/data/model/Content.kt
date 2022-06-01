package com.example.orderfood.data.model

import java.io.Serializable

data class Content(
    val alternateExternalUrls: AlternateExternalUrls,
    val collections: List<Any>,
    val ctaUrl: String,
    val description: Any,
    val details: Details,
    val guidedVariations: List<GuidedVariation>,
    val ingredientLines: List<IngredientLineX>,
    val moreContent: MoreContent,
    val nutrition: Nutrition,
    val platformName: String,
    val preparationStepCount: Int,
    val preparationSteps: Any,
    val relatedContent: RelatedContent,
    val relatedProducts: RelatedProducts,
    val reviews: Reviews,
    val tags: Tags,
    val tagsAds: TagsAds,
    val unitSystem: String,
    val urbSubmitters: List<Any>,
    val videos: Videos,
    val yums: Yums
): Serializable