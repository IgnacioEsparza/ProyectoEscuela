/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EscuelaVisual;

import EscuelaPackage.Curso;
import EscuelaPackage.Estudiante;
import Generar.ExportarExcel;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Ignacio Esparza
 */
public class EstudiantesPorApoderado extends javax.swing.JFrame {

    DefaultTableModel modelo;
    Estudiante estudiante;
    ExportarExcel ee = new ExportarExcel();

    public EstudiantesPorApoderado() {
        initComponents();
        modelo();
        setLocationRelativeTo(null);
    }

    public void modelo() {
        String cabecera[] = {"Datos", "Matemáticas", "Lenguaje", "Historia", "Inglés", "Ciencias", "Curso"};
        String datos[][] = {};
        modelo = new DefaultTableModel(datos, cabecera);
        JTPupilos.setModel(modelo);

    }

    public void datos(ArrayList<Estudiante> arrayEstudiante/*,ArrayList<Curso> curso*/) {
        int cont = 0;
        for (Estudiante e : arrayEstudiante) {
            String[] nom = {e.getNombre(), "", "", "", "", "",
                String.valueOf(e.getCurso().getNivel()) + "º " + e.getCurso().getLetra()};
            modelo.addRow(nom);
            for (int j = 0; j < 5; j++) {
                String datos[] = {"Nota " + (j + 1), String.valueOf(e.getAsignatura()[0].getNotas()[j].getNotas()),
                    String.valueOf(e.getAsignatura()[1].getNotas()[j].getNotas()),
                    String.valueOf(e.getAsignatura()[2].getNotas()[j].getNotas()),
                    String.valueOf(e.getAsignatura()[3].getNotas()[j].getNotas()),
                    String.valueOf(e.getAsignatura()[4].getNotas()[j].getNotas())};

                modelo.addRow(datos);
            }
            cont++;
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
                String planes[] = {arrayEstudiante.get(0).getCurso().getAsignaturaC()[0].getActividades()[i].getActividad(),
                    arrayEstudiante.get(0).getCurso().getAsignaturaC()[1].getActividades()[i].getActividad(),
                    arrayEstudiante.get(0).getCurso().getAsignaturaC()[2].getActividades()[i].getActividad(),
                    arrayEstudiante.get(0).getCurso().getAsignaturaC()[3].getActividades()[i].getActividad(),
                    arrayEstudiante.get(0).getCurso().getAsignaturaC()[4].getActividades()[i].getActividad()};
                modelo.addRow(planes);
            }
            modelo.addRow(dato1);
        }
        JLAPoderado.setText(arrayEstudiante.get(0).getApoderado().getNombre());
        if (cont == 1) {
            JLCantidad.setText("Tiene " + String.valueOf(cont) + " Pupilo en el colegio");
        } else {
            JLCantidad.setText("Tiene " + String.valueOf(cont) + " Pupilos en el colegio");
        }

        //estudiante = e;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        JTPupilos = new javax.swing.JTable();
        JLAPoderado = new javax.swing.JLabel();
        JLCantidad = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        JTPupilos.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(JTPupilos);

        JLAPoderado.setText("Apoderado");

        JLCantidad.setText("Cantidad de Pupilos");

        jButton1.setText("Volver");
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
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JLAPoderado, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JLCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 420, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(50, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(228, 228, 228))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(JLAPoderado)
                .addGap(18, 18, 18)
                .addComponent(JLCantidad)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1)
                .addGap(13, 13, 13))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        ApoderadosColegioVisual acv = new ApoderadosColegioVisual();
        acv.setVisible(true);
        dispose();
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
            java.util.logging.Logger.getLogger(EstudiantesPorApoderado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EstudiantesPorApoderado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EstudiantesPorApoderado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EstudiantesPorApoderado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EstudiantesPorApoderado().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel JLAPoderado;
    private javax.swing.JLabel JLCantidad;
    private javax.swing.JTable JTPupilos;
    private javax.swing.JButton jButton1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
