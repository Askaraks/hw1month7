package com.example.hw1month7.domain.mappers

import com.example.hw1month7.data.database.dao.Country
import com.example.hw1month7.domain.models.CountryEntity

fun List<Country>.mapToContactEntity() = this.map {
    CountryEntity(
        id = it.id,
        name = it.name,
        language = it.language
    )
}