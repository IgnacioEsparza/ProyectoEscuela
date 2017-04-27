/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EscuelaVisual;

import EscuelaPackage.Colegio;
import EscuelaPackage.Curso;
import Generar.GuardarXML;

/**
 *
 * @author Ignacio
 */
public class SelectProfesor extends javax.swing.JFrame {

    GuardarXML g = new GuardarXML();
    InfoCurso ic = new InfoCurso();
    Colegio college = g.cargar();
    Curso[] TCursos = college.getTCursos();
    OpcionesCurso oc = new OpcionesCurso();

    public SelectProfesor() {
        initComponents();
        setLocationRelativeTo(null);
        setTitle("Principal");
        nombresProfes();
    }

    public void nombresProfes() {
        ProfesMate.addItem(TCursos[0].getProfesor().getNombre()+", "+TCursos[0].getNivel()+"° "+TCursos[0].getLetra());
        ProfesMate.addItem(TCursos[1].getProfesor().getNombre()+", "+TCursos[1].getNivel()+"° "+TCursos[1].getLetra());
        ProfesMate.addItem(TCursos[2].getProfesor().getNombre()+", "+TCursos[2].getNivel()+"° "+TCursos[2].getLetra());
        ProfesMate.addItem(TCursos[3].getProfesor().getNombre()+", "+TCursos[3].getNivel()+"° "+TCursos[3].getLetra());
        ProfesMate.addItem(TCursos[4].getProfesor().getNombre()+", "+TCursos[4].getNivel()+"° "+TCursos[4].getLetra());
        ProfesLengua.addItem(TCursos[5].getProfesor().getNombre()+", "+TCursos[5].getNivel()+"° "+TCursos[5].getLetra());
        ProfesLengua.addItem(TCursos[6].getProfesor().getNombre()+", "+TCursos[6].getNivel()+"° "+TCursos[6].getLetra());
        ProfesLengua.addItem(TCursos[7].getProfesor().getNombre()+", "+TCursos[7].getNivel()+"° "+TCursos[7].getLetra());
        ProfesLengua.addItem(TCursos[8].getProfesor().getNombre()+", "+TCursos[8].getNivel()+"° "+TCursos[8].getLetra());
        ProfesLengua.addItem(TCursos[9].getProfesor().getNombre()+", "+TCursos[9].getNivel()+"° "+TCursos[9].getLetra());
        ProfesHistoria.addItem(TCursos[10].getProfesor().getNombre()+", "+TCursos[10].getNivel()+"° "+TCursos[10].getLetra());
        ProfesHistoria.addItem(TCursos[11].getProfesor().getNombre()+", "+TCursos[11].getNivel()+"° "+TCursos[11].getLetra());
        ProfesIngles.addItem(TCursos[12].getProfesor().getNombre()+", "+TCursos[12].getNivel()+"° "+TCursos[12].getLetra());
        ProfesIngles.addItem(TCursos[13].getProfesor().getNombre()+", "+TCursos[13].getNivel()+"° "+TCursos[13].getLetra());
        ProfesCiencias.addItem(TCursos[14].getProfesor().getNombre()+", "+TCursos[14].getNivel()+"° "+TCursos[14].getLetra());
        ProfesCiencias.addItem(TCursos[15].getProfesor().getNombre()+", "+TCursos[15].getNivel()+"° "+TCursos[15].getLetra());

    }

    public void ProfesMateSeleccion() {
        int pos = ProfesMate.getSelectedIndex()-1;
        oc.SelectCurso(TCursos[pos], pos);
        oc.setVisible(true);
        dispose();
    }

    public void ProfesLenguaSeleccion() {
        int pos = ProfesLengua.getSelectedIndex()+4;
        oc.SelectCurso(TCursos[pos], pos);
        oc.setVisible(true);
        dispose();
    }

    public void ProfesHistoriaSeleccion() {
        if (ProfesHistoria.getSelectedIndex() == 1) {
            oc.SelectCurso(TCursos[10], 10);
            oc.setVisible(true);
            dispose();
        }
        if (ProfesHistoria.getSelectedIndex() == 2) {
            oc.SelectCurso(TCursos[11], 11);
            oc.setVisible(true);
            dispose();
        }
    }

    public void ProfesInglesSeleccion() {
        if (ProfesIngles.getSelectedIndex() == 1) {
            oc.SelectCurso(TCursos[12], 12);
            oc.setVisible(true);
            dispose();
        }
        if (ProfesIngles.getSelectedIndex() == 2) {
            oc.SelectCurso(TCursos[13], 13);
            oc.setVisible(true);
            dispose();
        }
    }

