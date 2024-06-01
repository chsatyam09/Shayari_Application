package com.placement.shayari_project.Routing


sealed class ShayariRoutingItem (val route:String) {

    object FirstScreen :  ShayariRoutingItem("First")


    object CategoryScreen :  ShayariRoutingItem("category")

    object ShayriListScrren :  ShayariRoutingItem("Shayrilist")

    object FinalShayariScreen :  ShayariRoutingItem("FinalShayari")

}

