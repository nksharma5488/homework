package com.imaginato.homeworkmvvm.data.remote.login

import com.imaginato.homeworkmvvm.data.remote.login.request.LoginRequest
import com.imaginato.homeworkmvvm.data.remote.login.response.LoginResponse
import kotlinx.coroutines.Deferred
import retrofit2.http.*

interface LoginApi {
    @POST("api/login")
    fun getLoginAsync(@HeaderMap headers: Map<String, String>,@Body body:LoginRequest ): Deferred<retrofit2.Response<LoginResponse>>
}