package com.unhasa.android.data.remote.api.response

import com.google.gson.annotations.SerializedName

data class HelloResponse(
    @SerializedName("value")
    val value: String
)