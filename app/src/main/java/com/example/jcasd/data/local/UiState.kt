package com.example.jcasd.data.local

import androidx.room.ColumnInfo

// step 13 create a ui state data class, rename it to your liking

enum class SortType{
    FIRST_NAME,
    LAST_NAME,
    CLASS
}
enum class ResponseType{
    SUCCESS,
    ERROR,
    LOADING,
    EMPTY
}

data class UiState(
    // todo 13.0 add variables
    val student: List<StudentEntity> = emptyList(),
    val firstName: String = "",
    val lastName: String = "",
    val branch: String = "",
    val subject: String = "",
    val image: String = "",
    val rollNumber: Int =0,
    val gender: String = "",
    val dob: String = "",
    val address: String = "",
    val selectedId: Int = 0,
    val sortOrder: SortType = SortType.FIRST_NAME
)
