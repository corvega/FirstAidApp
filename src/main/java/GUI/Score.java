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
 * @author James and Marwan
 */
public class Score extends javax.swing.JFrame {


    /**
     * Creates new form Scores
     */
    public Score() {
        initComponents();
        getContentPane().setBackground(new Color(255,255,255)); //Sets the background colour to white
        setLocationRelativeTo(null); // Ensure the frame would open in the centre of the display
    }
    
    
    public void ProgressBar1(int QuizValue) {
        Session1Panel.setSize(new Dimension((QuizValue*3), 30)); //Sets the length of the progress bar based on the user's score across 300 pixels length
        Session1ScoreLabel.setText(QuizValue+"%"); //Prints the user's percentage score
        if (QuizValue==0) {
            Session1Panel.setSize(new Dimension((300), 30)); //Sets the progress bar to full size if they recieve 0 score so the text and colour is visible
            Session1Panel.setBackground(new Color(249, 6, 6)); //Sets the progress bar to red
        } else if (QuizValue<40) {
            Session1Panel.setBackground(new Color(249, 6, 6)); //Sets the progress bar to red as they have less than 40% correct
        } else if (QuizValue>=80) {
            Session1Panel.setBackground(new Color(0, 128, 0)); //Sets the progress bar to green as they have 80% or more correct
        } else {
            Session1Panel.setBackground(new Color(255, 255, 102)); //Sets the progress bar to yellow for between 40% and 80% correct
        }
    }
    
    public void ProgressBar2(int QuizValue) {
        Session2Panel.setSize(new Dimension((QuizValue*3), 30)); //Sets the length of the progress bar based on the user's score across 300 pixels length
        Session2ScoreLabel.setText(QuizValue+"%");  //Prints the user's percentage score
        if (QuizValue==0) {
            Session2Panel.setSize(new Dimension((300), 30)); //Sets the progress bar to full size if they recieve 0 score so the text and colour is visible
            Session2Panel.setBackground(new Color(249, 6, 6)); //Sets the progress bar to red
        } else if (QuizValue<40) {
            Session2Panel.setBackground(new Color(249, 6, 6)); //Sets the progress bar to red as they have less than 40% correct
        } else if (QuizValue>=80) {
            Session2Panel.setBackground(new Color(0, 128, 0)); //Sets the progress bar to green as they have 80% or more correct
        } else {
            Session2Panel.setBackground(new Color(255, 255, 102)); //Sets the progress bar to yellow for between 40% and 80% correct
        }
    }
    
