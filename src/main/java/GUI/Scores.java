/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import java.awt.Color;
import java.awt.Dimension;

/**
 *
 * @author up839921
 */
public class Scores extends javax.swing.JFrame {


    /**
     * Creates new form Scores
     */
    public Scores() {
        initComponents();
        getContentPane().setBackground(new java.awt.Color(255,255,255));
    }
    
    
    public void ProgressBar1(int QuizValue) {
        Session1Panel.setSize(new Dimension((QuizValue*3), 30));
        Session1ScoreLabel.setText(QuizValue+"%");
        if (QuizValue<40) {
            Session1Panel.setBackground(new Color(249, 6, 6));
        } else if (QuizValue>80) {
            Session1Panel.setBackground(new Color(0, 128, 0));
        } else {
            Session1Panel.setBackground(new Color(255, 255, 102));
        }
    }
    
    public void ProgressBar2(int QuizValue) {
        Session2Panel.setSize(new Dimension((QuizValue*3), 30));
        Session2ScoreLabel.setText(QuizValue+"%");
        if (QuizValue<40) {
            Session2Panel.setBackground(new Color(249, 6, 6));
        } else if (QuizValue>80) {
            Session2Panel.setBackground(new Color(0, 128, 0));
        } else {
            Session2Panel.setBackground(new Color(255, 255, 102));
        }
    }
    
