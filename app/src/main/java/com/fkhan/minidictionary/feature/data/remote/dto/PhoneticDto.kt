package com.fkhan.minidictionary.feature.data.remote.dto


import com.fkhan.minidictionary.feature.domain.model.Phonetic
import com.google.gson.annotations.SerializedName

data class PhoneticDto(
    @SerializedName("audio")
    val audio: String,
    @SerializedName("text")
    val text: String
) {
    fun toPhonetic(): Phonetic {
        return Phonetic(
            audio = audio,
            text = text
        )
    }
}