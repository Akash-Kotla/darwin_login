package com.example.medium_login.Respository

import com.example.medium_login.Api.Apiinterface
import com.example.medium_login.Api.LoginRequest
import com.example.medium_login.response.LoginResponse
import retrofit2.Response

class UserRepository {

    suspend fun loginUser(loginRequest: LoginRequest):
            Response<LoginResponse>? {
        return Apiinterface.getApi()?.loginUser(loginRequest = loginRequest)
    }
}