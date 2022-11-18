package com.qxy.belajardatabase.screen.home

import com.qxy.belajardatabase.data.News
import com.qxy.belajardatabase.data.database.NewsDao
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class RepositoryHome @Inject constructor(private val dao: NewsDao){

    fun getAllNews(): Flow<List<News>> = dao.getAllNews()

}