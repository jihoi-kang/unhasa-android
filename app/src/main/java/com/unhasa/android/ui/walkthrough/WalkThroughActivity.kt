package com.unhasa.android.ui.walkthrough

import android.os.Bundle
import com.unhasa.android.R
import com.unhasa.android.base.BaseActivity
import com.unhasa.android.databinding.ActivityWalkThroughBinding
import com.unhasa.android.ext.eventObserve
import com.unhasa.android.ext.startActivity
import com.unhasa.android.ui.verify.PhoneVerifyActivity
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class WalkThroughActivity : BaseActivity<ActivityWalkThroughBinding, WalkThroughViewModel>(
    R.layout.activity_walk_through
) {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setupObserve()
    }

    private fun setupObserve() {
        viewModel.showPhoneVerify.eventObserve(this) {
            startActivity<PhoneVerifyActivity>()
        }
    }

}