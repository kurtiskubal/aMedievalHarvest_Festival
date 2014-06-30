/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package byui.cit260.aMedievalHarvestFestival.control;
import amedievalharvestfestival.AMedievalHarvestFestival;
import byui.cit260.aMedievalHarvestFestival.model.Location;

import amedievalharvestfestival.AMedievalHarvestFestival;
import byui.cit260.aMedievalHarvestFestival.model.InstanceLocation;
import byui.cit260.aMedievalHarvestFestival.model.Location;
import byui.cit260.aMedievalHarvestFestival.model.Player;

/**
 *
 * @author Kurt
 */
public class LocationControl {
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
    public static void displayMap(){
        
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
    }
}
