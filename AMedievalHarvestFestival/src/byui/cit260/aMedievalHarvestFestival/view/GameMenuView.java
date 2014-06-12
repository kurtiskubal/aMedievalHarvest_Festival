/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
*/

package byui.cit260.aMedievalHarvestFestival.view;

import byui.cit260.aMedievalHarvestFestival.control.GameControl;
import static byui.cit260.aMedievalHarvestFestival.control.GameControl.getSortedInventoryList;
import byui.cit260.aMedievalHarvestFestival.control.MapControl;
import byui.cit260.aMedievalHarvestFestival.model.InstanceLocation;
import byui.cit260.aMedievalHarvestFestival.model.InventoryItem;
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
            + "\nA - Look at Map"
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
    
    private void displayInventoryList() {
        InventoryItem[] inventoryList = getSortedInventoryList();
        System.out.println("List of Items in Inventory\n");
        for (int i = 0; i < inventoryList.length - 1; i++)
        {
            System.out.println(inventoryList[i]);
        }
        
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
                
                case 'A':
                this.displayMap();
                
                break;
                
            case 'V':
                this.viewInventory();
                
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
    
    private int viewInventory() {
        InventoryItem[] inventory = GameControl.getSortedInventoryList();
        
        System.out.println("\nList of Inventory Items");
        System.out.println("\tDescription" + "\t\t\t\t\t\t\t\t" + 
                           "Quanity" + "\t" + 
                           "Type");
        
        for (InventoryItem inventoryItem : inventory) {
            System.out.println(inventoryItem.getDescription() + "\t\t\t\t\t\t\t\t\t\t" +
                               inventoryItem.getItemQuanity() + "\t" +
                               inventoryItem.getInventoryType());
        }
        
        return 0;
    }
    
    public void displayMap() {
        int lineLength = 0;
        
        Location[][] locations = GameControl.getMapLocations();
        int noColumns = locations[0].length;
        
        
        for (Location[] row : locations) {
           int count = 0;
            
           System.out.println("-----------------------------");
            
            for (int column = 0; column < noColumns; column++) {
                
                System.out.print("|");
                Location location = row[column];
                count = count + 1;
                if (location.isVisited()) {
                    InstanceLocation instance = location.getInstance();
                    if (count == 5) {
                        System.out.println(instance.getMapSymbol() + "|");
                        count = 0;
                    }
                    else {
                      System.out.print(instance.getMapSymbol());
                      
                    }
                }
                else {
                    if (count == 5) {
                      System.out.println(" ??? " + "|"); 
                      count = 0;
                    }
                    else {
                        System.out.print(" ??? ");
                       
                    }
                }
            
            }
            
        }
        
        System.out.println("-----------------------------");
    }
    private void printRowDivider(int noColumns) {
        for (int i = 0; i < noColumns; i++) {
        System.out.println("-");
        }
    }

}



    
