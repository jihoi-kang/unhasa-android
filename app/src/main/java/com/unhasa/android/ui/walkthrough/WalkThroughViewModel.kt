package com.unhasa.android.ui.walkthrough

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.unhasa.android.base.BaseViewModel
import com.unhasa.android.common.Event
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class WalkThroughViewModel @Inject constructor() : BaseViewModel() {

    private val _showPhoneVerify = MutableLiveData<Event<Unit>>()
    val showPhoneVerify: LiveData<Event<Unit>> get() = _showPhoneVerify

    fun next() {
        _showPhoneVerify.value = Event(Unit)
    }

}