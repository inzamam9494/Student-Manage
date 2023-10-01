package com.example.jcasd.data.local

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import java.net.Inet4Address
import javax.security.auth.Subject


// step 10 create an entity data class, rename it to your liking

@Entity(tableName = "studentData")
data class StudentEntity(
    @PrimaryKey(autoGenerate = true)
    val id: Int = 0,
    @ColumnInfo(name = "first_name")
    val firstName: String,
    @ColumnInfo(name = "last_name")
    val lastName: String = "",
    val branch: String = "",
    val subject: String = "",
    val image: String = "",
    val rollNumber: Int =0,
    val gender: String = "",
    val dob: String = "",
    val address: String = ""
)

