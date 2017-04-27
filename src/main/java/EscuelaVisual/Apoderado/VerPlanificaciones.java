/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EscuelaVisual.Apoderado;

import EscuelaPackage.Curso;
import EscuelaPackage.Estudiante;
import Generar.ExportarExcel;
import java.io.File;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Ignacio Esparza
 */
public class VerPlanificaciones extends javax.swing.JFrame {

    DefaultTableModel modeloVP;
    Estudiante estudiante;
    Curso curso;
    ExportarExcel EE = new ExportarExcel();

    public VerPlanificaciones() {
        initComponents();
        modelo();
        setLocationRelativeTo(null);
    }

    public void modelo() {
        String cabecera[] = {"Matematicas", "Lenguaje", "Historia", "Inglés", "Ciencias"};
        String datos[][] = {};
        modeloVP = new DefaultTableModel(datos, cabecera);
        JTVPlanAPoderado.setModel(modeloVP);

    }

    public void datos(Estudiante e, Curso c) {
        for (int i = 0; i < 10; i++) {
            String planes[] = {c.getAsignaturaC()[0].getActividades()[i].getActividad(),
                c.getAsignaturaC()[1].getActividades()[i].getActividad(),
                c.getAsignaturaC()[2].getActividades()[i].getActividad(),
                c.getAsignaturaC()[3].getActividades()[i].getActividad(),
                c.getAsignaturaC()[4].getActividades()[i].getActividad()};
            modeloVP.addRow(planes);
        }

        nomAlumno.setText(e.getNombre() + " Curso : " + c.getNivel() + " " + c.getLetra());
        estudiante = e;
        curso = c;
        System.out.println(estudiante.getNombre());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        JTVPlanAPoderado = new javax.swing.JTable();
        ExportarVP = new javax.swing.JButton();
        VolverVP = new javax.swing.JButton();
        nomAlumno = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        JTVPlanAPoderado.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        JTVPlanAPoderado.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(JTVPlanAPoderado);

        ExportarVP.setText("Exportar");
        ExportarVP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExportarVPActionPerformed(evt);
            }
        });

        VolverVP.setText("Volver");
        VolverVP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VolverVPActionPerformed(evt);
            }
        });

        nomAlumno.setText("Alumno");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(VolverVP)
                .addGap(286, 286, 286))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(nomAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, 442, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 106, Short.MAX_VALUE)
                .addComponent(ExportarVP)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ExportarVP)
                    .addComponent(nomAlumno))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 68, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(VolverVP)
                .addGap(12, 12, 12))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ExportarVPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExportarVPActionPerformed
        EE.exportar(new File("Planificaciones "+estudiante.getNombre()+".xls"), JTVPlanAPoderado);
    }//GEN-LAST:event_ExportarVPActionPerformed

    private void VolverVPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VolverVPActionPerformed
       TablaRegistro tr = new TablaRegistro();
       tr.datos(estudiante, curso);
       tr.setVisible(true);
       dispose();
    }//GEN-LAST:event_VolverVPActionPerformed

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
            java.util.logging.Logger.getLogger(VerPlanificaciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VerPlanificaciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VerPlanificaciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VerPlanificaciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VerPlanificaciones().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ExportarVP;
    private javax.swing.JTable JTVPlanAPoderado;
    private javax.swing.JButton VolverVP;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel nomAlumno;
    // End of variables declaration//GEN-END:variables
}
