package edu.uchicago.gerber.books.presentation.widgets

import androidx.compose.material.BottomNavigation
import androidx.compose.material.BottomNavigationItem
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.navigation.NavController
import androidx.navigation.compose.currentBackStackEntryAsState
import edu.uchicago.gerber.books.R
import edu.uchicago.gerber.books.presentation.navagation.Screen

@Composable
fun BottomNavigationBar(navController: NavController) {
    val tabs = listOf(
        Screen.Search,
        Screen.Favorites,
        Screen.Contact
    )
    BottomNavigation(
        backgroundColor = colorResource(id = R.color.design_default_color_on_primary),
        contentColor = Color.White
    ) {
        val navBackStackEntry by navController.currentBackStackEntryAsState()
        val currentRoute = navBackStackEntry?.destination?.route
        tabs.forEach { tab ->
            BottomNavigationItem(
                icon = { Icon(painterResource(id = tab.icon), contentDescription = tab.title) },
                label = { Text(text = tab.title) },
                selectedContentColor = Color.Blue,
                unselectedContentColor = Color.Blue.copy(0.4f),
                alwaysShowLabel = true,
                selected = currentRoute == tab.route,
                onClick = {
                    navController.navigate(tab.route) {
                        // Pop up to the start destination of the graph to
                        // avoid building up a large stack of destinations
                        // on the back stack as users select items
                        navController.graph.startDestinationRoute?.let { route ->
                            popUpTo(route) {
                                saveState = true
                            }
                        }
                        // Avoid multiple copies of the same destination when
                        // re-selecting the same item
                        launchSingleTop = true
                        // Restore state when reselecting a previously selected item
                        restoreState = true
                    }
                }
            )
        }
    }
}