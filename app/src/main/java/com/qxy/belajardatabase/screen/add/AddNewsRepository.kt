package com.qxy.belajardatabase.screen.add

import com.qxy.belajardatabase.data.News
import com.qxy.belajardatabase.data.database.NewsDao
import javax.inject.Inject

class AddNewsRepository @Inject constructor(
    private val dao: NewsDao
) {
    suspend fun insertNew(news: News) {
        dao.insertNew(news)
    }
}