    public void ProfesCienciasSeleccion() {
        if (ProfesCiencias.getSelectedIndex() == 1) {
            oc.SelectCurso(TCursos[14], 14);
            oc.setVisible(true);
            dispose();
        }
        if (ProfesCiencias.getSelectedIndex() == 2) {
            oc.SelectCurso(TCursos[15], 15);
            oc.setVisible(true);
            dispose();
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        GenReporte = new javax.swing.JButton();
        ProfeMate = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        LabelHistoria = new javax.swing.JLabel();
        ProfesMate = new javax.swing.JComboBox<>();
        ProfesLengua = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        ProfesHistoria = new javax.swing.JComboBox<>();
        ProfesCiencias = new javax.swing.JComboBox<>();
        LabelIngles = new javax.swing.JLabel();
        ProfesIngles = new javax.swing.JComboBox<>();
        Saludo = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        SalirButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Seleccionar Profesor");

        GenReporte.setText("Generar Reporte");
        GenReporte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GenReporteActionPerformed(evt);
            }
        });

        ProfeMate.setText("Matemáticas");

        jLabel3.setText("Lenguaje");

        LabelHistoria.setText("Historia");

        ProfesMate.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione su Nombre" }));
        ProfesMate.setToolTipText("");
        ProfesMate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ProfesMateActionPerformed(evt);
            }
        });

        ProfesLengua.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione su Nombre" }));
        ProfesLengua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ProfesLenguaActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Reporte Para Apoderados");

        jLabel5.setText("Ciencias");

        ProfesHistoria.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione su Nombre" }));
        ProfesHistoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ProfesHistoriaActionPerformed(evt);
            }
        });

        ProfesCiencias.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione su Nombre" }));
        ProfesCiencias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ProfesCienciasActionPerformed(evt);
            }
        });

        LabelIngles.setText("Inglés");

        ProfesIngles.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione su Nombre" }));
        ProfesIngles.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ProfesInglesActionPerformed(evt);
            }
        });

        Saludo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Saludo.setText("                          ");

        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        jTextArea1.setEditable(false);
        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jTextArea1.setRows(5);
        jTextArea1.setText("Se generará un\nreporte con : Notas,\nEvaluaciones,\nAnotaciones,\nPlanificaciones.\n");
        jScrollPane1.setViewportView(jTextArea1);

        SalirButton.setText("Salir");
        SalirButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalirButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2))
                    .addComponent(Saludo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(LabelHistoria)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 376, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(ProfesHistoria, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(ProfeMate, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(ProfesMate, javax.swing.GroupLayout.Alignment.LEADING, 0, 140, Short.MAX_VALUE)
                                    .addComponent(ProfesLengua, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel5)
                                    .addComponent(LabelIngles)
                                    .addComponent(ProfesCiencias, 0, 140, Short.MAX_VALUE)
                                    .addComponent(ProfesIngles, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(56, 56, 56)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(GenReporte, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(59, 59, 59))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(SalirButton)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(SalirButton)
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(ProfeMate)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ProfesMate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(GenReporte)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ProfesLengua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(LabelHistoria)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ProfesHistoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 42, Short.MAX_VALUE))
                            .addComponent(jScrollPane1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Saludo)
                        .addGap(47, 47, 47))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ProfesCiencias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(LabelIngles)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ProfesIngles, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void GenReporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GenReporteActionPerformed
        SelectCursos sc = new SelectCursos();
        sc.setVisible(true);
        dispose();
    }//GEN-LAST:event_GenReporteActionPerformed

    private void ProfesMateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ProfesMateActionPerformed
        ProfesMateSeleccion();
    }//GEN-LAST:event_ProfesMateActionPerformed

    private void SalirButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalirButtonActionPerformed
        System.exit(0);
    }//GEN-LAST:event_SalirButtonActionPerformed

    private void ProfesLenguaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ProfesLenguaActionPerformed
        ProfesLenguaSeleccion();
    }//GEN-LAST:event_ProfesLenguaActionPerformed

    private void ProfesHistoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ProfesHistoriaActionPerformed
        ProfesHistoriaSeleccion();
    }//GEN-LAST:event_ProfesHistoriaActionPerformed

    private void ProfesCienciasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ProfesCienciasActionPerformed
        ProfesCienciasSeleccion();
    }//GEN-LAST:event_ProfesCienciasActionPerformed

    private void ProfesInglesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ProfesInglesActionPerformed
        ProfesInglesSeleccion();
    }//GEN-LAST:event_ProfesInglesActionPerformed

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
            java.util.logging.Logger.getLogger(SelectProfesor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SelectProfesor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SelectProfesor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SelectProfesor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SelectProfesor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton GenReporte;
    private javax.swing.JLabel LabelHistoria;
    private javax.swing.JLabel LabelIngles;
    private javax.swing.JLabel ProfeMate;
    private javax.swing.JComboBox<String> ProfesCiencias;
    private javax.swing.JComboBox<String> ProfesHistoria;
    private javax.swing.JComboBox<String> ProfesIngles;
    private javax.swing.JComboBox<String> ProfesLengua;
    private javax.swing.JComboBox<String> ProfesMate;
    private javax.swing.JButton SalirButton;
    private javax.swing.JLabel Saludo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
}
