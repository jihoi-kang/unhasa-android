package com.unhasa.android.ext

import android.content.Intent
import androidx.annotation.IdRes
import androidx.appcompat.app.AppCompatActivity
import androidx.core.os.bundleOf
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentTransaction

inline fun <reified T> AppCompatActivity.startActivity(
    vararg pairs: Pair<String, Any>
) {
    startActivity(Intent(this, T::class.java).apply {
        addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP)
        putExtras(bundleOf(*pairs))
    })
}

fun AppCompatActivity.replaceFragment(fragment: Fragment, @IdRes frameId: Int) {
    val tag = fragment.javaClass.simpleName
    supportFragmentManager.transact {
        replace(frameId, fragment, tag)
    }
}

fun FragmentManager.transact(action: FragmentTransaction.() -> Unit) {
    beginTransaction().apply {
        action()
    }.commitAllowingStateLoss()
}