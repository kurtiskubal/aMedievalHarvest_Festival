/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
*/

package byui.cit260.aMedievalHarvestFestival.view;

import byui.cit260.aMedievalHarvestFestival.control.MapControl;
import byui.cit260.aMedievalHarvestFestival.model.Location;
import java.util.Scanner;

/**
*
* @author Adam Decker
*/
public class GameMenuView {
    private static final String MENU = "\n"
            + "\n----------------------------------------------"
            + "\n| Game Menu |"
            + "\nM - Move to a new location"
            + "\nL - Examine location"
            + "\nV - View Items in inventory"
            + "\nH - Estimate Hunger"
            + "\nT - Estimate Thirst"
            + "\nC - Start a conversation"
            + "\nS - Save Game"
            + "\nQ - Exit to Main Menu"
            + "\n----------------------------------------------";
    
    public void displayMenu() {
        
        char selection = ' ';
        do {
            
            System.out.println(MENU);
            
            String input = this.getInput();
            selection = input.charAt(0);
            
            this.doAction(selection);
        } while (selection != 'Q');
        
        
    }
    
    public String getInput() {
        boolean valid = false;
        String helpInput = null;
        Scanner keyboard = new Scanner(System.in);
        
        while(!valid) {
            
            helpInput = keyboard.nextLine();
            helpInput = helpInput.trim();
            
            if (helpInput.length() != 1) {
                System.out.println("Invalid selection - the selection must be non blank" +
                                   " and only one character in length.");
            }
            
            else {
                valid = true;
            }
        }
        
        return helpInput.toUpperCase();
    }
    
    public void doAction(char selection) {
        switch (selection) {
            case 'M':
                LocationView callViewLocation = new LocationView();
                callViewLocation.displayLocationMenu();

                break;
            case 'L':
                this.displayCurrLocation();
                 
                break;
            case 'V':
                InventoryView callInventoryView = new InventoryView();
                callInventoryView.displayInventoryMenu();
                
                break;
            case 'H':
                System.out.println("\n**** Estimate Hunger needs to be learned ****");
                break;
            case 'T':
                System.out.println("\n**** Estimate Thirst needs to be learned ****");
                break;
            case 'C':
                System.out.println("\n**** Conversations needs to be learned ****");
                break;
            case 'S':
                System.out.println("\"\\n**** Saving Game needs to be learned ****\"");
                break;
            case 'Q':
                return;
            default:
                System.out.print("\n*** Invalid selction *** Try Again");
                break;
        }
    }

    private void displayCurrLocation() {
        // call Control function to get the player's current location
        Location currentLocation = MapControl.getCurrentLocation();
        // Print out the description of the current location
        //System.out.println(currentLocation.toString());
    }
    
}

