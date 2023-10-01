package com.example.jcasd.data.local

import androidx.room.Database
import androidx.room.RoomDatabase

// step 9 create a database class
@Database(
    entities = [EntityOne::class], // todo 9.1 update entities
    version = 1
)
abstract class AppDatabase: RoomDatabase() {
    abstract val dao: EntityDao // todo 9.2 update dao if needed
}