package com.unhasa.android.ui.verify.phone

import android.os.Bundle
import android.view.View
import androidx.fragment.app.activityViewModels
import com.unhasa.android.R
import com.unhasa.android.base.BaseFragment
import com.unhasa.android.databinding.FragmentInputPhoneBinding
import com.unhasa.android.ext.eventObserve
import com.unhasa.android.ui.verify.PhoneVerifyViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class InputPhoneFragment : BaseFragment<FragmentInputPhoneBinding, InputPhoneViewModel>(
    R.layout.fragment_input_phone
) {
    private val phoneVerifyViewModel by activityViewModels<PhoneVerifyViewModel>()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        setupObserve()
    }

    private fun setupObserve() {
        viewModel.showInputCode.eventObserve(viewLifecycleOwner) {
            phoneVerifyViewModel.showInputCode(it)
        }
    }

    companion object {
        fun newInstance(): InputPhoneFragment = InputPhoneFragment()
    }

}