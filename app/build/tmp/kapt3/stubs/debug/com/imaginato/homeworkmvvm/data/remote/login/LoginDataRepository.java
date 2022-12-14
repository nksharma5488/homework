package com.imaginato.homeworkmvvm.data.remote.login;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J-\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u00062\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\r"}, d2 = {"Lcom/imaginato/homeworkmvvm/data/remote/login/LoginDataRepository;", "Lcom/imaginato/homeworkmvvm/data/remote/login/LoginRepository;", "api", "Lcom/imaginato/homeworkmvvm/data/remote/login/LoginApi;", "(Lcom/imaginato/homeworkmvvm/data/remote/login/LoginApi;)V", "getLogin", "Lkotlinx/coroutines/flow/Flow;", "Lretrofit2/Response;", "Lcom/imaginato/homeworkmvvm/data/remote/login/response/LoginResponse;", "userName", "", "password", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public final class LoginDataRepository implements com.imaginato.homeworkmvvm.data.remote.login.LoginRepository {
    private com.imaginato.homeworkmvvm.data.remote.login.LoginApi api;
    
    public LoginDataRepository(@org.jetbrains.annotations.NotNull()
    com.imaginato.homeworkmvvm.data.remote.login.LoginApi api) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object getLogin(@org.jetbrains.annotations.NotNull()
    java.lang.String userName, @org.jetbrains.annotations.NotNull()
    java.lang.String password, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<retrofit2.Response<com.imaginato.homeworkmvvm.data.remote.login.response.LoginResponse>>> continuation) {
        return null;
    }
}