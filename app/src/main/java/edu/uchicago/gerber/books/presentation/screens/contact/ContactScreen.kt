package edu.uchicago.gerber.books.presentation.screens.contact

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import edu.uchicago.gerber.books.R
import edu.uchicago.gerber.books.common.Constants
import edu.uchicago.gerber.books.presentation.widgets.BottomNavigationBar

@Composable
fun ContactScreen(navController: NavController) {

    Scaffold(
        modifier = Constants.modifier,
        bottomBar = { BottomNavigationBar(navController) },
        topBar = {
            TopAppBar(
                backgroundColor = Color.Transparent,
                elevation = 1.dp,

                ) {
                Text(
                    text = "Contact Us",
                    modifier = Modifier
                        .fillMaxWidth(),
                    style = TextStyle(color = Color.Black, fontWeight = FontWeight.Bold),
                    textAlign = TextAlign.Center,
                    fontSize = 20.sp
                )

            }
        }
    ) {
        paddingValues ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(paddingValues = paddingValues)
                .background(colorResource(id = R.color.cardview_shadow_start_color))
                .wrapContentSize(Alignment.Center)
        ) {
            Text(
                text = "Contact View",
                fontWeight = FontWeight.Bold,
                color = Color.White,
                modifier = Modifier.align(Alignment.CenterHorizontally),
                textAlign = TextAlign.Center,
                fontSize = 25.sp
            )
        }
    }
}


@Preview(showBackground = true)
@Composable
fun ContactScreenPreview() {
   // ContactScreen()
}