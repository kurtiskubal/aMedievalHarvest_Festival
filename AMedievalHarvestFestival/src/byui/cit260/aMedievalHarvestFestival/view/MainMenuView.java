/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package byui.cit260.aMedievalHarvestFestival.view;


import amedievalharvestfestival.AMedievalHarvestFestival;
import byui.cit260.aMedievalHarvestFestival.control.GameControl;
import byui.cit260.aMedievalHarvestFestival.control.ProgramControl;
import java.util.Scanner;

/**
 *
 * @author Kurt
 */
public class MainMenuView extends MenuView {
    
    private static final String MENU = "\n"
            + "\n----------------------------------------------"
            + "\n| Main Menu                                  |"
            + "\nG - Start the Game"
            + "\nH - How to Play"
            + "\nS - Save your Game"
            + "\nE - Exit the Game"
            + "\n----------------------------------------------";


    private void startNewGame() {
        GameControl.createNewGame(AMedievalHarvestFestival.getPlayer());
    
        GameMenuView gameMenu = new GameMenuView();
        gameMenu.displayMenu();
    }
    
    
    public void doAction(char value) {
        switch (value) {
            case 'G':
                startNewGame();
                break;
            case 'H':
                HelpMenuView helpMenu = new HelpMenuView();
                helpMenu.displayMenu();
                break;
            case 'S':
                ProgramControl saveGame = new ProgramControl();
                saveGame.saveGame();
                break;
            case 'E':
                return;
            case 'P' :
                PuzzleView puzzleTrial = new PuzzleView();
                puzzleTrial.getPlayerSolution();
                break;
            case 'D' :
                LocationView locationTrial = new LocationView();
                locationTrial.displayLocationMenu();
                break;
            default:
                System.out.print("\n*** Invalid selction *** Try Again");
                break;
        }
    }
    
}

