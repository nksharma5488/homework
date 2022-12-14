package com.imaginato.homeworkmvvm.data.remote.login

import android.util.Log
import com.imaginato.homeworkmvvm.data.local.login.UserInfoDao
import com.imaginato.homeworkmvvm.data.remote.login.request.LoginRequest
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.flowOn

class LoginDataRepository constructor(
    private var api: LoginApi
) : LoginRepository {
    override suspend fun getLogin(userName:String, password:String) = flow {
        val header = HashMap<String, String>()
        header["IMSI"] = "357175048449937"
        header["IMEI"] = "510110406068589"
        val response = api.getLoginAsync( headers = header, LoginRequest(userName,password)).await()
        emit(response)
    }.flowOn(Dispatchers.IO)

}