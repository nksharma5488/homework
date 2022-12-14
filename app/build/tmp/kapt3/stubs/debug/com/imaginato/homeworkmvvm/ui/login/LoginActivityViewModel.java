package com.imaginato.homeworkmvvm.ui.login;

import java.lang.System;

@org.koin.core.component.KoinApiExtension()
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0016\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u0019R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u000b8F\u00a2\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0017\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00070\u000b8F\u00a2\u0006\u0006\u001a\u0004\b\u000f\u0010\rR\u001b\u0010\u0010\u001a\u00020\u00118BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0012\u0010\u0013R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001b"}, d2 = {"Lcom/imaginato/homeworkmvvm/ui/login/LoginActivityViewModel;", "Lcom/imaginato/homeworkmvvm/ui/base/BaseViewModel;", "userInfoRepository", "Lcom/imaginato/homeworkmvvm/data/local/login/UserInfoRepository;", "(Lcom/imaginato/homeworkmvvm/data/local/login/UserInfoRepository;)V", "_progress", "Landroidx/lifecycle/MutableLiveData;", "", "_resultLiveData", "Lcom/imaginato/homeworkmvvm/data/remote/login/response/LoginResponse;", "getLoginData", "Landroidx/lifecycle/LiveData;", "getGetLoginData", "()Landroidx/lifecycle/LiveData;", "progress", "getProgress", "repository", "Lcom/imaginato/homeworkmvvm/data/remote/login/LoginRepository;", "getRepository", "()Lcom/imaginato/homeworkmvvm/data/remote/login/LoginRepository;", "repository$delegate", "Lkotlin/Lazy;", "getLogin", "", "userName", "", "password", "app_debug"})
public final class LoginActivityViewModel extends com.imaginato.homeworkmvvm.ui.base.BaseViewModel {
    private final com.imaginato.homeworkmvvm.data.local.login.UserInfoRepository userInfoRepository = null;
    private final kotlin.Lazy repository$delegate = null;
    private androidx.lifecycle.MutableLiveData<com.imaginato.homeworkmvvm.data.remote.login.response.LoginResponse> _resultLiveData;
    private androidx.lifecycle.MutableLiveData<java.lang.Boolean> _progress;
    
    public LoginActivityViewModel(@org.jetbrains.annotations.NotNull()
    com.imaginato.homeworkmvvm.data.local.login.UserInfoRepository userInfoRepository) {
        super();
    }
    
    private final com.imaginato.homeworkmvvm.data.remote.login.LoginRepository getRepository() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.Boolean> getProgress() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.imaginato.homeworkmvvm.data.remote.login.response.LoginResponse> getGetLoginData() {
        return null;
    }
    
    public final void getLogin(@org.jetbrains.annotations.NotNull()
    java.lang.String userName, @org.jetbrains.annotations.NotNull()
    java.lang.String password) {
    }
}