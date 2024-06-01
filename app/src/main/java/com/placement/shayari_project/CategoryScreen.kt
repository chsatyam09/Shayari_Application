package com.placement.shayari_project

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.placement.shayari_project.Routing.ShayariRoutingItem
import com.placement.shayari_project.ui.theme.primaryColor
import com.placement.shayari_project.ui.theme.primaryLight





@Composable
fun CategoryScreen(navHostController: NavHostController) {

    Column() {

        Box(
            modifier = Modifier
                .fillMaxSize()
                .background(color = primaryColor)
        ) {


          Column() {
              MainToolBar(title = "Category",) // ye call karwaya hai Common.kt ( MainToolBar) se
              {
              }
              Text(text = "List")
          }

            LazyColumn() {
                items(getList()) { item ->
                    Card(modifier = Modifier
                        .fillMaxWidth()
                        .height(105.dp)
                        .padding(15.dp)
                        .clickable {
navHostController.navigate(ShayariRoutingItem.ShayriListScrren.route + "/${item.title.toString()}")

                        },

                        shape = RoundedCornerShape(17.dp),
                        colors = CardDefaults.cardColors( containerColor = primaryLight)
                    ) {

                        Box(modifier = Modifier.fillMaxSize(),
                            contentAlignment = Alignment.Center )
                        {
                            Text(text = item.title.toString(), style = TextStyle(
                                fontWeight = FontWeight.ExtraBold, fontSize = 22.sp
                            ), color = Color.White
                            )
                        }
                    }

                }

            }

        } //Box
    }// Column
}
