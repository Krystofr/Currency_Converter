package app.christopher.currencyconverter.main

import app.christopher.currencyconverter.data.models.CurrencyResponse
import app.christopher.currencyconverter.util.Resource

interface MainRepository {
    suspend fun getRates(base: String): Resource<CurrencyResponse>
}