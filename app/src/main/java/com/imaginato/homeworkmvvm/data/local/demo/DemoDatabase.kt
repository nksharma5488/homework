package com.imaginato.homeworkmvvm.data.local.demo

import androidx.room.Database
import androidx.room.RoomDatabase
import com.imaginato.homeworkmvvm.data.local.login.UserInfo
import com.imaginato.homeworkmvvm.data.local.login.UserInfoDao

@Database(entities = [Demo::class,UserInfo::class], version = 2, exportSchema = false)
abstract class DemoDatabase : RoomDatabase() {
    abstract val demoDao: DemoDao
    abstract val userInfoDao: UserInfoDao
}