package com.example.hw1month7.domain.usecases

import com.example.hw1month7.domain.CountryRepository
import javax.inject.Inject

class GetCountryUseCase @Inject constructor(
    private val repository: CountryRepository
) {

    fun getCountry() = repository.getCountry()
}