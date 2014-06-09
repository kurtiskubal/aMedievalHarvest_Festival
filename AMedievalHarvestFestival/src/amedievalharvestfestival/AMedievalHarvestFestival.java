/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package amedievalharvestfestival;


import byui.cit260.aMedievalHarvestFestival.model.Game;
import byui.cit260.aMedievalHarvestFestival.model.Player;
import byui.cit260.aMedievalHarvestFestival.view.ConsumableView;
import byui.cit260.aMedievalHarvestFestival.view.StartProgramView;


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
        
        StartProgramView startProgramView = new StartProgramView();
        startProgramView.startProgram();
        
        ConsumableView startConView = new ConsumableView();
        startConView.determineConsumableValue();

        
        
        
      
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
