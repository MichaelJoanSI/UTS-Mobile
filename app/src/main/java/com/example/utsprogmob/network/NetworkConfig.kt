package com.example.utsprogmob.network

import com.example.utsprogmob.model.MahasiswaResI
import com.example.utsprogmob.model.ResponseItem
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Call
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET

class NetworkConfig {
    fun getInterceptor() : OkHttpClient {
        val logging = HttpLoggingInterceptor()
        logging.level = HttpLoggingInterceptor.Level.BODY
        val okHttpClient = OkHttpClient.Builder()
            .addInterceptor(logging)
            .build()
        return okHttpClient
    }
    fun getRetrofit() : Retrofit {
        return Retrofit.Builder()
            .baseUrl("https://kpsi.fti.ukdw.ac.id")
            .client(getInterceptor())
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }
    fun getService() = getRetrofit().create(Users::class.java)
}
interface Users {
    @GET("users")
    fun getUsers(): Call<List<ResponseItem>>
    @GET("api/progmob/mhs/72200375")
    fun getUser(): Call<List<MahasiswaResI>>
}