/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EscuelaVisual;

import EscuelaVisual.Apoderado.TablaRegistro;
import EscuelaPackage.Curso;

/**
 *
 * @author Ignacio
 */
public class InfoCurso extends javax.swing.JFrame {

    Curso curso;

    /**
     *
     */
    public InfoCurso() {
        initComponents();
        setLocationRelativeTo(null);
        setTitle("Informacion del Curso");

    }

    /**
     *
     * @param cur se envia el curso para poder actualizar los datos
     */
    public void llenadoInfoCurso(Curso cur) {
        curso = cur;
        Alumno1.setText(cur.getEstudiante()[0].getNombre());
        Alumno2.setText(cur.getEstudiante()[1].getNombre());
        Alumno3.setText(cur.getEstudiante()[2].getNombre());
        Alumno4.setText(cur.getEstudiante()[3].getNombre());
        Alumno5.setText(cur.getEstudiante()[4].getNombre());
        Alumno6.setText(cur.getEstudiante()[5].getNombre());
        Alumno7.setText(cur.getEstudiante()[6].getNombre());
        Alumno8.setText(cur.getEstudiante()[7].getNombre());
        Alumno9.setText(cur.getEstudiante()[8].getNombre());
        Alumno10.setText(cur.getEstudiante()[9].getNombre());
        Alumno11.setText(cur.getEstudiante()[10].getNombre());
        Alumno12.setText(cur.getEstudiante()[11].getNombre());
        Alumno13.setText(cur.getEstudiante()[12].getNombre());
        Alumno14.setText(cur.getEstudiante()[13].getNombre());
        Alumno15.setText(cur.getEstudiante()[14].getNombre());
        Alumno16.setText(cur.getEstudiante()[15].getNombre());
        Alumno17.setText(cur.getEstudiante()[16].getNombre());
        Alumno18.setText(cur.getEstudiante()[17].getNombre());
        Alumno19.setText(cur.getEstudiante()[18].getNombre());
        Alumno20.setText(cur.getEstudiante()[19].getNombre());
        Alumno21.setText(cur.getEstudiante()[20].getNombre());
        Alumno22.setText(cur.getEstudiante()[21].getNombre());
        Alumno23.setText(cur.getEstudiante()[22].getNombre());
        Alumno24.setText(cur.getEstudiante()[23].getNombre());
        Alumno25.setText(cur.getEstudiante()[24].getNombre());
        Alumno26.setText(cur.getEstudiante()[25].getNombre());
        Alumno27.setText(cur.getEstudiante()[26].getNombre());
        Alumno28.setText(cur.getEstudiante()[27].getNombre());
        Alumno29.setText(cur.getEstudiante()[28].getNombre());
        Alumno30.setText(cur.getEstudiante()[29].getNombre());
        nomProfeLabel.setText("Profesor " + cur.getProfesor().getNombre());
        nivelCursoLabel.setText("Curso " + cur.getNivel() + " " + cur.getLetra());

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        nomProfeLabel = new javax.swing.JLabel();
        nivelCursoLabel = new javax.swing.JLabel();
        Alumno1 = new javax.swing.JLabel();
        Alumno2 = new javax.swing.JLabel();
        Alumno3 = new javax.swing.JLabel();
        Alumno4 = new javax.swing.JLabel();
        Alumno5 = new javax.swing.JLabel();
        Alumno6 = new javax.swing.JLabel();
        Alumno7 = new javax.swing.JLabel();
        Alumno8 = new javax.swing.JLabel();
        Alumno9 = new javax.swing.JLabel();
        Alumno10 = new javax.swing.JLabel();
        Alumno11 = new javax.swing.JLabel();
        Alumno12 = new javax.swing.JLabel();
        Alumno21 = new javax.swing.JLabel();
        Alumno22 = new javax.swing.JLabel();
        Alumno13 = new javax.swing.JLabel();
        Alumno23 = new javax.swing.JLabel();
        Alumno14 = new javax.swing.JLabel();
        Alumno24 = new javax.swing.JLabel();
        Alumno15 = new javax.swing.JLabel();
        Alumno25 = new javax.swing.JLabel();
        Alumno16 = new javax.swing.JLabel();
        Alumno26 = new javax.swing.JLabel();
        Alumno17 = new javax.swing.JLabel();
        Alumno27 = new javax.swing.JLabel();
        Alumno18 = new javax.swing.JLabel();
        Alumno28 = new javax.swing.JLabel();
        Alumno19 = new javax.swing.JLabel();
        Alumno29 = new javax.swing.JLabel();
        Alumno20 = new javax.swing.JLabel();
        Alumno30 = new javax.swing.JLabel();
        volver = new javax.swing.JButton();

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        nomProfeLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        nomProfeLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nomProfeLabel.setText("Profesor :");

        nivelCursoLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        nivelCursoLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nivelCursoLabel.setText("nCurso");

        Alumno1.setText("Alumno1");
        Alumno1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Alumno1MouseClicked(evt);
            }
        });

        Alumno2.setText("Alumno2");
        Alumno2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Alumno2MouseClicked(evt);
            }
        });

        Alumno3.setText("Alumno3");
        Alumno3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Alumno3MouseClicked(evt);
            }
        });

        Alumno4.setText("Alumno4");
        Alumno4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Alumno4MouseClicked(evt);
            }
        });

        Alumno5.setText("Alumno5");
        Alumno5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Alumno5MouseClicked(evt);
            }
        });

        Alumno6.setText("Alumno6");
        Alumno6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Alumno6MouseClicked(evt);
            }
        });

        Alumno7.setText("jLabel2");

        Alumno8.setText("jLabel2");

        Alumno9.setText("jLabel2");

        Alumno10.setText("jLabel2");

        Alumno11.setText("jLabel2");

        Alumno12.setText("jLabel2");

        Alumno21.setText("jLabel2");

        Alumno22.setText("jLabel2");

        Alumno13.setText("jLabel2");

        Alumno23.setText("jLabel2");

        Alumno14.setText("jLabel2");

        Alumno24.setText("jLabel2");

        Alumno15.setText("jLabel2");

        Alumno25.setText("jLabel2");

        Alumno16.setText("jLabel2");

        Alumno26.setText("jLabel2");

        Alumno17.setText("jLabel2");

        Alumno27.setText("jLabel2");

        Alumno18.setText("jLabel2");

        Alumno28.setText("jLabel2");

        Alumno19.setText("jLabel2");

        Alumno29.setText("jLabel2");

        Alumno20.setText("jLabel2");

        Alumno30.setText("jLabel2");

        volver.setText("Volver");
        volver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                volverActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(nomProfeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(188, 188, 188)
                        .addComponent(nivelCursoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(123, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(volver)
                        .addGap(17, 17, 17))))
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Alumno1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Alumno2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Alumno3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Alumno4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Alumno5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Alumno7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Alumno8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Alumno9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Alumno10)
                    .addComponent(Alumno6, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Alumno11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Alumno12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Alumno13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Alumno14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Alumno15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Alumno16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Alumno17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Alumno18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Alumno19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Alumno20, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Alumno21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Alumno22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Alumno23, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Alumno24, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Alumno25, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Alumno26, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Alumno27, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Alumno28, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Alumno29, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Alumno30, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nivelCursoLabel)
                    .addComponent(nomProfeLabel))
                .addGap(66, 66, 66)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Alumno1)
                            .addComponent(Alumno11))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Alumno2)
                            .addComponent(Alumno12))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Alumno3)
                            .addComponent(Alumno13))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Alumno4)
                            .addComponent(Alumno14))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Alumno5)
                            .addComponent(Alumno15))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Alumno6)
                            .addComponent(Alumno16))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Alumno7)
                            .addComponent(Alumno17))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Alumno8)
                            .addComponent(Alumno18))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Alumno9)
                            .addComponent(Alumno19))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Alumno10)
                            .addComponent(Alumno20)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(Alumno21)
                        .addGap(18, 18, 18)
                        .addComponent(Alumno22)
                        .addGap(18, 18, 18)
                        .addComponent(Alumno23)
                        .addGap(18, 18, 18)
                        .addComponent(Alumno24)
                        .addGap(18, 18, 18)
                        .addComponent(Alumno25)
                        .addGap(18, 18, 18)
                        .addComponent(Alumno26)
                        .addGap(18, 18, 18)
                        .addComponent(Alumno27)
                        .addGap(18, 18, 18)
                        .addComponent(Alumno28)
                        .addGap(18, 18, 18)
                        .addComponent(Alumno29)
                        .addGap(18, 18, 18)
                        .addComponent(Alumno30)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 82, Short.MAX_VALUE)
                .addComponent(volver)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void volverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_volverActionPerformed
        SelectCursos sc = new SelectCursos();
        sc.setCurso(curso);
        sc.setVisible(true);
        dispose();
    }//GEN-LAST:event_volverActionPerformed

    private void Alumno1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Alumno1MouseClicked
        TablaRegistro tr = new TablaRegistro();;
        tr.datos(curso.getEstudiante()[0], curso);
        tr.setVisible(true);
        dispose();
    }//GEN-LAST:event_Alumno1MouseClicked

    private void Alumno2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Alumno2MouseClicked
        TablaRegistro tr = new TablaRegistro();
        tr.datos(curso.getEstudiante()[1], curso);
        tr.setVisible(true);
        dispose();
    }//GEN-LAST:event_Alumno2MouseClicked

    private void Alumno3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Alumno3MouseClicked
        TablaRegistro tr = new TablaRegistro();
        tr.datos(curso.getEstudiante()[2], curso);
        tr.setVisible(true);
        dispose();
    }//GEN-LAST:event_Alumno3MouseClicked

    private void Alumno4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Alumno4MouseClicked
        TablaRegistro tr = new TablaRegistro();
        tr.datos(curso.getEstudiante()[3], curso);
        tr.setVisible(true);
        dispose();
    }//GEN-LAST:event_Alumno4MouseClicked

    private void Alumno5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Alumno5MouseClicked
        TablaRegistro tr = new TablaRegistro();
        tr.datos(curso.getEstudiante()[4], curso);
        tr.setVisible(true);
        dispose();
    }//GEN-LAST:event_Alumno5MouseClicked

    private void Alumno6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Alumno6MouseClicked
        TablaRegistro tr = new TablaRegistro();
        tr.datos(curso.getEstudiante()[5], curso);
        tr.setVisible(true);
        dispose();
    }//GEN-LAST:event_Alumno6MouseClicked

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
            java.util.logging.Logger.getLogger(InfoCurso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InfoCurso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InfoCurso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InfoCurso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InfoCurso().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Alumno1;
    private javax.swing.JLabel Alumno10;
    private javax.swing.JLabel Alumno11;
    private javax.swing.JLabel Alumno12;
    private javax.swing.JLabel Alumno13;
    private javax.swing.JLabel Alumno14;
    private javax.swing.JLabel Alumno15;
    private javax.swing.JLabel Alumno16;
    private javax.swing.JLabel Alumno17;
    private javax.swing.JLabel Alumno18;
    private javax.swing.JLabel Alumno19;
    private javax.swing.JLabel Alumno2;
    private javax.swing.JLabel Alumno20;
    private javax.swing.JLabel Alumno21;
    private javax.swing.JLabel Alumno22;
    private javax.swing.JLabel Alumno23;
    private javax.swing.JLabel Alumno24;
    private javax.swing.JLabel Alumno25;
    private javax.swing.JLabel Alumno26;
    private javax.swing.JLabel Alumno27;
    private javax.swing.JLabel Alumno28;
    private javax.swing.JLabel Alumno29;
    private javax.swing.JLabel Alumno3;
    private javax.swing.JLabel Alumno30;
    private javax.swing.JLabel Alumno4;
    private javax.swing.JLabel Alumno5;
    private javax.swing.JLabel Alumno6;
    private javax.swing.JLabel Alumno7;
    private javax.swing.JLabel Alumno8;
    private javax.swing.JLabel Alumno9;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel nivelCursoLabel;
    private javax.swing.JLabel nomProfeLabel;
    private javax.swing.JButton volver;
    // End of variables declaration//GEN-END:variables
}
