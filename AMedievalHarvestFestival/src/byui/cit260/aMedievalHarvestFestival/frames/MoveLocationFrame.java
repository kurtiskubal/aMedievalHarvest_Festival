/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package byui.cit260.aMedievalHarvestFestival.frames;

/**
 *
 * @author Kurt
 */
public class MoveLocationFrame extends javax.swing.JFrame {

    /**
     * Creates new form MoveLocationFrame
     */
    public MoveLocationFrame() {
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

        jpLocationBody = new javax.swing.JPanel();
        jpLocationHeading = new javax.swing.JPanel();
        jlMoveLocationTitle = new javax.swing.JLabel();
        jbMyRoom = new javax.swing.JButton();
        jbLadyVioRoom = new javax.swing.JButton();
        jbDukeFredRoom = new javax.swing.JButton();
        jbDukeHaroRoom = new javax.swing.JButton();
        jbDukeLuisRoom = new javax.swing.JButton();
        jbLordCanaRoom = new javax.swing.JButton();
        jbEmptyRoom = new javax.swing.JButton();
        jbServantsQ = new javax.swing.JButton();
        jbPrinRoom = new javax.swing.JButton();
        jbKingRoom = new javax.swing.JButton();
        jbKingRestroom = new javax.swing.JButton();
        jbGardens = new javax.swing.JButton();
        jbStables = new javax.swing.JButton();
        jbCourtyard = new javax.swing.JButton();
        jbGuestRR = new javax.swing.JButton();
        jbKitchen = new javax.swing.JButton();
        jbAudCham = new javax.swing.JButton();
        jbDineHall = new javax.swing.JButton();
        jbLibrary = new javax.swing.JButton();
        jbPool = new javax.swing.JButton();
        jbExit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jpLocationBody.setBackground(new java.awt.Color(153, 255, 153));

        jpLocationHeading.setBackground(new java.awt.Color(153, 255, 255));

        jlMoveLocationTitle.setFont(new java.awt.Font("Vivaldi", 2, 21)); // NOI18N
        jlMoveLocationTitle.setForeground(new java.awt.Color(0, 0, 204));
        jlMoveLocationTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlMoveLocationTitle.setText("Move to a Location Menu");

        javax.swing.GroupLayout jpLocationHeadingLayout = new javax.swing.GroupLayout(jpLocationHeading);
        jpLocationHeading.setLayout(jpLocationHeadingLayout);
        jpLocationHeadingLayout.setHorizontalGroup(
            jpLocationHeadingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpLocationHeadingLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlMoveLocationTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jpLocationHeadingLayout.setVerticalGroup(
            jpLocationHeadingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpLocationHeadingLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlMoveLocationTitle, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)
                .addContainerGap())
        );

        jbMyRoom.setText("My Room");

        jbLadyVioRoom.setText("Lady Violet's Room");

        jbDukeFredRoom.setText("Duke Frederick's Room");

        jbDukeHaroRoom.setText("Duke Harold's Room");

        jbDukeLuisRoom.setText("Duke Luis' Room");

