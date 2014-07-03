/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package byui.cit260.aMedievalHarvestFestival.control;

import amedievalharvestfestival.AMedievalHarvestFestival;
import byui.cit260.aMedievalHarvestFestival.model.Location;

/**
 *
 * @author Kurt
 */
public class LocationControl {
    public static String movePlayerToLocation(Location location){
        String message = null;
        double prevHunger = AMedievalHarvestFestival.getPlayer().getHunger();
        if (location == AMedievalHarvestFestival.getPlayer().getPlayerLocation())
            {
            message = ("You are already in the " + GameControl.getPlayerCurrentLocationName() + ".");
            return message;
        }
        if (prevHunger == 100) {
            message = ("You are too hungry. You have no energy."
                    + "\nIf you have food, eat it. If not, earn"
                    + "\nfood by playing the memory game.");
            return message;
        }
        if (AMedievalHarvestFestival.getCurrentGame().isGameEvent() == true
                && location != GameControl.getGameEventLocation()) {
            message =("There seems to be something important"
                    + "\ngoing on in the " + GameControl.getGameEventLocation().getInstance().getName() + "."
                    + "\nYou should check it out.");
            return message;
        }
        
       else if (AMedievalHarvestFestival.getCurrentGame().isGameEvent() == true
                && location == AMedievalHarvestFestival.getCurrentGame().getGameEventLocation()) {
            AMedievalHarvestFestival.getPlayer().setPlayerLocation(location);
            ConsumableControl.gainHunger(AMedievalHarvestFestival.getPlayer());
            message = ("Moving to " + location.getInstance().getName() + " made you more hungry."
           + "\nYour hunger is " + AMedievalHarvestFestival.getPlayer().getHunger()
           + "\n" + GameControl.getPlayerCurrentLocationDescription());
        
        
        
            if (location.isVisited() == false) {
                location.setVisited(true);
                
            }
        AMedievalHarvestFestival.getCurrentGame().setGameEvent(false);
        return message;
        }
        
        else {
            AMedievalHarvestFestival.getPlayer().setPlayerLocation(location);
            ConsumableControl.gainHunger(AMedievalHarvestFestival.getPlayer());
        message = "Moving to " + location.getInstance().getName() + " made you more hungry."
            + "\nYour hunger is " + AMedievalHarvestFestival.getPlayer().getHunger() + "."
            + "\n" + GameControl.getPlayerCurrentLocationDescription();
            if (location.isVisited() == false) {
                location.setVisited(true);
            }
            return message; 
       
       } 
    }
    
}
