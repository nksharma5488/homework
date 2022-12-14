package com.imaginato.homeworkmvvm.data.local.demo;

import java.lang.System;

@androidx.room.Database(entities = {com.imaginato.homeworkmvvm.data.local.demo.Demo.class, com.imaginato.homeworkmvvm.data.local.login.UserInfo.class}, version = 2, exportSchema = false)
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\'\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002R\u0012\u0010\u0003\u001a\u00020\u0004X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0012\u0010\u0007\u001a\u00020\bX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\t\u0010\n\u00a8\u0006\u000b"}, d2 = {"Lcom/imaginato/homeworkmvvm/data/local/demo/DemoDatabase;", "Landroidx/room/RoomDatabase;", "()V", "demoDao", "Lcom/imaginato/homeworkmvvm/data/local/demo/DemoDao;", "getDemoDao", "()Lcom/imaginato/homeworkmvvm/data/local/demo/DemoDao;", "userInfoDao", "Lcom/imaginato/homeworkmvvm/data/local/login/UserInfoDao;", "getUserInfoDao", "()Lcom/imaginato/homeworkmvvm/data/local/login/UserInfoDao;", "app_debug"})
public abstract class DemoDatabase extends androidx.room.RoomDatabase {
    
    public DemoDatabase() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.imaginato.homeworkmvvm.data.local.demo.DemoDao getDemoDao();
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.imaginato.homeworkmvvm.data.local.login.UserInfoDao getUserInfoDao();
}