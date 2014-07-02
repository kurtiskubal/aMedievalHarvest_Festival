/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package byui.cit260.aMedievalHarvestFestival.view;

import byui.cit260.aMedievalHarvestFestival.control.GameControl;
import byui.cit260.aMedievalHarvestFestival.model.InventoryItem;
import java.util.Scanner;

/**
 *
 * @author Kurt
 */
public class ItemDescriptionView {
InventoryItem[] inventory = GameControl.getSortedInventoryList();
    
    public void display() {
        int i = 0;
        int empty = 0;
        String selection = "  ";
        do {
            System.out.println("\n"
            + "\n----------------------------------------------"
            + "\n|Select an Item to View it's Description     |");
             for (InventoryItem inventoryItem : inventory) {
                if (inventoryItem.getItemQuanity() > 0)
                    System.out.println(i + " - " + inventoryItem.getName());
                else
                    empty++;
                i++;  
             }
             if (empty == 20)
                 System.out.println("\nThere are no items to display desciptions for.");
             System.out.println("\n99 - Exit to Item Menu" + "\n----------------------------------------------");
             String input = this.getInput();
             selection = input.substring(0);
             this.doAction(selection);
        }while (!"99".equals(selection));
    
    }
    public String getInput() {
        boolean valid = false;
        String mainInput = null;
        Scanner keyboard = new Scanner(System.in);
        
        while(!valid) {
            mainInput = keyboard.nextLine();
            mainInput = mainInput.trim();
            
            if (mainInput.length() > 2 || mainInput.length() < 1) {
                System.out.println("Invalid selection - the selection must be non blank" +
                                   " and one or two characters in length.");
            }
            
            else {
                valid = true;
            }
        }
    
        return mainInput;
    }
    public void doAction(String value) {
        switch (value) {
            case "0":
                if (inventory[0].getItemQuanity() > 0)
                    System.out.println("\n" + inventory[0].getDescription());
                break;
            case "1":
                if (inventory[1].getItemQuanity() > 0)
                    System.out.println("\n" + inventory[1].getDescription());
                break;
            case "2":
                if (inventory[2].getItemQuanity() > 0)
                    System.out.println("\n" + inventory[2].getDescription());
                break;
            case "3":
                if (inventory[3].getItemQuanity() > 0)
                    System.out.println("\n" + inventory[3].getDescription());
                break;
            case "4":
                if (inventory[4].getItemQuanity() > 0)
                    System.out.println("\n" + inventory[4].getDescription());
                break;
            case "5":
                if (inventory[5].getItemQuanity() > 0)
                    System.out.println("\n" + inventory[5].getDescription());
                break;
            case "6":
                if (inventory[6].getItemQuanity() > 0)
                    System.out.println("\n" + inventory[6].getDescription());
                break;
            case "7":
                if (inventory[7].getItemQuanity() > 0)
                    System.out.println("\n" + inventory[7].getDescription());
                break;
            case "8":
                if (inventory[8].getItemQuanity() > 0)
                    System.out.println("\n" + inventory[8].getDescription());
                break;
            case "9":
                if (inventory[9].getItemQuanity() > 0)
                    System.out.println("\n" + inventory[9].getDescription());
                break;
            case "10":
                if (inventory[10].getItemQuanity() > 0)
                    System.out.println("\n" + inventory[10].getDescription());
                break;
            case "11":
                if (inventory[11].getItemQuanity() > 0)
                    System.out.println("\n" + inventory[11].getDescription());
                break;
            case "12":
                if (inventory[12].getItemQuanity() > 0)
                    System.out.println("\n" + inventory[12].getDescription());
                break;
            case "13":
                if (inventory[13].getItemQuanity() > 0)
                    System.out.println("\n" + inventory[13].getDescription());
                break;
            case "14":
                if (inventory[14].getItemQuanity() > 0)
                    System.out.println("\n" + inventory[14].getDescription());
                break;
            case "15":
                if (inventory[15].getItemQuanity() > 0)
                    System.out.println("\n" + inventory[15].getDescription());
                break;
            case "16":
                if (inventory[16].getItemQuanity() > 0)
                    System.out.println("\n" + inventory[16].getDescription());
                break;
            case "17":
                if (inventory[17].getItemQuanity() > 0)
                    System.out.println("\n" + inventory[17].getDescription());
                break;
            case "18":
                if (inventory[18].getItemQuanity() > 0)
                    System.out.println("\n" + inventory[18].getDescription());
                break;
            case "19":
                if (inventory[19].getItemQuanity() > 0)
                    System.out.println("\n" + inventory[19].getDescription());
                break;
            case "99":
                 return;
            default:
                System.out.print("\n*** Invalid selction *** Try Again");
                break;
        }
    }
}