/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package amedievalharvestfestival;


import byui.cit260.aMedievalHarvestFestival.frames.GameMenuFrame;
import byui.cit260.aMedievalHarvestFestival.frames.MainFrame;
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
    
    
    
}
