package com.example.jcasd.ui

import androidx.compose.ui.input.key.Key.Companion.F
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.jcasd.data.local.ScreenEvent
import com.example.jcasd.data.local.StudentDao
import com.example.jcasd.data.local.UiState
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch

// step 14 create a view model class, rename it to your liking
class StudentViewModel(
    private val dao: StudentDao
) : ViewModel() {
    private val _uiState = MutableStateFlow(UiState())
    val uiState: StateFlow<UiState> = _uiState

    init {
        viewModelScope.launch {
            dao.getStudentByFirstName().collect() { student ->
                _uiState.update { it.copy(student = student) }
            }
        }
    }

    fun onEvent(event: ScreenEvent) {
        when (event) {
            ScreenEvent.SaveStudentData -> TODO()
            is ScreenEvent.DeleteStudent -> viewModelScope.launch { dao.deleteData(event.student) }
            is ScreenEvent.FirstStudent -> _uiState.update { it.copy(firstName = event.firstName) }
            is ScreenEvent.LastStudent -> _uiState.update { it.copy(lastName = event.lastName) }


            is ScreenEvent.SetAddress -> _uiState.update { it.copy(address = event.address) }
            is ScreenEvent.SetBranch -> _uiState.update { it.copy(branch = event.branch) }
            is ScreenEvent.SetDob -> _uiState.update { it.copy(dob = event.dob) }
            is ScreenEvent.SetGender -> _uiState.update { it.copy(gender = event.gender) }
            is ScreenEvent.SetImage -> _uiState.update { it.copy(image = event.image) }

            is ScreenEvent.SetSelectedID -> _uiState.update { it.copy(selectedId = event.id) }

            is ScreenEvent.SetSortType -> _uiState.update { it.copy(sortOrder = event.sortType) }
            is ScreenEvent.SetSubject -> _uiState.update { it.copy(subject = event.subject) }
        }
    }
}