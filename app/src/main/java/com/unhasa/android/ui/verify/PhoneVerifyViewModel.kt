package com.unhasa.android.ui.verify

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.unhasa.android.base.BaseViewModel
import com.unhasa.android.common.Event
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class PhoneVerifyViewModel @Inject constructor() : BaseViewModel() {

    private val _showInputCode = MutableLiveData<Event<String>>()
    val showInputCode: LiveData<Event<String>> get() = _showInputCode

    fun showInputCode(phoneNumber: String) {
        _showInputCode.value = Event(phoneNumber)
    }

}
