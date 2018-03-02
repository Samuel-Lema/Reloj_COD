package com.logic;

import com.display.Interface;
import com.object.Alarm;
import com.object.Time;

/**
 *
 * @author slemagonzalez
 */
public class uManage {
    
    private static String activa = "";
    
     /**
     * Muestra la hora de Alarma en el reloj - Se usa un boolean para sobrecargar la función y identificar que es de la alarma
     * @param alarma
     */
    public static void pantalla(boolean alarma){
        
        if (Alarm.isActive() == true){
            activa = " A";
        }
        Interface.jtextTime.setText(Alarm.getHora() + " : " + Alarm.getMin() + activa);
    }
    
    public static void pantalla(){
        
        if (Alarm.isActive() == true){
            activa = " A";
            if (Time.getMin() == Alarm.getMin() && Time.getHora() == Alarm.getHora()){
                Interface.jtextBeep.setText("Beep Beep");
            } else {
                Interface.jtextBeep.setText("");
            }
        }
        
        Interface.jtextTime.setText(Time.getHora() + " : " + Time.getMin() + activa);
    }
    
    public static void snooze(){
        
        if(Alarm.isActive() == true){
            if (Time.getMin() == Alarm.getMin() && Time.getHora() == Alarm.getHora()){
                Alarm.setMin(Alarm.getMin() + 5);
            }
        }
    }
    
    public static void active(){
        
        if(Alarm.isActive() == true){
            Alarm.setActive(false);
        } else {
            Alarm.setActive(true);
        }
    }
    
    public static void hour(){
        
        Alarm.setHora(Alarm.getHora() + 1);
        pantalla(false);
    }
    
    public static void min(){
        
        Alarm.setHora(Alarm.getHora() + 1);
        pantalla(false);
    }

}
