package com.unhasa.android.ui.splash

import android.os.Bundle
import com.unhasa.android.R
import com.unhasa.android.base.BaseActivity
import com.unhasa.android.databinding.ActivitySplashBinding
import com.unhasa.android.ext.eventObserve
import com.unhasa.android.ext.startActivity
import com.unhasa.android.ui.walkthrough.WalkThroughActivity
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class SplashActivity : BaseActivity<ActivitySplashBinding, SplashViewModel>(
    R.layout.activity_splash
) {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setupObserve()
    }

    private fun setupObserve() {
        viewModel.showWalkThrough.eventObserve(this) {
            startActivity<WalkThroughActivity>()
            finish()
        }
    }
}