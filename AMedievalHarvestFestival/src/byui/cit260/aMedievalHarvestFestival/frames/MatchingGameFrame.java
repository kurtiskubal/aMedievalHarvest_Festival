/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package byui.cit260.aMedievalHarvestFestival.frames;

import amedievalharvestfestival.AMedievalHarvestFestival;
import byui.cit260.aMedievalHarvestFestival.control.GameControl;
import byui.cit260.aMedievalHarvestFestival.control.MatchingControl;
import byui.cit260.aMedievalHarvestFestival.exceptions.MatchingControlException;
import byui.cit260.aMedievalHarvestFestival.model.MatchingGameLocation;
import byui.cit260.aMedievalHarvestFestival.view.GameMenuView;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author Kurt
 */
public class MatchingGameFrame extends javax.swing.JFrame {

    /**
     * Creates new form MatchingGameFrame
     */
    public MatchingGameFrame() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpMatchingBody = new javax.swing.JPanel();
        jpMatchingHeader = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jbExit = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtMatchingMessage = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        jtMatchingGame = new javax.swing.JTextArea();
        jtCoords = new javax.swing.JTextField();
        jbCheckLocation = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jpMatchingBody.setBackground(new java.awt.Color(153, 255, 153));

        jpMatchingHeader.setBackground(new java.awt.Color(153, 255, 255));

