package com.object;

public class Time {
    
    private static int hora;
    private static int min;

    // Get's
    
    public static int getHora() {
        hora = (int) ((System.currentTimeMillis() / (1000*60*60)) % 24) + 1;
        
        return hora;
    }

    public static int getMin() {
        min = (int) ((System.currentTimeMillis() / (1000*60)) % 60);
        
        return min;
    }
}
