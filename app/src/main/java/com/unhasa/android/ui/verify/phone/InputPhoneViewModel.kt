package com.unhasa.android.ui.verify.phone

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.unhasa.android.base.BaseViewModel
import com.unhasa.android.common.Event
import dagger.hilt.android.lifecycle.HiltViewModel
import timber.log.Timber
import javax.inject.Inject

@HiltViewModel
class InputPhoneViewModel @Inject constructor() : BaseViewModel() {

    private val _showInputCode = MutableLiveData<Event<String>>()
    val showInputCode: LiveData<Event<String>> get() = _showInputCode

    val phoneNumber = MutableLiveData<String>()

    fun next() {
        Timber.d("jay phoneNumber.value: ${phoneNumber.value}")
        val phoneNumber = phoneNumber.value ?: return

        _showInputCode.value = Event(phoneNumber)
    }

}