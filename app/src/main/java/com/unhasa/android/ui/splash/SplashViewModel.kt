package com.unhasa.android.ui.splash

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import com.unhasa.android.base.BaseViewModel
import com.unhasa.android.common.Event
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class SplashViewModel @Inject constructor() : BaseViewModel() {

    private val _showWalkThrough = MutableLiveData<Event<Unit>>()
    val showWalkThrough: LiveData<Event<Unit>> get() = _showWalkThrough

    init {
        viewModelScope.launch {
            delay(3000L)
            _showWalkThrough.value = Event(Unit)
        }
    }

}