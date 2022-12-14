package com.imaginato.homeworkmvvm.data.local.login

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy

@Dao
interface UserInfoDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertUserInfo(userInfo: UserInfo)
}