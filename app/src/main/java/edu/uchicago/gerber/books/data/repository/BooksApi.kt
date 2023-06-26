package edu.uchicago.gerber.books.data.repository

import edu.uchicago.gerber.books.data.models.VolumesResponse
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface BooksApi {

    //https://developers.google.com/books/docs/v1/using
    //this will manage generating the query string and using Retrofit to send GET request to api
    @GET(value = "books/v1/volumes")
    suspend fun getBooks(
        @Query("q") query: String,
        @Query("maxResults") maxResults: Int,
        @Query("startIndex") startIndex: Int,
    ): Response<VolumesResponse>
}