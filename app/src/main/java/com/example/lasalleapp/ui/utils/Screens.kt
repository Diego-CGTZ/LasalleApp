package com.example.lasalleapp.ui.utils

sealed class Screens (val route : String){
    data object Home : Screens("home")
    data object Grades : Screens("grades")
    data object Calendar : Screens("calendar")
    data object Settings : Screens("settings")
    data object NewsDetail : Screens("news-detail")
    data object ChangePassword : Screens("change-password")
    data object ChangeTheme : Screens("change-theme")
    data object GradesDetail : Screens("grades-detail")
    data object PayScreen : Screens("pay-screen")
    data object PaymentDetail : Screens("payment-detal")
}