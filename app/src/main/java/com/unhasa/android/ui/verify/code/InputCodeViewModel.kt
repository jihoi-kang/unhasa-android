package com.unhasa.android.ui.verify.code

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.SavedStateHandle
import com.unhasa.android.base.BaseViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class InputCodeViewModel @Inject constructor(
    state: SavedStateHandle,
) : BaseViewModel() {

    private val _phoneNumber = MutableLiveData("")
    val phoneNumber: LiveData<String> get() = _phoneNumber

    init {
        _phoneNumber.value = state.get<String>(InputCodeFragment.ARGUMENT_PHONE_NUMBER)!!
    }

}