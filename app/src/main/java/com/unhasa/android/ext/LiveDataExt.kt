package com.unhasa.android.ext

import androidx.lifecycle.LifecycleOwner
import androidx.lifecycle.LiveData
import androidx.lifecycle.Observer
import com.unhasa.android.common.Event

inline fun <T> LiveData<Event<T>>.eventObserve(
    owner: LifecycleOwner,
    crossinline onChanged: (T) -> Unit,
): Observer<Event<T>> {
    val wrappedObserver = Observer<Event<T>> { event ->
        event.getContentIfNotHandled()?.let {
            onChanged.invoke(it)
        }
    }

    observe(owner, wrappedObserver)
    return wrappedObserver
}