    public void ProgressBar3(int QuizValue) {
        Session3Panel.setSize(new Dimension((QuizValue*3), 30));
        Session3ScoreLabel.setText(QuizValue+"%");
        if (QuizValue<40) {
            Session3Panel.setBackground(new Color(249, 6, 6));
        } else if (QuizValue>80) {
            Session3Panel.setBackground(new Color(0, 128, 0));
        } else {
            Session3Panel.setBackground(new Color(255, 255, 102));
        }
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Session1Label = new javax.swing.JLabel();
        Session3Label = new javax.swing.JLabel();
        Session2Label = new javax.swing.JLabel();
        Session3Panel = new javax.swing.JPanel();
        Session3ScoreLabel = new javax.swing.JLabel();
        Session1Panel = new javax.swing.JPanel();
        Session1ScoreLabel = new javax.swing.JLabel();
        Session2Panel = new javax.swing.JPanel();
        Session2ScoreLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        Session1Label.setFont(new java.awt.Font("Calibri", 0, 36)); // NOI18N
        Session1Label.setText("Quiz - Session 1");

        Session3Label.setFont(new java.awt.Font("Calibri", 0, 36)); // NOI18N
        Session3Label.setText("Quiz - Session 3");

        Session2Label.setFont(new java.awt.Font("Calibri", 0, 36)); // NOI18N
        Session2Label.setText("Quiz - Session 2");

        Session3Panel.setBackground(new java.awt.Color(0, 153, 255));
        Session3Panel.setMaximumSize(new java.awt.Dimension(300, 30));
        Session3Panel.setMinimumSize(new java.awt.Dimension(0, 30));

        Session3ScoreLabel.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        Session3ScoreLabel.setText("No Data");

        javax.swing.GroupLayout Session3PanelLayout = new javax.swing.GroupLayout(Session3Panel);
        Session3Panel.setLayout(Session3PanelLayout);
        Session3PanelLayout.setHorizontalGroup(
            Session3PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Session3PanelLayout.createSequentialGroup()
                .addGap(0, 230, Short.MAX_VALUE)
                .addComponent(Session3ScoreLabel))
        );
        Session3PanelLayout.setVerticalGroup(
            Session3PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Session3ScoreLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        Session1Panel.setBackground(new java.awt.Color(0, 153, 255));
        Session1Panel.setMaximumSize(new java.awt.Dimension(300, 30));
        Session1Panel.setMinimumSize(new java.awt.Dimension(0, 30));

        Session1ScoreLabel.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        Session1ScoreLabel.setText("No Data");

        javax.swing.GroupLayout Session1PanelLayout = new javax.swing.GroupLayout(Session1Panel);
        Session1Panel.setLayout(Session1PanelLayout);
        Session1PanelLayout.setHorizontalGroup(
            Session1PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Session1PanelLayout.createSequentialGroup()
                .addGap(0, 230, Short.MAX_VALUE)
                .addComponent(Session1ScoreLabel))
        );
        Session1PanelLayout.setVerticalGroup(
            Session1PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Session1ScoreLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        Session2Panel.setBackground(new java.awt.Color(0, 153, 255));
        Session2Panel.setMaximumSize(new java.awt.Dimension(300, 30));
        Session2Panel.setMinimumSize(new java.awt.Dimension(0, 30));

        Session2ScoreLabel.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        Session2ScoreLabel.setText("No Data");

        javax.swing.GroupLayout Session2PanelLayout = new javax.swing.GroupLayout(Session2Panel);
        Session2Panel.setLayout(Session2PanelLayout);
        Session2PanelLayout.setHorizontalGroup(
            Session2PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Session2PanelLayout.createSequentialGroup()
                .addGap(0, 230, Short.MAX_VALUE)
                .addComponent(Session2ScoreLabel))
        );
        Session2PanelLayout.setVerticalGroup(
            Session2PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Session2ScoreLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(Session1Label, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(Session1Panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(Session2Label))
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(Session2Panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(Session3Label, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(Session3Panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(131, 131, 131)
                .addComponent(Session1Label)
                .addGap(6, 6, 6)
                .addComponent(Session1Panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(73, 73, 73)
                .addComponent(Session2Label)
                .addGap(14, 14, 14)
                .addComponent(Session2Panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(65, 65, 65)
                .addComponent(Session3Label)
                .addGap(12, 12, 12)
                .addComponent(Session3Panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        ProgressBar1(86);
        ProgressBar2(67);
        ProgressBar3(32);
    }//GEN-LAST:event_formWindowActivated
    
    
    
//    public void colourChecker(String colour) {
//        if (defaultColours=true) {
//            defaultColoursScores(colour);
//        } else if (DeutranaopiaColours=true) {
//            DeutranopiaColoursScores(colour);
//        } else if (ProtanopiaColours=true) {
//            ProtanopiaColoursScores(colour);
//        } else if (TritanopiaColours=true)
//            TritanopiaColoursScores(colour);
//        }
//    }
    
    
    public void defaultColoursScores(String colour){
        switch (colour) {
            case "Red":
                System.out.println("new Color(249, 0, 0)");
            case "Green":
                System.out.println("new Color(0, 128, 0)");
            case "Blue":
                System.out.println("new Color(77, 77, 255)");
        }
    }
    
    public void DeuteranopiaColoursScores(String colour){
        switch (colour) {
            case "Red":
                System.out.println("new Color(238, 43, 150)");
            case "Green":
                System.out.println("new Color(0, 155, 33)");
            case "Blue":
                System.out.println("new Color(0, 64, 224)");
        }
    }
    
    public void ProtanopiaColoursScores(String colour){
        switch (colour) {
            case "Red":
                System.out.println("new Color(250, 56, 143)");
            case "Green":
                System.out.println("new Color(0, 128, 28)");
            case "Blue":
                System.out.println("new Color(6, 68, 224)");
        }
    }

    public void TritanopiaColoursScores(String colour){
        switch (colour) {
            case "Red":
                System.out.println("new Color(255, 0, 0)");
            case "Green":
                System.out.println("new Color(0, 179, 60)");
            case "Blue":
                System.out.println("new Color(0, 0, 196)");
        }
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
            java.util.logging.Logger.getLogger(Scores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Scores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Scores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Scores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Scores().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Session1Label;
    private javax.swing.JPanel Session1Panel;
    private javax.swing.JLabel Session1ScoreLabel;
    private javax.swing.JLabel Session2Label;
    private javax.swing.JPanel Session2Panel;
    private javax.swing.JLabel Session2ScoreLabel;
    private javax.swing.JLabel Session3Label;
    private javax.swing.JPanel Session3Panel;
    private javax.swing.JLabel Session3ScoreLabel;
    // End of variables declaration//GEN-END:variables
}
