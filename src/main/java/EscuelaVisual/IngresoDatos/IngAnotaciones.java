/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EscuelaVisual.IngresoDatos;

import EscuelaPackage.Colegio;
import EscuelaPackage.Curso;
import EscuelaVisual.OpcionesCurso;
import Generar.GuardarXML;
import java.io.FileNotFoundException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import javax.xml.bind.JAXBException;

/**
 *
 * @author Ignacio
 */
public class IngAnotaciones extends javax.swing.JFrame {

    DefaultTableModel modeloA;
    GuardarXML gx = new GuardarXML();
    Colegio college = gx.cargar();
    int pos;
    int materia = -1;
    Curso curso;

    public IngAnotaciones() {
        initComponents();
        setLocationRelativeTo(null);
        modelo();
        setTitle("Anotaciones");
    }

    public void modelo() {
        String cabecera[] = {"Alumno", "Anotacion"};
        String datos[][] = {};
        modeloA = new DefaultTableModel(datos, cabecera);
        JTAnotaciones.setModel(modeloA);

    }

    public void anotaciones(Curso cursoSel, int posicion) {

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
            String datosMate[] = {cursoSel.getEstudiante()[i].getNombre(),
                cursoSel.getEstudiante()[i].getAnotaciones()};

            modeloA.addRow(datosMate);
        }
        AnLabel.setText("Materia : " + cursoSel.getProfesor().getAsignaturaP().getMateria()+
                ", Curso : "+cursoSel.getNivel()+"º "+cursoSel.getLetra());
        NomProfe.setText("Profesor Jefe : "+cursoSel.getProfesor().getNombre());
        curso = cursoSel;
        pos = posicion;
    }

    public void GuardarAnotacion() throws JAXBException, FileNotFoundException {

        if (JTAnotaciones.getSelectedRows().length == 1) {
            college.getTCursos()[pos].getEstudiante()[JTAnotaciones.getSelectedRow()].setAnotaciones(
                    (String) JTAnotaciones.getValueAt(JTAnotaciones.getSelectedRow(), 1));
        } else {
            for (int i = 0; i < JTAnotaciones.getSelectedRows().length; i++) {
                  college.getTCursos()[pos].getEstudiante()[JTAnotaciones.getSelectedRows()[i]].setAnotaciones(
                    (String) JTAnotaciones.getValueAt(JTAnotaciones.getSelectedRows()[i], 1));
            }
          
        }

        gx.guardar(college);
        /*System.out.println("Fila " + JTAnotaciones.getSelectedRow()
                + "\nSeleccionadas" + Arrays.toString(JTAnotaciones.getSelectedRows()));*/
        System.out.println("Éxito");

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        AnLabel = new javax.swing.JLabel();
        GuardarAnBoton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        JTAnotaciones = new javax.swing.JTable();
        Volver1Boton = new javax.swing.JButton();
        NomProfe = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        AnLabel.setText("Anotaciones");

        GuardarAnBoton.setText("Guardar");
        GuardarAnBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GuardarAnBotonActionPerformed(evt);
            }
        });

        JTAnotaciones.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(JTAnotaciones);

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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 489, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(NomProfe, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(AnLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Volver1Boton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(GuardarAnBoton)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(GuardarAnBoton)
                        .addComponent(Volver1Boton))
                    .addComponent(AnLabel))
                .addGap(18, 18, 18)
                .addComponent(NomProfe)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Volver1BotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Volver1BotonActionPerformed
        OpcionesCurso oc = new OpcionesCurso();
        oc.SelectCurso(college.getTCursos()[pos], pos);
        oc.setVisible(true);
        dispose();
    }//GEN-LAST:event_Volver1BotonActionPerformed

    private void GuardarAnBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GuardarAnBotonActionPerformed
        try {
            GuardarAnotacion();
        } catch (JAXBException ex) {
            Logger.getLogger(IngAnotaciones.class.getName()).log(Level.SEVERE, null, ex);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(IngAnotaciones.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_GuardarAnBotonActionPerformed

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
            java.util.logging.Logger.getLogger(IngAnotaciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(IngAnotaciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(IngAnotaciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(IngAnotaciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new IngAnotaciones().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AnLabel;
    private javax.swing.JButton GuardarAnBoton;
    private javax.swing.JTable JTAnotaciones;
    private javax.swing.JLabel NomProfe;
    private javax.swing.JButton Volver1Boton;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
