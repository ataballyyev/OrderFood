package com.example.orderfood.data.model

import java.io.Serializable

data class UnitXXX(
    val abbreviation: String,
    val decimal: Boolean,
    val id: String,
    val kind: String,
    val name: String,
    val plural: String,
    val pluralAbbreviation: String
): Serializable