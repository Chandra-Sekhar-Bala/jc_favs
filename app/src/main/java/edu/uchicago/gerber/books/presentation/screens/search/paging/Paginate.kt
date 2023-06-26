package edu.uchicago.gerber.books.models

data class Paginate(
    val query: String = "",
    val maxResult: Int = 10,
    val startIndex: Int = 1,
)
