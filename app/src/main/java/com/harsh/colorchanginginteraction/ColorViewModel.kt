package com.harsh.colorchanginginteraction

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class ColorViewModel: ViewModel() {
    var color : MutableLiveData<Int> = MutableLiveData(0)
    var isSHOW :MutableLiveData<Int> = MutableLiveData(0)
}