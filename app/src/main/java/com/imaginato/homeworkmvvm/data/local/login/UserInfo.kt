package com.imaginato.homeworkmvvm.data.local.login

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "UserInfo")
data class UserInfo constructor(
    @PrimaryKey
    @ColumnInfo(name = "user_Id") var userId: String,
    @ColumnInfo(name = "user_name") var userName: String,
    @ColumnInfo(name = "isDeleted") var isDeleted: Boolean,
    @ColumnInfo(name = "Header") var header: String
)