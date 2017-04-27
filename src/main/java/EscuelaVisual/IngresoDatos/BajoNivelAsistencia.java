/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EscuelaVisual.IngresoDatos;

import EscuelaPackage.Curso;
import EscuelaPackage.Estudiante;
import Generar.ExportarExcel;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Ignacio Esparza
 */
public class BajoNivelAsistencia extends javax.swing.JFrame {

    DefaultTableModel modeloBNA;
    int pos;
    int materia = -1;
    Curso curso;
    ExportarExcel ee = new ExportarExcel();

    public BajoNivelAsistencia() {
        initComponents();
        modelo();
        setLocationRelativeTo(null);
    }

    public void modelo() {
        String cabecera[] = {"Alumno", "% Asistencias"};
        String datos[][] = {};
        modeloBNA = new DefaultTableModel(datos, cabecera);
        JTBNAsist.setModel(modeloBNA);
    }

    public void BNAMetodo(Curso cursoSel, int posicion, int porcentaje) {

        if (cursoSel.getProfesor().getAsignaturaP().getMateria().equals("Matemáticas")) {
            materia = 0;
        }
        if (cursoSel.getProfesor().getAsignaturaP().getMateria().equals("Lenguaje")) {
            materia = 1;
        }
        if (cursoSel.getProfesor().getAsignaturaP().getMateria().equals("Historia")) {
            materia = 2;
        }
        if (cursoSel.getProfesor().getAsignaturaP().getMateria().equals("Inglés")) {
            materia = 3;
        }
        if (cursoSel.getProfesor().getAsignaturaP().getMateria().equals("Ciencias")) {
            materia = 4;
        }
        int cant=0;
        double pAsist;
        ArrayList<Estudiante> arrayestu = new ArrayList();
        for (int i = 0; i < 30; i++) {
            pAsist = ((cursoSel.getEstudiante()[i].getAsistencia()) * 100) / 180;
            if (pAsist < porcentaje) {
                arrayestu.add(cursoSel.getEstudiante()[i]);
                String promedios[] = {cursoSel.getEstudiante()[i].getNombre(),
                    String.valueOf(pAsist) + "%"};
                modeloBNA.addRow(promedios);
                cant++;
            }
        }
        cantidad.setText("Hay "+cant+" Alumnos con menos de "+porcentaje+"%");
        datoslabel.setText("Materia : " + cursoSel.getProfesor().getAsignaturaP().getMateria()
                + ", Curso : " + cursoSel.getNivel() + "º " + cursoSel.getLetra());
        cursolabel.setText("Profesor Jefe : " + cursoSel.getProfesor().getNombre());
        curso = cursoSel;
        pos = posicion;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        JTBNAsist = new javax.swing.JTable();
        exportarboton = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        datoslabel = new javax.swing.JLabel();
        cursolabel = new javax.swing.JLabel();
        cantidad = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        JTBNAsist.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(JTBNAsist);

        exportarboton.setText("Exportar");

        jButton2.setText("Volver");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        datoslabel.setText("Datos");

        cursolabel.setText("Curso");

        cantidad.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cantidad.setText("Cantidad");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 573, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(cursolabel, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(datoslabel, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(exportarboton))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jButton2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(exportarboton)
                    .addComponent(datoslabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cursolabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(cantidad))
                .addGap(39, 39, 39))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        VerAsistencias va = new VerAsistencias();
        va.asistenciasMetodo(curso, pos);
        va.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(BajoNivelAsistencia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BajoNivelAsistencia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BajoNivelAsistencia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BajoNivelAsistencia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BajoNivelAsistencia().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable JTBNAsist;
    private javax.swing.JLabel cantidad;
    private javax.swing.JLabel cursolabel;
    private javax.swing.JLabel datoslabel;
    private javax.swing.JButton exportarboton;
    private javax.swing.JButton jButton2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
