package com.object;

public class Alarm {
    
    private static boolean active = false;
    private static int hora = (int) ((System.currentTimeMillis() / (1000*60*60)) % 24) + 1;
    private static int min = (int) ((System.currentTimeMillis() / (1000*60)) % 60);
    
    // Get's y Set's

    public static void setActive(boolean activa) {
        Alarm.active = activa;
    }

    public static boolean isActive() {
        return active;
    }
    
    public static int getHora() {
        return hora;
    }
    
    public static void setHora(int hora) {
        if(hora > 23){
            Alarm.hora = 0;
        } else {
            Alarm.hora = hora;
        }
    }
    
    public static int getMin() {
        return min;
    }
    
    public static void setMin(int min) {
        if(min > 59){
            Alarm.min = 0;
        } else {
            Alarm.min = min;
        }
    }
}
