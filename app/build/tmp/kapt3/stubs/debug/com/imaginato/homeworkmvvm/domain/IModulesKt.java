package com.imaginato.homeworkmvvm.domain;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 2, d1 = {"\u0000f\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\u001a\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0002\u001a\u0010\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u0014H\u0002\u001a\u0010\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018H\u0002\u001a\u0010\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u0016H\u0002\u001a\u0006\u0010\u001c\u001a\u00020\u001d\u001a\u0018\u0010\u001e\u001a\u0012\u0012\u0004\u0012\u00020 0\u001fj\b\u0012\u0004\u0012\u00020 `!H\u0002\u001a\u0010\u0010\"\u001a\u00020#2\u0006\u0010\u0017\u001a\u00020\u0018H\u0002\u001a\u0010\u0010$\u001a\u00020%2\u0006\u0010\u001b\u001a\u00020#H\u0002\u001a \u0010&\u001a\u00020\'2\u0016\u0010(\u001a\u0012\u0012\u0004\u0012\u00020 0\u001fj\b\u0012\u0004\u0012\u00020 `!H\u0002\u001a\u0010\u0010)\u001a\u00020\u00182\u0006\u0010*\u001a\u00020\'H\u0002\u001a\u0010\u0010+\u001a\u00020,2\u0006\u0010\u0010\u001a\u00020\u0011H\u0002\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T\u00a2\u0006\u0002\n\u0000\"\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u0005\"\u0011\u0010\u0006\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\u0005\"\u0011\u0010\b\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0005\"\u0011\u0010\n\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\u0005\"\u0011\u0010\f\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u0005\u00a8\u0006-"}, d2 = {"BASE_URL", "", "apiModules", "Lorg/koin/core/module/Module;", "getApiModules", "()Lorg/koin/core/module/Module;", "databaseModule", "getDatabaseModule", "netModules", "getNetModules", "repositoryModules", "getRepositoryModules", "viewModelModules", "getViewModelModules", "provideDao", "Lcom/imaginato/homeworkmvvm/data/local/demo/DemoDao;", "database", "Lcom/imaginato/homeworkmvvm/data/local/demo/DemoDatabase;", "provideDatabase", "application", "Landroid/app/Application;", "provideDemoApi", "Lcom/imaginato/homeworkmvvm/data/remote/demo/DemoApi;", "retrofit", "Lretrofit2/Retrofit;", "provideDemoRepo", "Lcom/imaginato/homeworkmvvm/data/remote/demo/DemoRepository;", "api", "provideGson", "Lcom/google/gson/Gson;", "provideInterceptors", "Ljava/util/ArrayList;", "Lokhttp3/Interceptor;", "Lkotlin/collections/ArrayList;", "provideLoginApi", "Lcom/imaginato/homeworkmvvm/data/remote/login/LoginApi;", "provideLoginRepo", "Lcom/imaginato/homeworkmvvm/data/remote/login/LoginRepository;", "provideOkHttpClient", "Lokhttp3/OkHttpClient;", "interceptors", "provideRetrofit", "okHttpClient", "provideUserInfoDao", "Lcom/imaginato/homeworkmvvm/data/local/login/UserInfoDao;", "app_debug"})
public final class IModulesKt {
    private static final java.lang.String BASE_URL = "http://private-222d3-homework5.apiary-mock.com/";
    @org.jetbrains.annotations.NotNull()
    private static final org.koin.core.module.Module databaseModule = null;
    @org.jetbrains.annotations.NotNull()
    private static final org.koin.core.module.Module netModules = null;
    @org.jetbrains.annotations.NotNull()
    private static final org.koin.core.module.Module apiModules = null;
    @org.jetbrains.annotations.NotNull()
    private static final org.koin.core.module.Module repositoryModules = null;
    @org.jetbrains.annotations.NotNull()
    private static final org.koin.core.module.Module viewModelModules = null;
    
    @org.jetbrains.annotations.NotNull()
    public static final org.koin.core.module.Module getDatabaseModule() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final org.koin.core.module.Module getNetModules() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final org.koin.core.module.Module getApiModules() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final org.koin.core.module.Module getRepositoryModules() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final org.koin.core.module.Module getViewModelModules() {
        return null;
    }
    
    private static final com.imaginato.homeworkmvvm.data.remote.demo.DemoRepository provideDemoRepo(com.imaginato.homeworkmvvm.data.remote.demo.DemoApi api) {
        return null;
    }
    
    private static final com.imaginato.homeworkmvvm.data.remote.login.LoginRepository provideLoginRepo(com.imaginato.homeworkmvvm.data.remote.login.LoginApi api) {
        return null;
    }
    
    private static final com.imaginato.homeworkmvvm.data.remote.demo.DemoApi provideDemoApi(retrofit2.Retrofit retrofit) {
        return null;
    }
    
    private static final com.imaginato.homeworkmvvm.data.remote.login.LoginApi provideLoginApi(retrofit2.Retrofit retrofit) {
        return null;
    }
    
    private static final com.imaginato.homeworkmvvm.data.local.demo.DemoDatabase provideDatabase(android.app.Application application) {
        return null;
    }
    
    private static final com.imaginato.homeworkmvvm.data.local.demo.DemoDao provideDao(com.imaginato.homeworkmvvm.data.local.demo.DemoDatabase database) {
        return null;
    }
    
    private static final com.imaginato.homeworkmvvm.data.local.login.UserInfoDao provideUserInfoDao(com.imaginato.homeworkmvvm.data.local.demo.DemoDatabase database) {
        return null;
    }
    
    private static final retrofit2.Retrofit provideRetrofit(okhttp3.OkHttpClient okHttpClient) {
        return null;
    }
    
    private static final okhttp3.OkHttpClient provideOkHttpClient(java.util.ArrayList<okhttp3.Interceptor> interceptors) {
        return null;
    }
    
    private static final java.util.ArrayList<okhttp3.Interceptor> provideInterceptors() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final com.google.gson.Gson provideGson() {
        return null;
    }
}