package com.qxy.belajardatabase.screen.home

import androidx.lifecycle.ViewModel
import com.qxy.belajardatabase.data.News
import com.qxy.belajardatabase.data.database.NewsDao
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

@HiltViewModel
class HomeViewModel @Inject constructor(
    private val repositoryHome: RepositoryHome
) : ViewModel() {

    fun getAllNews(): Flow<List<News>> = repositoryHome.getAllNews()

}