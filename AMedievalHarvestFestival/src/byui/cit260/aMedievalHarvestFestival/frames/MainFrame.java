/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package byui.cit260.aMedievalHarvestFestival.frames;

import amedievalharvestfestival.AMedievalHarvestFestival;
import byui.cit260.aMedievalHarvestFestival.control.GameControl;
import com.sun.media.jfxmedia.events.NewFrameEvent;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTree;

/**
 *
 * @author Kurt
 */
public class MainFrame extends javax.swing.JFrame {

    /**
     * Creates new form MainFrame
     */
    public MainFrame() {
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

        jScrollPane2 = new javax.swing.JScrollPane();
        jTree1 = new javax.swing.JTree();
        jpBody = new javax.swing.JPanel();
        jpTitle = new javax.swing.JPanel();
        jlTitle = new javax.swing.JLabel();
        jpMenuItems = new javax.swing.JPanel();
        jbStartGame = new javax.swing.JButton();
        jbHowToPlay = new javax.swing.JButton();
        jbSaveGame = new javax.swing.JButton();
        jbExitMain = new javax.swing.JButton();
        jbHowToPlay1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtWelcome = new javax.swing.JTextArea();

        jScrollPane2.setViewportView(jTree1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jpBody.setBackground(new java.awt.Color(153, 255, 153));
        jpBody.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(102, 102, 102)));

        jpTitle.setBackground(new java.awt.Color(153, 255, 255));

        jlTitle.setFont(new java.awt.Font("Vivaldi", 2, 21)); // NOI18N
        jlTitle.setForeground(new java.awt.Color(0, 0, 204));
        jlTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlTitle.setText("Main Menu");

