package com.example.sssssss.ui.theme.second

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.sp
import androidx.hilt.navigation.compose.hiltViewModel
import com.example.sssssss.ui.theme.home.HomeScreenViewModel

@Composable
fun SecondScreen (viewModel: HomeScreenViewModel =hiltViewModel()) {
    Column(modifier = Modifier.fillMaxSize(), verticalArrangement = Arrangement.Center, horizontalAlignment = Alignment.Start) {

        Text(text = viewModel.txt1, fontSize = 35.sp)
        Text(text = viewModel.txt2, fontSize = 35.sp)
    }
}