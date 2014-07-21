/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package byui.cit260.aMedievalHarvestFestival.control;

import byui.cit260.aMedievalHarvestFestival.exceptions.ViewLayerException;
import byui.cit260.aMedievalHarvestFestival.model.Player;

/**
 *
 * @author Adam Decker
 */
public class ConsumableControl {
    public static String getPlayerHunger(Player player) {
        double hungerEstimated;
        hungerEstimated = player.getHunger();
        String finalMessage;
        
        finalMessage = (player.getName() + ", Lord Pharoah's hunger is " + hungerEstimated + ".\n");
        return finalMessage;
    }
    
    public static String getPlayerThirst(Player player) {
        int thirstEstimated;
        thirstEstimated = (int) player.getThirst();
        String finalMessage;
        finalMessage = (player.getName() + ", Lord Pharoah's thirst is " + thirstEstimated + ".\n");
    return finalMessage;
}
    
    public static void gainHunger(Player player) {
        double hunger;
        hunger = (int) player.getHunger() + 5;
        if (hunger > 100)
            hunger = 100;
        player.setHunger(hunger);
        }
    
    public static Double calcFillingFoodItem(Integer foodType, String weightS) throws ViewLayerException{
        try {
        double weight = Double.parseDouble(weightS);
        
        if (weight < 1 || weight > 10)
            throw new ViewLayerException("Weight is a double and can only be between 1 and 10.");
        
        double fillingFactor;
        fillingFactor = foodType * weight;
        return fillingFactor;
        }
        catch (NumberFormatException ex) {
            throw new ViewLayerException("Weight must be a double"
            + "\nbetween 1 and 10");
        }
        
    }
    public static Double calcQuenchBeverageItem(Integer beverageType, String volumeS) throws ViewLayerException {
        try {
        double volume = Double.parseDouble(volumeS);
        if (volume < 1 || volume > 10)
            throw new ViewLayerException("Volume is a double and can only be between 1 and 10.");
            
        double quenchFactor;
        quenchFactor = beverageType * volume;
        return quenchFactor;
        }
        catch (NumberFormatException ex) {
            throw new ViewLayerException("Volume must be a double"
            + "\nbetween 1 and 10.");
        }
    }
}

