package com.sumup.challenge.toastcatalog

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class  cm  : ViewModel() {

    private val networkClient = NetworkClient()

    fun getItems() : List<Item>? {
        viewModelScope.launch(Dispatchers.IO) {
            val items = networkClient.getItems()
            items?.let {    println(it) }
        }

        return emptyList()
    }

}