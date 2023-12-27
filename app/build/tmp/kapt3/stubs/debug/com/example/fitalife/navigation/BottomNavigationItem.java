package com.example.fitalife.navigation;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0017\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e\u00a8\u0006\u000f"}, d2 = {"Lcom/example/fitalife/navigation/BottomNavigationItem;", "", "icon", "", "navDestination", "Lcom/example/fitalife/DestinationScreen;", "(Ljava/lang/String;IILcom/example/fitalife/DestinationScreen;)V", "getIcon", "()I", "getNavDestination", "()Lcom/example/fitalife/DestinationScreen;", "HOME", "NOTE", "DIET", "CART", "app_debug"})
public enum BottomNavigationItem {
    /*public static final*/ HOME /* = new HOME(0, null) */,
    /*public static final*/ NOTE /* = new NOTE(0, null) */,
    /*public static final*/ DIET /* = new DIET(0, null) */,
    /*public static final*/ CART /* = new CART(0, null) */;
    private final int icon = 0;
    @org.jetbrains.annotations.NotNull
    private final com.example.fitalife.DestinationScreen navDestination = null;
    
    BottomNavigationItem(int icon, com.example.fitalife.DestinationScreen navDestination) {
    }
    
    public final int getIcon() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.example.fitalife.DestinationScreen getNavDestination() {
        return null;
    }
}