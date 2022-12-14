package com.imaginato.homeworkmvvm.data.remote.login;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J4\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00032\u0014\b\u0001\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0001\u0010\t\u001a\u00020\nH\'\u00a8\u0006\u000b"}, d2 = {"Lcom/imaginato/homeworkmvvm/data/remote/login/LoginApi;", "", "getLoginAsync", "Lkotlinx/coroutines/Deferred;", "Lretrofit2/Response;", "Lcom/imaginato/homeworkmvvm/data/remote/login/response/LoginResponse;", "headers", "", "", "body", "Lcom/imaginato/homeworkmvvm/data/remote/login/request/LoginRequest;", "app_debug"})
public abstract interface LoginApi {
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.POST(value = "api/login")
    public abstract kotlinx.coroutines.Deferred<retrofit2.Response<com.imaginato.homeworkmvvm.data.remote.login.response.LoginResponse>> getLoginAsync(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.HeaderMap()
    java.util.Map<java.lang.String, java.lang.String> headers, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Body()
    com.imaginato.homeworkmvvm.data.remote.login.request.LoginRequest body);
}