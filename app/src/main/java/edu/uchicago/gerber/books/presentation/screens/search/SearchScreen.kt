package edu.uchicago.gerber.books.presentation.screens.search

import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import edu.uchicago.gerber.books.common.Constants

import edu.uchicago.gerber.books.presentation.search.SearchOperation
import edu.uchicago.gerber.books.presentation.search.widgets.BookList

import edu.uchicago.gerber.books.screens.CustomOutlinedTextField

import edu.uchicago.gerber.books.presentation.viewmodels.BookViewModel
import edu.uchicago.gerber.books.presentation.widgets.BottomNavigationBar


@Composable
fun SearchScreen(
    bookViewModel: BookViewModel,
    navController: NavController,
) {
    val state = bookViewModel.searchState.value
    val queryText = bookViewModel.queryText.value

    Scaffold(
        modifier = Constants.modifier,
        bottomBar = { BottomNavigationBar(navController) },
        topBar = {
            TopAppBar(
                backgroundColor = Color.Transparent,
                elevation = 1.dp,

                ) {
                Text(
                    text = "Search Books",
                    modifier = Modifier
                        .fillMaxWidth(),
                    style = TextStyle(color = Color.Black, fontWeight = FontWeight.Bold),
                    textAlign = TextAlign.Center,
                    fontSize = 20.sp
                )

            }
        }
    ) { paddingValues ->
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(paddingValues = paddingValues),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {

            CustomOutlinedTextField(
                title = "Search term(s)",
                placeHolder = "e.g. java",
                textState = queryText,
                onTextChange = bookViewModel::setQueryText,
                keyboardType = KeyboardType.Text,
                ImeAction.Search,
                bookViewModel::onSearch
            )

            Spacer(modifier = Modifier.height(10.dp))
            when (state.searchOperation) {
                SearchOperation.LOADING -> {
                    Box(
                        modifier = Modifier
                            .fillMaxSize()
                            .padding(16.dp)
                    ) {
                        CircularProgressIndicator(
                            modifier = Modifier
                                .padding(12.dp)
                                .align(
                                    Alignment.Center
                                )
                        )
                    }
                }
                SearchOperation.DONE -> {
                    BookList(bookViewModel, navController)
                }
                else -> {
                    Box {}
                }
            }

        }
    }
}