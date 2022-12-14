package com.imaginato.homeworkmvvm.ui.base;

import java.lang.System;

@org.koin.core.component.KoinApiExtension()
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\b\'\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0014\u00a8\u0006\u0006"}, d2 = {"Lcom/imaginato/homeworkmvvm/ui/base/BaseViewModel;", "Landroidx/lifecycle/ViewModel;", "Lorg/koin/core/component/KoinComponent;", "()V", "onCleared", "", "app_debug"})
public abstract class BaseViewModel extends androidx.lifecycle.ViewModel implements org.koin.core.component.KoinComponent {
    
    public BaseViewModel() {
        super();
    }
    
    @java.lang.Override()
    protected void onCleared() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public org.koin.core.Koin getKoin() {
        return null;
    }
}