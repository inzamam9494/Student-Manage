package com.example.jcasd.data.local

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Query
import androidx.room.Upsert
import kotlinx.coroutines.flow.Flow

// step 11 create a dao interface, rename it to your liking
@Dao
interface StudentDao {
    @Upsert
    suspend fun addData(studentEntity: StudentEntity)

    @Delete
    suspend fun deleteData(studentEntity: StudentEntity)


    //    for detail screens
    @Query("SELECT * FROM studentData ORDER BY first_name DESC")
    fun getStudentByFirstName(): Flow<List<StudentEntity>>

    @Query("SELECT * FROM studentData ORDER BY last_name DESC")
    fun getStudentByLastName(): Flow<List<StudentEntity>>

    @Query("SELECT * FROM studentData ORDER BY branch DESC")
    fun getStudentByBranch(): Flow<List<StudentEntity>>

    @Query("SELECT * FROM studentData WHERE id = :id")
    fun getStudentData(id: Int): Flow<StudentEntity>

}