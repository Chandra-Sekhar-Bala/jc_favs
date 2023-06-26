package edu.uchicago.gerber.books.screens


import androidx.compose.animation.AnimatedContentScope
import androidx.compose.animation.ExperimentalAnimationApi
import androidx.compose.animation.core.tween
import androidx.compose.runtime.Composable

import androidx.navigation.NavHostController
import com.google.accompanist.navigation.animation.AnimatedNavHost
import com.google.accompanist.navigation.animation.composable
import edu.uchicago.gerber.books.presentation.screens.contact.ContactScreen
import edu.uchicago.gerber.books.presentation.screens.details.DetailsScreen
import edu.uchicago.gerber.books.presentation.screens.favorites.FavoritesScreen
import edu.uchicago.gerber.books.presentation.screens.search.SearchScreen
import edu.uchicago.gerber.books.presentation.navagation.Screen
import edu.uchicago.gerber.books.presentation.viewmodels.BookViewModel

@OptIn(ExperimentalAnimationApi::class)
@Composable
fun Navigation(
    navController: NavHostController,
    bookViewModel: BookViewModel = BookViewModel()
) {

    AnimatedNavHost(navController, startDestination = Screen.Search.route) {
        composable(Screen.Search.route) {
            SearchScreen(bookViewModel = bookViewModel, navController = navController)

        }
        composable(Screen.Favorites.route) {
            FavoritesScreen(navController)
        }

        composable(Screen.Contact.route) {
            ContactScreen(navController)
        }

        composable(
            Screen.Detail.route,
            enterTransition = {
                slideIntoContainer(AnimatedContentScope.SlideDirection.Right, animationSpec = tween(300))
            },
            exitTransition = {
                slideOutOfContainer(AnimatedContentScope.SlideDirection.Left, animationSpec = tween(300))
            },) {
            DetailsScreen(navController = navController, bookViewModel = bookViewModel)
        }
    }
}

