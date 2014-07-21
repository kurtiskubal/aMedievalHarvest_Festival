/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package amedievalharvestfestival;


import byui.cit260.aMedievalHarvestFestival.frames.GameMenuFrame;
import byui.cit260.aMedievalHarvestFestival.frames.InventoryFrame;
import byui.cit260.aMedievalHarvestFestival.frames.MainFrame;
import byui.cit260.aMedievalHarvestFestival.frames.MapDimensionsFrame;
import byui.cit260.aMedievalHarvestFestival.frames.MapFrame;
import byui.cit260.aMedievalHarvestFestival.frames.MatchingGameFrame;
import byui.cit260.aMedievalHarvestFestival.frames.MoveLocationFrame;
import byui.cit260.aMedievalHarvestFestival.frames.StartProgramFrame;
import byui.cit260.aMedievalHarvestFestival.model.Game;
import byui.cit260.aMedievalHarvestFestival.model.Player;
import static java.lang.System.out;


/**
 * co-editor: Adam
 * @author Kurt
 */
public class AMedievalHarvestFestival {
    private static Game currentGame = null;
    private static Player player = null;
    private static MainFrame mainMenu = null;
    private static GameMenuFrame gameMenu = null;
    private static InventoryFrame inventoryMenu = null;
    private static MatchingGameFrame matchingGameMenu = null;
    private static MapDimensionsFrame mapDimensionsFrame = null;
    private static MoveLocationFrame moveLocationMenu = null;
    private static MapFrame mapFrame = null;

    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    try {
//        StartProgramView startProgramView = new StartProgramView();
//        startProgramView.startProgram();
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run(){
                StartProgramFrame startProgFrame = new StartProgramFrame();
                startProgFrame.setVisible(true);
                
            }
    });
        return;
        
    }
    catch (Throwable ex) {
        System.out.println("An unexpected error occured. Trying re-running the program." 
                + "\nError: " + ex.getMessage());
        ex.printStackTrace();
    }
    finally {
        out.close();
    }
    }

    public static Game getCurrentGame() {
        return currentGame;
    }

    public static void setCurrentGame(Game currentGame) {
        AMedievalHarvestFestival.currentGame = currentGame;
    }

    public static Player getPlayer() {
        return player;
    }

    public static void setPlayer(Player player) {
        AMedievalHarvestFestival.player = player;
    }
    
    public static MainFrame getMainMenu() {
        return mainMenu;
    }

    public static void setMainMenu(MainFrame mainMenu) {
        AMedievalHarvestFestival.mainMenu = mainMenu;
    }

    public static GameMenuFrame getGameMenu() {
        return gameMenu;
    }

    public static void setGameMenu(GameMenuFrame gameMenu) {
        AMedievalHarvestFestival.gameMenu = gameMenu;
    }

    public static InventoryFrame getInventoryMenu() {
        return inventoryMenu;
    }

    public static void setInventoryMenu(InventoryFrame inventoryMenu) {
        AMedievalHarvestFestival.inventoryMenu = inventoryMenu;
    }

    public static MatchingGameFrame getMatchingGameMenu() {
        return matchingGameMenu;
    }

    public static void setMatchingGameMenu(MatchingGameFrame matchingGameMenu) {
        AMedievalHarvestFestival.matchingGameMenu = matchingGameMenu;
    }

    public static MapDimensionsFrame getMapDimensionsFrame() {
        return mapDimensionsFrame;
    }

    public static void setMapDimensionsFrame(MapDimensionsFrame mapDimensionsFrame) {
        AMedievalHarvestFestival.mapDimensionsFrame = mapDimensionsFrame;
    }

    public static MoveLocationFrame getMoveLocationMenu() {
        return moveLocationMenu;
    }

    public static void setMoveLocationMenu(MoveLocationFrame moveLocationMenu) {
        AMedievalHarvestFestival.moveLocationMenu = moveLocationMenu;
    }

    public static MapFrame getMapFrame() {
        return mapFrame;
    }

    public static void setMapFrame(MapFrame mapFrame) {
        AMedievalHarvestFestival.mapFrame = mapFrame;
    }
    
    
    
    
}
