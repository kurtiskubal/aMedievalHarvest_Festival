/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package byui.cit260.aMedievalHarvestFestival.view;

import byui.cit260.aMedievalHarvestFestival.control.LocationControl;
import java.util.Scanner;

/**
 *
 * @author Kurt
 */
public class LocationView {
     private static final String MENU = "\n"
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
            + "\n----------------------------------------------";

    public void displayLocationMenu() {
        
        char selection = ' ';
        do {
            
            System.out.println(MENU);
            
            String input = this.getInput();
            selection = input.charAt(0);
            
            this.doLocationAction(selection);
        } while (selection != 'Q');
        
        
    }

    public String getInput() {
        boolean valid = false;
        String helpInput = null;
        Scanner keyboard = new Scanner(System.in);
        
        while(!valid) {
            
            helpInput = keyboard.nextLine();
            helpInput = helpInput.trim();
            
            if (helpInput.length() != 1) {
                System.out.println("Invalid selection - the selection must be non blank" +
                                   " and only one character in length.");
            }
            
            else {
                valid = true;
            }
        }
        
        return helpInput.toUpperCase();
    }

    public void doLocationAction(char selection) {
        switch (selection) {
            case 'R':
                LocationControl playerMoveMyRoom = new LocationControl();
                playerMoveMyRoom.movePlayerToLocation();
                break;
            case 'Y':
                LocationControl playerMoveLadyV = new LocationControl();
                playerMoveLadyV.movePlayerToLocation();
                break;
            case 'G':
                LocationControl playerMoveDukeF = new LocationControl();
                playerMoveDukeF.movePlayerToLocation();
                break;
            case 'H':
                LocationControl playerMoveDukeH = new LocationControl();
                playerMoveDukeH.movePlayerToLocation();
                break;
            case 'U':
                LocationControl playerMoveDukeL = new LocationControl();
                playerMoveDukeL.movePlayerToLocation();
                break;
            case 'C':
                LocationControl playerMoveLordC = new LocationControl();
                playerMoveLordC.movePlayerToLocation();
                break;
            case 'E':
                LocationControl playerMoveEmpGuest = new LocationControl();
                playerMoveEmpGuest.movePlayerToLocation();
                break;
            case 'O':
                LocationControl playerMoveSerQ = new LocationControl();
                playerMoveSerQ.movePlayerToLocation();
                break;
            case 'P':
                LocationControl playerMovePrinR = new LocationControl();
                playerMovePrinR.movePlayerToLocation();
                break;
            case 'N':
                LocationControl playerMoveKingR = new LocationControl();
                playerMoveKingR.movePlayerToLocation();
                break;
            case 'B':
                LocationControl playerMoveKingRR = new LocationControl();
                playerMoveKingRR.movePlayerToLocation();
                break;
            case 'T':
                LocationControl playerMoveGardens = new LocationControl();
                playerMoveGardens.movePlayerToLocation();
                break;
            case 'S':
                LocationControl playerMoveStables = new LocationControl();
                playerMoveStables.movePlayerToLocation();
                break;
            case 'F':
                LocationControl playerMoveCourtyard = new LocationControl();
                playerMoveCourtyard.movePlayerToLocation();
                break;
            case 'V':
                LocationControl playerMoveGuestRR = new LocationControl();
                playerMoveGuestRR.movePlayerToLocation();
                break;
            case 'K':
                LocationControl playerMoveKitchen = new LocationControl();
                playerMoveKitchen.movePlayerToLocation();
                break;
            case 'A':
                LocationControl playerMoveChamber = new LocationControl();
                playerMoveChamber.movePlayerToLocation();
                break;
            case 'D':
                LocationControl playerMoveDining = new LocationControl();
                playerMoveDining.movePlayerToLocation();
                break;
            case 'L':
                LocationControl playerMoveLibrary = new LocationControl();
                playerMoveLibrary.movePlayerToLocation();
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

