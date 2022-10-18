package com.example.medium_login.viewmodel

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import com.example.medium_login.Api.BaseResponse
import com.example.medium_login.Api.LoginRequest
import com.example.medium_login.Respository.UserRepository
import com.example.medium_login.response.LoginResponse
import kotlinx.coroutines.launch
import java.lang.Exception

class LoginViewModel (application: Application):
        AndroidViewModel(application){

            val userRepo = UserRepository()
            val loginResult: MutableLiveData<BaseResponse<LoginResponse>> = MutableLiveData()

            fun loginUser(email:String, pwd:String){
                viewModelScope.launch {
                    try {
                        val loginRequest = LoginRequest(
                            password = pwd,
                            email = email
                        )
                        val response = userRepo.loginUser(loginRequest = loginRequest)

                        if (response?.code() == 200) {
                            loginResult.value = BaseResponse.Success(response.body())
                        } else {
                            loginResult.value = BaseResponse.Error(response?.message())
                        }

                        }catch (ex: Exception){
                                loginResult.value= BaseResponse.Error(ex.message)
                            }

                    }
                }
            }