    public void ProgressBar3(int QuizValue) {
        Session3Panel.setSize(new Dimension((QuizValue*3), 30)); //Sets the length of the progress bar based on the user's score across 300 pixels length
        Session3ScoreLabel.setText(QuizValue+"%"); //Prints the user's percentage score
        if (QuizValue==0) {
            Session3Panel.setSize(new Dimension((300), 30)); //Sets the progress bar to full size if they recieve 0 score so the text and colour is visible
            Session3Panel.setBackground(new Color(249, 6, 6)); //Sets the progress bar to red
        } else if (QuizValue<40) {
            Session3Panel.setBackground(new Color(249, 6, 6)); //Sets the progress bar to red as they have less than 40% correct
        } else if (QuizValue>=80) {
            Session3Panel.setBackground(new Color(0, 128, 0)); //Sets the progress bar to green as they have 80% or more correct
        } else {
            Session3Panel.setBackground(new Color(255, 255, 102)); //Sets the progress bar to yellow for between 40% and 80% correct
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

        back = new javax.swing.JButton();
        header = new javax.swing.JLabel();
        Session1Label = new javax.swing.JLabel();
        Session3Label = new javax.swing.JLabel();
        Session2Label = new javax.swing.JLabel();
        Session3Panel = new javax.swing.JPanel();
        Session3ScoreLabel = new javax.swing.JLabel();
        Session1Panel = new javax.swing.JPanel();
        Session1ScoreLabel = new javax.swing.JLabel();
        Session2Panel = new javax.swing.JPanel();
        Session2ScoreLabel = new javax.swing.JLabel();
        HeaderBackground = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setMaximumSize(new java.awt.Dimension(370, 640));
        setMinimumSize(new java.awt.Dimension(370, 640));
        setName("Scores"); // NOI18N
        setPreferredSize(new java.awt.Dimension(370, 640));
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

        header.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Scores/scoreScreen.png"))); // NOI18N
        getContentPane().add(header);
        header.setBounds(-20, 0, 380, 170);

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

        Session3Panel.setBackground(new java.awt.Color(0, 153, 255));
        Session3Panel.setMaximumSize(new java.awt.Dimension(300, 30));
        Session3Panel.setMinimumSize(new java.awt.Dimension(0, 30));
        Session3Panel.setPreferredSize(new java.awt.Dimension(300, 30));

        Session3ScoreLabel.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        Session3ScoreLabel.setText("No Data");

        javax.swing.GroupLayout Session3PanelLayout = new javax.swing.GroupLayout(Session3Panel);
        Session3Panel.setLayout(Session3PanelLayout);
        Session3PanelLayout.setHorizontalGroup(
            Session3PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Session3PanelLayout.createSequentialGroup()
                .addGap(0, 239, Short.MAX_VALUE)
                .addComponent(Session3ScoreLabel))
        );
        Session3PanelLayout.setVerticalGroup(
            Session3PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Session3ScoreLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        getContentPane().add(Session3Panel);
        Session3Panel.setBounds(30, 493, 300, 30);

        Session1Panel.setBackground(new java.awt.Color(0, 128, 0));
        Session1Panel.setMaximumSize(new java.awt.Dimension(300, 30));
        Session1Panel.setMinimumSize(new java.awt.Dimension(0, 30));
        Session1Panel.setPreferredSize(new java.awt.Dimension(300, 30));

        Session1ScoreLabel.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        Session1ScoreLabel.setText("80%");

        javax.swing.GroupLayout Session1PanelLayout = new javax.swing.GroupLayout(Session1Panel);
        Session1Panel.setLayout(Session1PanelLayout);
        Session1PanelLayout.setHorizontalGroup(
            Session1PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Session1PanelLayout.createSequentialGroup()
                .addGap(0, 209, Short.MAX_VALUE)
                .addComponent(Session1ScoreLabel))
        );
        Session1PanelLayout.setVerticalGroup(
            Session1PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Session1ScoreLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        getContentPane().add(Session1Panel);
        Session1Panel.setBounds(30, 181, 240, 30);

        Session2Panel.setBackground(new java.awt.Color(255, 255, 102));
        Session2Panel.setMaximumSize(new java.awt.Dimension(300, 30));
        Session2Panel.setMinimumSize(new java.awt.Dimension(0, 30));
        Session2Panel.setPreferredSize(new java.awt.Dimension(300, 30));

        Session2ScoreLabel.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        Session2ScoreLabel.setText("60%");

        javax.swing.GroupLayout Session2PanelLayout = new javax.swing.GroupLayout(Session2Panel);
        Session2Panel.setLayout(Session2PanelLayout);
        Session2PanelLayout.setHorizontalGroup(
            Session2PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Session2PanelLayout.createSequentialGroup()
                .addGap(0, 149, Short.MAX_VALUE)
                .addComponent(Session2ScoreLabel))
        );
        Session2PanelLayout.setVerticalGroup(
            Session2PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Session2ScoreLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        getContentPane().add(Session2Panel);
        Session2Panel.setBounds(30, 342, 180, 30);

        HeaderBackground.setBackground(new java.awt.Color(249, 6, 6));
        HeaderBackground.setOpaque(true);
        HeaderBackground.setPreferredSize(new java.awt.Dimension(360, 110));
        getContentPane().add(HeaderBackground);
        HeaderBackground.setBounds(0, 0, 360, 110);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        new Menu().setVisible(true); //Create a new Menu frame
        this.setVisible(false); // Turn off visibility for this frame
    }//GEN-LAST:event_backActionPerformed

    //The below code is commented out for prototype purposes
    //The code requires Red,Green or Blue to be passed to it and then detects which colourblindness setting is currently active
    //It then outputs the colour inputted based on this setting
    //It is designed to be used in the progress bar
    //Example code: Session1Panel.setBackground(colourChecker("Red"));
    
//    public void colourChecker(String colour) {
//        if (defaultColours=true) {
//            switch (colour) {
//            case "Red":
//                System.out.println("new Color(249, 6, 6)");
//            case "Green":
//                System.out.println("new Color(0, 128, 0)");
//            case "Blue":
//                System.out.println("new Color(77, 77, 255)");
//            }
//        } else if (DeutranaopiaColours=true) {
//            switch (colour) {
//            case "Red":
//                System.out.println("new Color(238, 43, 150)");
//            case "Green":
//                System.out.println("new Color(0, 155, 33)");
//            case "Blue":
//                System.out.println("new Color(0, 64, 224)");
//            }
//        } else if (ProtanopiaColours=true) {
//            switch (colour) {
//            case "Red":
//                System.out.println("new Color(250, 56, 143)");
//            case "Green":
//                System.out.println("new Color(0, 128, 28)");
//            case "Blue":
//                System.out.println("new Color(6, 68, 224)");
//            }
//        } else if (TritanopiaColours=true)
//            switch (colour) {
//            case "Red":
//                System.out.println("new Color(255, 0, 0)");
//            case "Green":
//                System.out.println("new Color(0, 179, 60)");
//            case "Blue":
//                System.out.println("new Color(0, 0, 196)");
//            }
//        }
//    }
    
    
    public void defaultColoursScores(String colour){
        HeaderBackground.setBackground(new Color(249, 6, 6));
        //Sets the colours back to the original default
    }
    
    public void DeuteranopiaColoursScores(String colour){
        HeaderBackground.setBackground(new Color(238, 43, 150));
        //Sets the colours to allow for easier reading for those who suffer from Deuteranopia colourblindness
    }
    
    public void ProtanopiaColoursScores(String colour){
        HeaderBackground.setBackground(new Color(250, 56, 143));
        //Sets the colours to allow for easier reading for those who suffer from Protanopia colourblindness
    }

    public void TritanopiaColoursScores(String colour){
        HeaderBackground.setBackground(new Color(255, 0, 0));
        //Sets the colours to allow for easier reading for those who suffer from Tritanopia colourblindness
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
            java.util.logging.Logger.getLogger(Score.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Score.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Score.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Score.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Score().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel HeaderBackground;
    private javax.swing.JLabel Session1Label;
    private javax.swing.JPanel Session1Panel;
    private javax.swing.JLabel Session1ScoreLabel;
    private javax.swing.JLabel Session2Label;
    private javax.swing.JPanel Session2Panel;
    private javax.swing.JLabel Session2ScoreLabel;
    private javax.swing.JLabel Session3Label;
    private javax.swing.JPanel Session3Panel;
    private javax.swing.JLabel Session3ScoreLabel;
    private javax.swing.JButton back;
    private javax.swing.JLabel header;
    // End of variables declaration//GEN-END:variables
}
