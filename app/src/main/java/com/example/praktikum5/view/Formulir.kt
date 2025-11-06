@file:OptIn(ExperimentalMaterial3Api::class)
package com.example.praktikum5.view

import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.runtime.Composable

@Composable
fun FormIsian(
    JenisK:List<String> = listOf("Laki-laki", "Perempuan"),
    OnSubmitBtnClick : () -> Unit
)