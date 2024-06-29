package com.dante.bullseye

import android.util.Log
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.dante.bullseye.ui.theme.BullseyeTheme

@Composable
fun GameScreen() {
    var alertIsVisible by remember { mutableStateOf(false)}
    var sliderValue by remember { mutableStateOf(0.5f)


    }

    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center, modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {
        Spacer(modifier = Modifier.weight(.5f))
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.SpaceEvenly,
            modifier = Modifier.weight(9f)
        ) {
            Text(stringResource(R.string.instruction_text))
            Text(
                stringResource(R.string.target_value),
                fontSize = 32.sp,
                fontWeight = FontWeight.Bold
            )
            TargetSlider(value = sliderValue, valueChanged = {value ->
                sliderValue = value
            })
            Button(onClick = {
                alertIsVisible = !alertIsVisible
                Log.i("debug", alertIsVisible.toString())
            }) {
                Text(stringResource(R.string.hit_me_button_text))
            }
        }
        Spacer(modifier = Modifier.weight(.5f))
        if (alertIsVisible){
            ResultDialog(
                hideDialog = {alertIsVisible = false}
            )
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