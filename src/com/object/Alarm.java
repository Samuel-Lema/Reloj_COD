package com.object;

/**
 *
 * @author slemagonzalez
 */
public class Alarm {
    
    private static boolean active = false;
    private static int hora = (int) ((System.currentTimeMillis() / (1000*60*60)) % 24) + 1;
    private static int min = (int) ((System.currentTimeMillis() / (1000*60)) % 60);

    /**
     * Cambio el estado de la Alarma (Activada / Desactivada)
     * @param activa
     */

    public static void setActive(boolean activa) {
        Alarm.active = activa;
    }

    /**
     * Devuelve el estado de la Alarma (Activada / Desactivada)
     * @return active
     */
    public static boolean isActive() {
        return active;
    }
    
    /**
     * Devuelve la hora de la Alarma
     * @return hora
     */
    public static int getHora() {
        return hora;
    }
    
    /**
     * Permite cambiar la hora de la Alarma (De 00 a 23)
     * @param hora
     */
    public static void setHora(int hora) {
        
        if(hora > 23){
            Alarm.hora = 0;
        } else {
            Alarm.hora = hora;
        }
    }
    
    /**
     * Devuelve los minutos de la Alarma
     * @return min
     */
    public static int getMin() {
        return min;
    }
    
    /**
     * Permite cambiar los minutos de la Alarma (De 00 a 59)
     * @param min
     */
    public static void setMin(int min) {
        if(min > 59){
            Alarm.min = 0;
        } else {
            Alarm.min = min;
        }
    }
}
