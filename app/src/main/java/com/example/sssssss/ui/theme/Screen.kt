package com.example.sssssss.ui.theme

import androidx.annotation.StringRes
import com.example.sssssss.R

sealed class Screen(val route: String, @StringRes val resourceId: Int) {
    object Home : Screen("Home", R.string.Home)
    object Second : Screen("Second", R.string.Second)
}