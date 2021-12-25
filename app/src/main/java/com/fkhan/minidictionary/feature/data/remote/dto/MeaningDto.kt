package com.fkhan.minidictionary.feature.data.remote.dto


import com.fkhan.minidictionary.feature.domain.model.Meaning
import com.google.gson.annotations.SerializedName

data class MeaningDto(
    @SerializedName("definitions")
    val definitions: List<DefinitionDto>,
    @SerializedName("partOfSpeech")
    val partOfSpeech: String
) {
    fun toMeaning(): Meaning {
        return Meaning(
            definitions = definitions.map{it.toDefinition()},
            partOfSpeech = partOfSpeech
        )
    }
}