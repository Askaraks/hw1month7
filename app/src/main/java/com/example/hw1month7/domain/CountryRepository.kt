package com.example.hw1month7.domain

import com.example.hw1month7.data.database.dao.Country
import com.example.hw1month7.domain.models.CountryEntity
import com.example.hw1month7.domain.utils.Resource
import kotlinx.coroutines.flow.Flow

interface CountryRepository {

    fun getCountry(): Flow<Resource<List<CountryEntity>>>

    fun createCountry(country: Country): Flow<Resource<Unit>>

    fun updateCountry(country: Country): Flow<Resource<Unit>>

    fun deleteCountry(country: Country): Flow<Resource<Unit>>
}