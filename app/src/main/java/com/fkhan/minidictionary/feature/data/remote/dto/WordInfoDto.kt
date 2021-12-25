package com.fkhan.minidictionary.feature.data.remote.dto


import com.fkhan.minidictionary.feature.domain.model.Phonetic
import com.fkhan.minidictionary.feature.domain.model.WordInfo
import com.google.gson.annotations.SerializedName

data class WordInfoDto(
    @SerializedName("meanings")
    val meaningDtos: List<MeaningDto>,
    @SerializedName("origin")
    val origin: String,
    @SerializedName("phonetic")
    val phonetic: String,
    @SerializedName("phonetics")
    val phoneticDtos: List<PhoneticDto>,
    @SerializedName("word")
    val word: String
) {
    fun toWordInfo(): WordInfo {
        return WordInfo(
            meaning = meaningDtos.map { it.toMeaning() },
            origin = origin,
            phonetic = phonetic,
            word = word
        )
    }
}