package com.object;

/**
 *
 * @author slemagonzalez
 */
public class Time {
    
    private static int hora;
    private static int min;

    // Get's

    /**
     * Devuelve la hora actual del sistema
     * @return
     */
    
    public static int getHora() {
        hora = (int) ((System.currentTimeMillis() / (1000*60*60)) % 24) + 1;
        
        return hora;
    }

    /**
     * Devuelve los minutos actuales del sistema
     * @return
     */
    public static int getMin() {
        min = (int) ((System.currentTimeMillis() / (1000*60)) % 60);
        
        return min;
    }
}
