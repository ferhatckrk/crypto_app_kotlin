package com.example.cryptoapp.network

import com.example.cryptoapp.model.home.CryptoResponse
import retrofit2.http.GET
import retrofit2.http.Header
import retrofit2.http.Query
import java.nio.channels.spi.AbstractSelectionKey

interface ApiFactory {
    // https://sandbox-api.coinmarketcap.com/v1/cryptocurrency/listings/latest?limit=10
    @GET("v1/cryptocurrency/listings/latest")
    suspend fun getData(
        @Header("X-CMC_PRO_API_KEY") apiKey: String,
        @Query("limit") limit : String
    ) : CryptoResponse
}