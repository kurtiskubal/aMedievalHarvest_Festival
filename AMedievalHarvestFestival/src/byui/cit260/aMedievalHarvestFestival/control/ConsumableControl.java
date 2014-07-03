/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package byui.cit260.aMedievalHarvestFestival.control;

import byui.cit260.aMedievalHarvestFestival.exceptions.ViewLayerException;
import byui.cit260.aMedievalHarvestFestival.model.BeverageItem;
import byui.cit260.aMedievalHarvestFestival.model.FoodItem;
import byui.cit260.aMedievalHarvestFestival.model.Player;

/**
 *
 * @author Adam Decker
 */
public class ConsumableControl {
    public static void getPlayerHunger(Player player) {
        double hungerEstimated;
        hungerEstimated = player.getHunger();
        String message = null;
        if (hungerEstimated == 0)
            message = "You are full.";
        else if (hungerEstimated >= 30)
            message = "You are getting hungry, but you'll be fine.";
        else if (hungerEstimated >= 60)
            message = "You could go for a snack.";
        else if (hungerEstimated >= 90)
            message = "Your stomach is making audible rumblings.";
        else if (hungerEstimated == 100)
            message = "Luckily you are in a castle filled with food,"
                    + "\nbecause you are starving.";
        System.out.println(player.getName() + ", Lord Pharoah's hunger is " + hungerEstimated + ".\n"
                                            + message);
    }
    
    public static void getPlayerThirst(Player player) {
        int thirstEstimated;
        thirstEstimated = (int) player.getThirst();
        String message = null;
        if (thirstEstimated == 0)
            message = "You are quenched. The liquid in your stomach is sloshing a little bit.";
        else if (thirstEstimated >= 30)
            message = "You are getting thirsty, but you'll be fine.";
        else if (thirstEstimated >= 60)
            message = "You could go for a drink.";
        else if (thirstEstimated >= 90)
            message = "Your tongue is dry.";
        else if (thirstEstimated == 100)
            message = "You cannot speak. You need to drink something.";
        System.out.println(player.getName() + ", Lord Pharoah's thirst is " + thirstEstimated + ".\n"
                                            + message);
    
}
    
    public static void gainHunger(Player player) {
        double hunger;
        hunger = (int) player.getHunger() + 5;
        if (hunger > 100)
            hunger = 100;
        player.setHunger(hunger);
        }
    
    public static Double calcFillingFoodItem(Integer foodType, double weight) throws ViewLayerException{
        
        if (weight < 1 || weight > 10)
            throw new ViewLayerException("Weight is a double and can only be between 1 and 10.");
        
        double fillingFactor;
        fillingFactor = foodType * weight;
        return fillingFactor;
        
    }
    public static Double calcQuenchBeverageItem(Integer beverageType, double volume) throws ViewLayerException {
        if (volume < 1 || volume > 10)
            throw new ViewLayerException("Volume is a double and can only be between 1 and 10.");
            
        double quenchFactor;
        quenchFactor = beverageType * volume;
        return quenchFactor;
        
    }
}

