package com.example.android.trackmysleepquality.sleeptracker;

import java.lang.System;

/**
 * ViewModel for SleepTrackerFragment.
 */
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0013\u0010\u001b\u001a\u0004\u0018\u00010\fH\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001cJ\u0006\u0010\u001d\u001a\u00020\u001eJ\u0019\u0010\u001f\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020\fH\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010!J\u0006\u0010\"\u001a\u00020\u001eR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR&\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001f\u0010\u0011\u001a\u0010\u0012\f\u0012\n \u0013*\u0004\u0018\u00010\u00120\u00120\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000eR\"\u0010\u0015\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\u0016X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001a\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006#"}, d2 = {"Lcom/example/android/trackmysleepquality/sleeptracker/SleepTrackerViewModel;", "Landroidx/lifecycle/AndroidViewModel;", "database", "Lcom/example/android/trackmysleepquality/database/SleepDatabaseDao;", "application", "Landroid/app/Application;", "(Lcom/example/android/trackmysleepquality/database/SleepDatabaseDao;Landroid/app/Application;)V", "getDatabase", "()Lcom/example/android/trackmysleepquality/database/SleepDatabaseDao;", "nights", "Landroidx/lifecycle/LiveData;", "", "Lcom/example/android/trackmysleepquality/database/SleepNight;", "getNights", "()Landroidx/lifecycle/LiveData;", "setNights", "(Landroidx/lifecycle/LiveData;)V", "nightsString", "Landroid/text/Spanned;", "kotlin.jvm.PlatformType", "getNightsString", "tonight", "Landroidx/lifecycle/MutableLiveData;", "getTonight", "()Landroidx/lifecycle/MutableLiveData;", "setTonight", "(Landroidx/lifecycle/MutableLiveData;)V", "getTonightFromDatabase", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "initializeTonight", "", "insert", "night", "(Lcom/example/android/trackmysleepquality/database/SleepNight;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onStartTracking", "app_debug"})
public final class SleepTrackerViewModel extends androidx.lifecycle.AndroidViewModel {
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<com.example.android.trackmysleepquality.database.SleepNight> tonight;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.LiveData<java.util.List<com.example.android.trackmysleepquality.database.SleepNight>> nights;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<android.text.Spanned> nightsString = null;
    @org.jetbrains.annotations.NotNull()
    private final com.example.android.trackmysleepquality.database.SleepDatabaseDao database = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.example.android.trackmysleepquality.database.SleepNight> getTonight() {
        return null;
    }
    
    public final void setTonight(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<com.example.android.trackmysleepquality.database.SleepNight> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.example.android.trackmysleepquality.database.SleepNight>> getNights() {
        return null;
    }
    
    public final void setNights(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.LiveData<java.util.List<com.example.android.trackmysleepquality.database.SleepNight>> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<android.text.Spanned> getNightsString() {
        return null;
    }
    
    public final void initializeTonight() {
    }
    
    public final void onStartTracking() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.android.trackmysleepquality.database.SleepDatabaseDao getDatabase() {
        return null;
    }
    
    public SleepTrackerViewModel(@org.jetbrains.annotations.NotNull()
    com.example.android.trackmysleepquality.database.SleepDatabaseDao database, @org.jetbrains.annotations.NotNull()
    android.app.Application application) {
        super(null);
    }
}