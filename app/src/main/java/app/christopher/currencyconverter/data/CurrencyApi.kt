package app.christopher.currencyconverter.data

import app.christopher.currencyconverter.data.models.CurrencyResponse
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface CurrencyApi {
    @GET("/latest?access_key=be029a0582b3181d6be6550e9565c69c&format=1")
    suspend fun getRates (
        @Query("base") base: String
    ): Response<CurrencyResponse>
}