package com.example.infoapp;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\fJ\u000e\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014J\u0006\u0010\u0015\u001a\u00020\u0006J\u000e\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\fR\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u001d\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e\u00a8\u0006\u0017"}, d2 = {"Lcom/example/infoapp/MainViewModel;", "Landroidx/lifecycle/ViewModel;", "mainDb", "Lcom/example/infoapp/db/MainDb;", "(Lcom/example/infoapp/db/MainDb;)V", "job", "Lkotlinx/coroutines/Job;", "getMainDb", "()Lcom/example/infoapp/db/MainDb;", "mainList", "Landroidx/compose/runtime/MutableState;", "", "Lcom/example/infoapp/utils/ListItem;", "getMainList", "()Landroidx/compose/runtime/MutableState;", "deleteItem", "item", "getAllItemsByCategory", "", "cat", "", "getFavorites", "insertItem", "app_debug"})
public final class MainViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull
    private final com.example.infoapp.db.MainDb mainDb = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.compose.runtime.MutableState<java.util.List<com.example.infoapp.utils.ListItem>> mainList = null;
    private kotlinx.coroutines.Job job;
    
    @javax.inject.Inject
    public MainViewModel(@org.jetbrains.annotations.NotNull
    com.example.infoapp.db.MainDb mainDb) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.example.infoapp.db.MainDb getMainDb() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.compose.runtime.MutableState<java.util.List<com.example.infoapp.utils.ListItem>> getMainList() {
        return null;
    }
    
    public final void getAllItemsByCategory(@org.jetbrains.annotations.NotNull
    java.lang.String cat) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.Job getFavorites() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.Job insertItem(@org.jetbrains.annotations.NotNull
    com.example.infoapp.utils.ListItem item) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.Job deleteItem(@org.jetbrains.annotations.NotNull
    com.example.infoapp.utils.ListItem item) {
        return null;
    }
}