package com.example.jcasd.data.local

// step 10 create an event interface, rename it to your liking
sealed interface ScreenEvent {
    object SaveStudentData : ScreenEvent
    data class FirstStudent(val firstName: String) : ScreenEvent
    data class LastStudent(val lastName: String) : ScreenEvent
    data class SetBranch(val branch: String) : ScreenEvent
    data class SetSubject(val subject: String) : ScreenEvent
    data class SetImage(val image: String) : ScreenEvent
    data class SetGender(val gender: String) : ScreenEvent
    data class SetDob(val dob: String) : ScreenEvent
    data class SetAddress(val address: String) : ScreenEvent

    //    add event
    data class SetSortType(val sortType: SortType) : ScreenEvent
    data class SetSelectedID(val id: Int) : ScreenEvent

    //    detail events
    data class DeleteStudent(val student: StudentEntity) : ScreenEvent

}