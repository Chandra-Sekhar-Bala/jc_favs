package edu.uchicago.gerber.books.data.repository


import edu.uchicago.gerber.books.data.models.VolumesResponse
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import retrofit2.Response

//simple books repo
class BooksRepository (private val booksApi: BooksApi) {

    //this must be called on a background thread b/c it is long-running
    //here, I pass in the parameters I need, which then re-pass to the instantated interface
    suspend fun getBooks(
        query: String,
        maxResults: Int,
        startIndex: Int,
    ): Response<VolumesResponse> {
        return withContext(Dispatchers.IO) {
            booksApi.getBooks(
                query = query,
                maxResults = maxResults,
                startIndex = startIndex,
            )
        }
    }
}



