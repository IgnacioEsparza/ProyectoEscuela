/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EscuelaVisual;

import EscuelaPackage.Colegio;
import EscuelaPackage.Curso;
import EscuelaPackage.Estudiante;
import Generar.GuardarXML;
import java.util.ArrayList;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author Ignacio Esparza
 */
public class ApoderadosColegioVisual extends javax.swing.JFrame {
    
    GuardarXML gx = new GuardarXML();
    Colegio college = gx.cargar();
    Set<String> ap = new TreeSet();
    EstudiantesPorApoderado epa = new EstudiantesPorApoderado();
    ArrayList<Estudiante> es = new ArrayList();
    Curso curso = new Curso();
    ArrayList<String> nombresAB = new ArrayList();
    ArrayList<String> nombresCD = new ArrayList();
    ArrayList<String> nombresEI = new ArrayList();
    ArrayList<String> nombresJM = new ArrayList();
    ArrayList<String> nombresNR = new ArrayList();
    ArrayList<String> nombresSZ = new ArrayList();

    public ApoderadosColegioVisual() {
        initComponents();
        llenadoBox();
        setLocationRelativeTo(null);
    }

    public ArrayList<Estudiante> buscarApo(String nApoderado) {
        for (int i = 0; i < 16; i++) {
            for (int j = 0; j < 30; j++) {
                if (college.getTCursos()[i].getEstudiante()[j].getApoderado().getNombre().equals(nApoderado)) {
                    curso=college.getTCursos()[i];
                    college.getTCursos()[i].getEstudiante()[j].setCurso(curso);
                    es.add(college.getTCursos()[i].getEstudiante()[j]);
                    
                }
            }
        }
        return es;
    }

    public Set obtenerApo() {
        for (int i = 0; i < 16; i++) {
            for (int j = 0; j < 30; j++) {
                ap.add(college.getTCursos()[i].getEstudiante()[j].getApoderado().getNombre());
            }
        }
        return ap;
    }

    public void sepadados() {
        obtenerApo();
        int i = 0, j = 0, k = 0, l = 0, m = 0, n = 0;
        for (String s : ap) {
            if (s.substring(0, 1).equals("A") || s.substring(0, 1).equals("B")) {
                nombresAB.add(s);
                //System.out.println("________________________________");
                //System.out.println((i + 1) + " " + nombresAB.get(i));
                i++;
            }
            if (s.substring(0, 1).equals("C") || s.substring(0, 1).equals("D")) {
                nombresCD.add(s);
//                System.out.println("________________________________");
//                System.out.println((j + 1) + " " + nombresCD.get(j));
                j++;
            }
            if (s.substring(0, 1).equals("E") || s.substring(0, 1).equals("F")
                    || s.substring(0, 1).equals("G") || s.substring(0, 1).equals("H")
                    || s.substring(0, 1).equals("I")) {
                nombresEI.add(s);
//                System.out.println("________________________________");
//                System.out.println((k + 1) + " " + nombresEI.get(k));
                k++;
            }
            if (s.substring(0, 1).equals("J") || s.substring(0, 1).equals("K")
                    || s.substring(0, 1).equals("L") || s.substring(0, 1).equals("M")) {
                nombresJM.add(s);
//                System.out.println("________________________________");
//                System.out.println((l + 1) + " " + nombresJM.get(l));
                l++;
            }
            if (s.substring(0, 1).equals("N") || s.substring(0, 1).equals("O")
                    || s.substring(0, 1).equals("P") || s.substring(0, 1).equals("Q")
                    || s.substring(0, 1).equals("R")) {
                nombresNR.add(s);
//                System.out.println("________________________________");
//                System.out.println((m + 1) + " " + nombresNR.get(m));
                m++;
            }
            if (s.substring(0, 1).equals("S")
                    || s.substring(0, 1).equals("T") || s.substring(0, 1).equals("U")
                    || s.substring(0, 1).equals("V") || s.substring(0, 1).equals("W")
                    || s.substring(0, 1).equals("X") || s.substring(0, 1).equals("Y")
                    || s.substring(0, 1).equals("Z")) {
                nombresSZ.add(s);
//                System.out.println("________________________________");
//                System.out.println((n + 1) + " " + nombresSZ.get(n));
                n++;
            }

        }
    }
    
