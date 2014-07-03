/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
*/

package byui.cit260.aMedievalHarvestFestival.view;

import byui.cit260.aMedievalHarvestFestival.control.GameControl;

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
            GameMenuView.viewInventory();
        switch (selection) {
            case 'U':
                System.out.println("\n**** decisions still need to be made on how items are used ****");

                break;
            case 'E':
                 ItemDescriptionView descriptionView = new ItemDescriptionView();
                descriptionView.display();
                 
                break;
            case 'D':
                System.out.println(GameControl.greatestAmount(GameControl.getSortedInventoryList())); 
                break;
            case 'Q':
                return;
            default:
                System.out.print("\n*** Invalid selction *** Try Again");
                break;
        }
    }
}
