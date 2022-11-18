package com.qxy.belajardatabase.data.database

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import com.qxy.belajardatabase.data.News
import kotlinx.coroutines.flow.Flow

@Dao
interface NewsDao {

    @Insert
    suspend fun insertNew(news: News)

    @Query("DELETE FROM news")
    suspend fun deleteAll()

    @Query("SELECT * FROM news")
    fun getAllNews(): Flow<List<News>>

}