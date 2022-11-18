package com.qxy.belajardatabase.screen.add

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.qxy.belajardatabase.data.News
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class AddViewModel @Inject constructor(
    private val repository: AddNewsRepository
) : ViewModel() {

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
        // TODO validasi inputan user
        // title kosong harusnya muncul error title masih kosong
        // content kosong harusnya muncul error content masih kosong

        // lolos validasi
        viewModelScope.launch {
            val news = News(
                title = title.value.toString(),
                content = content.value.toString()
            )

            repository.insertNew(news)

            // TODO kalau data sudah berhasil di save. close screen atau hapus data yang ada di depan
            clearData()
        }
    }

    private fun clearData() {
        _title.value = ""
        _content.value = ""
    }
}



