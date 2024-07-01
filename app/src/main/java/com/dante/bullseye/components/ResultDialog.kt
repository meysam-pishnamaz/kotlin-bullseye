package com.dante.bullseye.components

import androidx.compose.ui.res.stringResource
import androidx.compose.material3.AlertDialog
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.dante.bullseye.R


@Composable
fun ResultDialog(sliderValue: Int,points:Int,
    hideDialog: () -> Unit,incrementRound: () -> Unit, modifier: Modifier = Modifier
) {
    AlertDialog(modifier = modifier,onDismissRequest = {
        hideDialog()
        incrementRound()
    }, confirmButton = {
        TextButton(onClick = {
            hideDialog()
            incrementRound()
        }) {
            Text(stringResource(id = R.string.result_dialog_button_text))
        }
    }, title = { Text(stringResource(id = R.string.result_dialog_title)) },
        text = { Text(stringResource(id = R.string.result_dialog_message,sliderValue,points)) }
    )
}