package com.qxy.belajardatabase.screen.add

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class AddViewModel @Inject constructor() : ViewModel() {

    private val _title = MutableLiveData<String>()
    val title = _title

    private val _content = MutableLiveData<String>()
    val content = _content

    fun setDataTitle(newTitle: String) {
        _title.value = newTitle
    }

    fun setDataContent(newContent: String) {
        _content.value = newContent
    }

    fun submit() {

    }
}



