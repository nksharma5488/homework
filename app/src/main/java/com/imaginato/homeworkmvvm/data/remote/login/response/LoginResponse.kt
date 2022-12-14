package com.imaginato.homeworkmvvm.data.remote.login.response

import com.google.gson.annotations.SerializedName

data class LoginResponse(
    @SerializedName("errorCode")
    var errorCode: Int?,
    @SerializedName("errorMessage")
    var errorMessage: String?,
    @SerializedName("data")
    var loginData: LoginData?
)