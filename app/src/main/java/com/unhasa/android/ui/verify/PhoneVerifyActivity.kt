package com.unhasa.android.ui.verify

import android.os.Bundle
import com.unhasa.android.R
import com.unhasa.android.base.BaseActivity
import com.unhasa.android.databinding.ActivityPhoneVerifyBinding
import com.unhasa.android.ext.eventObserve
import com.unhasa.android.ext.replaceFragment
import com.unhasa.android.ui.verify.code.InputCodeFragment
import com.unhasa.android.ui.verify.phone.InputPhoneFragment
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class PhoneVerifyActivity : BaseActivity<ActivityPhoneVerifyBinding, PhoneVerifyViewModel>(
    R.layout.activity_phone_verify
) {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setupUi()
        setupObserve()
    }

    private fun setupUi() {
        replaceFragment(InputPhoneFragment.newInstance(), R.id.fl_frame)
    }

    private fun setupObserve() {
        viewModel.showInputCode.eventObserve(this) {
            replaceFragment(InputCodeFragment.newInstance(it), R.id.fl_frame)
        }
    }

}