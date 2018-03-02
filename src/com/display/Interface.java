package com.display;

import com.logic.uManage;
import java.awt.event.ActionEvent;

/**
 *
 * @author slemagonzalez
 */
public class Interface extends javax.swing.JFrame implements Runnable {

    static Thread h1;
    static String activa = "";
    Interface miInterface;
    
    /**
     * Inicializa la Interfaz ( Constructor )
     */
    public Interface() {
        initComponents();
        h1 = new Thread((Runnable) this);
        h1.start();
        setVisible(true);
        
        // Boton de encendido de Alarma
        
        btnOn.addActionListener((ActionEvent e) -> {
           
            uManage.active();
        });
        
        // Boton de cambio de Modo Alarma / Hora
        
        btnAlarm.addActionListener((ActionEvent e) -> {
            
            if(h1.isAlive() == false){
                h1 = new Thread((Runnable) this);
                h1.start();
                jtextBeep.setText("");
            } else {
                h1.stop();
                uManage.pantalla(false);
                jtextBeep.setText("Alarm Mode");
            }
        });
        
        // Boton de +1 a la hora de la Alarma
        
        btnHora.addActionListener((ActionEvent e) -> {
           
            uManage.hour();
        });
                
        // Boton de +1 a los minutos de la Alarma
        
        btnMin.addActionListener((ActionEvent e) -> {
           
            uManage.min();
        });
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

        btnAlarm.setText("Alarm");

        btnHora.setText("+H");

        btnOn.setText("On / Off");

        btnMin.setText("+M");

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

        java.awt.EventQueue.invokeLater(() -> {
        });
        
        Interface miInterface = new Interface();
    }
    
    // Carga el hilo principal para refrescar la (hora : min) cada 1000 ms, que se muestran por pantalla.
    
    @Override public void run(){
        Thread ct = Thread.currentThread();
        
        while(ct == h1) {
            uManage.pantalla();
                    
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
    public static javax.swing.JTextField jtextBeep;
    public static javax.swing.JTextField jtextTime;
    // End of variables declaration//GEN-END:variables


}
