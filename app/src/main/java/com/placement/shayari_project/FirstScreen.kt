package com.placement.shayari_project

import android.os.Handler
import android.os.Looper
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.placement.shayari_project.Routing.ShayariRoutingItem
import com.placement.shayari_project.ui.theme.primaryColor
import kotlinx.coroutines.delay


@Composable
fun FirstScreen(navHostController: NavHostController) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(color = primaryColor)
    ) {
        Box(
            modifier = Modifier.fillMaxSize(),
            contentAlignment = Alignment.Center
        ) {

            Column() {

                Image(
                    painterResource(id = R.drawable.logo),
                    contentDescription = "App logo",
                    modifier = Modifier.size(100.dp)

                )

                Text(
                    text = "Shayri App",
                    color = Color.White,
                    fontSize = 19.sp,
                    fontFamily = FontFamily.Serif
                )

            } // Column

            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(19.dp),
                contentAlignment = Alignment.BottomCenter
            ) {
//                CircularProgressIndicator(
//                    modifier = Modifier.size(35.dp), strokeWidth = 5.dp,
//                    color = Color.White
//                )
            }   // Box


            LaunchedEffect(Unit) {
                delay(3500) // wait 3.5 seconds
                navHostController.navigate("category")
            }



            Handler(Looper.getMainLooper()).postDelayed(Runnable {
                navHostController.navigate(ShayariRoutingItem.CategoryScreen.route)
            }, 3000)


//            Handler(Looper.getMainLooper()).postDelayed(Runnable {
//                navHostController.navigate("category")
//            }, 3000)


        }  // Box

    }
}