        jbLordCanaRoom.setText("Lord Canaway's Room");
        jbLordCanaRoom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbLordCanaRoomActionPerformed(evt);
            }
        });

        jbEmptyRoom.setText("Empty Room");
        jbEmptyRoom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbEmptyRoomActionPerformed(evt);
            }
        });

        jbServantsQ.setText("Servants' Quarters");

        jbPrinRoom.setText("Princess' Room");
        jbPrinRoom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbPrinRoomActionPerformed(evt);
            }
        });

        jbKingRoom.setText("King's Room");

        jbKingRestroom.setText("King's Private Restroom");
        jbKingRestroom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbKingRestroomActionPerformed(evt);
            }
        });

        jbGardens.setText("Gardens");

        jbStables.setText("Stables");
        jbStables.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbStablesActionPerformed(evt);
            }
        });

        jbCourtyard.setText("Courtyard");

        jbGuestRR.setText("Guest's Restroom");

        jbKitchen.setText("Kitchen");

        jbAudCham.setText("Audience Chamber");

        jbDineHall.setText("Dining Hall");

        jbLibrary.setText("Library");
        jbLibrary.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbLibraryActionPerformed(evt);
            }
        });

        jbPool.setText("Pool");
        jbPool.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbPoolActionPerformed(evt);
            }
        });

        jbExit.setText("Cancel");
        jbExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbExitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpLocationBodyLayout = new javax.swing.GroupLayout(jpLocationBody);
        jpLocationBody.setLayout(jpLocationBodyLayout);
        jpLocationBodyLayout.setHorizontalGroup(
            jpLocationBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpLocationHeading, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jpLocationBodyLayout.createSequentialGroup()
                .addGroup(jpLocationBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpLocationBodyLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jpLocationBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jbMyRoom, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jbLadyVioRoom, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jbDukeFredRoom, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jbDukeHaroRoom, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jbDukeLuisRoom, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jbLordCanaRoom, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jbEmptyRoom, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jbServantsQ, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jbPrinRoom, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jbKingRoom, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jpLocationBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jbCourtyard, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jbGuestRR, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jbKitchen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jbAudCham, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jbDineHall, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jbLibrary, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jbKingRestroom, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jbGardens, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jbStables, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jbPool, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jpLocationBodyLayout.createSequentialGroup()
                        .addGap(123, 123, 123)
                        .addComponent(jbExit)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jpLocationBodyLayout.setVerticalGroup(
            jpLocationBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpLocationBodyLayout.createSequentialGroup()
                .addComponent(jpLocationHeading, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jpLocationBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbMyRoom)
                    .addComponent(jbKingRestroom))
                .addGap(4, 4, 4)
                .addGroup(jpLocationBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbLadyVioRoom)
                    .addComponent(jbGardens))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpLocationBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbDukeFredRoom)
                    .addComponent(jbStables))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpLocationBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbDukeHaroRoom)
                    .addComponent(jbCourtyard))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpLocationBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbDukeLuisRoom)
                    .addComponent(jbGuestRR))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpLocationBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbLordCanaRoom)
                    .addComponent(jbKitchen))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpLocationBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbEmptyRoom)
                    .addComponent(jbAudCham))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpLocationBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbServantsQ)
                    .addComponent(jbDineHall))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpLocationBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbPrinRoom)
                    .addComponent(jbLibrary))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpLocationBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbKingRoom)
                    .addComponent(jbPool))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jbExit)
                .addGap(0, 11, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpLocationBody, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpLocationBody, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbLordCanaRoomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbLordCanaRoomActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbLordCanaRoomActionPerformed

    private void jbEmptyRoomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbEmptyRoomActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbEmptyRoomActionPerformed

    private void jbPrinRoomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbPrinRoomActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbPrinRoomActionPerformed

    private void jbKingRestroomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbKingRestroomActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbKingRestroomActionPerformed

    private void jbStablesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbStablesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbStablesActionPerformed

    private void jbLibraryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbLibraryActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbLibraryActionPerformed

    private void jbPoolActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbPoolActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbPoolActionPerformed

    private void jbExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbExitActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbExitActionPerformed

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
            java.util.logging.Logger.getLogger(MoveLocationFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MoveLocationFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MoveLocationFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MoveLocationFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MoveLocationFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jbAudCham;
    private javax.swing.JButton jbCourtyard;
    private javax.swing.JButton jbDineHall;
    private javax.swing.JButton jbDukeFredRoom;
    private javax.swing.JButton jbDukeHaroRoom;
    private javax.swing.JButton jbDukeLuisRoom;
    private javax.swing.JButton jbEmptyRoom;
    private javax.swing.JButton jbExit;
    private javax.swing.JButton jbGardens;
    private javax.swing.JButton jbGuestRR;
    private javax.swing.JButton jbKingRestroom;
    private javax.swing.JButton jbKingRoom;
    private javax.swing.JButton jbKitchen;
    private javax.swing.JButton jbLadyVioRoom;
    private javax.swing.JButton jbLibrary;
    private javax.swing.JButton jbLordCanaRoom;
    private javax.swing.JButton jbMyRoom;
    private javax.swing.JButton jbPool;
    private javax.swing.JButton jbPrinRoom;
    private javax.swing.JButton jbServantsQ;
    private javax.swing.JButton jbStables;
    private javax.swing.JLabel jlMoveLocationTitle;
    private javax.swing.JPanel jpLocationBody;
    private javax.swing.JPanel jpLocationHeading;
    // End of variables declaration//GEN-END:variables
}
