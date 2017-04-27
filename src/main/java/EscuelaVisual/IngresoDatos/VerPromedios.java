/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EscuelaVisual.IngresoDatos;

import EscuelaPackage.Colegio;
import EscuelaPackage.Curso;
import EscuelaVisual.OpcionesCurso;
import Generar.ExportarExcel;
import Generar.GuardarXML;
import java.io.File;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Ignacio
 */
public class VerPromedios extends javax.swing.JFrame {

    DefaultTableModel modeloP;
    int pos;
    int materia = -1;
    Curso curso;
    ExportarExcel ee = new ExportarExcel();
    double promedio;

    public VerPromedios() {
        initComponents();
        setLocationRelativeTo(null);
        modelo();
    }

    public void modelo() {
        String cabecera[] = {"Alumno", "Promedio Notas"};
        String datos[][] = {};
        modeloP = new DefaultTableModel(datos, cabecera);
        JTVerPromedios.setModel(modeloP);
    }
    
    public void promediosMetodo(Curso cursoSel, int posicion) {

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
        for (int i = 0; i < 10; i++) {
            cursoSel.getEstudiante()[i].getAsignatura()[materia].getNotas()[0].getNotas();
        }
        
        for (int i = 0; i < 30; i++) {
            promedio = ((cursoSel.getEstudiante()[i].getAsignatura()[materia].getNotas()[0].getNotas())
                +(cursoSel.getEstudiante()[i].getAsignatura()[materia].getNotas()[1].getNotas())
                +(cursoSel.getEstudiante()[i].getAsignatura()[materia].getNotas()[2].getNotas())
                +(cursoSel.getEstudiante()[i].getAsignatura()[materia].getNotas()[3].getNotas())
                +(cursoSel.getEstudiante()[i].getAsignatura()[materia].getNotas()[4].getNotas()))/5;
            String promedios[] = {cursoSel.getEstudiante()[i].getNombre(),
                String.valueOf(promedio)};

            modeloP.addRow(promedios);
        }
        Datos.setText("Materia : " + cursoSel.getProfesor().getAsignaturaP().getMateria()+
                ", Curso : "+cursoSel.getNivel()+"º "+cursoSel.getLetra());
        nomProfe.setText("Profesor Jefe : "+cursoSel.getProfesor().getNombre());
        curso = cursoSel;
        pos = posicion;
    }
    public double getPromedio(){
        return promedio;
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        JTVerPromedios = new javax.swing.JTable();
        VolverVPromedios = new javax.swing.JButton();
        Datos = new javax.swing.JLabel();
        nomProfe = new javax.swing.JLabel();
        ExportarBoton = new javax.swing.JButton();
        reprobados = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        JTVerPromedios.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(JTVerPromedios);

        VolverVPromedios.setText("Volver");
        VolverVPromedios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VolverVPromediosActionPerformed(evt);
            }
        });

        Datos.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        Datos.setText("Datos");

        nomProfe.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        nomProfe.setText("Profesor Jefe");

        ExportarBoton.setText("Exportar");
        ExportarBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExportarBotonActionPerformed(evt);
            }
        });

        reprobados.setText("Reprobados");
        reprobados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reprobadosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 563, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Datos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(nomProfe, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(ExportarBoton))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(245, 245, 245)
                        .addComponent(VolverVPromedios)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(reprobados)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Datos)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ExportarBoton)
                    .addComponent(nomProfe))
                .addGap(26, 26, 26)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(VolverVPromedios)
                    .addComponent(reprobados))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void VolverVPromediosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VolverVPromediosActionPerformed
        OpcionesCurso oc = new OpcionesCurso();
        oc.SelectCurso(curso, pos);
        oc.setVisible(true);
        dispose();
    }//GEN-LAST:event_VolverVPromediosActionPerformed

    private void ExportarBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExportarBotonActionPerformed
        ee.exportar(new File("Promedios "+curso.getNivel() +" "+ curso.getLetra()+".xls"), JTVerPromedios);
    }//GEN-LAST:event_ExportarBotonActionPerformed

    private void reprobadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reprobadosActionPerformed
        Reprobados r = new Reprobados();
        r.repMetodos(curso, pos);
        r.setVisible(true);
        dispose();
    }//GEN-LAST:event_reprobadosActionPerformed

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
            java.util.logging.Logger.getLogger(VerPromedios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VerPromedios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VerPromedios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VerPromedios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VerPromedios().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Datos;
    private javax.swing.JButton ExportarBoton;
    private javax.swing.JTable JTVerPromedios;
    private javax.swing.JButton VolverVPromedios;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel nomProfe;
    private javax.swing.JButton reprobados;
    // End of variables declaration//GEN-END:variables
}
