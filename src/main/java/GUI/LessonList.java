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
public class LessonList extends javax.swing.JFrame {

    /**
     * Creates new form LessonList
     */
    public LessonList() {
        initComponents();
        getContentPane().setBackground(new java.awt.Color(255,255,255));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        CPRButton = new javax.swing.JButton();
        UnresponsiveBreathingButton = new javax.swing.JButton();
        HeavyBleedingButton = new javax.swing.JButton();
        BurnsButton = new javax.swing.JButton();
        ChokingButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(360, 640));

        CPRButton.setBackground(new java.awt.Color(249, 6, 6));
        CPRButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImageFiles/CPR LessonList.png"))); // NOI18N
        CPRButton.setMaximumSize(new java.awt.Dimension(159, 169));
        CPRButton.setMinimumSize(new java.awt.Dimension(159, 169));
        CPRButton.setPreferredSize(new java.awt.Dimension(290, 90));
        CPRButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CPRButtonActionPerformed(evt);
            }
        });

        UnresponsiveBreathingButton.setBackground(new java.awt.Color(249, 6, 6));
        UnresponsiveBreathingButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImageFiles/Unresponsive-Breathing LessonList.png"))); // NOI18N
        UnresponsiveBreathingButton.setMaximumSize(new java.awt.Dimension(159, 169));
        UnresponsiveBreathingButton.setMinimumSize(new java.awt.Dimension(159, 169));
        UnresponsiveBreathingButton.setPreferredSize(new java.awt.Dimension(290, 90));
        UnresponsiveBreathingButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UnresponsiveBreathingButtonActionPerformed(evt);
            }
        });

        HeavyBleedingButton.setBackground(new java.awt.Color(249, 6, 6));
        HeavyBleedingButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImageFiles/Heavy-Bleeding LessonList.png"))); // NOI18N
        HeavyBleedingButton.setMaximumSize(new java.awt.Dimension(159, 169));
        HeavyBleedingButton.setMinimumSize(new java.awt.Dimension(159, 169));
        HeavyBleedingButton.setPreferredSize(new java.awt.Dimension(290, 90));
        HeavyBleedingButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HeavyBleedingButtonActionPerformed(evt);
            }
        });

        BurnsButton.setBackground(new java.awt.Color(249, 6, 6));
        BurnsButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImageFiles/Burns LessonList.png"))); // NOI18N
        BurnsButton.setMaximumSize(new java.awt.Dimension(159, 169));
        BurnsButton.setMinimumSize(new java.awt.Dimension(159, 169));
        BurnsButton.setPreferredSize(new java.awt.Dimension(290, 90));
        BurnsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BurnsButtonActionPerformed(evt);
            }
        });

        ChokingButton.setBackground(new java.awt.Color(249, 6, 6));
        ChokingButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImageFiles/Choking LessonList.png"))); // NOI18N
        ChokingButton.setMaximumSize(new java.awt.Dimension(159, 169));
        ChokingButton.setMinimumSize(new java.awt.Dimension(159, 169));
        ChokingButton.setPreferredSize(new java.awt.Dimension(290, 90));
        ChokingButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ChokingButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ChokingButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BurnsButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(HeavyBleedingButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(UnresponsiveBreathingButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CPRButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(35, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(110, Short.MAX_VALUE)
                .addComponent(CPRButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(UnresponsiveBreathingButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(HeavyBleedingButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(BurnsButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ChokingButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CPRButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CPRButtonActionPerformed
        //new Lesson().setVisible(true);
        //Set which lesson to go to here
        this.setVisible(false);
    }//GEN-LAST:event_CPRButtonActionPerformed

    private void UnresponsiveBreathingButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UnresponsiveBreathingButtonActionPerformed
        //new Lesson().setVisible(true);
        //Set which lesson to go to here
        this.setVisible(false);
    }//GEN-LAST:event_UnresponsiveBreathingButtonActionPerformed

    private void HeavyBleedingButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HeavyBleedingButtonActionPerformed
        //new Lesson().setVisible(true);
        //Set which lesson to go to here
        this.setVisible(false);
    }//GEN-LAST:event_HeavyBleedingButtonActionPerformed

    private void BurnsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BurnsButtonActionPerformed
        //new Lesson().setVisible(true);
        //Set which lesson to go to here
        this.setVisible(false);
    }//GEN-LAST:event_BurnsButtonActionPerformed

    private void ChokingButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ChokingButtonActionPerformed
        //new Lesson().setVisible(true);
        //Set which lesson to go to here
        this.setVisible(false);
    }//GEN-LAST:event_ChokingButtonActionPerformed

    
    
    
    
    public void defaultColoursLessonList(){
        //Header.setBackground(new Color(249, 6, 6));
        CPRButton.setBackground(new Color(249, 6, 6));
        UnresponsiveBreathingButton.setBackground(new Color(249, 6, 6));
        HeavyBleedingButton.setBackground(new Color(249, 6, 6));
        BurnsButton.setBackground(new Color(249, 6, 6));
        ChokingButton.setBackground(new Color(249, 6, 6));
    }
    
    public void DeuteranopiaColoursLessonList(){
        //Header.setBackground(new Color(238, 43, 150));
        CPRButton.setBackground(new Color(238, 43, 150));
        UnresponsiveBreathingButton.setBackground(new Color(238, 43, 150));
        HeavyBleedingButton.setBackground(new Color(238, 43, 150));
        BurnsButton.setBackground(new Color(238, 43, 150));
        ChokingButton.setBackground(new Color(238, 43, 150));
    }
    
    public void ProtanopiaColoursLessonList(){
        //Header.setBackground(new Color(250, 56, 143));
        CPRButton.setBackground(new Color(250, 56, 143));
        UnresponsiveBreathingButton.setBackground(new Color(250, 56, 143));
        HeavyBleedingButton.setBackground(new Color(250, 56, 143));
        BurnsButton.setBackground(new Color(250, 56, 143));
        ChokingButton.setBackground(new Color(250, 56, 143));
    }
    
    public void TritanopiaColoursLessonList(){
        //Header.setBackground(new Color(255, 0, 0));
        CPRButton.setBackground(new Color(255, 0, 0));
        UnresponsiveBreathingButton.setBackground(new Color(255, 0, 0));
        HeavyBleedingButton.setBackground(new Color(255, 0, 0));
        BurnsButton.setBackground(new Color(255, 0, 0));
        ChokingButton.setBackground(new Color(255, 0, 0));
    }
    
    
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
            java.util.logging.Logger.getLogger(LessonList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LessonList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LessonList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LessonList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LessonList().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BurnsButton;
    private javax.swing.JButton CPRButton;
    private javax.swing.JButton ChokingButton;
    private javax.swing.JButton HeavyBleedingButton;
    private javax.swing.JButton UnresponsiveBreathingButton;
    // End of variables declaration//GEN-END:variables
}
