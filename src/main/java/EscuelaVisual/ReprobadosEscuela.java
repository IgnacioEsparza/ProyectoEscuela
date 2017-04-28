/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EscuelaVisual;

import EscuelaPackage.Colegio;
import Generar.ExportarExcel;
import Generar.GuardarXML;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Ignacio Esparza
 */
public class ReprobadosEscuela extends javax.swing.JFrame {

    GuardarXML g = new GuardarXML();
    DefaultTableModel modeloR;
    Colegio col = g.cargar();
    ExportarExcel ee = new ExportarExcel();
    double promedio;

    public ReprobadosEscuela() {
        initComponents();
        setTitle("Reprobados");
        modelo();
        setLocationRelativeTo(null);
    }

    public void modelo() {
        String cabecera[] = {"Alumno Reprobado", "Promedio Notas"};
        String datos[][] = {};
        modeloR = new DefaultTableModel(datos, cabecera);
        JTReprobadosE.setModel(modeloR);
    }

    public void ReprobadosMetodo() {
        int cant = 1;
        String [] vacio={""};
        for (int i = 0; i < 16; i++) {
            String[] curso = {col.getTCursos()[i].getNivel() + "º " + col.getTCursos()[i].getLetra()};
            modeloR.addRow(curso);
            for (int j = 0; j < 30; j++) {
                for (int k = 0; k < 5; k++) {
                    promedio = (((col.getTCursos()[i].getEstudiante()[j].getAsignatura()[k].getNotas()[0].getNotas())
                        + (col.getTCursos()[i].getEstudiante()[j].getAsignatura()[k].getNotas()[1].getNotas())
                        + (col.getTCursos()[i].getEstudiante()[j].getAsignatura()[k].getNotas()[2].getNotas())
                        + (col.getTCursos()[i].getEstudiante()[j].getAsignatura()[k].getNotas()[3].getNotas())
                        + (col.getTCursos()[i].getEstudiante()[j].getAsignatura()[k].getNotas()[4].getNotas())) / 5)+promedio;
                }
                promedio=promedio/5;
                
                if(promedio<4){
                String promedios[] = {cant + " " + col.getTCursos()[i].getEstudiante()[j].getNombre(),
                    String.valueOf(promedio)};
                modeloR.addRow(promedios);
                cant++;
            }
            }
            modeloR.addRow(vacio);
        }
        JLCantidad.setText("Hay "+String.valueOf(cant-1)+" Reprobados");
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        JTReprobadosE = new javax.swing.JTable();
        JTBVolver = new javax.swing.JButton();
        JLCantidad = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        JTReprobadosE.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(JTReprobadosE);

        JTBVolver.setText("Volver");
        JTBVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTBVolverActionPerformed(evt);
            }
        });

        JLCantidad.setText("Cantidad");

        jLabel2.setText("Reprobados de la Escuela");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 520, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(JTBVolver)
                        .addGap(40, 40, 40)
                        .addComponent(JLCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JTBVolver)
                    .addComponent(JLCantidad))
                .addGap(26, 26, 26))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JTBVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTBVolverActionPerformed
        PromediosEscuela pe = new PromediosEscuela();
        pe.setVisible(true);
        pe.promediosMetodo();
        dispose();
    }//GEN-LAST:event_JTBVolverActionPerformed

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
            java.util.logging.Logger.getLogger(ReprobadosEscuela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ReprobadosEscuela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ReprobadosEscuela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ReprobadosEscuela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ReprobadosEscuela().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel JLCantidad;
    private javax.swing.JButton JTBVolver;
    private javax.swing.JTable JTReprobadosE;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
