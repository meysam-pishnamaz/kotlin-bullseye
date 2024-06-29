package com.dante.bullseye

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun GamePrompt(modifier: Modifier=Modifier){
    Column(modifier = modifier,horizontalAlignment = Alignment.CenterHorizontally) {
        Text(stringResource(R.string.instruction_text))
        Text(
            stringResource(R.string.target_value),
            fontSize = 32.sp,
            fontWeight = FontWeight.Bold,
            modifier = modifier.padding(8.dp)
        )
    }
}