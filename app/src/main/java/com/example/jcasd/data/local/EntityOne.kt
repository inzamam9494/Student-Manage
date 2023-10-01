package com.example.jcasd.data.local

import androidx.room.PrimaryKey


// step 10 create an entity data class, rename it to your liking
// todo 10.0 add @Entity annotation
data class EntityOne(
    @PrimaryKey(autoGenerate = true)
    val id: Int = 0
    // todo 10.2 add Columns
)

