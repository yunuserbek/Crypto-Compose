package com.example.crypto_compose.service

import com.example.crypto_compose.model.Crypto
import com.example.crypto_compose.model.CryptoList
import retrofit2.http.GET

//https://raw.githubusercontent.com/atilsamancioglu/IA32-CryptoComposeData/main/cryptolist.json
interface CryptoAPI {
    @GET("/atilsamancioglu/IA32-CryptoComposeData/main/cryptolist.json")
    suspend fun getCryptoList():CryptoList

    @GET("/atilsamancioglu/IA32-CryptoComposeData/main/crypto.json")
    suspend fun getCrypto():Crypto
}