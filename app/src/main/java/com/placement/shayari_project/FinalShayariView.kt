package com.placement.shayari_project

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.contentColorFor
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.placement.shayari_project.ui.theme.primaryColor
import com.placement.shayari_project.ui.theme.primaryLight


@Composable
 fun FinalShayariView(finalShyari:String) {

  Surface() {
   Box(modifier = Modifier
    .fillMaxSize()
    .background(color = primaryColor), contentAlignment = Alignment.Center)

   {
 Column {

  Card(modifier = Modifier
   .fillMaxWidth()
   .padding(20.dp), shape = RoundedCornerShape(16.dp),
   colors = CardDefaults.cardColors(containerColor = primaryLight.copy(0.5f)),
    border = BorderStroke(width = 1.dp, color = Color.White)
  ) {
   Box(modifier = Modifier.fillMaxWidth(),
   ){

    Text(
     modifier = Modifier
      .fillMaxWidth()
      .padding(25.dp),
     text = finalShyari,
     color = Color.White,
     style = TextStyle(fontSize = 18.sp, fontWeight = FontWeight.Bold),
     textAlign = TextAlign.Center
    )

   }// Box
  }

Row(horizontalArrangement = Arrangement.SpaceEvenly,
 modifier = Modifier.fillMaxWidth()) {
 Card(modifier = Modifier.size(45.dp,35.dp).clickable {
                                                      //TODO
 }, colors = CardDefaults.cardColors(
  containerColor = primaryLight.copy(0.7f),
  ), shape = RoundedCornerShape(100.dp)


  ) {

Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center){

 Icon(painterResource(id =R.drawable.copy ) , contentDescription = " copy button",
  tint = Color.White
 )
}

 }

 Card(modifier = Modifier.size(45.dp,35.dp).clickable {
                                                    //  TODO
 }, colors = CardDefaults.cardColors(
  containerColor = primaryLight.copy(0.7f),
 ), shape = RoundedCornerShape(100.dp)


 ) {

  Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center){

   Icon(painterResource(id =R.drawable.share ) , contentDescription = " copy button",
    tint = Color.White
   )
  }

 }


}


 } // Column


   } // Box

  }
    
}