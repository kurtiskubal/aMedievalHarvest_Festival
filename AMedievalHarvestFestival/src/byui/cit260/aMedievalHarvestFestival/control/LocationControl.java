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
    Location[][] locations = GameControl.getMapLocations();
    public static void movePlayerToLocation(Location location){
        if (AMedievalHarvestFestival.getCurrentGame().isGameEvent() == true
                && location != AMedievalHarvestFestival.getCurrentGame().getGameEventLocation()) {
            System.out.println("There seems to be something important"
                    + "\ngoing on in the " + AMedievalHarvestFestival.getCurrentGame().getGameEventLocation().getInstance().getName() + "."
                    + "\nYou should check it out.");
        }
        
        else if (AMedievalHarvestFestival.getCurrentGame().isGameEvent() == true
                && location == AMedievalHarvestFestival.getCurrentGame().getGameEventLocation()) {
            AMedievalHarvestFestival.getPlayer().setPlayerLocation(location);
        System.out.println(AMedievalHarvestFestival.getPlayer().getPlayerLocation().getInstance().getDescription());
        if (location.isVisited() == false) {
            location.setVisited(true);
        }
        AMedievalHarvestFestival.getCurrentGame().setGameEvent(false);
        }
        
        else {
            AMedievalHarvestFestival.getPlayer().setPlayerLocation(location);
        System.out.println(AMedievalHarvestFestival.getPlayer().getPlayerLocation().getInstance().getDescription());
        if (location.isVisited() == false) {
            location.setVisited(true);
        }
        } 
            
    }
    
    
}
