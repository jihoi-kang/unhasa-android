package com.unhasa.android.ui

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import com.unhasa.android.base.BaseViewModel
import com.unhasa.android.data.remote.api.UnhasaService
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(
    private val unhasaService: UnhasaService,
) : BaseViewModel() {

    private val _value = MutableLiveData<String>("Hello world !!!!")
    val value: LiveData<String> get() = _value

    fun onClick() {
        viewModelScope.launch {
            val result = unhasaService.hello()
            _value.value = result.value
        }
    }

}