/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import java.awt.Color;

/**
 *
 * @author up839921
 */
public class PreviewResultsList extends javax.swing.JFrame {

    /**
     * Creates new form PreviewResultsList
     */
    public PreviewResultsList() {
        initComponents();
        getContentPane().setBackground(new Color(255, 255, 255));
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        back = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        CPRButton = new javax.swing.JButton();
        UnresponsiveBreathingButton = new javax.swing.JButton();
        HeavyBleedingButton = new javax.swing.JButton();
        BurnsButton = new javax.swing.JButton();
        ChokingButton = new javax.swing.JButton();
        HeaderBackground = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setName("PreviewResultsList"); // NOI18N
        setPreferredSize(new java.awt.Dimension(360, 640));
        setSize(new java.awt.Dimension(360, 640));
        getContentPane().setLayout(null);

        back.setBackground(new java.awt.Color(255, 51, 51));
        back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Main/back.png"))); // NOI18N
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });
        getContentPane().add(back);
        back.setBounds(20, 40, 30, 60);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Results/resultsScreen.png"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(-10, 0, 370, 170);

        CPRButton.setBackground(new java.awt.Color(249, 6, 6));
        CPRButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/LessonList/CPR LessonList.png"))); // NOI18N
        CPRButton.setMaximumSize(new java.awt.Dimension(159, 169));
        CPRButton.setMinimumSize(new java.awt.Dimension(159, 169));
        CPRButton.setPreferredSize(new java.awt.Dimension(290, 90));
        CPRButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CPRButtonActionPerformed(evt);
            }
        });
        getContentPane().add(CPRButton);
        CPRButton.setBounds(30, 120, 290, 90);

        UnresponsiveBreathingButton.setBackground(new java.awt.Color(249, 6, 6));
        UnresponsiveBreathingButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/LessonList/Unresponsive-Breathing LessonList.png"))); // NOI18N
        UnresponsiveBreathingButton.setMaximumSize(new java.awt.Dimension(159, 169));
        UnresponsiveBreathingButton.setMinimumSize(new java.awt.Dimension(159, 169));
        UnresponsiveBreathingButton.setPreferredSize(new java.awt.Dimension(290, 90));
        UnresponsiveBreathingButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UnresponsiveBreathingButtonActionPerformed(evt);
            }
        });
        getContentPane().add(UnresponsiveBreathingButton);
        UnresponsiveBreathingButton.setBounds(30, 220, 290, 90);

        HeavyBleedingButton.setBackground(new java.awt.Color(249, 6, 6));
        HeavyBleedingButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/LessonList/Heavy-Bleeding LessonList.png"))); // NOI18N
        HeavyBleedingButton.setMaximumSize(new java.awt.Dimension(159, 169));
        HeavyBleedingButton.setMinimumSize(new java.awt.Dimension(159, 169));
        HeavyBleedingButton.setPreferredSize(new java.awt.Dimension(290, 90));
        HeavyBleedingButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HeavyBleedingButtonActionPerformed(evt);
            }
        });
        getContentPane().add(HeavyBleedingButton);
        HeavyBleedingButton.setBounds(30, 320, 290, 90);

        BurnsButton.setBackground(new java.awt.Color(249, 6, 6));
        BurnsButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/LessonList/Burns LessonList.png"))); // NOI18N
        BurnsButton.setMaximumSize(new java.awt.Dimension(159, 169));
        BurnsButton.setMinimumSize(new java.awt.Dimension(159, 169));
        BurnsButton.setPreferredSize(new java.awt.Dimension(290, 90));
        BurnsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BurnsButtonActionPerformed(evt);
            }
        });
        getContentPane().add(BurnsButton);
        BurnsButton.setBounds(30, 420, 290, 90);

        ChokingButton.setBackground(new java.awt.Color(249, 6, 6));
        ChokingButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/LessonList/Choking LessonList.png"))); // NOI18N
        ChokingButton.setMaximumSize(new java.awt.Dimension(159, 169));
        ChokingButton.setMinimumSize(new java.awt.Dimension(159, 169));
        ChokingButton.setPreferredSize(new java.awt.Dimension(290, 90));
        ChokingButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ChokingButtonActionPerformed(evt);
            }
        });
        getContentPane().add(ChokingButton);
        ChokingButton.setBounds(30, 520, 290, 90);

        HeaderBackground.setBackground(new java.awt.Color(249, 6, 6));
        HeaderBackground.setOpaque(true);
        HeaderBackground.setPreferredSize(new java.awt.Dimension(360, 110));
        getContentPane().add(HeaderBackground);
        HeaderBackground.setBounds(0, 0, 360, 110);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CPRButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CPRButtonActionPerformed
        //new Results().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_CPRButtonActionPerformed

    private void UnresponsiveBreathingButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UnresponsiveBreathingButtonActionPerformed
        //new Results().setVisible(true);
        this.setVisible(false);;
    }//GEN-LAST:event_UnresponsiveBreathingButtonActionPerformed

    private void HeavyBleedingButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HeavyBleedingButtonActionPerformed
        //new Results().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_HeavyBleedingButtonActionPerformed

    private void BurnsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BurnsButtonActionPerformed
        //new Results().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_BurnsButtonActionPerformed

    private void ChokingButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ChokingButtonActionPerformed
        new Results().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_ChokingButtonActionPerformed

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        new Menu().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_backActionPerformed

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
            java.util.logging.Logger.getLogger(PreviewResultsList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PreviewResultsList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PreviewResultsList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PreviewResultsList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PreviewResultsList().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BurnsButton;
    private javax.swing.JButton CPRButton;
    private javax.swing.JButton ChokingButton;
    private javax.swing.JLabel HeaderBackground;
    private javax.swing.JButton HeavyBleedingButton;
    private javax.swing.JButton UnresponsiveBreathingButton;
    private javax.swing.JButton back;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
