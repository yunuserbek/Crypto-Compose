package com.example.crypto_compose.di

import com.example.crypto_compose.repository.CryptoRepository
import com.example.crypto_compose.service.CryptoAPI
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.create
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {
    @Singleton
    @Provides
    fun provideCryptoRepository(api: CryptoAPI) = CryptoRepository(api)

    @Singleton
    @Provides
    fun provideCryptoApi():CryptoAPI{
        return Retrofit.Builder()
            .addConverterFactory(GsonConverterFactory.create())
            .baseUrl("https://raw.githubusercontent.com/")
            .build()
            .create(CryptoAPI::class.java)
    }

}