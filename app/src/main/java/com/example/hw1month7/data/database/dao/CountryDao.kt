package com.example.hw1month7.data.database.dao

import androidx.room.*
import com.example.hw1month7.data.database.dao.Country

@Dao
interface CountryDao {

    @Query("SELECT * FROM country")
    suspend fun getCountry(): List<Country>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun createCountry(country: Country)

    @Update
    suspend fun updateCountry(country: Country)

    @Delete
    suspend fun deleteCountry(country: Country)
}