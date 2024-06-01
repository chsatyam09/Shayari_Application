package com.placement.shayari_project.Routing

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.placement.shayari_project.CategoryScreen

import com.placement.shayari_project.FinalShayariView
import com.placement.shayari_project.FirstScreen
import com.placement.shayari_project.ShayariListScreen


@Composable
fun ShyariRouting(navHostController: NavHostController) {

    NavHost(navController = navHostController, startDestination = ShayariRoutingItem.FirstScreen.route,)

//    NavHost(navController = navHostController, startDestination = "FirstScreen")



//    NavHost(navController =navHostController , graph =  ???? )
    
//    NavHost(navController = navHostController, graph = )
    {

        composable(ShayariRoutingItem.CategoryScreen.route){

            CategoryScreen(navHostController)
        }

        composable(ShayariRoutingItem.FirstScreen.route){
            FirstScreen(navHostController)
        }

        composable(ShayariRoutingItem.FirstScreen.route + "/{title}"){
            val title = it.arguments?.getString("title")
            ShayariListScreen(navHostController,title)
        }

        composable(ShayariRoutingItem.FinalShayariScreen .route + "{item}"
        ){

            FinalShayariView(it.arguments?.getString("item").toString())
        }

    }

}