    public void llenadoBox(){
        sepadados();
        for (int i = 0; i < nombresAB.size(); i++) {
            BoxAB.addItem(nombresAB.get(i));
        }
        for (int i = 0; i < nombresCD.size(); i++) {
            BoxCD.addItem(nombresCD.get(i));
        }
        for (int i = 0; i < nombresEI.size(); i++) {
            BoxEI.addItem(nombresEI.get(i));
        }
        for (int i = 0; i < nombresJM.size(); i++) {
            BoxJM.addItem(nombresJM.get(i));
        }
        for (int i = 0; i < nombresNR.size(); i++) {
            BoxNR.addItem(nombresNR.get(i));
        }
        for (int i = 0; i < nombresSZ.size(); i++) {
            BoxSZ.addItem(nombresSZ.get(i));
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BoxAB = new javax.swing.JComboBox<>();
        BoxCD = new javax.swing.JComboBox<>();
        BoxEI = new javax.swing.JComboBox<>();
        BoxJM = new javax.swing.JComboBox<>();
        BoxNR = new javax.swing.JComboBox<>();
        BoxSZ = new javax.swing.JComboBox<>();
        AB = new javax.swing.JLabel();
        AB1 = new javax.swing.JLabel();
        AB2 = new javax.swing.JLabel();
        AB3 = new javax.swing.JLabel();
        AB4 = new javax.swing.JLabel();
        AB5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        JBVolver = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Apoderados en el Colegio");

        BoxAB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar Nombre" }));
        BoxAB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BoxABActionPerformed(evt);
            }
        });

        BoxCD.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar Nombre" }));
        BoxCD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BoxCDActionPerformed(evt);
            }
        });

        BoxEI.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar Nombre" }));
        BoxEI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BoxEIActionPerformed(evt);
            }
        });

        BoxJM.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar Nombre" }));
        BoxJM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BoxJMActionPerformed(evt);
            }
        });

        BoxNR.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar Nombre" }));
        BoxNR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BoxNRActionPerformed(evt);
            }
        });

        BoxSZ.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar Nombre" }));
        BoxSZ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BoxSZActionPerformed(evt);
            }
        });

        AB.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        AB.setText("A-B");

        AB1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        AB1.setText("E-I");

        AB2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        AB2.setText("N-R");

        AB3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        AB3.setText("C-D");

        AB4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        AB4.setText("J-M");

        AB5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        AB5.setText("S-Z");

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Apoderados en el Colegio");

        JBVolver.setText("Volver");
        JBVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBVolverActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(165, 165, 165)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(BoxAB, 0, 212, Short.MAX_VALUE)
                                    .addComponent(BoxEI, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(50, 50, 50)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(BoxJM, 0, 212, Short.MAX_VALUE)
                                    .addComponent(BoxCD, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(32, 32, 32)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(AB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(AB1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(AB2, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(BoxNR, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(50, 50, 50)
                                        .addComponent(BoxSZ, 0, 212, Short.MAX_VALUE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                    .addComponent(AB4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(AB5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(43, 43, 43))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addComponent(AB3, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(75, 75, 75)))))))))
                .addGap(44, 44, 44))
            .addGroup(layout.createSequentialGroup()
                .addGap(242, 242, 242)
                .addComponent(JBVolver)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(178, 178, 178)
                        .addComponent(AB4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(BoxJM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(46, 46, 46)
                        .addComponent(AB5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(BoxSZ, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(79, 79, 79)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(AB)
                            .addComponent(AB3))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(BoxAB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BoxCD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(47, 47, 47)
                        .addComponent(AB1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BoxEI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(51, 51, 51)
                        .addComponent(AB2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(BoxNR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addComponent(JBVolver)
                .addGap(23, 23, 23))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BoxABActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BoxABActionPerformed
        epa.datos(buscarApo(BoxAB.getSelectedItem().toString())/*,curso*/);
        epa.setVisible(true);
        dispose();
    }//GEN-LAST:event_BoxABActionPerformed

    private void BoxCDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BoxCDActionPerformed
        epa.datos(buscarApo(BoxCD.getSelectedItem().toString())/*,curso*/);
        epa.setVisible(true);
        dispose();
    }//GEN-LAST:event_BoxCDActionPerformed

    private void BoxEIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BoxEIActionPerformed
        epa.datos(buscarApo(BoxEI.getSelectedItem().toString())/*,curso*/);
        epa.setVisible(true);
        dispose();
    }//GEN-LAST:event_BoxEIActionPerformed

    private void BoxJMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BoxJMActionPerformed
        epa.datos(buscarApo(BoxJM.getSelectedItem().toString())/*,curso*/);
        epa.setVisible(true);
        dispose();
    }//GEN-LAST:event_BoxJMActionPerformed

    private void BoxNRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BoxNRActionPerformed
        epa.datos(buscarApo(BoxNR.getSelectedItem().toString())/*,curso*/);
        epa.setVisible(true);
        dispose();
    }//GEN-LAST:event_BoxNRActionPerformed

    private void BoxSZActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BoxSZActionPerformed
        epa.datos(buscarApo(BoxSZ.getSelectedItem().toString())/*,curso*/);
        epa.setVisible(true);
        dispose();
    }//GEN-LAST:event_BoxSZActionPerformed

    private void JBVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBVolverActionPerformed
        Principal p = new Principal();
        p.setVisible(true);
        dispose();
    }//GEN-LAST:event_JBVolverActionPerformed

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
            java.util.logging.Logger.getLogger(ApoderadosColegioVisual.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ApoderadosColegioVisual.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ApoderadosColegioVisual.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ApoderadosColegioVisual.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ApoderadosColegioVisual().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AB;
    private javax.swing.JLabel AB1;
    private javax.swing.JLabel AB2;
    private javax.swing.JLabel AB3;
    private javax.swing.JLabel AB4;
    private javax.swing.JLabel AB5;
    private javax.swing.JComboBox<String> BoxAB;
    private javax.swing.JComboBox<String> BoxCD;
    private javax.swing.JComboBox<String> BoxEI;
    private javax.swing.JComboBox<String> BoxJM;
    private javax.swing.JComboBox<String> BoxNR;
    private javax.swing.JComboBox<String> BoxSZ;
    private javax.swing.JButton JBVolver;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
