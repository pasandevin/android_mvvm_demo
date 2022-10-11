package com.pasandevin.android.android_mvvm_demo.ui.main

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {
    private var _string = MutableLiveData<String>().apply {
        value = ""
    }

    var string : LiveData<String> = _string

}