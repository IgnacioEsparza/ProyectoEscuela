/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EscuelaVisual.IngresoDatos;

import EscuelaPackage.Curso;
import EscuelaPackage.Estudiante;
import Generar.ExportarExcel;
import java.io.File;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Ignacio
 */
public class Reprobados extends javax.swing.JFrame {

    DefaultTableModel modeloR;
    int pos;
    int materia = -1;
    Curso curso;
    ExportarExcel ee = new ExportarExcel();
    double promedio;
    public Reprobados() {
        initComponents();
        setLocationRelativeTo(null);
        modelo();
    }

    public void modelo() {
        String cabecera[] = {"Alumno", "Promedio"};
        String datos[][] = {};
        modeloR = new DefaultTableModel(datos, cabecera);
        JTVerReprobados.setModel(modeloR);
    }
    public void repMetodos(Curso cursoSel, int posicion) {

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
        ArrayList<Estudiante> arrayestu = new ArrayList();
        for (int i = 0; i < 30; i++) {
            promedio = ((cursoSel.getEstudiante()[i].getAsignatura()[materia].getNotas()[0].getNotas())
                +(cursoSel.getEstudiante()[i].getAsignatura()[materia].getNotas()[1].getNotas())
                +(cursoSel.getEstudiante()[i].getAsignatura()[materia].getNotas()[2].getNotas())
                +(cursoSel.getEstudiante()[i].getAsignatura()[materia].getNotas()[3].getNotas())
                +(cursoSel.getEstudiante()[i].getAsignatura()[materia].getNotas()[4].getNotas()))/5;
            if(promedio<4){
                String promedios[] = {cursoSel.getEstudiante()[i].getNombre(),
                String.valueOf(promedio)};
                modeloR.addRow(promedios);
                cant++;
            }
        }

            
        cantidad.setText("Cantidad de Alumnos "+cant);
        Datos.setText("Materia : " + cursoSel.getProfesor().getAsignaturaP().getMateria()
                + ", Curso : " + cursoSel.getNivel() + "º " + cursoSel.getLetra());
        nomProfe.setText("Profesor Jefe : " + cursoSel.getProfesor().getNombre());
        curso = cursoSel;
        pos = posicion;
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        JTVerReprobados = new javax.swing.JTable();
        ExportarBoton = new javax.swing.JButton();
        nomProfe = new javax.swing.JLabel();
        Datos = new javax.swing.JLabel();
        cantidad = new javax.swing.JLabel();
        Volver = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        JTVerReprobados.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(JTVerReprobados);

        ExportarBoton.setText("Exportar");
        ExportarBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExportarBotonActionPerformed(evt);
            }
        });

        nomProfe.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        nomProfe.setText("Profesor Jefe");

        Datos.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        Datos.setText("Datos");

        cantidad.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cantidad.setText("Cantidad");

        Volver.setText("Volver");
        Volver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VolverActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 551, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(Volver)
                        .addGap(71, 71, 71)
                        .addComponent(cantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(Datos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(nomProfe, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(ExportarBoton)))
                    .addContainerGap()))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(105, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cantidad)
                    .addComponent(Volver))
                .addGap(37, 37, 37))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(Datos)
                    .addGap(18, 18, 18)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(ExportarBoton)
                        .addComponent(nomProfe))
                    .addContainerGap(350, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ExportarBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExportarBotonActionPerformed
        ee.exportar(new File("Reprobados " + curso.getNivel() + " " + curso.getLetra() + ".xls"), JTVerReprobados);
    }//GEN-LAST:event_ExportarBotonActionPerformed

    private void VolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VolverActionPerformed
        VerPromedios vp = new VerPromedios();
        vp.promediosMetodo(curso, pos);
        vp.setVisible(true);
        dispose();
    }//GEN-LAST:event_VolverActionPerformed

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
            java.util.logging.Logger.getLogger(Reprobados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Reprobados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Reprobados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Reprobados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Reprobados().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Datos;
    private javax.swing.JButton ExportarBoton;
    private javax.swing.JTable JTVerReprobados;
    private javax.swing.JButton Volver;
    private javax.swing.JLabel cantidad;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel nomProfe;
    // End of variables declaration//GEN-END:variables
}
