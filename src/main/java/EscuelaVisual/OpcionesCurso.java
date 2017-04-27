/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EscuelaVisual;

import EscuelaPackage.Curso;
import EscuelaVisual.IngresoDatos.IngAnotaciones;
import EscuelaVisual.IngresoDatos.IngNotas;
import EscuelaVisual.IngresoDatos.IngPlanificaciones;
import EscuelaVisual.IngresoDatos.VerAsistencias;
import EscuelaVisual.IngresoDatos.VerCurso;
import EscuelaVisual.IngresoDatos.VerPromedios;

/**
 *
 * @author Ignacio Esparza
 */
public class OpcionesCurso extends javax.swing.JFrame {
    Curso curso;
    int pos;
    public OpcionesCurso() {
        initComponents();
        setLocationRelativeTo(null);
    }
    
    public void SelectCurso(Curso c,int posicion){
        NomProfesor.setText(c.getProfesor().getNombre()+", "
                + ""+c.getProfesor().getAsignaturaP().getMateria());
        NumeroCurso.setText(c.getNivel()+"º "+c.getLetra());
        curso=c;
        pos=posicion;
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        INotasBoton = new javax.swing.JButton();
        IPlanificacionesBoton = new javax.swing.JButton();
        NomProfesor = new javax.swing.JLabel();
        IAnotacionesBoton = new javax.swing.JButton();
        VPromediosBoton = new javax.swing.JButton();
        VAsistenciasBoton = new javax.swing.JButton();
        VolverOC = new javax.swing.JButton();
        VerCursoBoton = new javax.swing.JButton();
        NumeroCurso = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        INotasBoton.setText("Ingresar Notas");
        INotasBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                INotasBotonActionPerformed(evt);
            }
        });

        IPlanificacionesBoton.setText("Ingresar Planificaciones");
        IPlanificacionesBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IPlanificacionesBotonActionPerformed(evt);
            }
        });

        NomProfesor.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        NomProfesor.setText("Nombre Profesor, Materia");

        IAnotacionesBoton.setText("Ingresar Anotaciones");
        IAnotacionesBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IAnotacionesBotonActionPerformed(evt);
            }
        });

        VPromediosBoton.setText("Ver Promedios");
        VPromediosBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VPromediosBotonActionPerformed(evt);
            }
        });

        VAsistenciasBoton.setText("Ver Asistencias");
        VAsistenciasBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VAsistenciasBotonActionPerformed(evt);
            }
        });

        VolverOC.setText("Volver");
        VolverOC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VolverOCActionPerformed(evt);
            }
        });

        VerCursoBoton.setText("Ver Curso");
        VerCursoBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VerCursoBotonActionPerformed(evt);
            }
        });

        NumeroCurso.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        NumeroCurso.setText("Curso");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(251, 251, 251)
                .addComponent(VolverOC)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(NomProfesor, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 136, Short.MAX_VALUE)
                        .addComponent(NumeroCurso))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(IPlanificacionesBoton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 211, Short.MAX_VALUE)
                            .addComponent(IAnotacionesBoton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(INotasBoton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(VPromediosBoton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(VAsistenciasBoton, javax.swing.GroupLayout.DEFAULT_SIZE, 211, Short.MAX_VALUE)
                            .addComponent(VerCursoBoton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(58, 58, 58))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NomProfesor)
                    .addComponent(NumeroCurso))
                .addGap(52, 52, 52)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(INotasBoton, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(VPromediosBoton, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(VAsistenciasBoton, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(IAnotacionesBoton, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(IPlanificacionesBoton, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE)
                    .addComponent(VerCursoBoton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 96, Short.MAX_VALUE)
                .addComponent(VolverOC)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void INotasBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_INotasBotonActionPerformed
        IngNotas in = new IngNotas();
        in.notas(curso, pos);
        in.setVisible(true);
        dispose();
    }//GEN-LAST:event_INotasBotonActionPerformed

    private void IPlanificacionesBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IPlanificacionesBotonActionPerformed
        IngPlanificaciones ip = new IngPlanificaciones();
        ip.planes(curso,pos);
        ip.setVisible(true);
        dispose();
    }//GEN-LAST:event_IPlanificacionesBotonActionPerformed

    private void VolverOCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VolverOCActionPerformed
        SelectProfesor sp = new SelectProfesor();
        sp.setVisible(true);
        dispose();
    }//GEN-LAST:event_VolverOCActionPerformed

    private void IAnotacionesBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IAnotacionesBotonActionPerformed
        IngAnotaciones ia = new IngAnotaciones();
        ia.anotaciones(curso, pos);
        ia.setVisible(true);
        dispose();
    }//GEN-LAST:event_IAnotacionesBotonActionPerformed

    private void VPromediosBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VPromediosBotonActionPerformed
        VerPromedios vp = new VerPromedios();
        vp.promediosMetodo(curso, pos);
        vp.setVisible(true);
        dispose();
    }//GEN-LAST:event_VPromediosBotonActionPerformed

    private void VAsistenciasBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VAsistenciasBotonActionPerformed
        VerAsistencias va = new VerAsistencias();
        va.asistenciasMetodo(curso, pos);
        va.setVisible(true);
        dispose();
    }//GEN-LAST:event_VAsistenciasBotonActionPerformed

    private void VerCursoBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VerCursoBotonActionPerformed
        VerCurso vc = new VerCurso();
        vc.vercursoMetodo(curso, pos);
        vc.setVisible(true);
        dispose();
    }//GEN-LAST:event_VerCursoBotonActionPerformed

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
            java.util.logging.Logger.getLogger(OpcionesCurso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(OpcionesCurso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(OpcionesCurso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(OpcionesCurso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new OpcionesCurso().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton IAnotacionesBoton;
    private javax.swing.JButton INotasBoton;
    private javax.swing.JButton IPlanificacionesBoton;
    private javax.swing.JLabel NomProfesor;
    private javax.swing.JLabel NumeroCurso;
    private javax.swing.JButton VAsistenciasBoton;
    private javax.swing.JButton VPromediosBoton;
    private javax.swing.JButton VerCursoBoton;
    private javax.swing.JButton VolverOC;
    // End of variables declaration//GEN-END:variables
}
