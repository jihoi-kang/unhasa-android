package com.unhasa.android.ui

import android.os.Bundle
import com.unhasa.android.R
import com.unhasa.android.base.BaseActivity
import com.unhasa.android.databinding.ActivityMainBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : BaseActivity<ActivityMainBinding, MainViewModel>(
    R.layout.activity_main
) {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setupObserve()
    }

    private fun setupObserve() {

    }
}