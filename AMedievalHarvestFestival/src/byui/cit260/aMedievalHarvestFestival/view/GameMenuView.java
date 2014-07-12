/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
*/

package byui.cit260.aMedievalHarvestFestival.view;

import amedievalharvestfestival.AMedievalHarvestFestival;
import byui.cit260.aMedievalHarvestFestival.control.ConsumableControl;
import byui.cit260.aMedievalHarvestFestival.control.GameControl;
import static byui.cit260.aMedievalHarvestFestival.control.GameControl.getSortedInventoryList;
import byui.cit260.aMedievalHarvestFestival.model.Actors;
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
            + "\nB - Calculate Filling Factor" 
            + "\nJ - Estimate Dimensions"
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
                case 'J':
                MapDimensionsView locationDim = new MapDimensionsView();
                locationDim.display();
            case 'V':
                GameMenuView.viewInventory();
                InventoryView inventoryView = new InventoryView();
                inventoryView.display();
                break;
            case 'O':
                this.displayMatchingGame();
                MatchingGameView matchingGameView = new MatchingGameView();
                matchingGameView.display();
                break;
            case 'R':
                NurseryRhymes bookOfRhymes = new NurseryRhymes();
                bookOfRhymes.display();
                break;
            case 'H':
                ConsumableControl.getPlayerHunger(AMedievalHarvestFestival.getPlayer());
                break;
            case 'T':
                ConsumableControl.getPlayerThirst(AMedievalHarvestFestival.getPlayer());
                break;
            case 'B':
                TestFillingFactorView testFilling = new TestFillingFactorView();
                testFilling.display();
                break;
            case 'C':
                String pass = this.haveConv();
                ConversationsView convView = new ConversationsView(pass);
                convView.display();
                break;
            case 'S':
                System.out.println("\n**** Save Game needs to be learned ****");
                break;
            case 'Q':
                return;
            default:
                System.out.print("\n*** Invalid selction *** Try Again");
                break;
        }
    }

    private void displayCurrLocation() {
        
        System.out.println(AMedievalHarvestFestival.getPlayer().getPlayerLocation().getInstance().getDescription());
        
    }
    
    public static void viewFoodItems() {
        InventoryItem[] inventory = GameControl.getSortedInventoryList();
        
         System.out.println("\nList of Food Items");
         int i = 65;
         for (InventoryItem inventoryItem : inventory)
         {
             if (inventoryItem.getInventoryType() == 2) {
                 System.out.println(Character.toString((char) i) + " - "
                 + inventoryItem.getName());
                 i++;
             }
         }
    }
    
    public static void viewBeverageItems() {
        InventoryItem[] inventory = GameControl.getSortedInventoryList();
        
         System.out.println("\nList of Beverage Items");
         int i = 65;
         for (InventoryItem inventoryItem : inventory)
         {
             if (inventoryItem.getInventoryType() == 3) {
                 System.out.println(Character.toString((char) i) + " - "
                 + inventoryItem.getName());
                 i++;
             }
         }
    }
    
    public static String viewExistingItems() {
        String existingItems = "Inventory Items"
                + "\nName\tQuanity";
        InventoryItem[] inventory = GameControl.getSortedInventoryList();
        int count = 0;
        for (InventoryItem inventoryItem : inventory) {
            
            
            if (inventoryItem.getItemQuanity() > 0 ) {
                existingItems += '\n' + inventoryItem.getName() + inventoryItem.getItemQuanity();
                count++;
            }
                           
        }
        if (count == 0)
            existingItems += '\n' + "There are no items";
        return existingItems;
    }
    public static void viewInventory() {
        InventoryItem[] inventory = GameControl.getSortedInventoryList();
        
        System.out.println("\nList of Inventory Items");
        System.out.println("\tName" + "\t\t\t\t\t\t" + 
                           "Quanity" + "\t" + 
                           "Type");
        
        for (InventoryItem inventoryItem : inventory) {
            
            
            if (inventoryItem.getInventoryType() != -1 ) {
                System.out.println(inventoryItem.getName() + "\t\t\t\t\t" +
                                 inventoryItem.getItemQuanity() + "\t" +
                                 inventoryItem.getInventoryType());
            }
                               
        }
        
        
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
        int i = 0;
         System.out.println("   0    1    2    3    4 ");
        for (MatchingGameLocation[] row : matchingLocations) {
           int count = 0;
           
           System.out.println("---------------------------");
            System.out.print(i);
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
                else if (matchingLocation.isMatched()){
                    if (count == 5) {
                        System.out.println(" OK " + "|");
                        count = 0;
                    }
                    else {
                      System.out.print(" OK ");
                      
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
            i++;
        }
        
        System.out.println("---------------------------");
    }

    private String haveConv() {
        Actors[] actorsNear = AMedievalHarvestFestival.getPlayer().getPlayerLocation().getActors();
        String menu = "Would you like to talk to:";
        
        try {
        //loop for moving through an array
        for (int i = 0; i < actorsNear.length; i++){
            // Need to print a number and a name for each actor in array.
            menu += "\n" + i + " - " + actorsNear[i].getName();
        }
        } catch(Throwable ex){
            
        } finally {
            return menu;
        }
    }
   
    
}



    
