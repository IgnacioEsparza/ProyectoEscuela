/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EscuelaVisual.IngresoDatos;

import EscuelaPackage.Colegio;
import EscuelaPackage.Curso;
import EscuelaPackage.Notas;
import EscuelaVisual.OpcionesCurso;
import Generar.ExportarExcel;
import Generar.GuardarXML;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import javax.xml.bind.JAXBException;

/**
 *
 * @author Ignacio
 */
public class IngNotas extends javax.swing.JFrame {

    DefaultTableModel modeloN;
    GuardarXML gx = new GuardarXML();
    Colegio college = gx.cargar();
    int pos;
    int materia = -1;
    Curso curso;
    ExportarExcel ee = new ExportarExcel();

    public IngNotas() {
        initComponents();
        setLocationRelativeTo(null);
        modelo();
    }

    public void modelo() {
        String cabecera[] = {"Alumno", "Nota 1", "Nota 2", "Nota 3", "Nota 4", "Nota 5"};
        String datos[][] = {};
        modeloN = new DefaultTableModel(datos, cabecera);
        JTNotas.setModel(modeloN);
    }

    public void notas(Curso cursoSel, int posicion) {

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
            String Notas[] = {cursoSel.getEstudiante()[i].getNombre(),
                String.valueOf(cursoSel.getEstudiante()[i].getAsignatura()[materia].getNotas()[0].getNotas()),
                String.valueOf(cursoSel.getEstudiante()[i].getAsignatura()[materia].getNotas()[1].getNotas()),
                String.valueOf(cursoSel.getEstudiante()[i].getAsignatura()[materia].getNotas()[2].getNotas()),
                String.valueOf(cursoSel.getEstudiante()[i].getAsignatura()[materia].getNotas()[3].getNotas()),
                String.valueOf(cursoSel.getEstudiante()[i].getAsignatura()[materia].getNotas()[4].getNotas())};

            modeloN.addRow(Notas);
        }
        MateriaJLabel.setText("Materia : " + cursoSel.getProfesor().getAsignaturaP().getMateria());
        curso = cursoSel;
        pos = posicion;
    }

    public void GuardarNotas() throws JAXBException, FileNotFoundException {
        college.getTCursos()[pos].getEstudiante()[JTNotas.getSelectedRow()].getAsignatura()[materia].getNotas()[JTNotas.getSelectedColumn()-1].setNotas(
                Double.parseDouble((String) JTNotas.getValueAt(JTNotas.getSelectedRow(), JTNotas.getSelectedColumn())));
        
        //System.out.println("Nota "+(String) JTNotas.getValueAt(JTNotas.getSelectedRow(), JTNotas.getSelectedColumn()));        
       
        gx.guardar(college);
        System.out.println("Éxito");

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        JTNotas = new javax.swing.JTable();
        MateriaJLabel = new javax.swing.JLabel();
        GNotasBoton = new javax.swing.JButton();
        VolverBoton1 = new javax.swing.JButton();
        ExportarBoton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        JTNotas.setModel(new javax.swing.table.DefaultTableModel(
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
        JTNotas.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(JTNotas);

        MateriaJLabel.setText("Ingresar Notas ");

        GNotasBoton.setText("Guardar");
        GNotasBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GNotasBotonActionPerformed(evt);
            }
        });

        VolverBoton1.setText("Volver");
        VolverBoton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VolverBoton1ActionPerformed(evt);
            }
        });

        ExportarBoton.setText("Exportar");
        ExportarBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExportarBotonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(MateriaJLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(ExportarBoton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(GNotasBoton)
                .addGap(25, 25, 25))
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 642, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(280, 280, 280)
                .addComponent(VolverBoton1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(MateriaJLabel)
                    .addComponent(GNotasBoton)
                    .addComponent(ExportarBoton))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(VolverBoton1)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void GNotasBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GNotasBotonActionPerformed
        try {
            GuardarNotas();
        } catch (JAXBException ex) {
            Logger.getLogger(IngNotas.class.getName()).log(Level.SEVERE, null, ex);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(IngNotas.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_GNotasBotonActionPerformed

    private void VolverBoton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VolverBoton1ActionPerformed
        OpcionesCurso oc = new OpcionesCurso();
        oc.SelectCurso(college.getTCursos()[pos], pos);
        oc.setVisible(true);
        dispose();
    }//GEN-LAST:event_VolverBoton1ActionPerformed

    private void ExportarBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExportarBotonActionPerformed
       ee.exportar(new File("Notas " + curso.getNivel() + " " + curso.getLetra() + ".xls"), JTNotas);
    }//GEN-LAST:event_ExportarBotonActionPerformed

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
            java.util.logging.Logger.getLogger(IngNotas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(IngNotas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(IngNotas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(IngNotas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new IngNotas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ExportarBoton;
    private javax.swing.JButton GNotasBoton;
    private javax.swing.JTable JTNotas;
    private javax.swing.JLabel MateriaJLabel;
    private javax.swing.JButton VolverBoton1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
