/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import GUI.*;

/**
 *
 * @author usman
 */
public class Quiz2 extends javax.swing.JFrame {

    String userAnswer;
    /**
     * Creates new form Quiz
     */
    public Quiz2() {
        initComponents();
        getContentPane().setBackground(new java.awt.Color(255, 255, 255));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        userAnswer1 = new javax.swing.JRadioButton();
        userAnswer2 = new javax.swing.JRadioButton();
        userAnswer3 = new javax.swing.JRadioButton();
        userAnswer4 = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton2.setText("Next");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Quiz/quizScreen.png"))); // NOI18N

        jScrollPane1.setEnabled(false);

        jTextArea1.setEditable(false);
        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jTextArea1.setText("After you’ve moved a person who is unresponsive and \nbreathing onto their side, you should…what?");
        jScrollPane1.setViewportView(jTextArea1);

        userAnswer1.setText("leave the person alone now they are comfortable, they’ll wake up soon");
        userAnswer1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userAnswer1ActionPerformed(evt);
            }
        });

        userAnswer2.setText("stay with the person and keep checking their head is tilted back to allow them to keep breathing normally");
        userAnswer2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userAnswer2ActionPerformed(evt);
            }
        });

        userAnswer3.setText("sit with but do not touch the person again. If they move, it is just them starting to wake up");
        userAnswer3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userAnswer3ActionPerformed(evt);
            }
        });

        userAnswer4.setText("give 50 grams of Vodka");
        userAnswer4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userAnswer4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 367, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(userAnswer1)
                                .addComponent(userAnswer2)
                                .addComponent(userAnswer3))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 427, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(userAnswer4)
                            .addGap(120, 120, 120))))
                .addGap(0, 6, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addGap(61, 61, 61))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addComponent(userAnswer1)
                .addGap(18, 18, 18)
                .addComponent(userAnswer2)
                .addGap(18, 18, 18)
                .addComponent(userAnswer3)
                .addGap(18, 18, 18)
                .addComponent(userAnswer4)
                .addGap(26, 26, 26)
                .addComponent(jButton2)
                .addGap(58, 58, 58))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void userAnswer1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userAnswer1ActionPerformed
        // TODO add your handling code here:
        userAnswer = "1";
    }//GEN-LAST:event_userAnswer1ActionPerformed

    private void userAnswer2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userAnswer2ActionPerformed
        // TODO add your handling code here:
        userAnswer = "2";
    }//GEN-LAST:event_userAnswer2ActionPerformed

    private void userAnswer3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userAnswer3ActionPerformed
        // TODO add your handling code here:
        userAnswer = "3";
    }//GEN-LAST:event_userAnswer3ActionPerformed

    private void userAnswer4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userAnswer4ActionPerformed
        // TODO add your handling code here:
        userAnswer = "4";
    }//GEN-LAST:event_userAnswer4ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        int marks = 0;
        if(userAnswer4.isSelected()){
            marks++;
        }
        new Quiz3().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(Quiz2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Quiz2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Quiz2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Quiz2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Quiz2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JRadioButton userAnswer1;
    private javax.swing.JRadioButton userAnswer2;
    private javax.swing.JRadioButton userAnswer3;
    private javax.swing.JRadioButton userAnswer4;
    // End of variables declaration//GEN-END:variables
}