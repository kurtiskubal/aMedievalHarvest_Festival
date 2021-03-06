/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package byui.cit260.aMedievalHarvestFestival.frames;

import amedievalharvestfestival.AMedievalHarvestFestival;
import byui.cit260.aMedievalHarvestFestival.control.ConsumableControl;
import byui.cit260.aMedievalHarvestFestival.control.GameControl;
import byui.cit260.aMedievalHarvestFestival.model.InventoryItem;
import byui.cit260.aMedievalHarvestFestival.view.GameMenuView;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

/**
 *
 * @author Kurt
 */
public class GameMenuFrame extends javax.swing.JFrame {

    /**
     * Creates new form GameMenuFrame
     */
    public GameMenuFrame() {
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

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jpGameMenuBody = new javax.swing.JPanel();
        jbMoveToLoation = new javax.swing.JButton();
        jbExamineLocation = new javax.swing.JButton();
        jbLookAtMap = new javax.swing.JButton();
        jbViewInventory = new javax.swing.JButton();
        jbMemoryGame = new javax.swing.JButton();
        jbReadNurseryRhyme = new javax.swing.JButton();
        jbEstimateHunger = new javax.swing.JButton();
        jbEstimateThirst = new javax.swing.JButton();
        jbEstimateFilling = new javax.swing.JButton();
        jbEstimateDimensions = new javax.swing.JButton();
        jbStartConversation = new javax.swing.JButton();
        jbSaveGame = new javax.swing.JButton();
        jbExit = new javax.swing.JButton();
        jpGameMenuHeading = new javax.swing.JPanel();
        jlGameMenuHeading = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtMessage = new javax.swing.JTextArea();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        jpGameMenuBody.setBackground(new java.awt.Color(153, 255, 153));

        jbMoveToLoation.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jbMoveToLoation.setText("Move to a Location");
        jbMoveToLoation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbMoveToLoationActionPerformed(evt);
            }
        });

        jbExamineLocation.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jbExamineLocation.setText("Examine Location");
        jbExamineLocation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbExamineLocationActionPerformed(evt);
            }
        });

        jbLookAtMap.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jbLookAtMap.setText("Look at Map");
        jbLookAtMap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbLookAtMapActionPerformed(evt);
            }
        });

        jbViewInventory.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jbViewInventory.setText("View Inventory");
        jbViewInventory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbViewInventoryActionPerformed(evt);
            }
        });

        jbMemoryGame.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jbMemoryGame.setText("Memory Game");
        jbMemoryGame.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbMemoryGameActionPerformed(evt);
            }
        });

        jbReadNurseryRhyme.setFont(new java.awt.Font("Tahoma", 0, 9)); // NOI18N
        jbReadNurseryRhyme.setText("Read a Nursery Rhyme");
        jbReadNurseryRhyme.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbReadNurseryRhymeActionPerformed(evt);
            }
        });

        jbEstimateHunger.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jbEstimateHunger.setText("Estimate Hunger");
        jbEstimateHunger.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbEstimateHungerActionPerformed(evt);
            }
        });

        jbEstimateThirst.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jbEstimateThirst.setText("Estimate Thirst");
        jbEstimateThirst.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbEstimateThirstActionPerformed(evt);
            }
        });

        jbEstimateFilling.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jbEstimateFilling.setText("Calculate Filling Factor");
        jbEstimateFilling.setPreferredSize(new java.awt.Dimension(131, 21));
        jbEstimateFilling.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbEstimateFillingActionPerformed(evt);
            }
        });

        jbEstimateDimensions.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jbEstimateDimensions.setText("Estimate Dimensions");
        jbEstimateDimensions.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbEstimateDimensionsActionPerformed(evt);
            }
        });

        jbStartConversation.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jbStartConversation.setText("Start a Conversation");
        jbStartConversation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbStartConversationActionPerformed(evt);
            }
        });

        jbSaveGame.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jbSaveGame.setText("Save your Game");
        jbSaveGame.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSaveGameActionPerformed(evt);
            }
        });

        jbExit.setText("Exit");
        jbExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbExitActionPerformed(evt);
            }
        });

        jpGameMenuHeading.setBackground(new java.awt.Color(153, 255, 255));

        jlGameMenuHeading.setFont(new java.awt.Font("Vivaldi", 2, 21)); // NOI18N
        jlGameMenuHeading.setForeground(new java.awt.Color(0, 0, 204));
        jlGameMenuHeading.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlGameMenuHeading.setText("Game Menu");

        javax.swing.GroupLayout jpGameMenuHeadingLayout = new javax.swing.GroupLayout(jpGameMenuHeading);
        jpGameMenuHeading.setLayout(jpGameMenuHeadingLayout);
        jpGameMenuHeadingLayout.setHorizontalGroup(
            jpGameMenuHeadingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpGameMenuHeadingLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlGameMenuHeading, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(16, 16, 16))
        );
        jpGameMenuHeadingLayout.setVerticalGroup(
            jpGameMenuHeadingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpGameMenuHeadingLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlGameMenuHeading, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
                .addContainerGap())
        );

        jtMessage.setEditable(false);
        jtMessage.setBackground(new java.awt.Color(204, 204, 255));
        jtMessage.setColumns(20);
        jtMessage.setFont(new java.awt.Font("MingLiU_HKSCS-ExtB", 0, 13)); // NOI18N
        jtMessage.setLineWrap(true);
        jtMessage.setRows(5);
        jtMessage.setWrapStyleWord(true);
        jScrollPane1.setViewportView(jtMessage);

        javax.swing.GroupLayout jpGameMenuBodyLayout = new javax.swing.GroupLayout(jpGameMenuBody);
        jpGameMenuBody.setLayout(jpGameMenuBodyLayout);
        jpGameMenuBodyLayout.setHorizontalGroup(
            jpGameMenuBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpGameMenuHeading, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jpGameMenuBodyLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpGameMenuBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpGameMenuBodyLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jbExit, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(109, 109, 109))
                    .addGroup(jpGameMenuBodyLayout.createSequentialGroup()
                        .addGroup(jpGameMenuBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1)
                            .addGroup(jpGameMenuBodyLayout.createSequentialGroup()
                                .addComponent(jbViewInventory, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jbEstimateDimensions, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jpGameMenuBodyLayout.createSequentialGroup()
                                .addComponent(jbLookAtMap, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jbEstimateFilling, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jpGameMenuBodyLayout.createSequentialGroup()
                                .addComponent(jbExamineLocation, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jbEstimateThirst, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jpGameMenuBodyLayout.createSequentialGroup()
                                .addComponent(jbMoveToLoation, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jbEstimateHunger, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpGameMenuBodyLayout.createSequentialGroup()
                                .addComponent(jbMemoryGame, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jbStartConversation, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jpGameMenuBodyLayout.createSequentialGroup()
                                .addComponent(jbReadNurseryRhyme)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jbSaveGame, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap())))
        );
        jpGameMenuBodyLayout.setVerticalGroup(
            jpGameMenuBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpGameMenuBodyLayout.createSequentialGroup()
                .addComponent(jpGameMenuHeading, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22)
                .addGroup(jpGameMenuBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbMoveToLoation)
                    .addComponent(jbEstimateHunger))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpGameMenuBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbExamineLocation)
                    .addComponent(jbEstimateThirst))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpGameMenuBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbLookAtMap)
                    .addComponent(jbEstimateFilling, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpGameMenuBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbEstimateDimensions)
                    .addComponent(jbViewInventory))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpGameMenuBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbStartConversation)
                    .addComponent(jbMemoryGame))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpGameMenuBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbReadNurseryRhyme, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbSaveGame))
                .addGap(18, 18, 18)
                .addComponent(jbExit)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 155, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpGameMenuBody, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpGameMenuBody, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbEstimateFillingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbEstimateFillingActionPerformed
        TestFillingFactorFrame testFilling = new TestFillingFactorFrame();
        testFilling.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jbEstimateFillingActionPerformed

    private void jbExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbExitActionPerformed
        AMedievalHarvestFestival.getMainMenu().setVisible(true);
        
        this.dispose();
    }//GEN-LAST:event_jbExitActionPerformed

    private void jbMoveToLoationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbMoveToLoationActionPerformed
        // TODO add your handling code here:
        MoveLocationFrame moveMenu = new MoveLocationFrame();
        moveMenu.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jbMoveToLoationActionPerformed

    private void jbExamineLocationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbExamineLocationActionPerformed
        // TODO add your handling code here:
        this.jtMessage.setText(GameControl.getPlayerCurrentLocationDescription());
    }//GEN-LAST:event_jbExamineLocationActionPerformed

    private void jbLookAtMapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbLookAtMapActionPerformed
        // TODO add your handling code here:
        MapFrame mapFrame = new MapFrame();
        AMedievalHarvestFestival.setMapFrame(mapFrame);
        mapFrame.getJtMap().setText(GameMenuView.displayMapString());
        mapFrame.setVisible(true);
        this.setVisible(false);
        
    }//GEN-LAST:event_jbLookAtMapActionPerformed

    private void jbViewInventoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbViewInventoryActionPerformed
        // TODO add your handling code here:
        InventoryFrame inventoryMenu = new InventoryFrame();
        inventoryMenu.getJtInventoryItemList().setText(GameMenuView.viewExistingItems());
        InventoryItem[] items = GameMenuView.getExistingItems();
        for (InventoryItem item : items) {
            inventoryMenu.getJcItems().addItem(item);
        }
        for (InventoryItem item : items) {
            inventoryMenu.getJcItems2().addItem(item);
        }
        inventoryMenu.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jbViewInventoryActionPerformed

    private void jbMemoryGameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbMemoryGameActionPerformed
        // TODO add your handling code here:
        MatchingGameFrame matchingMenu = new MatchingGameFrame();
        AMedievalHarvestFestival.setMatchingGameMenu(matchingMenu);
        matchingMenu.getJtMatchingGame().setText(GameMenuView.displayMatchingGame());
        matchingMenu.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jbMemoryGameActionPerformed

    private void jbReadNurseryRhymeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbReadNurseryRhymeActionPerformed

        // TODO add your handling code here:
        NurseryRhymesFrame rhymeMenu = new NurseryRhymesFrame();
        rhymeMenu.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jbReadNurseryRhymeActionPerformed

    private void jbEstimateHungerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbEstimateHungerActionPerformed
        // TODO add your handling code here:
        this.jtMessage.setText(ConsumableControl.getPlayerHunger(AMedievalHarvestFestival.getPlayer()));
    }//GEN-LAST:event_jbEstimateHungerActionPerformed

    private void jbEstimateThirstActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbEstimateThirstActionPerformed
        // TODO add your handling code here:
        this.jtMessage.setText(ConsumableControl.getPlayerThirst(AMedievalHarvestFestival.getPlayer()));
    }//GEN-LAST:event_jbEstimateThirstActionPerformed

    private void jbEstimateDimensionsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbEstimateDimensionsActionPerformed
        // TODO add your handling code here:
        MapDimensionsFrame dimensionsMenu = new MapDimensionsFrame();
        dimensionsMenu.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jbEstimateDimensionsActionPerformed

    private void jbStartConversationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbStartConversationActionPerformed
        // TODO add your handling code here:
        ConversationsFrame conversationsMenu = new ConversationsFrame();
        conversationsMenu.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jbStartConversationActionPerformed

    private void jbSaveGameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSaveGameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbSaveGameActionPerformed

    public JPanel getjPanel1() {
        return jPanel1;
    }

    public void setjPanel1(JPanel jPanel1) {
        this.jPanel1 = jPanel1;
    }

    public JPanel getjPanel2() {
        return jPanel2;
    }

    public void setjPanel2(JPanel jPanel2) {
        this.jPanel2 = jPanel2;
    }

    public JButton getJbEstimateDimensions() {
        return jbEstimateDimensions;
    }

    public void setJbEstimateDimensions(JButton jbEstimateDimensions) {
        this.jbEstimateDimensions = jbEstimateDimensions;
    }

    public JButton getJbEstimateFilling() {
        return jbEstimateFilling;
    }

    public void setJbEstimateFilling(JButton jbEstimateFilling) {
        this.jbEstimateFilling = jbEstimateFilling;
    }

    public JButton getJbEstimateHunger() {
        return jbEstimateHunger;
    }

    public void setJbEstimateHunger(JButton jbEstimateHunger) {
        this.jbEstimateHunger = jbEstimateHunger;
    }

    public JButton getJbEstimateThirst() {
        return jbEstimateThirst;
    }

    public void setJbEstimateThirst(JButton jbEstimateThirst) {
        this.jbEstimateThirst = jbEstimateThirst;
    }

    public JButton getJbExamineLocation() {
        return jbExamineLocation;
    }

    public void setJbExamineLocation(JButton jbExamineLocation) {
        this.jbExamineLocation = jbExamineLocation;
    }

    public JButton getJbExit() {
        return jbExit;
    }

    public void setJbExit(JButton jbExit) {
        this.jbExit = jbExit;
    }

    public JButton getJbLookAtMap() {
        return jbLookAtMap;
    }

    public void setJbLookAtMap(JButton jbLookAtMap) {
        this.jbLookAtMap = jbLookAtMap;
    }

    public JButton getJbMemoryGame() {
        return jbMemoryGame;
    }

    public void setJbMemoryGame(JButton jbMemoryGame) {
        this.jbMemoryGame = jbMemoryGame;
    }

    public JButton getJbMoveToLoation() {
        return jbMoveToLoation;
    }

    public void setJbMoveToLoation(JButton jbMoveToLoation) {
        this.jbMoveToLoation = jbMoveToLoation;
    }

    public JButton getJbReadNurseryRhyme() {
        return jbReadNurseryRhyme;
    }

    public void setJbReadNurseryRhyme(JButton jbReadNurseryRhyme) {
        this.jbReadNurseryRhyme = jbReadNurseryRhyme;
    }

    public JButton getJbSaveGame() {
        return jbSaveGame;
    }

    public void setJbSaveGame(JButton jbSaveGame) {
        this.jbSaveGame = jbSaveGame;
    }

    public JButton getJbStartConversation() {
        return jbStartConversation;
    }

    public void setJbStartConversation(JButton jbStartConversation) {
        this.jbStartConversation = jbStartConversation;
    }

    public JButton getJbViewInventory() {
        return jbViewInventory;
    }

    public void setJbViewInventory(JButton jbViewInventory) {
        this.jbViewInventory = jbViewInventory;
    }

    public JLabel getJlGameMenuHeading() {
        return jlGameMenuHeading;
    }

    public void setJlGameMenuHeading(JLabel jlGameMenuHeading) {
        this.jlGameMenuHeading = jlGameMenuHeading;
    }

    public JPanel getJpGameMenuBody() {
        return jpGameMenuBody;
    }

    public void setJpGameMenuBody(JPanel jpGameMenuBody) {
        this.jpGameMenuBody = jpGameMenuBody;
    }

    public JPanel getJpGameMenuHeading() {
        return jpGameMenuHeading;
    }

    public void setJpGameMenuHeading(JPanel jpGameMenuHeading) {
        this.jpGameMenuHeading = jpGameMenuHeading;
    }

    public JScrollPane getjScrollPane1() {
        return jScrollPane1;
    }

    public void setjScrollPane1(JScrollPane jScrollPane1) {
        this.jScrollPane1 = jScrollPane1;
    }

    public JTextArea getJtMessage() {
        return jtMessage;
    }

    public void setJtMessage(JTextArea jtMessage) {
        this.jtMessage = jtMessage;
    }

    

    
    
    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbEstimateDimensions;
    private javax.swing.JButton jbEstimateFilling;
    private javax.swing.JButton jbEstimateHunger;
    private javax.swing.JButton jbEstimateThirst;
    private javax.swing.JButton jbExamineLocation;
    private javax.swing.JButton jbExit;
    private javax.swing.JButton jbLookAtMap;
    private javax.swing.JButton jbMemoryGame;
    private javax.swing.JButton jbMoveToLoation;
    private javax.swing.JButton jbReadNurseryRhyme;
    private javax.swing.JButton jbSaveGame;
    private javax.swing.JButton jbStartConversation;
    private javax.swing.JButton jbViewInventory;
    private javax.swing.JLabel jlGameMenuHeading;
    private javax.swing.JPanel jpGameMenuBody;
    private javax.swing.JPanel jpGameMenuHeading;
    private javax.swing.JTextArea jtMessage;
    // End of variables declaration//GEN-END:variables
}
