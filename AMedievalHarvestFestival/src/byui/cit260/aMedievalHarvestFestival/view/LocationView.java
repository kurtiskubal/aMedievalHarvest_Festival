/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package byui.cit260.aMedievalHarvestFestival.view;

import byui.cit260.aMedievalHarvestFestival.control.GameControl;
import byui.cit260.aMedievalHarvestFestival.control.LocationControl;
import byui.cit260.aMedievalHarvestFestival.model.Location;

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
            + "\nJ - Pool"
            + "\nQ - Quit the Move to a New Location menu"
            + "\n----------------------------------------------");
     }
     
    @Override
    public void doAction(char value) {
        Location[][] locations = GameControl.getMapLocations();
        switch (value) {
            case 'R':
                System.out.println(LocationControl.movePlayerToLocation(locations[0][1]));
                break;
            case 'Y':
                System.out.println(LocationControl.movePlayerToLocation(locations[0][2]));
                break;
            case 'G':
                System.out.println(LocationControl.movePlayerToLocation(locations[0][3]));
                break;
            case 'H':
                System.out.println(LocationControl.movePlayerToLocation(locations[0][4]));
                break;
            case 'U':
                System.out.println(LocationControl.movePlayerToLocation(locations[1][0]));
                break;
            case 'C':
                System.out.println(LocationControl.movePlayerToLocation(locations[1][1]));
                break;
            case 'E':
                System.out.println(LocationControl.movePlayerToLocation(locations[1][2]));
                break;
            case 'O':
                System.out.println(LocationControl.movePlayerToLocation(locations[1][3]));
                break;
            case 'P':
                System.out.println(LocationControl.movePlayerToLocation(locations[1][4]));
                break;
            case 'N':
                System.out.println(LocationControl.movePlayerToLocation(locations[2][0]));
                break;
            case 'B':
                System.out.println(LocationControl.movePlayerToLocation(locations[2][1]));
                break;
            case 'T':
                System.out.println(LocationControl.movePlayerToLocation(locations[2][2]));
                break;
            case 'S':
                System.out.println(LocationControl.movePlayerToLocation(locations[0][0]));
                break;
            case 'F':
                System.out.println(LocationControl.movePlayerToLocation(locations[2][3]));
                break;
            case 'V':
                System.out.println(LocationControl.movePlayerToLocation(locations[2][4]));
                break;
            case 'K':
                System.out.println(LocationControl.movePlayerToLocation(locations[3][0]));
                break;
            case 'A':
                System.out.println(LocationControl.movePlayerToLocation(locations[3][1]));
                break;
            case 'D':
                System.out.println(LocationControl.movePlayerToLocation(locations[3][2]));
                break;
            case 'L':
                System.out.println(LocationControl.movePlayerToLocation(locations[3][3]));
                break;
            case 'J':
                System.out.println(LocationControl.movePlayerToLocation(locations[3][4]));
                break;    
           case 'Q':
                return;
            default:
                System.out.print("\n*** Invalid selction *** Try Again");
                break;
        }
    }

   
}

