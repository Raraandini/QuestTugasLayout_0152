package com.example.questtugaslayout

import androidx.compose.runtime.Composable
import androidx.compose.foundation.layout.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.material3.Text
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.ui.res.colorResource

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
        Spacer(modifier = Modifier.height(24.dp))
        Text(
            text = stringResource(id = R.string.title_tekinfo),
            fontSize = 24.sp,
            fontWeight = FontWeight.Bold
        )
        Text(
            text = stringResource(id = R.string.subtitle_umy),
            fontSize = 14.sp,
            fontWeight = FontWeight.Medium
        )
        Spacer(modifier = Modifier.height(24.dp))

        Text(
            text = stringResource(id = R.string.copyright_text),
            fontSize = 12.sp,
            modifier = Modifier.padding(vertical = 8.dp)
        )

    }
}

@Composable
fun ProfileCard(profile: ProfileData) {
    Card(
        modifier = Modifier.fillMaxWidth(),
        shape = RoundedCornerShape(16.dp),
        colors = CardDefaults.cardColors(containerColor = colorResource(id = profile.bgColorRes))
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween
        ) {

        }

    }
}