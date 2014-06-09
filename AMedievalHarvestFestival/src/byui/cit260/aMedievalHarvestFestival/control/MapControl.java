/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package byui.cit260.aMedievalHarvestFestival.control;

import byui.cit260.aMedievalHarvestFestival.model.Actors;
import byui.cit260.aMedievalHarvestFestival.model.Location;
import byui.cit260.aMedievalHarvestFestival.model.Map;

/**
 *
 * @author Kurt
 */
public class MapControl {

    public static Location getCurrentLocation() {
        System.out.println("\n**** getCurrentLocation stub function called ****");
        return null;
    }

    static void moveActorsToLocation(Map map, Actors[] actors, int row, int column) {
           Location location = map.getLocations()[row][column];
           
       } 
    
    public double calcSqFootageOfRoom(double roomWidth, double roomLength){

        if (roomWidth < 0 || roomLength < 0){
            return -1;
        }
        if (roomLength > 50 || roomWidth > 100) { 
            return -2;
        }
        double squareFootage = roomWidth * roomLength;

        return squareFootage;
    }
    
    public double calcVolumeOfPool(double poolWidth, double poolLength, double poolDepth){

        if (poolWidth < 0 || poolLength < 0 || poolDepth < 0){
            return -1;
        }
        if (poolLength > 80 || poolWidth > 40 || poolDepth > 20) { 
            return -2;
        }
        double poolVolume = poolWidth * poolLength * poolDepth;

        return poolVolume;
    }
    
    public double calcSqFootageOfYard(double yardWidth, double yardLength){

        if (yardWidth < 0 || yardLength < 0){
            return -1;
        }
        if (yardLength > 200 || yardWidth > 100) { 
            return -2;
        }
        double ydSquareFootage = yardWidth * yardLength;

        return ydSquareFootage;
    }
    
}
