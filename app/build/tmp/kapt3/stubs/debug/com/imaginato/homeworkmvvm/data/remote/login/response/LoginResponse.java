package com.imaginato.homeworkmvvm.data.remote.login.response;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\u0002\u0010\bJ\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\nJ\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003J2\u0010\u0019\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u00c6\u0001\u00a2\u0006\u0002\u0010\u001aJ\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u001e\u001a\u00020\u0003H\u00d6\u0001J\t\u0010\u001f\u001a\u00020\u0005H\u00d6\u0001R\"\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010\r\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR \u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R \u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015\u00a8\u0006 "}, d2 = {"Lcom/imaginato/homeworkmvvm/data/remote/login/response/LoginResponse;", "", "errorCode", "", "errorMessage", "", "loginData", "Lcom/imaginato/homeworkmvvm/data/remote/login/response/LoginData;", "(Ljava/lang/Integer;Ljava/lang/String;Lcom/imaginato/homeworkmvvm/data/remote/login/response/LoginData;)V", "getErrorCode", "()Ljava/lang/Integer;", "setErrorCode", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getErrorMessage", "()Ljava/lang/String;", "setErrorMessage", "(Ljava/lang/String;)V", "getLoginData", "()Lcom/imaginato/homeworkmvvm/data/remote/login/response/LoginData;", "setLoginData", "(Lcom/imaginato/homeworkmvvm/data/remote/login/response/LoginData;)V", "component1", "component2", "component3", "copy", "(Ljava/lang/Integer;Ljava/lang/String;Lcom/imaginato/homeworkmvvm/data/remote/login/response/LoginData;)Lcom/imaginato/homeworkmvvm/data/remote/login/response/LoginResponse;", "equals", "", "other", "hashCode", "toString", "app_debug"})
public final class LoginResponse {
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "errorCode")
    private java.lang.Integer errorCode;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "errorMessage")
    private java.lang.String errorMessage;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "data")
    private com.imaginato.homeworkmvvm.data.remote.login.response.LoginData loginData;
    
    @org.jetbrains.annotations.NotNull()
    public final com.imaginato.homeworkmvvm.data.remote.login.response.LoginResponse copy(@org.jetbrains.annotations.Nullable()
    java.lang.Integer errorCode, @org.jetbrains.annotations.Nullable()
    java.lang.String errorMessage, @org.jetbrains.annotations.Nullable()
    com.imaginato.homeworkmvvm.data.remote.login.response.LoginData loginData) {
        return null;
    }
    
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object other) {
        return false;
    }
    
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    public LoginResponse(@org.jetbrains.annotations.Nullable()
    java.lang.Integer errorCode, @org.jetbrains.annotations.Nullable()
    java.lang.String errorMessage, @org.jetbrains.annotations.Nullable()
    com.imaginato.homeworkmvvm.data.remote.login.response.LoginData loginData) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component1() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getErrorCode() {
        return null;
    }
    
    public final void setErrorCode(@org.jetbrains.annotations.Nullable()
    java.lang.Integer p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component2() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getErrorMessage() {
        return null;
    }
    
    public final void setErrorMessage(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.imaginato.homeworkmvvm.data.remote.login.response.LoginData component3() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.imaginato.homeworkmvvm.data.remote.login.response.LoginData getLoginData() {
        return null;
    }
    
    public final void setLoginData(@org.jetbrains.annotations.Nullable()
    com.imaginato.homeworkmvvm.data.remote.login.response.LoginData p0) {
    }
}