        jLabel1.setFont(new java.awt.Font("Vivaldi", 0, 21)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 204));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Matching Game");

        javax.swing.GroupLayout jpMatchingHeaderLayout = new javax.swing.GroupLayout(jpMatchingHeader);
        jpMatchingHeader.setLayout(jpMatchingHeaderLayout);
        jpMatchingHeaderLayout.setHorizontalGroup(
            jpMatchingHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpMatchingHeaderLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jpMatchingHeaderLayout.setVerticalGroup(
            jpMatchingHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpMatchingHeaderLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                .addContainerGap())
        );

        jbExit.setText("Exit");
        jbExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbExitActionPerformed(evt);
            }
        });

        jtMatchingMessage.setEditable(false);
        jtMatchingMessage.setBackground(new java.awt.Color(204, 204, 255));
        jtMatchingMessage.setColumns(20);
        jtMatchingMessage.setFont(new java.awt.Font("MingLiU_HKSCS-ExtB", 0, 12)); // NOI18N
        jtMatchingMessage.setLineWrap(true);
        jtMatchingMessage.setRows(5);
        jtMatchingMessage.setText("Once a coordinate displays \"OK\" you will be given an Apple and will be able to find it already in your inventory. Once you complete the game, the game will reset and you will have more chances to get Apples.\n");
        jtMatchingMessage.setWrapStyleWord(true);
        jScrollPane2.setViewportView(jtMatchingMessage);

        jtMatchingGame.setColumns(20);
        jtMatchingGame.setRows(5);
        jScrollPane3.setViewportView(jtMatchingGame);

        jtCoords.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtCoordsActionPerformed(evt);
            }
        });

        jbCheckLocation.setText("Check Coordinates");
        jbCheckLocation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCheckLocationActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpMatchingBodyLayout = new javax.swing.GroupLayout(jpMatchingBody);
        jpMatchingBody.setLayout(jpMatchingBodyLayout);
        jpMatchingBodyLayout.setHorizontalGroup(
            jpMatchingBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpMatchingHeader, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jpMatchingBodyLayout.createSequentialGroup()
                .addGroup(jpMatchingBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpMatchingBodyLayout.createSequentialGroup()
                        .addGroup(jpMatchingBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jpMatchingBodyLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 375, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jpMatchingBodyLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jScrollPane2)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpMatchingBodyLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jtCoords, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jbCheckLocation)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jbExit)))
                .addContainerGap())
        );
        jpMatchingBodyLayout.setVerticalGroup(
            jpMatchingBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpMatchingBodyLayout.createSequentialGroup()
                .addComponent(jpMatchingHeader, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 287, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jpMatchingBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbExit)
                    .addComponent(jtCoords, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbCheckLocation))
                .addGap(20, 20, 20))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpMatchingBody, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpMatchingBody, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbExitActionPerformed
        // TODO add your handling code here:
        AMedievalHarvestFestival.getGameMenu().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jbExitActionPerformed

    private void jtCoordsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtCoordsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtCoordsActionPerformed

    private void jbCheckLocationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCheckLocationActionPerformed
        // TODO add your handling code here:
       String coords = this.jtCoords.getText();
       coords = coords.trim();
       if (coords.length() != 2) {
           JOptionPane.showMessageDialog(this, "The coordinates must be non blank and only two character in length.", "Invalid Coordinates", JOptionPane.ERROR_MESSAGE);
       }
       else {
           try {
        MatchingGameLocation[][] matchingLocations = GameControl.getMatchingGameLocations();
        MatchingControl matchingControl = new MatchingControl();
        String[] coordsArr = coords.split("");
        String selectionMessage = matchingControl.showSelection(coordsArr);
        if (selectionMessage.length() > 1){
           JOptionPane.showMessageDialog(this, selectionMessage, "Message", JOptionPane.INFORMATION_MESSAGE);
        } } catch(MatchingControlException ex) {
             JOptionPane.showMessageDialog(this, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);         
         }
           this.getJtMatchingGame().setText(GameMenuView.displayMatchingGame());
       }
    }//GEN-LAST:event_jbCheckLocationActionPerformed

    public JLabel getjLabel1() {
        return jLabel1;
    }

    public void setjLabel1(JLabel jLabel1) {
        this.jLabel1 = jLabel1;
    }

    public JScrollPane getjScrollPane2() {
        return jScrollPane2;
    }

    public void setjScrollPane2(JScrollPane jScrollPane2) {
        this.jScrollPane2 = jScrollPane2;
    }

    public JTextArea getJtMatchingMessage() {
        return jtMatchingMessage;
    }

    public void setJtMatchingMessage(JTextArea jtMatchingMessage) {
        this.jtMatchingMessage = jtMatchingMessage;
    }

    

    public JButton getJbExit() {
        return jbExit;
    }

    public void setJbExit(JButton jbExit) {
        this.jbExit = jbExit;
    }

    public JPanel getJpMatchingBody() {
        return jpMatchingBody;
    }

    public void setJpMatchingBody(JPanel jpMatchingBody) {
        this.jpMatchingBody = jpMatchingBody;
    }

    public JPanel getJpMatchingHeader() {
        return jpMatchingHeader;
    }

    public void setJpMatchingHeader(JPanel jpMatchingHeader) {
        this.jpMatchingHeader = jpMatchingHeader;
    }

    public JScrollPane getjScrollPane3() {
        return jScrollPane3;
    }

    public void setjScrollPane3(JScrollPane jScrollPane3) {
        this.jScrollPane3 = jScrollPane3;
    }

    public JTextArea getJtMatchingGame() {
        return jtMatchingGame;
    }

    public void setJtMatchingGame(JTextArea jtMatchingGame) {
        this.jtMatchingGame = jtMatchingGame;
    }

    public JButton getJbCheckLocation() {
        return jbCheckLocation;
    }

    public void setJbCheckLocation(JButton jbCheckLocation) {
        this.jbCheckLocation = jbCheckLocation;
    }

    public JTextField getJtCoords() {
        return jtCoords;
    }

    public void setJtCoords(JTextField jtCoords) {
        this.jtCoords = jtCoords;
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
            java.util.logging.Logger.getLogger(MatchingGameFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MatchingGameFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MatchingGameFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MatchingGameFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MatchingGameFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JButton jbCheckLocation;
    private javax.swing.JButton jbExit;
    private javax.swing.JPanel jpMatchingBody;
    private javax.swing.JPanel jpMatchingHeader;
    private javax.swing.JTextField jtCoords;
    private javax.swing.JTextArea jtMatchingGame;
    private javax.swing.JTextArea jtMatchingMessage;
    // End of variables declaration//GEN-END:variables
}
