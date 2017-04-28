/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EscuelaVisual;

import EscuelaPackage.Colegio;
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
    ArrayList<Estudiante> es = new ArrayList();
    ArrayList<String> nombresAB = new ArrayList();
    ArrayList<String> nombresCD = new ArrayList();
    ArrayList<String> nombresEI = new ArrayList();
    ArrayList<String> nombresJM = new ArrayList();
    ArrayList<String> nombresNR = new ArrayList();
    ArrayList<String> nombresSZ = new ArrayList();

    public ApoderadosColegioVisual() {
        initComponents();
        llenadoBox();
    }

    public ArrayList<Estudiante> buscarApo(String nApoderado) {
        for (int i = 0; i < 16; i++) {
            for (int j = 0; j < 30; j++) {
                if (college.getTCursos()[i].getEstudiante()[j].getApoderado().getNombre().equals(nApoderado)) {
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
                System.out.println("________________________________");
                System.out.println((i + 1) + " " + nombresAB.get(i));
                i++;
            }
            if (s.substring(0, 1).equals("C") || s.substring(0, 1).equals("D")) {
                nombresCD.add(s);
                System.out.println("________________________________");
                System.out.println((j + 1) + " " + nombresCD.get(j));
                j++;
            }
            if (s.substring(0, 1).equals("E") || s.substring(0, 1).equals("F")
                    || s.substring(0, 1).equals("G") || s.substring(0, 1).equals("H")
                    || s.substring(0, 1).equals("I")) {
                nombresEI.add(s);
                System.out.println("________________________________");
                System.out.println((k + 1) + " " + nombresEI.get(k));
                k++;
            }
            if (s.substring(0, 1).equals("J") || s.substring(0, 1).equals("K")
                    || s.substring(0, 1).equals("L") || s.substring(0, 1).equals("M")) {
                nombresJM.add(s);
                System.out.println("________________________________");
                System.out.println((l + 1) + " " + nombresJM.get(l));
                l++;
            }
            if (s.substring(0, 1).equals("N") || s.substring(0, 1).equals("O")
                    || s.substring(0, 1).equals("P") || s.substring(0, 1).equals("Q")
                    || s.substring(0, 1).equals("R")) {
                nombresNR.add(s);
                System.out.println("________________________________");
                System.out.println((m + 1) + " " + nombresNR.get(m));
                m++;
            }
            if (s.substring(0, 1).equals("S")
                    || s.substring(0, 1).equals("T") || s.substring(0, 1).equals("U")
                    || s.substring(0, 1).equals("V") || s.substring(0, 1).equals("W")
                    || s.substring(0, 1).equals("X") || s.substring(0, 1).equals("Y")
                    || s.substring(0, 1).equals("Z")) {
                nombresSZ.add(s);
                System.out.println("________________________________");
                System.out.println((n + 1) + " " + nombresSZ.get(n));
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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Apoderados en el Colegio");

        BoxAB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar Nombre" }));
        BoxAB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BoxABActionPerformed(evt);
            }
        });

        BoxCD.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar Nombre" }));

        BoxEI.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar Nombre" }));

        BoxJM.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar Nombre" }));

        BoxNR.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar Nombre" }));

        BoxSZ.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar Nombre" }));

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
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(AB4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(AB5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(AB3, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(31, 31, 31)))
                                        .addGap(43, 43, 43))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(50, 50, 50)
                                        .addComponent(BoxSZ, 0, 212, Short.MAX_VALUE))))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(BoxAB, 0, 212, Short.MAX_VALUE)
                                    .addComponent(BoxEI, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(50, 50, 50)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(BoxJM, 0, 212, Short.MAX_VALUE)
                                    .addComponent(BoxCD, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
                .addGap(44, 44, 44))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel1)
                .addGap(79, 79, 79)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(AB3)
                        .addGap(85, 85, 85)
                        .addComponent(AB4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(BoxJM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(46, 46, 46)
                        .addComponent(AB5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(BoxSZ, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(AB)
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
                .addContainerGap(82, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BoxABActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BoxABActionPerformed
        //llenadoBox();
    }//GEN-LAST:event_BoxABActionPerformed

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
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
