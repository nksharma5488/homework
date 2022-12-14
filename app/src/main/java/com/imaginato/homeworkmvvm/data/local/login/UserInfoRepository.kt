package com.imaginato.homeworkmvvm.data.local.login

import android.util.Log
import androidx.annotation.WorkerThread
import com.imaginato.homeworkmvvm.data.local.login.UserInfoDao
import com.imaginato.homeworkmvvm.data.remote.login.request.LoginRequest
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.flowOn

class UserInfoRepository (private val userInfoDao: UserInfoDao){
    @WorkerThread
    suspend fun insertUser(userInfo: UserInfo) {
        userInfoDao.insertUserInfo(userInfo)
    }

}