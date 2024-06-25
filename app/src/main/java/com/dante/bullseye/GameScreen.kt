package com.dante.bullseye

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.material3.Button
import androidx.compose.material3.Slider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.dante.bullseye.ui.theme.BullseyeTheme

@Composable
fun GameScreen() {
    Column (horizontalAlignment = Alignment.CenterHorizontally){
        Text("Put The Bullseye As Close As You Can To")
        Text("89", fontSize = 32.sp , fontWeight = FontWeight.Bold)
        Row(verticalAlignment = Alignment.CenterVertically) {
            Text("0")
            Slider(
                value = 0.5f,
                valueRange = 0.01f..1f,
                onValueChange = {}
            )
            Text("100")
        }
        Button(onClick = {}) {
            Text("Hit Me")
        }

    }

}

@Preview(showBackground = true)
@Composable
fun GameScreenPreview() {
    BullseyeTheme {
        GameScreen()
    }
}