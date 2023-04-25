package com.example.cameraapp

sealed class Screen(val route: String){
    object Home : Screen("home")
    object Gallery : Screen("Gallery")
    object PickFromCamera : Screen("PickFromCamera")
}