/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EscuelaVisual.IngresoDatos;

import EscuelaPackage.Curso;
import EscuelaVisual.OpcionesCurso;
import Generar.ExportarExcel;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.io.File;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Ignacio
 */
public class VerAsistencias extends javax.swing.JFrame {

    DefaultTableModel modeloA;
    int pos;
    int materia = -1;
    Curso curso;
    ExportarExcel ee = new ExportarExcel();
    int porcentaje = 8;

    public VerAsistencias() {
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

    public void asistenciasMetodo(Curso cursoSel, int posicion) {

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
        double pAsist;
        for (int i = 0; i < 30; i++) {
            pAsist = ((cursoSel.getEstudiante()[i].getAsistencia()) * 100) / 180;
            String promedios[] = {cursoSel.getEstudiante()[i].getNombre(),
                String.valueOf(pAsist) + "%"};
            modeloA.addRow(promedios);
        }

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
        JTAsistencias = new javax.swing.JTable();
        VolverVAsistBoton = new javax.swing.JButton();
        Datos = new javax.swing.JLabel();
        nomProfe = new javax.swing.JLabel();
        ExportarBoton = new javax.swing.JButton();
        verboton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        InasisBoton = new javax.swing.JButton();
        PorSelect = new javax.swing.JTextField();

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

        VolverVAsistBoton.setText("Volver");
        VolverVAsistBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VolverVAsistBotonActionPerformed(evt);
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

        verboton.setText("Ver");
        verboton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                verbotonActionPerformed(evt);
            }
        });

        jLabel1.setText("Estudiante con bajo nivel de asistencia");

        InasisBoton.setText("Ingresar Asistencias");
        InasisBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InasisBotonActionPerformed(evt);
            }
        });

        PorSelect.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        PorSelect.setText("%");
        PorSelect.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PorSelectActionPerformed(evt);
            }
        });
        PorSelect.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                PorSelectKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 641, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Datos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(nomProfe)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(InasisBoton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(ExportarBoton))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(VolverVAsistBoton)
                                .addGap(68, 68, 68)
                                .addComponent(PorSelect, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(verboton)
                                .addGap(67, 67, 67))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(14, 14, 14)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Datos)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(nomProfe))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ExportarBoton)
                            .addComponent(InasisBoton))))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 226, Short.MAX_VALUE)
                .addGap(5, 5, 5)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(VolverVAsistBoton)
                    .addComponent(verboton)
                    .addComponent(PorSelect, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ExportarBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExportarBotonActionPerformed
        ee.exportar(new File("Asistencias " + curso.getNivel() + " " + curso.getLetra() + ".xls"), JTAsistencias);
    }//GEN-LAST:event_ExportarBotonActionPerformed

    private void VolverVAsistBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VolverVAsistBotonActionPerformed
        OpcionesCurso oc = new OpcionesCurso();
        oc.SelectCurso(curso, pos);
        oc.setVisible(true);
        dispose();
    }//GEN-LAST:event_VolverVAsistBotonActionPerformed

    private void verbotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_verbotonActionPerformed
        BajoNivelAsistencia bna = new BajoNivelAsistencia();
        bna.BNAMetodo(curso, pos, porcentaje * 10);
        bna.setVisible(true);
        dispose();

    }//GEN-LAST:event_verbotonActionPerformed

    private void InasisBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InasisBotonActionPerformed
        IngAsistencias ia = new IngAsistencias();
        ia.asistenciasMetodo(curso, pos);
        ia.setVisible(true);
        dispose();
    }//GEN-LAST:event_InasisBotonActionPerformed

    private void PorSelectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PorSelectActionPerformed

    }//GEN-LAST:event_PorSelectActionPerformed

    private void PorSelectKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_PorSelectKeyTyped
        try {
            if (PorSelect.getText().length() >= 3) {
                evt.consume();
            }
            SNumeros(PorSelect);
            porcentaje = Integer.parseInt(PorSelect.getText());
        } catch (Exception e) {
        }
    }//GEN-LAST:event_PorSelectKeyTyped

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
            java.util.logging.Logger.getLogger(VerAsistencias.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VerAsistencias.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VerAsistencias.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VerAsistencias.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VerAsistencias().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Datos;
    private javax.swing.JButton ExportarBoton;
    private javax.swing.JButton InasisBoton;
    private javax.swing.JTable JTAsistencias;
    private javax.swing.JTextField PorSelect;
    private javax.swing.JButton VolverVAsistBoton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel nomProfe;
    private javax.swing.JButton verboton;
    // End of variables declaration//GEN-END:variables
}
