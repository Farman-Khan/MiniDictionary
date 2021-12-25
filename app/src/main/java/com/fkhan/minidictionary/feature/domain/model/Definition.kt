package com.fkhan.minidictionary.feature.domain.model

import com.google.gson.annotations.SerializedName

data class Definition(
    val antonyms: List<String>,
    val definition: String,
    val example: String?,
    val synonyms: List<String>
)
