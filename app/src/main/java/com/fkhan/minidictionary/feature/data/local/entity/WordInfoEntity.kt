package com.fkhan.minidictionary.feature.data.local.entity

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.fkhan.minidictionary.feature.domain.model.Meaning
import com.fkhan.minidictionary.feature.domain.model.WordInfo
import kotlin.system.measureTimeMillis

@Entity
data class WordInfoEntity(
    val word: String,
    val phonetic: String,
    val origin: String,
    val meanings: List<Meaning>,
    @PrimaryKey val id: Int? = null
) {
    fun toWordInfo(): WordInfo {
        return WordInfo(
            meaning = meanings,
            word = word,
            origin = origin,
            phonetic = phonetic
        )
    }
}
