package com.dante.bullseye.components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.dante.bullseye.R

@Composable
fun GamePrompt(modifier: Modifier=Modifier,value: Int){
    Column(modifier = modifier,horizontalAlignment = Alignment.CenterHorizontally) {
        Text(stringResource(R.string.instruction_text), style = MaterialTheme.typography.titleMedium.copy(letterSpacing = 1.sp, fontWeight = FontWeight.Bold))
        Text(
            value.toString(),
            fontSize = 32.sp,
            fontWeight = FontWeight.Bold,
            modifier = modifier.padding(8.dp)
        )
    }
}

@Preview(showBackground = true)
@Composable
fun GamePromptPreview(){
    GamePrompt(value = 1)
}