        javax.swing.GroupLayout jpTitleLayout = new javax.swing.GroupLayout(jpTitle);
        jpTitle.setLayout(jpTitleLayout);
        jpTitleLayout.setHorizontalGroup(
            jpTitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpTitleLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jlTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40))
        );
        jpTitleLayout.setVerticalGroup(
            jpTitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpTitleLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jpMenuItems.setBackground(new java.awt.Color(153, 255, 255));

        jbStartGame.setFont(new java.awt.Font("Miriam", 0, 11)); // NOI18N
        jbStartGame.setText("Start the Game");
        jbStartGame.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbStartGameActionPerformed(evt);
            }
        });

        jbHowToPlay.setFont(new java.awt.Font("Miriam", 0, 11)); // NOI18N
        jbHowToPlay.setText("How to Play");
        jbHowToPlay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbHowToPlayActionPerformed(evt);
            }
        });

        jbSaveGame.setFont(new java.awt.Font("Miriam", 0, 11)); // NOI18N
        jbSaveGame.setText("Save your Game");
        jbSaveGame.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSaveGameActionPerformed(evt);
            }
        });

        jbExitMain.setFont(new java.awt.Font("Miriam", 0, 11)); // NOI18N
        jbExitMain.setText("Exit");
        jbExitMain.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbExitMainActionPerformed(evt);
            }
        });

        jbHowToPlay1.setFont(new java.awt.Font("Miriam", 0, 11)); // NOI18N
        jbHowToPlay1.setText("Start Existing");
        jbHowToPlay1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbStartExistingGame(evt);
            }
        });

        javax.swing.GroupLayout jpMenuItemsLayout = new javax.swing.GroupLayout(jpMenuItems);
        jpMenuItems.setLayout(jpMenuItemsLayout);
        jpMenuItemsLayout.setHorizontalGroup(
            jpMenuItemsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpMenuItemsLayout.createSequentialGroup()
                .addGroup(jpMenuItemsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpMenuItemsLayout.createSequentialGroup()
                        .addGroup(jpMenuItemsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jpMenuItemsLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jbHowToPlay, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jpMenuItemsLayout.createSequentialGroup()
                                .addGap(39, 39, 39)
                                .addComponent(jbExitMain))
                            .addGroup(jpMenuItemsLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jbStartGame, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpMenuItemsLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jpMenuItemsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jbHowToPlay1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbSaveGame, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addContainerGap())
        );
        jpMenuItemsLayout.setVerticalGroup(
            jpMenuItemsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpMenuItemsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jbStartGame)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbHowToPlay1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbHowToPlay)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbSaveGame)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jbExitMain)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        jtWelcome.setEditable(false);
        jtWelcome.setBackground(new java.awt.Color(204, 204, 255));
        jtWelcome.setColumns(20);
        jtWelcome.setFont(new java.awt.Font("MingLiU_HKSCS-ExtB", 0, 13)); // NOI18N
        jtWelcome.setLineWrap(true);
        jtWelcome.setRows(5);
        jtWelcome.setText("Welcome to the game player's name! Have a good time! It is recommended that first time players visit the \"How to Play\" menu.");
        jtWelcome.setWrapStyleWord(true);
        jScrollPane1.setViewportView(jtWelcome);

        javax.swing.GroupLayout jpBodyLayout = new javax.swing.GroupLayout(jpBody);
        jpBody.setLayout(jpBodyLayout);
        jpBodyLayout.setHorizontalGroup(
            jpBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpTitle, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jpBodyLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jpMenuItems, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jpBodyLayout.setVerticalGroup(
            jpBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpBodyLayout.createSequentialGroup()
                .addComponent(jpTitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jpBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jpMenuItems, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1))
                .addGap(37, 37, 37))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpBody, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpBody, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbStartGameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbStartGameActionPerformed
        // TODO add your handling code here:
        if (AMedievalHarvestFestival.getCurrentGame() == null) {
            GameControl.createNewGame(AMedievalHarvestFestival.getPlayer());
            GameMenuFrame gameMenuFrame = new GameMenuFrame();
            gameMenuFrame.getJtMessage().setText("Your name is Lord Pharoah. You are a wealthy landowner"
                    + "in the land of Carlsburg. You have been invited by the"
                    + "royal family, the Williams, to a harvest festival, a"
                    + "celebration of the wealth of all the dukes, ladies, and lords"
                    + "in the valley. You arrived last night to the Williams' estate."
                    + "You are now awake in your guest room and there seems to be some"
                    + "sort of commotion out in the Audience Chamber.");
            AMedievalHarvestFestival.setGameMenu(gameMenuFrame);
            gameMenuFrame.setVisible(true);
            this.dispose();
        }
        else{
            GameMenuFrame currentGameMenu = AMedievalHarvestFestival.getGameMenu();
            currentGameMenu.getJtMessage().setText("Welcome back " + AMedievalHarvestFestival.getPlayer().getName() + "!");
            currentGameMenu.setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_jbStartGameActionPerformed

    private void jbExitMainActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbExitMainActionPerformed
        this.dispose();
    }//GEN-LAST:event_jbExitMainActionPerformed

    private void jbHowToPlayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbHowToPlayActionPerformed
        // TODO add your handling code here:
        HelpMenuFrame helpMenuFrame = new HelpMenuFrame();
        helpMenuFrame.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jbHowToPlayActionPerformed

    private void jbSaveGameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSaveGameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbSaveGameActionPerformed

    private void jbStartExistingGame(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbStartExistingGame
        // TODO add your handling code here:
    }//GEN-LAST:event_jbStartExistingGame

    public JScrollPane getjScrollPane1() {
        return jScrollPane1;
    }

    public void setjScrollPane1(JScrollPane jScrollPane1) {
        this.jScrollPane1 = jScrollPane1;
    }

    public JScrollPane getjScrollPane2() {
        return jScrollPane2;
    }

    public void setjScrollPane2(JScrollPane jScrollPane2) {
        this.jScrollPane2 = jScrollPane2;
    }

    public JTree getjTree1() {
        return jTree1;
    }

    public void setjTree1(JTree jTree1) {
        this.jTree1 = jTree1;
    }

    public JButton getJbExitMain() {
        return jbExitMain;
    }

    public void setJbExitMain(JButton jbExitMain) {
        this.jbExitMain = jbExitMain;
    }

    public JButton getJbHowToPlay() {
        return jbHowToPlay;
    }

    public void setJbHowToPlay(JButton jbHowToPlay) {
        this.jbHowToPlay = jbHowToPlay;
    }

    public JButton getJbHowToPlay1() {
        return jbHowToPlay1;
    }

    public void setJbHowToPlay1(JButton jbHowToPlay1) {
        this.jbHowToPlay1 = jbHowToPlay1;
    }

    public JButton getJbSaveGame() {
        return jbSaveGame;
    }

    public void setJbSaveGame(JButton jbSaveGame) {
        this.jbSaveGame = jbSaveGame;
    }

    public JButton getJbStartGame() {
        return jbStartGame;
    }

    public void setJbStartGame(JButton jbStartGame) {
        this.jbStartGame = jbStartGame;
    }

    public JLabel getJlTitle() {
        return jlTitle;
    }

    public void setJlTitle(JLabel jlTitle) {
        this.jlTitle = jlTitle;
    }

    public JPanel getJpBody() {
        return jpBody;
    }

    public void setJpBody(JPanel jpBody) {
        this.jpBody = jpBody;
    }

    public JPanel getJpMenuItems() {
        return jpMenuItems;
    }

    public void setJpMenuItems(JPanel jpMenuItems) {
        this.jpMenuItems = jpMenuItems;
    }

    public JPanel getJpTitle() {
        return jpTitle;
    }

    public void setJpTitle(JPanel jpTitle) {
        this.jpTitle = jpTitle;
    }

    public JTextArea getJtWelcome() {
        return jtWelcome;
    }

    public void setJtWelcome(JTextArea jtWelcome) {
        this.jtWelcome = jtWelcome;
    }

    
    
    
    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTree jTree1;
    private javax.swing.JButton jbExitMain;
    private javax.swing.JButton jbHowToPlay;
    private javax.swing.JButton jbHowToPlay1;
    private javax.swing.JButton jbSaveGame;
    private javax.swing.JButton jbStartGame;
    private javax.swing.JLabel jlTitle;
    private javax.swing.JPanel jpBody;
    private javax.swing.JPanel jpMenuItems;
    private javax.swing.JPanel jpTitle;
    private javax.swing.JTextArea jtWelcome;
    // End of variables declaration//GEN-END:variables
}