package ru.asselinux.medapp.ui.home

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

class HeadViewModel : ViewModel() {
    private val _isLoading: MutableLiveData<Boolean> = MutableLiveData<Boolean>().apply {
        value = false
    }

    private val _fuck: MutableLiveData<String> = MutableLiveData<String>().apply {
        value = " "
    }

    val fuck: LiveData<String> = _fuck
    val isLoading: LiveData<Boolean> = _isLoading

    fun getFuckName(name: String, surname: String) {
        viewModelScope.launch {
            _isLoading.postValue(true)
            withContext(Dispatchers.IO) {
                delay(5000)
                if(name == "Fuck" && surname == "Bullshit") {
                    _fuck.postValue("MotherFucker")
                } else {
                    _fuck.postValue("FatherFucker")
                }
                _isLoading.postValue(false)
            }
        }
    }
}