/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.ejercicios_resueltos_actividad5;

import javax.swing.JOptionPane;

/**
 *
 * @author User
 */
public class VentanaPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form VentanaPrincipal
     */
    public VentanaPrincipal() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Contenedor = new javax.swing.JPanel();
        n1 = new javax.swing.JLabel();
        n2 = new javax.swing.JLabel();
        n3 = new javax.swing.JLabel();
        n4 = new javax.swing.JLabel();
        n5 = new javax.swing.JLabel();
        Cnota1 = new javax.swing.JTextField();
        Cnota2 = new javax.swing.JTextField();
        Cnota3 = new javax.swing.JTextField();
        Cnota4 = new javax.swing.JTextField();
        Cnota5 = new javax.swing.JTextField();
        Calcular = new javax.swing.JButton();
        Limpiar = new javax.swing.JButton();
        Pro = new javax.swing.JLabel();
        Des = new javax.swing.JLabel();
        May = new javax.swing.JLabel();
        Men = new javax.swing.JLabel();
        SalidaP = new javax.swing.JLabel();
        SalidaDes = new javax.swing.JLabel();
        SalidaMax = new javax.swing.JLabel();
        SalidaMen = new javax.swing.JLabel();
        Errores = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Contenedor.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        n1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        n1.setText("Nota 1:");

        n2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        n2.setText("Nota 2:");

        n3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        n3.setText("Nota 3:");

        n4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        n4.setText("Nota 4:");

        n5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        n5.setText("Nota 5:");

        Cnota1.setText(" ");
        Cnota1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Cnota1ActionPerformed(evt);
            }
        });

        Cnota2.setText(" ");

        Cnota3.setText(" ");

        Cnota4.setText(" ");

        Cnota5.setText(" ");

        Calcular.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Calcular.setText("Calcular");
        Calcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CalcularActionPerformed(evt);
            }
        });

        Limpiar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Limpiar.setText("Limpiar");
        Limpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LimpiarActionPerformed(evt);
            }
        });

        Pro.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Pro.setText("Promedio Notas:");

        Des.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Des.setText("Desviación Estandar Notas: ");

        May.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        May.setText("Nota Máxima:");

        Men.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Men.setText("Nota Menor:");

        Errores.setText(" ");

        javax.swing.GroupLayout ContenedorLayout = new javax.swing.GroupLayout(Contenedor);
        Contenedor.setLayout(ContenedorLayout);
        ContenedorLayout.setHorizontalGroup(
            ContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ContenedorLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(ContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(n3)
                    .addComponent(n2)
                    .addComponent(n1)
                    .addGroup(ContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(n5)
                        .addComponent(n4)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(ContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Cnota2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Cnota1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Cnota3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Cnota4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Cnota5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(ContenedorLayout.createSequentialGroup()
                .addGroup(ContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ContenedorLayout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(Des)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(ContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(SalidaMen, javax.swing.GroupLayout.DEFAULT_SIZE, 51, Short.MAX_VALUE)
                            .addComponent(SalidaMax, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(SalidaDes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(ContenedorLayout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addGroup(ContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(ContenedorLayout.createSequentialGroup()
                                .addComponent(Calcular, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(28, 28, 28)
                                .addComponent(Limpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(Men)
                            .addComponent(May)
                            .addGroup(ContenedorLayout.createSequentialGroup()
                                .addComponent(Pro)
                                .addGap(82, 82, 82)
                                .addComponent(SalidaP, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(ContenedorLayout.createSequentialGroup()
                .addGap(124, 124, 124)
                .addComponent(Errores)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        ContenedorLayout.setVerticalGroup(
            ContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ContenedorLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(ContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(n1)
                    .addComponent(Cnota1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(ContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(n2)
                    .addComponent(Cnota2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(ContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(n3)
                    .addComponent(Cnota3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(ContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(n4)
                    .addComponent(Cnota4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(ContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(n5)
                    .addComponent(Cnota5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(ContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Calcular, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
                    .addComponent(Limpiar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(24, 24, 24)
                .addGroup(ContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Pro)
                    .addComponent(SalidaP))
                .addGap(18, 18, 18)
                .addGroup(ContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Des)
                    .addComponent(SalidaDes))
                .addGap(18, 18, 18)
                .addGroup(ContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(May)
                    .addComponent(SalidaMax))
                .addGap(18, 18, 18)
                .addGroup(ContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Men)
                    .addComponent(SalidaMen))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Errores)
                .addContainerGap(13, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(Contenedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(42, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(Contenedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Cnota1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Cnota1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Cnota1ActionPerformed

    private void LimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LimpiarActionPerformed
        Cnota1.setText("");
        Cnota2.setText("");
        Cnota3.setText("");
        Cnota4.setText("");
        Cnota5.setText("");
        SalidaP.setText("");
        SalidaDes.setText("");
        SalidaMax.setText("");
        SalidaMen.setText("");
        Errores.setText("");
        
    }//GEN-LAST:event_LimpiarActionPerformed

    private void CalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CalcularActionPerformed
        try{
        double  p, m, M, D;        
        Notas lista = new Notas();
        
        lista.listaN[0] = Double.parseDouble(Cnota1.getText());
        lista.listaN[1] = Double.parseDouble(Cnota2.getText());
        lista.listaN[2] = Double.parseDouble(Cnota3.getText());
        lista.listaN[3] = Double.parseDouble(Cnota4.getText());
        lista.listaN[4] = Double.parseDouble(Cnota5.getText());
        
        
        p = lista.cPromedio();
        m = lista.cMenor();
        M = lista.cMayor();
        D = lista.cDesviacion();
        SalidaP.setText(String.valueOf(p));
        SalidaDes.setText(String.valueOf(D));
        SalidaMax.setText(String.valueOf(M));
        SalidaMen.setText(String.valueOf(m));}
        catch(NumberFormatException nfe){
            Errores.setText(String.valueOf("Digite bien las notas"));
        }
    }//GEN-LAST:event_CalcularActionPerformed

    /**
     * @param args the command line arguments
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
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Calcular;
    private javax.swing.JTextField Cnota1;
    private javax.swing.JTextField Cnota2;
    private javax.swing.JTextField Cnota3;
    private javax.swing.JTextField Cnota4;
    private javax.swing.JTextField Cnota5;
    private javax.swing.JPanel Contenedor;
    private javax.swing.JLabel Des;
    private javax.swing.JLabel Errores;
    private javax.swing.JButton Limpiar;
    private javax.swing.JLabel May;
    private javax.swing.JLabel Men;
    private javax.swing.JLabel Pro;
    private javax.swing.JLabel SalidaDes;
    private javax.swing.JLabel SalidaMax;
    private javax.swing.JLabel SalidaMen;
    private javax.swing.JLabel SalidaP;
    private javax.swing.JLabel n1;
    private javax.swing.JLabel n2;
    private javax.swing.JLabel n3;
    private javax.swing.JLabel n4;
    private javax.swing.JLabel n5;
    // End of variables declaration//GEN-END:variables
}
