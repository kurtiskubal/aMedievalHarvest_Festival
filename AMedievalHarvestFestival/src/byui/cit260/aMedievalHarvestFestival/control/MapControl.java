/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package byui.cit260.aMedievalHarvestFestival.control;

import amedievalharvestfestival.AMedievalHarvestFestival;
import byui.cit260.aMedievalHarvestFestival.exceptions.ViewLayerException;
import byui.cit260.aMedievalHarvestFestival.model.Actors;
import byui.cit260.aMedievalHarvestFestival.model.Constants;
import byui.cit260.aMedievalHarvestFestival.model.InstanceLocation;
import byui.cit260.aMedievalHarvestFestival.model.Location;
import byui.cit260.aMedievalHarvestFestival.model.Player;

/**
 *
 * @author Kurt
 */
public class MapControl {

    public static InstanceLocation getCurrentLocation() {
        Player thisPlayer = amedievalharvestfestival.AMedievalHarvestFestival.getPlayer();
        Location location = thisPlayer.getPlayerLocation();
        InstanceLocation scene = location.getInstance();
        return scene;
    }

    static void moveActorsToLocation(Actors[] actors) {
        Location[][] map = AMedievalHarvestFestival.getCurrentGame().getMap().getLocations();
        Actors[] onMap = map[0][0].getActors();
        onMap[0]=actors[Constants.PRINCESS_WILLIAM];
        onMap = map[0][1].getActors();
//        onMap[0]=actors[Constants.PRINCESS_WILLIAM];
        onMap = map[0][2].getActors();
//        onMap[0]=actors[Constants.PRINCESS_WILLIAM];
        onMap = map[0][3].getActors();
//        onMap[0]=actors[Constants.HAROLD];
        onMap = map[0][4].getActors();
        onMap[0]=actors[Constants.HAROLD];
        onMap = map[1][0].getActors();
        onMap[0]=actors[Constants.LUIS];
        onMap = map[1][1].getActors();
//        onMap[0]=actors[Constants.HAROLD];
        onMap = map[1][2].getActors();
//        onMap[0]=actors[Constants.HAROLD];
        onMap = map[1][3].getActors();
//        onMap[0]=actors[Constants.HAROLD];
        onMap = map[1][4].getActors();
//        onMap[0]=actors[Constants.HAROLD];
        onMap = map[2][0].getActors();
//        onMap[0]=actors[Constants.HAROLD];
        onMap = map[2][1].getActors();
//        onMap[0]=actors[Constants.HAROLD];
        onMap = map[2][2].getActors();
        onMap[0]=actors[Constants.QUEEN_WILLIAM];
        onMap[1]=actors[Constants.VIOLET];
        onMap = map[2][3].getActors();
        onMap[0]=actors[Constants.CANAWAY];
        onMap[1]=actors[Constants.FREDERICK];
        onMap[2]=actors[Constants.SERVANT_LILLY];
        onMap = map[2][4].getActors();
//        onMap[0]=actors[Constants.HAROLD];
        onMap = map[3][0].getActors();
        onMap[0]=actors[Constants.SERVANT_DAVID];
        onMap = map[3][1].getActors();
        onMap[0]=actors[Constants.KING_WILLIAM];
        onMap[1]=actors[Constants.SERVANT_CHARLES];
        onMap = map[3][2].getActors();
//        onMap[0]=actors[Constants.HAROLD];
        onMap = map[3][3].getActors();
//        onMap[0]=actors[Constants.HAROLD];
        onMap = map[3][4].getActors();
//        onMap[0]=actors[Constants.HAROLD];
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
    
    public double calcSqFootageOfYard(double yardWidth, double yardLength) 
                                    throws ViewLayerException{
//        try {
//            double width = Double.parseDouble(yardWidth);
//            double length = Double.parseDouble(yardLength);
//        } catch(NumberFormatException ex) {
//            throw new ViewLayerException("");
//        }
        if (yardWidth < 0 || yardLength < 0){
            throw new ViewLayerException("Yard width or length is less than 0:"
                    + "\n Length must be between: 0 - 200"
                    + "\n Width must be between:  0 - 100");
        }
        if (yardLength > 200 || yardWidth > 100) { 
            throw new ViewLayerException("Yard width or length is more than MAX:"
                    + "\n Length must be between: 0 - 200"
                    + "\n Width must be between:  0 - 100");
        }
        double ydSquareFootage = yardWidth * yardLength;

        return ydSquareFootage;
    }
    
}
