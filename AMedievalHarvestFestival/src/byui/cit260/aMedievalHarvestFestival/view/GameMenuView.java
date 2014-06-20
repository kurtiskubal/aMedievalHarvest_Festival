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
import byui.cit260.aMedievalHarvestFestival.model.MatchingGameLocation;
import byui.cit260.aMedievalHarvestFestival.model.MatchingInstance;

/**
*
* @author Adam Decker
*/
public class GameMenuView extends MenuView{
    
    public GameMenuView(){
        super("\n"
            + "\n----------------------------------------------"
            + "\n| Game Menu |"
            + "\nM - Move to a new location"
            + "\nL - Examine location"
            + "\nA - Look at Map"
            + "\nV - View Items in inventory"
            + "\nO - Memory Game"
            + "\nR - Read a Nursery Rhyme"
            + "\nH - Estimate Hunger"
            + "\nT - Estimate Thirst"
            + "\nC - Start a conversation"
            + "\nS - Save Game"
            + "\nQ - Exit to Main Menu"
            + "\n----------------------------------------------");
    }
    
    
    private void displayInventoryList() {
        InventoryItem[] inventoryList = getSortedInventoryList();
        System.out.println("List of Items in Inventory\n");
        for (int i = 0; i < inventoryList.length - 1; i++)
        {
            System.out.println(inventoryList[i]);
        }
        
    }
    
    @Override
    public void doAction(char value) {
        switch (value) {
            case 'M':
                LocationView callViewLocation = new LocationView();
                callViewLocation.display();

                break;
            case 'L':
                this.displayCurrLocation();
                 
                break;
                
                case 'A':
                this.displayMap();
                
                break;
                
            case 'V':
                this.viewInventory();
                InventoryView inventoryView = new InventoryView();
                inventoryView.display();
                break;
            case 'O':
                this.displayMatchingGame();
                //MatchingGameView matchingGameView = new MatchingGameView();
                //matchingGameView.display();
                break;
            case 'R':
                this.displayRhymes();
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
    
    public int viewInventory() {
        InventoryItem[] inventory = GameControl.getSortedInventoryList();
        
        System.out.println("\nList of Inventory Items");
        System.out.println("\tName" + "\t\t\t\t\t\t" + 
                           "Quanity" + "\t" + 
                           "Type");
        
        for (InventoryItem inventoryItem : inventory) {
            
            
            
                System.out.println(inventoryItem.getName() + "\t\t\t\t\t" +
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
            
           System.out.println("-------------------------------");
            
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
        
        System.out.println("-------------------------------");
    }
    
    public void displayMatchingGame() {
        int lineLength = 0;
        
        MatchingGameLocation[][] matchingLocations = GameControl.getMatchingGameLocations();
        int noColumns = matchingLocations[0].length;
        
        
        for (MatchingGameLocation[] row : matchingLocations) {
           int count = 0;
            
           System.out.println("--------------------------");
            
            for (int column = 0; column < noColumns; column++) {
                
                System.out.print("|");
                MatchingGameLocation matchingLocation = row[column];
                count = count + 1;
                if (matchingLocation.isChoosen()) {
                    MatchingInstance matchingInstance = matchingLocation.getMatchingInstance();
                    if (count == 5) {
                        System.out.println(matchingInstance.getMapSymbol() + "|");
                        count = 0;
                    }
                    else {
                      System.out.print(matchingInstance.getMapSymbol());
                      
                    }
                }
                else {
                    if (count == 5) {
                      System.out.println(" ?? " + "|"); 
                      count = 0;
                    }
                    else {
                        System.out.print(" ?? ");
                       
                    }
                }
            
            }
            
        }
        
        System.out.println("--------------------------");
    }

    private void displayRhymes() {
        NurseryRhymes bookOfRhymes = new NurseryRhymes();
        bookOfRhymes.display();
    }
   
    
}



    
