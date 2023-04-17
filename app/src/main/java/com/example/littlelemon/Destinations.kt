package com.example.littlelemon

interface Destinations {
    val route: String
    val icon: Int
    val title: String
}

object Home : Destinations {
    override val route: String = "Home"
    override val icon: Int = R.drawable.ic_home
    override val title: String = "Home Page"
}

object Menu : Destinations {
    override val route: String = "Menu"
    override val icon: Int = R.drawable.ic_menu
    override val title: String = "Menu Page"
}

object Location : Destinations {
    override val route: String = "Location"
    override val icon: Int = R.drawable.ic_location
    override val title: String = "Location Page"
}