package com.example.perte9.room

import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import android.content.Context

@Database(entities = [Siswa::class], version = 1, exportSchema = false)
abstract class DatabaseSiswa : RoomDatabase() {

    abstract fun siswaDao(): SiswaDao

    companion object {
        @Volatile
        private var instance: DatabaseSiswa? = null

        fun getDatabase(context: Context): DatabaseSiswa {
            return (instance ?: synchronized(this) {
                Room.databaseBuilder(
                    context,
                    klass = DatabaseSiswa::class.java,
                    name = "siswa_database"
                )
                    .build().also { instance = it }
            })
        }
    }
}