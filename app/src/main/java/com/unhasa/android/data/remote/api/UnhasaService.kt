package com.unhasa.android.data.remote.api

import com.unhasa.android.data.remote.api.response.HelloResponse
import retrofit2.http.GET

interface UnhasaService {

    @GET("/dev/hello")
    suspend fun hello(): HelloResponse

}