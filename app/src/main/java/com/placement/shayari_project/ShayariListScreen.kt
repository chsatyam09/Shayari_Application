package com.placement.shayari_project

import android.os.Handler
import android.os.Looper
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.placement.shayari_project.Routing.ShayariRoutingItem
import com.placement.shayari_project.ui.theme.primaryColor


@Preview
@Composable
 fun ShayariListScreen(title: String = "Love") {

}


@Composable
fun ShayariListScreen(navHostController: NavHostController? = null, title: String?) {

    Surface() {
        Box(modifier = Modifier
            .fillMaxSize()
            .background(color = primaryColor)
        ){

Column() {
    MainToolBar(title = title.toString()){

    }

    var myFinalList = getList().filter {
        it.title == title.toString()
    }

    val finalList = myFinalList[0]


    finalList.list?.let{ list ->
        LazyColumn {
            items(list){   item ->


                Card(modifier = Modifier
                    .fillMaxSize()
                    .padding(start = 15.dp , end = 15.dp, top = 15.dp)
                    .clickable {

     navHostController?.navigate(ShayariRoutingItem.FinalShayariScreen .route+ " /$item")


                    },
                    colors = CardDefaults.cardColors(
                        containerColor = primaryColor
                    )
                ) {



                    Text(text = item, color = Color.White,
                        modifier = Modifier.fillMaxSize()
                            .padding(17.dp),
                        textAlign = TextAlign.Center,
                        style = TextStyle(
                            fontSize = 14.sp
                        )

                        )
                }















            }
        }

    }
}


        } // Box


    } // surface

} //ShayariListScreen
















