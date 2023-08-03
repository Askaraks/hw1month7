package com.example.hw1month7.data.database

import androidx.room.Database
import com.example.hw1month7.data.database.dao.Country
import com.example.hw1month7.data.database.dao.CountryDao

@Database(entities = [Country::class], [], 1)
abstract class CountryDataBase {

    abstract fun getCountryDao(): CountryDao
}