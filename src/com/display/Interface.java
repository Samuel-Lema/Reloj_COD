package com.display;

import com.object.Alarm;
import com.object.Time;

/**
 *
 * @author slemagonzalez
 */
public class Interface extends javax.swing.JFrame implements Runnable {

    Thread h1;
    static String activa = "";
    
    /**
     * Inicializa la Interfaz ( Constructor )
     */
    public Interface() {
        initComponents();

        h1 = new Thread((Runnable) this);
        h1.start();
        setVisible(true);
    }
    
    /**
     * Muestra la hora de Alarma en el reloj - Se usa un boolean para sobrecargar la función y identificar que es de la alarma
     * @param alarma
     */
    public static void display(boolean alarma){
        
        if (Alarm.isActive() == true){
            activa = " A";
        }
        jtextTime.setText(Alarm.getHora() + " : " + Alarm.getMin() + activa);
    }
    
    /**
     * Muestra la hora actual del sistema por pantalla
     */
    public static void display(){
        
        if (Alarm.isActive() == true){
            activa = " A";
            if (Time.getMin() == Alarm.getMin() && Time.getHora() == Alarm.getHora()){
                jtextBeep.setText("Beep Beep");
            } else {
                jtextBeep.setText("");
            }
        }
        jtextTime.setText(Time.getHora() + " : " + Time.getMin() + activa);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFormattedTextField2 = new javax.swing.JFormattedTextField();
        jPanel1 = new javax.swing.JPanel();
        jtextTime = new javax.swing.JTextField();
        jtextBeep = new javax.swing.JTextField();
        btnSnooze = new javax.swing.JButton();
        btnAlarm = new javax.swing.JButton();
        btnHora = new javax.swing.JButton();
        btnOn = new javax.swing.JButton();
        btnMin = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(new javax.swing.border.MatteBorder(null));

        jtextTime.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jtextTime.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jtextBeep.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jtextBeep.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jtextTime, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jtextBeep, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jtextTime, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtextBeep, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnSnooze.setText("Snooze");
        btnSnooze.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSnoozeActionPerformed(evt);
            }
        });

        btnAlarm.setText("Alarm");
        btnAlarm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlarmActionPerformed(evt);
            }
        });

        btnHora.setText("+H");
        btnHora.setEnabled(false);
        btnHora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHoraActionPerformed(evt);
            }
        });

        btnOn.setText("On / Off");
        btnOn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOnActionPerformed(evt);
            }
        });

        btnMin.setText("+M");
        btnMin.setEnabled(false);
        btnMin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMinActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnSnooze)
                        .addGap(18, 18, 18)
                        .addComponent(btnAlarm)
                        .addGap(16, 16, 16)
                        .addComponent(btnHora, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnMin)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnOn))
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSnooze)
                    .addComponent(btnAlarm)
                    .addComponent(btnOn)
                    .addComponent(btnMin)
                    .addComponent(btnHora))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Enciende \ Apaga la Alarma
    
    private void btnOnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOnActionPerformed
        
        if(Alarm.isActive() == true){
            Alarm.setActive(false);
        } else {
            Alarm.setActive(true);
        }
    }//GEN-LAST:event_btnOnActionPerformed

    // Cambia de modo ver Hora a modo ver Alarma y viceversa. Des/Habilita los botones de cambiar hora y min.
    
    private void btnAlarmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlarmActionPerformed
     
        if (btnHora.isEnabled() == true){
            display();
            btnHora.setEnabled(false);
            btnMin.setEnabled(false);
        } else {
            display(false);
            btnHora.setEnabled(true);
            btnMin.setEnabled(true);
        }
        
        if(h1.isAlive() == false){
            h1 = new Thread((Runnable) this);
            h1.start();
        }
    }//GEN-LAST:event_btnAlarmActionPerformed

    // Añade +1 a la hora de la Alarma
    
    private void btnHoraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHoraActionPerformed
        
        h1.stop();
        Alarm.setHora(Alarm.getHora() + 1);
        display(false);
    }//GEN-LAST:event_btnHoraActionPerformed

    // Añade +1 a los minutos de la Alarma
    
    private void btnMinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMinActionPerformed
        
        h1.stop();
        Alarm.setMin(Alarm.getMin() + 1);
        display(false);
    }//GEN-LAST:event_btnMinActionPerformed

    // Pospone la Alarma (cuando este sonando) para dentro de 5 min
    
    private void btnSnoozeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSnoozeActionPerformed
        
        if(Alarm.isActive() == true){
            if (Time.getMin() == Alarm.getMin() && Time.getHora() == Alarm.getHora()){
                Alarm.setMin(Alarm.getMin() + 5);
            }
        }
    }//GEN-LAST:event_btnSnoozeActionPerformed

    /**
     * Llama el Constructor de la Interface
     * @param args
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override public void run() {
                
            }
        });
        
        new Interface();
    }
    
    // Carga el hilo principal para refrescar la (hora : min) cada 1000 ms, que se muestran por pantalla.
    
    @Override public void run(){
        Thread ct = Thread.currentThread();
        
        while(ct == h1) {
            activa = "";
            display();
                    
            try {
                Thread.sleep(1000);
            }catch(InterruptedException e) {}
        }       
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlarm;
    private javax.swing.JButton btnHora;
    private javax.swing.JButton btnMin;
    private javax.swing.JButton btnOn;
    private javax.swing.JButton btnSnooze;
    private javax.swing.JFormattedTextField jFormattedTextField2;
    private javax.swing.JPanel jPanel1;
    private static javax.swing.JTextField jtextBeep;
    private static javax.swing.JTextField jtextTime;
    // End of variables declaration//GEN-END:variables


}
