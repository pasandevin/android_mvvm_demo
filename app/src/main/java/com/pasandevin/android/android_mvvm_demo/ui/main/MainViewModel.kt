package com.pasandevin.android.android_mvvm_demo.ui.main

import android.content.ContentValues.TAG
import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {
    private var _message = MutableLiveData<String>().apply {
        value = ""
    }

    var message : LiveData<String> = _message

    fun updateMessage(originalMessage: String){
        _message.value = originalMessage
    }

}