package com.unhasa.android.ui.verify.code

import androidx.core.os.bundleOf
import com.unhasa.android.R
import com.unhasa.android.base.BaseFragment
import com.unhasa.android.databinding.FragmentInputCodeBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class InputCodeFragment : BaseFragment<FragmentInputCodeBinding, InputCodeViewModel>(
    R.layout.fragment_input_code
) {

    companion object {
        const val ARGUMENT_PHONE_NUMBER = "ARGUMENT_PHONE_NUMBER"

        fun newInstance(
            phoneNumber: String
        ): InputCodeFragment = InputCodeFragment().apply {
            arguments = bundleOf(
                ARGUMENT_PHONE_NUMBER to phoneNumber
            )
        }
    }

}