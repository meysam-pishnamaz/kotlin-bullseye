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
import androidx.compose.runtime.mutableFloatStateOf
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.dante.bullseye.ui.theme.BullseyeTheme
import kotlin.random.Random

@Composable
fun GameScreen() {
    var alertIsVisible by rememberSaveable { mutableStateOf(false)}
    var sliderValue by rememberSaveable { mutableFloatStateOf(0.5f)}
    var targetValue by rememberSaveable { mutableIntStateOf(Random.nextInt(from = 1, until = 100)) }

    val sliderToInt = (sliderValue * 100).toInt()

    fun pointsForCurrentRound():Int{
        return 999
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
            GamePrompt(value = targetValue)
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
                sliderValue = sliderToInt,
                points = pointsForCurrentRound(),
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