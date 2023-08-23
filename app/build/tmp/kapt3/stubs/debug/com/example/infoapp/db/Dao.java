package com.example.infoapp.db;

import java.lang.System;

@androidx.room.Dao
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\u0019\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0006J\u001c\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\t0\b2\u0006\u0010\n\u001a\u00020\u000bH\'J\u0014\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\t0\bH\'J\u0019\u0010\r\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u000e"}, d2 = {"Lcom/example/infoapp/db/Dao;", "", "deleteItem", "", "item", "Lcom/example/infoapp/utils/ListItem;", "(Lcom/example/infoapp/utils/ListItem;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getAllItemsByCategory", "Lkotlinx/coroutines/flow/Flow;", "", "cat", "", "getFavorites", "insertItem", "app_debug"})
public abstract interface Dao {
    
    @org.jetbrains.annotations.Nullable
    @androidx.room.Insert(onConflict = 1)
    public abstract java.lang.Object insertItem(@org.jetbrains.annotations.NotNull
    com.example.infoapp.utils.ListItem item, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
    
    @org.jetbrains.annotations.Nullable
    @androidx.room.Delete
    public abstract java.lang.Object deleteItem(@org.jetbrains.annotations.NotNull
    com.example.infoapp.utils.ListItem item, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
    
    @org.jetbrains.annotations.NotNull
    @androidx.room.Query(value = "SELECT * FROM main WHERE category LIKE :cat")
    public abstract kotlinx.coroutines.flow.Flow<java.util.List<com.example.infoapp.utils.ListItem>> getAllItemsByCategory(@org.jetbrains.annotations.NotNull
    java.lang.String cat);
    
    @org.jetbrains.annotations.NotNull
    @androidx.room.Query(value = "SELECT * FROM main WHERE isFav = 1")
    public abstract kotlinx.coroutines.flow.Flow<java.util.List<com.example.infoapp.utils.ListItem>> getFavorites();
}