package com.imaginato.homeworkmvvm.data.remote.login

import com.imaginato.homeworkmvvm.data.remote.login.response.LoginResponse
import kotlinx.coroutines.flow.Flow

interface LoginRepository {

    suspend fun getLogin(userName:String, password:String): Flow<retrofit2.Response<LoginResponse>>
}