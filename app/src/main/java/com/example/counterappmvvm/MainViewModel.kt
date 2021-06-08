package com.example.counterappmvvm

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.Transformations
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {

    private var _counter = MutableLiveData<Int>()
    var counter: LiveData<String> = Transformations.map(_counter) {
        it.toString()
    }

    init {
        _counter.value = 0
    }

    fun onClickMeButton() {
        _counter.value = _counter.value!! + 1
    }
}
