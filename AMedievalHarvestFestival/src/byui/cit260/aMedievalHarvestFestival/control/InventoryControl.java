/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package byui.cit260.aMedievalHarvestFestival.control;

import amedievalharvestfestival.AMedievalHarvestFestival;
import byui.cit260.aMedievalHarvestFestival.model.BeverageItem;
import byui.cit260.aMedievalHarvestFestival.model.FoodItem;
import byui.cit260.aMedievalHarvestFestival.model.InventoryItem;

/**
 *
 * @author Kurt
 */
public class InventoryControl {
    public static String useItem(InventoryItem item) {
        if (item.getInventoryType() == 1)
            return "You cannot use this item.";
        else if (item.getInventoryType() == 2) {
            FoodItem usedFood = new FoodItem(item.getConsumableType());
            double hunger = AMedievalHarvestFestival.getPlayer().getHunger();
            hunger -= 5;
            if (hunger < 0)
                hunger = 0;
            }
            AMedievalHarvestFestival.getPlayer().setHunger(hunger);
            item.setItemQuanity(item.getItemQuanity() - 1);
            return "You have eaten " + item.getName() + "\n and it brought your hunger down to " +
                    AMedievalHarvestFestival.getPlayer().getHunger();
        }
        else if (item.getInventoryType() == 3) {
            BeverageItem usedBev = new BeverageItem(item.getConsumableType());
            double thirst = AMedievalHarvestFestival.getPlayer().getThirst();
            thirst -= 5;
            if (thirst < 0)
                thirst = 0;
            }
            AMedievalHarvestFestival.getPlayer().setThirst(thirst);
            item.setItemQuanity(item.getItemQuanity() - 1);
            return "You drank " + item.getName() + "\n and it brought your thirst down to " +
                    AMedievalHarvestFestival.getPlayer().getThirst();
        }
        else if (item.getInventoryType() == 4)
            return "You cannot use this item.";
        else
            return "You cannot use this item.";
    }
}
