package com.example.sssssss.ui.theme.home

import android.app.Application
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import androidx.hilt.navigation.compose.hiltViewModel

@Composable
fun HomeScreen(viewModel: HomeScreenViewModel=hiltViewModel()){
    Column(modifier = Modifier.fillMaxSize(), verticalArrangement = Arrangement.Top, horizontalAlignment = Alignment.Start) {
        Text(text = "Стартовый экран", fontSize = 35.sp)
    }
    Column(modifier = Modifier.fillMaxSize(), verticalArrangement = Arrangement.Center, horizontalAlignment = Alignment.Start) {
        TextField(value = viewModel.txt1, onValueChange = {viewModel.txt1=it})
        TextField(value = viewModel.txt2, onValueChange = {viewModel.txt2=it})
    }
}


@Preview
@Composable
fun PreviewHome(){
    HomeScreen()
}