package com.imaginato.homeworkmvvm.data.local.login;

import java.lang.System;

@androidx.room.Dao()
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\'\u00a8\u0006\u0006"}, d2 = {"Lcom/imaginato/homeworkmvvm/data/local/login/UserInfoDao;", "", "insertUserInfo", "", "userInfo", "Lcom/imaginato/homeworkmvvm/data/local/login/UserInfo;", "app_debug"})
public abstract interface UserInfoDao {
    
    @androidx.room.Insert(onConflict = androidx.room.OnConflictStrategy.REPLACE)
    public abstract void insertUserInfo(@org.jetbrains.annotations.NotNull()
    com.imaginato.homeworkmvvm.data.local.login.UserInfo userInfo);
}