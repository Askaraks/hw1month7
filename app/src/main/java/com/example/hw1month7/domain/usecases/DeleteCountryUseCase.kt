package com.example.hw1month7.domain.usecases

import com.example.hw1month7.data.database.dao.Country
import com.example.hw1month7.domain.CountryRepository
import javax.inject.Inject

class DeleteCountryUseCase @Inject constructor(
    private val countryRepository: CountryRepository
) {
    fun deleteCountry(country: Country) = countryRepository.createCountry(country)
}