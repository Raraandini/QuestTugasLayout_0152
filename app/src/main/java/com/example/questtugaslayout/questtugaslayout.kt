package com.example.questtugaslayout

import androidx.compose.runtime.Composable
import androidx.compose.foundation.layout.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

data class ProfileData(
    val nameRes: Int,
    val phoneRes: Int?,
    val detailRes: Int,
    val bgColorRes: Int,
    val nameColorRes: Int
)

@Composable
fun MainScreen() {
    val profiles = listOf(
        ProfileData(R.string.name_rara, null, R.string.detail_rara, R.color.card_sage, R.color.text_dark),
        ProfileData(R.string.name_salwa, R.string.phone_salwa, R.string.detail_salwa, R.color.card_purple, R.color.text_dark),
        ProfileData(R.string.name_iza, R.string.phone_iza, R.string.detail_iza, R.color.card_blue, R.color.text_dark),
        ProfileData(R.string.name_putri, R.string.phone_putri, R.string.detail_putri, R.color.card_green, R.color.text_dark)
    )
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

    }
}