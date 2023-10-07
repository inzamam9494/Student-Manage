package com.example.jcasd.ui

import androidx.activity.viewModels
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.jcasd.data.local.ScreenEvent
import com.example.jcasd.data.local.UiState

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun AddScreen(
    state:UiState,
    onEvent: (ScreenEvent) -> Unit,
    saveClick: () -> Unit,
    cancelClick: () -> Unit,
    modifier: Modifier = Modifier
) {
    Column(verticalArrangement = Arrangement.SpaceEvenly,
        horizontalAlignment = Alignment.CenterHorizontally) {
        OutlinedTextField(value = state.firstName,
            onValueChange = {onEvent(ScreenEvent.FirstStudent(it))},
            placeholder = { Text(text = "Enter First Name")})

        OutlinedTextField(value = state.lastName,
            onValueChange = {onEvent(ScreenEvent.LastStudent(it))},
            placeholder = { Text(text = "Enter Last Name")})

        OutlinedTextField(value = state.branch,
            onValueChange = {onEvent(ScreenEvent.SetBranch(it))},
            placeholder = { Text(text = "Enter Class")})

        OutlinedTextField(value = state.subject,
            onValueChange = {onEvent(ScreenEvent.SetSubject(it))},
            placeholder = { Text(text = "Enter Subject")})

        OutlinedTextField(value = state.dob,
            onValueChange = {onEvent(ScreenEvent.SetDob(it))},
            placeholder = { Text(text = "Enter Date of Birth")})

        OutlinedTextField(value = state.gender,
            onValueChange = {onEvent(ScreenEvent.SetGender(it))},
            placeholder = { Text(text = "Enter Your Gender")})

        OutlinedTextField(value = state.address,
            onValueChange = {onEvent(ScreenEvent.SetAddress(it))})

        Row(horizontalArrangement = Arrangement.SpaceBetween,
            modifier = Modifier.padding(10.dp)) {
            OutlinedButton(onClick =  cancelClick ,
                modifier = Modifier.weight(0.1f)) {
                Text(text = "Cancel")
            }
            Spacer(modifier = Modifier.padding(5.dp))

            Button(onClick =  saveClick ,
                modifier = Modifier.weight(0.1f)) {
                Text(text = "Save")
            }
        }
    }
}

@Preview(showSystemUi = true)
@Composable
fun Preview() {
    val sampleState = UiState(
        firstName = "John",
        lastName = "Doe",
        branch = "Computer Science",
        subject = "Math",
        dob = "01/01/1990",
        gender = "Male",
        address = "123 Main St"
    )
    MaterialTheme{
        AddScreen(state = sampleState, onEvent = {}, saveClick = {}, cancelClick = {})
    }
}