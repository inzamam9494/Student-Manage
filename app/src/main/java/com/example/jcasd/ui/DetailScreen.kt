package com.example.jcasd.ui

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Modifier
import com.example.jcasd.data.local.ScreenEvent
import com.example.jcasd.data.local.StudentEntity
import com.example.jcasd.data.local.UiState

@Composable
fun DetailScreen(
    navigateToEditItem: () -> Unit,
    uiState: UiState,
    onEvent: (ScreenEvent) -> Unit,
    modifier: Modifier = Modifier,
) {

    Column {
        Card {
            Column {
                Text(text = "Student name")
                Text(text = uiState.firstName + uiState.lastName)
            }
            Column {
                Text(text = "Class name")
                Text(text = uiState.branch)
            }
            Column {
                Text(text = "Subject")
                Text(text = uiState.subject)
            }
            Column {
                Text(text = "Gender")
                Text(text = uiState.gender)
            }
            Column {
                Text(text = "Date of Birth")
                Text(text = uiState.dob)
            }
            Column {
                Text(text = "Address")
                Text(text = uiState.address)
            }
        }
        Column {
//            iska Logic ->
            Button(onClick = { }) {
                Text(text = "Edit")
            }
            OutlinedButton(onClick = {  }) {
                Text(text = "Done")
            }
        }
    }
}