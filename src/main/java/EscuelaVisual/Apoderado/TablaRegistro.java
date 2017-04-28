/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EscuelaVisual.Apoderado;

import EscuelaPackage.Curso;
import EscuelaPackage.Estudiante;
import EscuelaVisual.InfoCurso;
import EscuelaVisual.SelectCursos;
import EscuelaVisual.SelectProfesor;
import Generar.ExportarExcel;
import java.io.File;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Ignacio Esparza
 */
public class TablaRegistro extends javax.swing.JFrame {

    DefaultTableModel modelo;
    Estudiante estudiante;
    Curso curso;
    ExportarExcel ee = new ExportarExcel();

    public TablaRegistro() {
        initComponents();
        setLocationRelativeTo(null);
        modelo();
    }

    public void modelo() {
        String cabecera[] = {"Materias", "Prueba 1", "Revisión 1", "Prueba 2", "Revisión 2", "Prueba 3"};
        String datos[][] = {};
        modelo = new DefaultTableModel(datos, cabecera);
        TablaDatos.setModel(modelo);

    }

    public void datos(Estudiante e, Curso c) {
        for (int i = 0; i < 5; i++) {

            String datosMate[] = {e.getAsignatura()[i].getMateria(),
                String.valueOf(e.getAsignatura()[i].getNotas()[0].getNotas()),
                String.valueOf(e.getAsignatura()[i].getNotas()[1].getNotas()),
                String.valueOf(e.getAsignatura()[i].getNotas()[2].getNotas()),
                String.valueOf(e.getAsignatura()[i].getNotas()[3].getNotas()),
                String.valueOf(e.getAsignatura()[i].getNotas()[4].getNotas())};

            modelo.addRow(datosMate);
        }

        String[] dato1 = {};
        String[] dato2 = {"Anotaciones"};
        String anotaciones = e.getAnotaciones();
        modelo.addRow(dato1);
        modelo.addRow(dato2);
        try {
            String[] aSplit = anotaciones.split(";");
            modelo.addRow(aSplit);
        } catch (Exception ex) {
        }

        modelo.addRow(dato1);
        String[] plan = {"Planificaciones"};
        modelo.addRow(plan);
        String[] mate = {"Matematicas", "Lenguaje", "Historia", "Inglés", "Ciencias"};
        modelo.addRow(mate);
        for (int i = 0; i < 10; i++) {
            String planes[] = {c.getAsignaturaC()[0].getActividades()[i].getActividad(),
                c.getAsignaturaC()[1].getActividades()[i].getActividad(),
                c.getAsignaturaC()[2].getActividades()[i].getActividad(),
                c.getAsignaturaC()[3].getActividades()[i].getActividad(),
                c.getAsignaturaC()[4].getActividades()[i].getActividad()};
            modelo.addRow(planes);
        }

        nomEstudiante.setText(e.getNombre());
        estudiante = e;
        curso = c;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        TablaDatos = new javax.swing.JTable();
        GenerarReporte = new javax.swing.JButton();
        Volver = new javax.swing.JButton();
        nomEstudiante = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        EstadoExpo = new javax.swing.JLabel();
        ExportarPlan = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Datos Alumno");

        TablaDatos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Materias", "Prueba1", "Revición 1", "Prueba 2", "Revision 2", "Prueba 3"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        TablaDatos.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(TablaDatos);
        if (TablaDatos.getColumnModel().getColumnCount() > 0) {
            TablaDatos.getColumnModel().getColumn(0).setResizable(false);
            TablaDatos.getColumnModel().getColumn(1).setResizable(false);
            TablaDatos.getColumnModel().getColumn(2).setResizable(false);
            TablaDatos.getColumnModel().getColumn(3).setResizable(false);
            TablaDatos.getColumnModel().getColumn(4).setResizable(false);
            TablaDatos.getColumnModel().getColumn(5).setResizable(false);
        }

        GenerarReporte.setText("Exportar");
        GenerarReporte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GenerarReporteActionPerformed(evt);
            }
        });

        Volver.setText("Volver");
        Volver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VolverActionPerformed(evt);
            }
        });

        nomEstudiante.setText("Estudiante");

        jButton1.setText("Salir");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        EstadoExpo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        EstadoExpo.setText("Estado Exportacion");

        ExportarPlan.setText("Exportar Sólo Planificaciones");
        ExportarPlan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExportarPlanActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(EstadoExpo, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Volver)
                .addGap(24, 24, 24))
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 548, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(GenerarReporte)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(ExportarPlan))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(nomEstudiante, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(nomEstudiante)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(GenerarReporte)
                    .addComponent(ExportarPlan))
                .addGap(33, 33, 33)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(76, 76, 76)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Volver)
                    .addComponent(jButton1)
                    .addComponent(EstadoExpo))
                .addGap(19, 19, 19))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void GenerarReporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GenerarReporteActionPerformed
        ee.exportar(new File(estudiante.getNombre() + ".xls"), TablaDatos);
        EstadoExpo.setText("Exportado con Éxito");
    }//GEN-LAST:event_GenerarReporteActionPerformed

    private void VolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VolverActionPerformed
        InfoCurso ic = new InfoCurso();
        ic.llenadoInfoCurso(curso);
        ic.setVisible(true);
        dispose();
    }//GEN-LAST:event_VolverActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void ExportarPlanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExportarPlanActionPerformed
        VerPlanificaciones vp = new VerPlanificaciones();
        vp.datos(estudiante, curso);
        vp.setVisible(true);
        dispose();
    }//GEN-LAST:event_ExportarPlanActionPerformed

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
            java.util.logging.Logger.getLogger(TablaRegistro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TablaRegistro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TablaRegistro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TablaRegistro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TablaRegistro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel EstadoExpo;
    private javax.swing.JButton ExportarPlan;
    public javax.swing.JButton GenerarReporte;
    public javax.swing.JTable TablaDatos;
    private javax.swing.JButton Volver;
    private javax.swing.JButton jButton1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel nomEstudiante;
    // End of variables declaration//GEN-END:variables
}
