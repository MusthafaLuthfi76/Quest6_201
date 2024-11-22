package com.example.praktikumnavigasi.ui.view.screen

import androidx.compose.runtime.Composable
import com.example.praktikumnavigasi.model.Mahasiswa

@Composable
fun RencanaStudyView(
    mahasiswa: Mahasiswa,
    onSubmitButtonClicked: (MutableList<String>) -> Unit,
    onBackButtonClicked: () -> Unit
){}