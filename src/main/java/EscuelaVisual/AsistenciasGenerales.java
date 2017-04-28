/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EscuelaVisual;

import EscuelaPackage.Colegio;
import EscuelaPackage.Curso;
import Generar.ExportarExcel;
import Generar.GuardarXML;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.io.File;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Ignacio Esparza
 */
public class AsistenciasGenerales extends javax.swing.JFrame {

    GuardarXML g = new GuardarXML();
    Colegio col = g.cargar();
    DefaultTableModel modeloA;
    ExportarExcel ee = new ExportarExcel();
    int porcentaje = 8;

    public AsistenciasGenerales() {
        initComponents();
        modelo();
        setLocationRelativeTo(null);
    }

    public void SNumeros(JTextField jt) {
        jt.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent e) {
                char c = e.getKeyChar();
                if (!Character.isDigit(c)) {
                    //getToolkit().beep();

                    e.consume();
                }
            }
        });
    }

    public void modelo() {
        String cabecera[] = {"Alumno", "% Asistencias"};
        String datos[][] = {};
        modeloA = new DefaultTableModel(datos, cabecera);
        JTAsistencias.setModel(modeloA);
    }

    public void asistenciasMetodo() {
        int cant = 0;
        String[] vacio = {""};
        for (int j = 0; j < 16; j++) {
            String[] curso = {col.getTCursos()[j].getNivel() + "º " + col.getTCursos()[j].getLetra()};
            modeloA.addRow(curso);
            for (int i = 0; i < 30; i++) {
                cant++;
                String promedios[] = {cant + " " + col.getTCursos()[j].getEstudiante()[i].getNombre(),
                    String.valueOf(((col.getTCursos()[j].getEstudiante()[i].getAsistencia()) * 100) / 180) + "%"};
                modeloA.addRow(promedios);

            }
            modeloA.addRow(vacio);
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        JTAsistencias = new javax.swing.JTable();
        JBVolver = new javax.swing.JButton();
        BTBAsistencias = new javax.swing.JButton();
        JTFPorcentaje = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        JTAsistencias.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(JTAsistencias);

        JBVolver.setText("Volver");
        JBVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBVolverActionPerformed(evt);
            }
        });

        BTBAsistencias.setText("Baja Asistencia");
        BTBAsistencias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTBAsistenciasActionPerformed(evt);
            }
        });

        JTFPorcentaje.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        JTFPorcentaje.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTFPorcentajeActionPerformed(evt);
            }
        });
        JTFPorcentaje.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                JTFPorcentajeKeyTyped(evt);
            }
        });

        jLabel1.setText("Asistencias de todos los alumnos del Colegio");

        jButton1.setText("Exportar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 525, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(JBVolver)
                        .addGap(58, 58, 58)
                        .addComponent(JTFPorcentaje, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(BTBAsistencias))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addComponent(jButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JBVolver)
                    .addComponent(BTBAsistencias)
                    .addComponent(JTFPorcentaje, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JBVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBVolverActionPerformed
        EstudiantesGeneral eg = new EstudiantesGeneral();
        eg.setVisible(true);
        dispose();
    }//GEN-LAST:event_JBVolverActionPerformed

    private void JTFPorcentajeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTFPorcentajeActionPerformed
        try {
            SNumeros(JTFPorcentaje);
            porcentaje = Integer.parseInt(JTFPorcentaje.getText());
        } catch (Exception e) {
        }
    }//GEN-LAST:event_JTFPorcentajeActionPerformed

    private void BTBAsistenciasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTBAsistenciasActionPerformed
        BajasAsistenciasGeneral bag = new BajasAsistenciasGeneral();
        bag.asistenciasMetodo(porcentaje * 10);
        bag.setVisible(true);
        dispose();
    }//GEN-LAST:event_BTBAsistenciasActionPerformed

    private void JTFPorcentajeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_JTFPorcentajeKeyTyped
        try {
            if (JTFPorcentaje.getText().length() >= 3) {
                evt.consume();
            }
            porcentaje = Integer.parseInt(JTFPorcentaje.getText());
        } catch (Exception e) {
        }
    }//GEN-LAST:event_JTFPorcentajeKeyTyped

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        ee.exportar(new File("Asistencias Escuela.xls"), JTAsistencias);
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(AsistenciasGenerales.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AsistenciasGenerales.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AsistenciasGenerales.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AsistenciasGenerales.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AsistenciasGenerales().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BTBAsistencias;
    private javax.swing.JButton JBVolver;
    private javax.swing.JTable JTAsistencias;
    private javax.swing.JTextField JTFPorcentaje;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
