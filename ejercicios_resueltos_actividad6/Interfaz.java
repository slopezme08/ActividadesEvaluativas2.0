/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.ejercicios_resueltos_actividad6;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.lang.NumberFormatException;

public class Interfaz extends javax.swing.JFrame {

    public Interfaz() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        EntradaNombre = new javax.swing.JTextField();
        EntradaNumero = new javax.swing.JTextField();
        BotonCrear = new javax.swing.JButton();
        BotonLeer = new javax.swing.JButton();
        BotonActualizar = new javax.swing.JButton();
        BotonBorrar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        Salida = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("Nombre");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("Número");

        EntradaNombre.setText(" ");

        EntradaNumero.setText(" ");

        BotonCrear.setText("Crear");
        BotonCrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonCrearActionPerformed(evt);
            }
        });

        BotonLeer.setText("Leer");
        BotonLeer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonLeerActionPerformed(evt);
            }
        });

        BotonActualizar.setText("Actualizar");
        BotonActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonActualizarActionPerformed(evt);
            }
        });

        BotonBorrar.setText("Borrar");
        BotonBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonBorrarActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("Actividad 6 POO");

        Salida.setText(" ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2))
                                .addGap(50, 50, 50)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(EntradaNombre, javax.swing.GroupLayout.DEFAULT_SIZE, 179, Short.MAX_VALUE)
                                    .addComponent(EntradaNumero)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(BotonCrear, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(BotonLeer))
                                .addGap(75, 75, 75)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(BotonActualizar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(BotonBorrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(146, 146, 146)
                        .addComponent(jLabel3)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 61, Short.MAX_VALUE)
                .addComponent(Salida, javax.swing.GroupLayout.PREFERRED_SIZE, 356, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(76, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel3)
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(EntradaNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(EntradaNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BotonCrear)
                    .addComponent(BotonActualizar))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BotonLeer)
                    .addComponent(BotonBorrar))
                .addGap(18, 18, 18)
                .addComponent(Salida, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BotonCrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonCrearActionPerformed
    try {
	String NuevoNombre = String.valueOf(EntradaNombre.getText());
        long NuevoNumero = Long.parseLong(EntradaNumero.getText());

	String nameNumberString;
	String name;
	long number;

	File file = new File("C:\\Users\\User\\OneDrive\\Escritorio\\Actividad6\\PortafolioContactos.txt");
	if (!file.exists()) {
            file.createNewFile();
	}
	RandomAccessFile raf = new RandomAccessFile(file, "rw");
	boolean existe = false;

	while (raf.getFilePointer() < raf.length()) {
            nameNumberString = raf.readLine();
            String[] lineSplit = nameNumberString.split("!");
            name = lineSplit[0];
            number = Long.parseLong(lineSplit[1]);
            if (name.equals(NuevoNombre) || number == NuevoNumero) {
		existe = true;
		break;
            }
	}

	if (existe == false) {
            nameNumberString = NuevoNombre + "!" + String.valueOf(NuevoNumero);
            raf.writeBytes(nameNumberString);
            raf.writeBytes(System.lineSeparator());
            System.out.println("Contacto Agregado");
            raf.close();
	}   else {
            raf.close();
            System.out.println("El contacto ya existe");
	}
    }   catch (IOException ioe) {
            System.out.println(ioe);
	}
	catch (NumberFormatException nef) {
	System.out.println(nef);
}


    }//GEN-LAST:event_BotonCrearActionPerformed

    private void BotonLeerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonLeerActionPerformed
    try {
        String NombreBusqueda = String.valueOf(EntradaNombre.getText());
       
        String nameNumberString;
        String name;
        long number;
        
        File file = new File("C:\\Users\\User\\OneDrive\\Escritorio\\Actividad6\\PortafolioContactos.txt");
 
        if (!file.exists()) {
                file.createNewFile();
        }
        RandomAccessFile raf = new RandomAccessFile(file, "rw");

        while (raf.getFilePointer() < raf.length()) {

            nameNumberString = raf.readLine();
            String[] lineSplit = nameNumberString.split("!");

            name = lineSplit[0];
            number = Long.parseLong(lineSplit[1]);
            if(name.equals(NombreBusqueda)){                
                System.out.println("Nombre Amigo: " + name + "- Número Contacto: " + number + "\n");
                Salida.setText("Nombre Amigo: " + name + "- Número Contacto: " + number + "\n");
            }            
            }
        }   catch (IOException ioe){
            System.out.println(ioe);
        }   catch (NumberFormatException nef) {
                System.out.println(nef);
            }
    }//GEN-LAST:event_BotonLeerActionPerformed

    private void BotonActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonActualizarActionPerformed
    try {            
        String NuevoNombre = String.valueOf(EntradaNombre.getText());
        long NuevoNumero = Long.parseLong(EntradaNumero.getText());
 
        String nameNumberString;
        String name;
        long number;
        int index;

        File file = new File("C:\\Users\\User\\OneDrive\\Escritorio\\Actividad6\\PortafolioContactos.txt");
        if (!file.exists()) {
            file.createNewFile();
        }
        RandomAccessFile raf = new RandomAccessFile(file, "rw");
        boolean found = false;
 
        while (raf.getFilePointer() < raf.length()) {
            nameNumberString = raf.readLine();
            String[] lineSplit = nameNumberString.split("!");
 
            name = lineSplit[0];
            number = Long.parseLong(lineSplit[1]);
            if (name.equals(NuevoNombre) || number == NuevoNumero) {
                found = true;
                break;
            }
        }
        if (found == true) {
            File tmpFile = new File("C:\\Users\\User\\OneDrive\\Escritorio\\Actividad6\\PortafolioContactosTemporal.txt");
 
            RandomAccessFile tmpraf = new RandomAccessFile(tmpFile, "rw");
            raf.seek(0);
            while (raf.getFilePointer() < raf.length()) {
                nameNumberString = raf.readLine();
                index = nameNumberString.indexOf('!');
                name = nameNumberString.substring(0, index);
                if (name.equals(NuevoNombre)) {
                        nameNumberString = name + "!" + String.valueOf(NuevoNumero);
                }
                tmpraf.writeBytes(nameNumberString);
                    tmpraf.writeBytes(
                        System.lineSeparator());
                }
            raf.seek(0);
            tmpraf.seek(0);
            while (tmpraf.getFilePointer() < tmpraf.length()) {
                    raf.writeBytes(tmpraf.readLine());
                    raf.writeBytes(System.lineSeparator());
            }
            raf.setLength(tmpraf.length());
            tmpraf.close();
            raf.close();
            tmpFile.delete();
 
            System.out.println(" Contacto Actualizado ");
        } else {
            raf.close();
            System.out.println(" Input name" + " does not exists. ");
            }
        }
        catch (IOException ioe) {
            System.out.println(ioe);
        } catch (NumberFormatException nef) {
            System.out.println(nef);
        }
    }//GEN-LAST:event_BotonActualizarActionPerformed

    private void BotonBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonBorrarActionPerformed
        try {
            String newName = String.valueOf(EntradaNombre.getText());
            String nameNumberString;
            String name;
            long number;
            int index;
 
            File file = new File("C:\\Users\\User\\OneDrive\\Escritorio\\Actividad6\\PortafolioContactos.txt");
 
            if (!file.exists()) {
                file.createNewFile();
            }
            RandomAccessFile raf = new RandomAccessFile(file, "rw");
            boolean found = false;
 
            while (raf.getFilePointer() < raf.length()) {
                nameNumberString = raf.readLine();
                String[] lineSplit = nameNumberString.split("!");
                name = lineSplit[0];
                number = Long.parseLong(lineSplit[1]);
                if (name.equals(newName)) {
                    found = true;
                    break;
                }
            }
            if (found == true) {
                File tmpFile = new File("C:\\Users\\User\\OneDrive\\Escritorio\\Actividad6\\PortafolioContactosTemporal.txt");
                RandomAccessFile tmpraf = new RandomAccessFile(tmpFile, "rw");
                raf.seek(0);
 
                while (raf.getFilePointer() < raf.length()) {
                    nameNumberString = raf.readLine(); 
                    index = nameNumberString.indexOf('!');
                    name = nameNumberString.substring(0, index);
                    if (name.equals(newName)) {
                        continue;
                    }
                    tmpraf.writeBytes(nameNumberString);
                    tmpraf.writeBytes(System.lineSeparator());
                }
                raf.seek(0);
                tmpraf.seek(0);
 
                while (tmpraf.getFilePointer() < tmpraf.length()) {
                    raf.writeBytes(tmpraf.readLine());
                    raf.writeBytes(System.lineSeparator());
                }
                raf.setLength(tmpraf.length());
                tmpraf.close();
                raf.close();
                tmpFile.delete();
                System.out.println(" Contacto Borrado ");
            }
            else {
                raf.close();
                System.out.println(" Input name" + " does not exists. ");
            }
        }
        catch (IOException ioe) {
            System.out.println(ioe);
        }
    }//GEN-LAST:event_BotonBorrarActionPerformed

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
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interfaz().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonActualizar;
    private javax.swing.JButton BotonBorrar;
    private javax.swing.JButton BotonCrear;
    private javax.swing.JButton BotonLeer;
    private javax.swing.JTextField EntradaNombre;
    private javax.swing.JTextField EntradaNumero;
    private javax.swing.JLabel Salida;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables
}
