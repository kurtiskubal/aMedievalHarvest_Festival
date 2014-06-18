/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
*/

package byui.cit260.aMedievalHarvestFestival.view;

import byui.cit260.aMedievalHarvestFestival.control.GameControl;
import byui.cit260.aMedievalHarvestFestival.model.InventoryItem;

/**
*
* @author Adam Decker
*/
public class InventoryView extends MenuView{
    
    public InventoryView(){
        super("\n"
            + "\n----------------------------------------------"
            + "\n| Item Menu |"
            + "\nU - Use item"
            + "\nE - Examine Item"
            + "\nD - Determine item of the greatest quanity"
            + "\nQ - Exit to Game Menu"
            + "\n----------------------------------------------");
    }
    
    @Override
        public void doAction(char selection) {
        switch (selection) {
            case 'U':
                System.out.println("\n**** decisions still need to be made on how items are used ****");

                break;
            case 'E':
                this.displayItemDescription();
                 
                break;
            case 'D':
                InventoryItem max = new InventoryItem();
                max = GameControl.greatestAmount();
                System.out.println(max.getName());
                max.setName("                                                                                                                                                                           ");
                 
                break;
            case 'Q':
                return;
            default:
                System.out.print("\n*** Invalid selction *** Try Again");
                break;
        }
    }

    public void displayItemDescription() {
        // call Control function to get the item's description
        System.out.println("\n**** displayItemDescription stub function called ****");
        // Print out the description of the current location
    }
}

