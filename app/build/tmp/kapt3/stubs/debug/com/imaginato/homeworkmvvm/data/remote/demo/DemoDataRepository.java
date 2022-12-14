package com.imaginato.homeworkmvvm.data.remote.demo;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u0000 \t2\u00020\u0001:\u0001\tB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\n"}, d2 = {"Lcom/imaginato/homeworkmvvm/data/remote/demo/DemoDataRepository;", "Lcom/imaginato/homeworkmvvm/data/remote/demo/DemoRepository;", "api", "Lcom/imaginato/homeworkmvvm/data/remote/demo/DemoApi;", "(Lcom/imaginato/homeworkmvvm/data/remote/demo/DemoApi;)V", "getDemoData", "Lkotlinx/coroutines/flow/Flow;", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion", "app_debug"})
public final class DemoDataRepository implements com.imaginato.homeworkmvvm.data.remote.demo.DemoRepository {
    private com.imaginato.homeworkmvvm.data.remote.demo.DemoApi api;
    @org.jetbrains.annotations.NotNull()
    public static final com.imaginato.homeworkmvvm.data.remote.demo.DemoDataRepository.Companion Companion = null;
    private static final java.lang.String URL_GET_PUBLIC_IP = "https://ifconfig.me/all.json";
    private static final java.lang.String NOTHING_GET = "Nothing get!";
    
    public DemoDataRepository(@org.jetbrains.annotations.NotNull()
    com.imaginato.homeworkmvvm.data.remote.demo.DemoApi api) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object getDemoData(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<java.lang.String>> continuation) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0006"}, d2 = {"Lcom/imaginato/homeworkmvvm/data/remote/demo/DemoDataRepository$Companion;", "", "()V", "NOTHING_GET", "", "URL_GET_PUBLIC_IP", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}