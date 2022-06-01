package com.example.orderfood.data.model

import java.io.Serializable

data class Action(
    val name: String,
    val stepGroups: List<StepGroup>
): Serializable