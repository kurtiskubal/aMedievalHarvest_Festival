/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package byui.cit260.aMedievalHarvestFestival.view;

import amedievalharvestfestival.AMedievalHarvestFestival;
import byui.cit260.aMedievalHarvestFestival.control.LocationControl;
import byui.cit260.aMedievalHarvestFestival.model.Game;
import byui.cit260.aMedievalHarvestFestival.model.Location;
import byui.cit260.aMedievalHarvestFestival.model.Map;


/**
 *
 * @author Kurt
 */
public class LocationView extends MenuView{
         
     public LocationView(){
         super("\n"
            + "\n----------------------------------------------"
            + "\n| Move to a new Location                     |"
            + "\nR - My room"
            + "\nY - Lady Violet's room"
            + "\nG - Duke Frederick's room"
            + "\nH - Duke Harold’s room"
            + "\nU - Duke Luis’ room"
            + "\nC - Lord Canaway’s room"
            + "\nE - Empty guest room"
            + "\nO - Servants’ Quarters"
            + "\nP - Princess’ room"
            + "\nN - King’s Room"
            + "\nB - King’s Private Restroom"
            + "\nT - Gardens"
            + "\nS - Stable"
            + "\nF - Festival in courtyard"
            + "\nV - Guest’s Restroom"
            + "\nK - Kitchen"
            + "\nA - Audience chamber"
            + "\nD - Dining hall"
            + "\nL - Library"
            + "\nM - Look at map"
            + "\nQ - Quit the Move to a New Location menu"
            + "\n----------------------------------------------");
     }
    @Override
    public void doAction(char value) {
        Game thisGame = AMedievalHarvestFestival.getCurrentGame();
        Map gameMap = thisGame.getMap();
        Location[][] gameLocations = gameMap.getLocations();
        
        switch (value) {
            case 'R':
                LocationControl playerMoveMyRoom = new LocationControl();
                playerMoveMyRoom.movePlayerToLocation(gameLocations[0][1]);
                break;
            case 'Y':
                LocationControl playerMoveLadyV = new LocationControl();
                playerMoveLadyV.movePlayerToLocation(gameLocations[0][2]);
                break;
            case 'G':
                LocationControl playerMoveDukeF = new LocationControl();
                playerMoveDukeF.movePlayerToLocation(gameLocations[0][3]);
                break;
            case 'H':
                LocationControl playerMoveDukeH = new LocationControl();
                playerMoveDukeH.movePlayerToLocation(gameLocations[0][4]);
                break;
            case 'U':
                LocationControl playerMoveDukeL = new LocationControl();
                playerMoveDukeL.movePlayerToLocation(gameLocations[1][0]);
                break;
            case 'C':
                LocationControl playerMoveLordC = new LocationControl();
                playerMoveLordC.movePlayerToLocation(gameLocations[1][1]);
                break;
            case 'E':
                LocationControl playerMoveEmpGuest = new LocationControl();
                playerMoveEmpGuest.movePlayerToLocation(gameLocations[1][2]);
                break;
            case 'O':
                LocationControl playerMoveSerQ = new LocationControl();
                playerMoveSerQ.movePlayerToLocation(gameLocations[1][3]);
                break;
            case 'P':
                LocationControl playerMovePrinR = new LocationControl();
                playerMovePrinR.movePlayerToLocation(gameLocations[1][4]);
                break;
            case 'N':
                LocationControl playerMoveKingR = new LocationControl();
                playerMoveKingR.movePlayerToLocation(gameLocations[2][0]);
                break;
            case 'B':
                LocationControl playerMoveKingRR = new LocationControl();
                playerMoveKingRR.movePlayerToLocation(gameLocations[2][1]);
                break;
            case 'T':
                LocationControl playerMoveGardens = new LocationControl();
                playerMoveGardens.movePlayerToLocation(gameLocations[2][2]);
                break;
            case 'S':
                LocationControl playerMoveStables = new LocationControl();
                playerMoveStables.movePlayerToLocation(gameLocations[0][0]);
                break;
            case 'F':
                LocationControl playerMoveCourtyard = new LocationControl();
                playerMoveCourtyard.movePlayerToLocation(gameLocations[2][3]);
                break;
            case 'V':
                LocationControl playerMoveGuestRR = new LocationControl();
                playerMoveGuestRR.movePlayerToLocation(gameLocations[2][4]);
                break;
            case 'K':
                LocationControl playerMoveKitchen = new LocationControl();
                playerMoveKitchen.movePlayerToLocation(gameLocations[3][0]);
                break;
            case 'A':
                LocationControl playerMoveChamber = new LocationControl();
                playerMoveChamber.movePlayerToLocation(gameLocations[3][1]);
                break;
            case 'D':
                LocationControl playerMoveDining = new LocationControl();
                playerMoveDining.movePlayerToLocation(gameLocations[3][2]);
                break;
            case 'L':
                LocationControl playerMoveLibrary = new LocationControl();
                playerMoveLibrary.movePlayerToLocation(gameLocations[3][3]);
                break;
            case 'M':
                LocationControl lookAtMap = new LocationControl();
                LocationControl.displayMap();
                break;
            case 'Q':
                return;
            default:
                System.out.print("\n*** Invalid selction *** Try Again");
                break;
        }
    }

   
}

