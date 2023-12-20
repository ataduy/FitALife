package com.example.fitalife.main;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 2, d1 = {"\u0000,\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u001a$\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u0005H\u0007\u001a\u0010\u0010\u0006\u001a\u00020\u00012\u0006\u0010\u0007\u001a\u00020\bH\u0003\u001a\u008e\u0001\u0010\t\u001a\u00020\u00012\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u00032\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u00052\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u00052\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u00052\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u00052\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00010\u0012H\u0003\u001a\u0018\u0010\u0013\u001a\u00020\u00012\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\u0015H\u0007\u00a8\u0006\u0016"}, d2 = {"GenderSelector", "", "selectedGender", "", "onGenderChange", "Lkotlin/Function1;", "Header", "navController", "Landroidx/navigation/NavController;", "ProfileContent", "gender", "weight", "height", "age", "onWeightChange", "onHeightChange", "onAgeChange", "onSave", "Lkotlin/Function0;", "ProfileScreen", "vm", "Lcom/example/fitalife/AppViewModel;", "app_debug"})
public final class ProfileScreenKt {
    
    @androidx.compose.runtime.Composable
    @kotlin.OptIn(markerClass = {androidx.compose.material3.ExperimentalMaterial3Api.class})
    public static final void ProfileScreen(@org.jetbrains.annotations.NotNull
    androidx.navigation.NavController navController, @org.jetbrains.annotations.NotNull
    com.example.fitalife.AppViewModel vm) {
    }
    
    @kotlin.OptIn(markerClass = {androidx.compose.material3.ExperimentalMaterial3Api.class})
    @androidx.compose.runtime.Composable
    private static final void ProfileContent(androidx.navigation.NavController navController, java.lang.String gender, java.lang.String weight, java.lang.String height, java.lang.String age, kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> onGenderChange, kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> onWeightChange, kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> onHeightChange, kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> onAgeChange, kotlin.jvm.functions.Function0<kotlin.Unit> onSave) {
    }
    
    @androidx.compose.runtime.Composable
    private static final void Header(androidx.navigation.NavController navController) {
    }
    
    @androidx.compose.runtime.Composable
    @kotlin.OptIn(markerClass = {androidx.compose.material3.ExperimentalMaterial3Api.class})
    public static final void GenderSelector(@org.jetbrains.annotations.NotNull
    java.lang.String selectedGender, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> onGenderChange) {
    }
}