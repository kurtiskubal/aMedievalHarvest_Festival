/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package byui.cit260.aMedievalHarvestFestival.view;

import byui.cit260.aMedievalHarvestFestival.control.GameControl;
import byui.cit260.aMedievalHarvestFestival.control.MatchingControl;
import byui.cit260.aMedievalHarvestFestival.exceptions.MatchingControlException;
import byui.cit260.aMedievalHarvestFestival.model.MatchingGameLocation;
import java.util.Scanner;

/**
 *
 * @author Kurt
 */
public class MatchingView{
    private static final String MENU = "\n"
                                     + "\n-----------------------"
                                     + "\n| Matching Menu |"
                                     + "\n## - Select a Number to Match"
                                     + "\n99 - Exit to Game Menu"
                                    + "\n-----------------------";


    public void display() {
GameMenuView gameMenuView = new GameMenuView();
        String selection = "  ";
        do {
            System.out.println(MENU);
            gameMenuView.displayMatchingGame();
            String input = this.getInput();
            selection = input.substring(0);
            this.doAction(selection);
        } while (!"99".equals(selection));
       
    }
     public String getInput() {
        boolean valid = false;
        String mainInput = null;
        Scanner keyboard = new Scanner(System.in);
        
        while(!valid) {
            
            mainInput = keyboard.nextLine();
            mainInput = mainInput.trim();
            
            if (mainInput.length() != 2) {
                System.out.println("Invalid selection - the selection must be non blank" +
                                   " and only two character in length.");
            }
            
            else {
                valid = true;
            }
        }
        return mainInput;
       
    }
     public void doAction(String value) {
         try {
        MatchingGameLocation[][] matchingLocations = GameControl.getMatchingGameLocations();
        MatchingControl matchingControl = new MatchingControl();
        String[] valueArr = value.split("");
        String selectionMessage = matchingControl.showSelection(valueArr);
        if (selectionMessage.length() > 1){
           System.out.println(selectionMessage);
         } } catch (MatchingControlException ex) {
             System.out.println(ex.getMessage());
         }
     }
}
     
