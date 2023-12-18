package com.example.fitalife;

import java.lang.System;

@dagger.hilt.InstallIn(value = {dagger.hilt.android.components.ViewModelComponent.class})
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0007J\b\u0010\u0005\u001a\u00020\u0006H\u0007J\b\u0010\u0007\u001a\u00020\bH\u0007\u00a8\u0006\t"}, d2 = {"Lcom/example/fitalife/HiltModule;", "", "()V", "provideAuthentication", "Lcom/google/firebase/auth/FirebaseAuth;", "provideFirestore", "Lcom/google/firebase/firestore/FirebaseFirestore;", "provideStorage", "Lcom/google/firebase/storage/FirebaseStorage;", "app_debug"})
@dagger.Module
public final class HiltModule {
    
    public HiltModule() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    @dagger.Provides
    public final com.google.firebase.auth.FirebaseAuth provideAuthentication() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @dagger.Provides
    public final com.google.firebase.firestore.FirebaseFirestore provideFirestore() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @dagger.Provides
    public final com.google.firebase.storage.FirebaseStorage provideStorage() {
        return null;
    }
}