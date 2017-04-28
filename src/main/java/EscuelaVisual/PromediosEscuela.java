/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EscuelaVisual;

import EscuelaPackage.Colegio;
import Generar.ExportarExcel;
import Generar.GuardarXML;
import java.io.File;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Ignacio Esparza
 */
public class PromediosEscuela extends javax.swing.JFrame {

    GuardarXML g = new GuardarXML();
    Colegio col = g.cargar();
    DefaultTableModel modeloP;
    ExportarExcel ee = new ExportarExcel();
    double promedio;

    public PromediosEscuela() {
        initComponents();
        modelo();
        setLocationRelativeTo(null);
    }

    public void modelo() {
        String cabecera[] = {"Alumno", "promedio final"};
        String datos[][] = {};
        modeloP = new DefaultTableModel(datos, cabecera);
        JTPromedios.setModel(modeloP);
    }

    public void promediosMetodo() {
        int cant = 1;
        String [] vacio={""};
        for (int i = 0; i < 16; i++) {
            String[] curso = {col.getTCursos()[i].getNivel() + "º " + col.getTCursos()[i].getLetra()};
            modeloP.addRow(curso);
            for (int j = 0; j < 30; j++) {
                for (int k = 0; k < 5; k++) {
                    promedio = (((col.getTCursos()[i].getEstudiante()[j].getAsignatura()[k].getNotas()[0].getNotas())
                        + (col.getTCursos()[i].getEstudiante()[j].getAsignatura()[k].getNotas()[1].getNotas())
                        + (col.getTCursos()[i].getEstudiante()[j].getAsignatura()[k].getNotas()[2].getNotas())
                        + (col.getTCursos()[i].getEstudiante()[j].getAsignatura()[k].getNotas()[3].getNotas())
                        + (col.getTCursos()[i].getEstudiante()[j].getAsignatura()[k].getNotas()[4].getNotas())) / 5)+promedio;
                }
                promedio=promedio/5;
                String promedios[] = {cant + " " + col.getTCursos()[i].getEstudiante()[j].getNombre(),
                    String.valueOf(promedio)};
                cant++;
                modeloP.addRow(promedios);
            }
            modeloP.addRow(vacio);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        JTPromedios = new javax.swing.JTable();
        JBReprobados = new javax.swing.JButton();
        JLVolver = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        JTPromedios.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(JTPromedios);

        JBReprobados.setText("Reprobados");
        JBReprobados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBReprobadosActionPerformed(evt);
            }
        });

        JLVolver.setText("Volver");
        JLVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JLVolverActionPerformed(evt);
            }
        });

        jButton1.setText("Exportar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setText("Promedios en la Escuela");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(JLVolver)
                        .addGap(99, 99, 99)
                        .addComponent(JBReprobados))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton1))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 434, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(42, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JBReprobados)
                    .addComponent(JLVolver))
                .addGap(19, 19, 19))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JLVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JLVolverActionPerformed
        EstudiantesGeneral eg = new EstudiantesGeneral();
        eg.setVisible(true);
        dispose();
    }//GEN-LAST:event_JLVolverActionPerformed

    private void JBReprobadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBReprobadosActionPerformed
        ReprobadosEscuela re = new ReprobadosEscuela();
        re.setVisible(true);
        re.ReprobadosMetodo();
        dispose();
    }//GEN-LAST:event_JBReprobadosActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
         ee.exportar(new File("Promedios Escuela.xls"), JTPromedios);
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
            java.util.logging.Logger.getLogger(PromediosEscuela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PromediosEscuela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PromediosEscuela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PromediosEscuela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PromediosEscuela().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JBReprobados;
    private javax.swing.JButton JLVolver;
    private javax.swing.JTable JTPromedios;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
