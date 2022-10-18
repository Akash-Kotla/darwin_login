package com.example.medium_login.Api

import com.example.medium_login.response.LoginResponse
import retrofit2.Response
import retrofit2.create
import retrofit2.http.Body
import retrofit2.http.Headers
import retrofit2.http.POST

interface Apiinterface {

    @Headers("Content-Type:application/json",
        "ocp-apim-subscription-key:c442b3d7489942058d2a83e7a023b731")

    @POST("users/sigin")
    suspend fun loginUser(@Body loginRequest: LoginRequest): Response<LoginResponse>

    companion object {
        fun getApi() : Apiinterface? {
            return ApiClient.client?.create(Apiinterface::class.java)
        }
    }

}