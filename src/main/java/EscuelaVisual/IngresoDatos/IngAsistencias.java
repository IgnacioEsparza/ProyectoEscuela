/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EscuelaVisual.IngresoDatos;

import EscuelaPackage.Colegio;
import EscuelaPackage.Curso;
import Generar.GuardarXML;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import javax.xml.bind.JAXBException;

/**
 *
 * @author Ignacio
 */
public class IngAsistencias extends javax.swing.JFrame {

    DefaultTableModel modeloA;
    GuardarXML gx = new GuardarXML();
    Colegio college = gx.cargar();
    int pos;
    int materia = -1;
    Curso curso;

    public IngAsistencias() {
        initComponents();
        modelo();
        setLocationRelativeTo(null);
    }

    public void modelo() {
        String cabecera[] = {"Alumno", "Dia 1", "Dia 2", "Dia 3", "Dia 4", "Dia 5", "Dia 6",
            "Dia 7", "Dia 8", "Dia 9", "Dia 10", "Dia 11", "Dia 12", "Dia 13", "Dia 14", "Dia 15",
            "Dia 16", "Dia 17", "Dia 18", "Dia 19", "Dia 20", "Dia 21", "Dia 22", "Dia 23", "Dia 24",
            "Dia 25", "Dia 26", "Dia 27", "Dia 28", "Dia 29", "Dia 30"};
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

        for (int i = 0; i < 30; i++) {
            String ingasis[] = {cursoSel.getEstudiante()[i].getNombre(), "", "",
                "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "",
                "", "", "", "", "", "", "", "", "", "", ""};
            modeloA.addRow(ingasis);
        }

        AsisLabel.setText("Materia : " + cursoSel.getProfesor().getAsignaturaP().getMateria()
                + ", Curso : " + cursoSel.getNivel() + "º " + cursoSel.getLetra());
        NomProfe.setText("Profesor Jefe : " + cursoSel.getProfesor().getNombre());
        curso = cursoSel;
        pos = posicion;
    }

    public void GuardarAnotacion() throws JAXBException, FileNotFoundException {
        String datos[]= new String[30];
        for (int i = 0; i < 30; i++) {
            datos[i]=(String)JTAsistencias.getValueAt(0, i);
        }
        System.out.println(Arrays.toString(datos));

        //gx.guardar(college);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        AsisLabel = new javax.swing.JLabel();
        GuardarAnBoton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        JTAsistencias = new javax.swing.JTable();
        Volver1Boton = new javax.swing.JButton();
        NomProfe = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        AsisLabel.setText("Asistencias");

        GuardarAnBoton.setText("Guardar");
        GuardarAnBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GuardarAnBotonActionPerformed(evt);
            }
        });

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

        Volver1Boton.setText("Volver");
        Volver1Boton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Volver1BotonActionPerformed(evt);
            }
        });

        NomProfe.setText("Profesor Jefe");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(NomProfe, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 605, Short.MAX_VALUE)
                    .addComponent(AsisLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Volver1Boton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(GuardarAnBoton)
                .addContainerGap())
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(GuardarAnBoton)
                        .addComponent(Volver1Boton))
                    .addComponent(AsisLabel))
                .addGap(18, 18, 18)
                .addComponent(NomProfe)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void GuardarAnBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GuardarAnBotonActionPerformed
        try {
            GuardarAnotacion();
        } catch (JAXBException ex) {
            Logger.getLogger(IngAnotaciones.class.getName()).log(Level.SEVERE, null, ex);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(IngAnotaciones.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_GuardarAnBotonActionPerformed

    private void Volver1BotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Volver1BotonActionPerformed
        VerAsistencias va = new VerAsistencias();
        va.asistenciasMetodo(college.getTCursos()[pos], pos);
        va.setVisible(true);
        dispose();
    }//GEN-LAST:event_Volver1BotonActionPerformed

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
            java.util.logging.Logger.getLogger(IngAsistencias.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(IngAsistencias.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(IngAsistencias.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(IngAsistencias.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new IngAsistencias().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AsisLabel;
    private javax.swing.JButton GuardarAnBoton;
    private javax.swing.JTable JTAsistencias;
    private javax.swing.JLabel NomProfe;
    private javax.swing.JButton Volver1Boton;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
