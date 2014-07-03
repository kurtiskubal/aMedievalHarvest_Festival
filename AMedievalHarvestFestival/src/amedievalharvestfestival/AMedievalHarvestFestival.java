/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package amedievalharvestfestival;


import byui.cit260.aMedievalHarvestFestival.model.Game;
import byui.cit260.aMedievalHarvestFestival.model.Player;
import byui.cit260.aMedievalHarvestFestival.view.StartProgramView;
import static java.lang.System.out;
import java.util.Arrays;


/**
 * co-editor: Adam
 * @author Kurt
 */
public class AMedievalHarvestFestival {
    private static Game currentGame = null;
    private static Player player = null;
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    try {
        StartProgramView startProgramView = new StartProgramView();
        startProgramView.startProgram();
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
    
    
    
}
