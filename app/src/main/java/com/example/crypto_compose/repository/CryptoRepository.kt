package com.example.crypto_compose.repository

import com.example.crypto_compose.model.Crypto
import com.example.crypto_compose.model.CryptoList
import com.example.crypto_compose.service.CryptoAPI
import com.example.crypto_compose.util.Resource
import dagger.hilt.android.scopes.ActivityScoped
import java.lang.Exception
import javax.inject.Inject

@ActivityScoped
class CryptoRepository@Inject constructor(private val api:CryptoAPI) {
    suspend fun getCryptoList():Resource<CryptoList>{
        val response = try {
            api.getCryptoList()

        }catch (e:Exception){
            return Resource.Error("Error")
        }
        return Resource.Success(response)

    }
    suspend fun getCrypto ():Resource<Crypto>{
        val response =try {
            api.getCrypto()

        }catch (e:Exception){
            return Resource.Error("Error")
        }
        return Resource.Success(response)
    }

}