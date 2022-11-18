package com.qxy.belajardatabase.data.database

import androidx.room.Database
import androidx.room.RoomDatabase
import com.qxy.belajardatabase.data.News

@Database(entities = [News::class], version = 1, exportSchema = false)
abstract class MyAppDatabase : RoomDatabase() {
    abstract fun newsDao(): NewsDao
}