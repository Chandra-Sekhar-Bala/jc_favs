package edu.uchicago.gerber.books.data.repository

import edu.uchicago.gerber.books.common.Constants
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory


object ApiProvider {

    fun booksApi(): BooksApi {
        return Retrofit.Builder()
            .baseUrl(Constants.googleUrl)
             //add a client allows us to intercept the network traffic
            .client(getOkHttpClient())
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(BooksApi::class.java)
    }


    private fun getOkHttpClient() = OkHttpClient.Builder().addInterceptor(getLoggingInterceptor()).build()

    //todo set HttpLoggingInterceptor.Level.BODY to HttpLoggingInterceptor.Level.NONE for production release
    private fun getLoggingInterceptor() =
        HttpLoggingInterceptor().setLevel(HttpLoggingInterceptor.Level.BODY)

}