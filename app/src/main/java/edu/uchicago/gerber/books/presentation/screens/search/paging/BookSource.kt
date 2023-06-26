package edu.uchicago.gerber.books.presentation.screens.search.paging

import android.app.Application
import androidx.paging.PagingSource
import androidx.paging.PagingState
import edu.uchicago.gerber.books.data.models.Item
import edu.uchicago.gerber.books.models.Paginate
import edu.uchicago.gerber.books.data.repository.BooksRepository

class BookSource (
    private val booksRepository: BooksRepository,
    private val paginateData: Paginate
) :
    PagingSource<Int, Item>() {
    override fun getRefreshKey(state: PagingState<Int, Item>): Int? {
        return state.anchorPosition?.let { anchorPosition ->
            val anchorPage = state.closestPageToPosition(anchorPosition)
            anchorPage?.prevKey?.plus(1) ?: anchorPage?.nextKey?.minus(1)
        }
    }

    override suspend fun load(params: LoadParams<Int>): LoadResult<Int, Item> {
        return try {
            val prev = params.key ?: 0

            val response = booksRepository.getBooks(
                startIndex = prev,
                maxResults = params.loadSize,
                query = paginateData.query,
            )

            if (response.isSuccessful) {
                val body = response.body()?.items
                LoadResult.Page(
                    data = body!!,
                    prevKey = if (prev == 0) null else prev - 1,
                    nextKey = if (body.size < params.loadSize) null else prev + 10
                )
            } else {
                 LoadResult.Error(Exception(response.message()))
            }

        } catch (e: Exception) {
            LoadResult.Error(e)
        }
    }

    override val keyReuseSupported: Boolean
        get() = true

}