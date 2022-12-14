package com.imaginato.homeworkmvvm.ui.demo;

import java.lang.System;

@org.koin.core.component.KoinApiExtension()
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u0014\u001a\u00020\u0015R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\t8F\u00a2\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u001b\u0010\f\u001a\u00020\r8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00070\t8F\u00a2\u0006\u0006\u001a\u0004\b\u0013\u0010\u000b\u00a8\u0006\u0016"}, d2 = {"Lcom/imaginato/homeworkmvvm/ui/demo/MainActivityViewModel;", "Lcom/imaginato/homeworkmvvm/ui/base/BaseViewModel;", "()V", "_progress", "Landroidx/lifecycle/MutableLiveData;", "", "_resultLiveData", "", "progress", "Landroidx/lifecycle/LiveData;", "getProgress", "()Landroidx/lifecycle/LiveData;", "repository", "Lcom/imaginato/homeworkmvvm/data/remote/demo/DemoRepository;", "getRepository", "()Lcom/imaginato/homeworkmvvm/data/remote/demo/DemoRepository;", "repository$delegate", "Lkotlin/Lazy;", "resultLiveData", "getResultLiveData", "getDemoData", "", "app_debug"})
public final class MainActivityViewModel extends com.imaginato.homeworkmvvm.ui.base.BaseViewModel {
    private final kotlin.Lazy repository$delegate = null;
    private androidx.lifecycle.MutableLiveData<java.lang.String> _resultLiveData;
    private androidx.lifecycle.MutableLiveData<java.lang.Boolean> _progress;
    
    public MainActivityViewModel() {
        super();
    }
    
    private final com.imaginato.homeworkmvvm.data.remote.demo.DemoRepository getRepository() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.Boolean> getProgress() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.String> getResultLiveData() {
        return null;
    }
    
    /**
     * Do something and handle business logic here
     */
    public final void getDemoData() {
    }
}