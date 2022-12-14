package com.imaginato.homeworkmvvm.data.remote.demo;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H\'\u00a8\u0006\u0007"}, d2 = {"Lcom/imaginato/homeworkmvvm/data/remote/demo/DemoApi;", "", "getDemoDataAsync", "Lkotlinx/coroutines/Deferred;", "Lcom/imaginato/homeworkmvvm/data/remote/demo/response/DemoResponse;", "url", "", "app_debug"})
public abstract interface DemoApi {
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET()
    public abstract kotlinx.coroutines.Deferred<com.imaginato.homeworkmvvm.data.remote.demo.response.DemoResponse> getDemoDataAsync(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Url()
    java.lang.String url);
}