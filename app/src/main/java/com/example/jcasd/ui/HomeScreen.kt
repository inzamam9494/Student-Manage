package com.example.jcasd.ui

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.KeyboardArrowDown
import androidx.compose.material3.Card
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.example.jcasd.data.local.ScreenEvent
import com.example.jcasd.data.local.StudentEntity
import com.example.jcasd.data.local.UiState

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeScreen(
    state: UiState,
    onEvent: (ScreenEvent) -> Unit,
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
) {
    Scaffold(floatingActionButton = {
        FloatingActionButton(onClick =  onClick ) {
            Icon(
                imageVector = Icons.Default.Add,
                contentDescription = "add button"
            )
        }
    }) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(it)
        ) {
            LazyColumn {
                items(state.students){ item ->
                    StudentItem(studentItem = item, onEvent = onEvent)
                }
            }
        }
    }
}

@Composable
fun StudentItem(
    studentItem: StudentEntity,
    onEvent: (ScreenEvent) -> Unit,
    modifier: Modifier = Modifier
) {
    Card {
        Row {
            Text(text = studentItem.firstName)
            Icon(
                imageVector = Icons.Default.KeyboardArrowDown,
                contentDescription = "detail icons"
            )
        }
    }
}