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
   double gp=0.0;
    
    
    public void ProgressBar1(int QuizValue) {
        ProBar.setValue((int)this.gp);
    }   

public void getPoints(double pts){
   gp=pts;
}
    
    
   /* public void ProgressBar2(int QuizValue) {
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
    }*/
    
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
        ProBar = new javax.swing.JProgressBar();
        ProBar1 = new javax.swing.JProgressBar();
        ProBar2 = new javax.swing.JProgressBar();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setMaximumSize(new java.awt.Dimension(370, 680));
        setMinimumSize(new java.awt.Dimension(370, 680));
        setPreferredSize(new java.awt.Dimension(370, 680));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });
        getContentPane().setLayout(null);

        Session1Label.setFont(new java.awt.Font("Calibri", 0, 36)); // NOI18N
        Session1Label.setText("Quiz - Session 1");
        getContentPane().add(Session1Label);
        Session1Label.setBounds(27, 131, 300, 44);

        Session3Label.setFont(new java.awt.Font("Calibri", 0, 36)); // NOI18N
        Session3Label.setText("Quiz - Session 3");
        getContentPane().add(Session3Label);
        Session3Label.setBounds(27, 437, 300, 44);

        Session2Label.setFont(new java.awt.Font("Calibri", 0, 36)); // NOI18N
        Session2Label.setText("Quiz - Session 2");
        getContentPane().add(Session2Label);
        Session2Label.setBounds(27, 284, 227, 44);

        ProBar.setMaximum(300);
        ProBar.setStringPainted(true);
        getContentPane().add(ProBar);
        ProBar.setBounds(30, 180, 297, 30);

        ProBar1.setMaximum(300);
        ProBar1.setStringPainted(true);
        getContentPane().add(ProBar1);
        ProBar1.setBounds(30, 340, 297, 30);

        ProBar2.setMaximum(300);
        ProBar2.setStringPainted(true);
        getContentPane().add(ProBar2);
        ProBar2.setBounds(30, 490, 297, 30);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        ProgressBar1(86);
        //ProgressBar2(67);
        //ProgressBar3(32);
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
    private javax.swing.JProgressBar ProBar;
    private javax.swing.JProgressBar ProBar1;
    private javax.swing.JProgressBar ProBar2;
    private javax.swing.JLabel Session1Label;
    private javax.swing.JLabel Session2Label;
    private javax.swing.JLabel Session3Label;
    // End of variables declaration//GEN-END:variables
}
