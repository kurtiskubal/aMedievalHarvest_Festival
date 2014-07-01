/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package byui.cit260.aMedievalHarvestFestival.control;

import byui.cit260.aMedievalHarvestFestival.model.BeverageItem;
import byui.cit260.aMedievalHarvestFestival.model.FoodItem;
import byui.cit260.aMedievalHarvestFestival.model.Player;

/**
 *
 * @author Adam Decker
 */
public class ConsumableControl {
    public void getPlayerHunger(Player player) {
        int hungerEstimated;
        hungerEstimated = (int) player.getHunger();
        String messageAboutHunger;
        
        System.out.println(player.getName() + ", Lord Pharoah's hunger is " + hungerEstimated + "."
                                            + "");
    }
    
    public void getPlayerThirst(Player player) {
        int thirstEstimated;
        thirstEstimated = (int) player.getThirst();
    
}
    /*
    public Integer calcFillingFoodItem(FoodItem foodItem){
        if(foodType == null || weight == null)return null;
        else if(foodType < 1)return -1;
        else if(weight < 1)return -2;
        else if (foodType > 5)return -3;
        else if(weight > 10)return -4;
        else {
            Integer fillingFactor;
            fillingFactor = foodType * weight;
            return fillingFactor;
        }
    }
    public Integer calcQuenchBeverageItem(BeverageItem beverageItem){
        if(beverageType == null || volume == null)return null;
        else if(beverageType < 1)return -1;
        else if(volume < 1)return -2;
        else if (beverageType > 5)return -3;
        else if(volume > 10)return -4;
        else {
            Integer quenchFactor;
            quenchFactor = beverageType * volume;
            return quenchFactor;
        }
    }
*/
}

