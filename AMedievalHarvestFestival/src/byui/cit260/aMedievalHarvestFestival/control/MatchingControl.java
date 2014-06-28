/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package byui.cit260.aMedievalHarvestFestival.control;

import amedievalharvestfestival.AMedievalHarvestFestival;
import static byui.cit260.aMedievalHarvestFestival.model.Constants.APPLE;
import byui.cit260.aMedievalHarvestFestival.model.InventoryItem;
import byui.cit260.aMedievalHarvestFestival.model.MatchingGameLocation;

/**
 *
 * @author Kurt
 */
public class MatchingControl {

    public void showSelection(String value) {
        InventoryItem[] inventory = AMedievalHarvestFestival.getCurrentGame().getInventory();
        MatchingGameLocation[][] matchingLocations = GameControl.getMatchingGameLocations();        
        
        int counter = -1;
        int totalMatches = 0;
        int[] matchesRow = new int[2];
        int[] matchesCol = new int[2];
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 5; j++) {
                if (matchingLocations[i][j].isChoosen() == true) {
                    counter++;
                    matchesRow[counter] = i;
                    matchesCol[counter] = j;
                }
                if (matchingLocations[i][j].isMatched() == true)
                {
                    totalMatches++;
                }
            } 
        }
        
        if (counter == 1) {
            if (matchingLocations[matchesRow[0]][matchesCol[0]].getMatchingInstance().getValue() != 
                    matchingLocations[matchesRow[1]][matchesCol[1]].getMatchingInstance().getValue())
            {
                matchingLocations[matchesRow[0]][matchesCol[0]].setChoosen(false);
                matchingLocations[matchesRow[1]][matchesCol[1]].setChoosen(false);
                System.out.println("Try again.");
            } 
            else 
            {
                matchingLocations[matchesRow[0]][matchesCol[0]].setChoosen(false);
                matchingLocations[matchesRow[1]][matchesCol[1]].setChoosen(false);
                matchingLocations[matchesRow[0]][matchesCol[0]].setMatched(true);
                matchingLocations[matchesRow[1]][matchesCol[1]].setMatched(true);
                System.out.println("Good Job! You get an apple");
                inventory[APPLE].setItemQuanity(inventory[APPLE].getItemQuanity() + 1);
                
            }
        }
        
        if (totalMatches == 40)
        {
            System.out.println("Good job, you found all the matches!"
                    + "\nThe puzzle will now reset.");
            for (int i = 0; i < 8; i++) {
                for (int j = 0; j < 5; j++) {
                    if (matchingLocations[i][j].isChoosen() == true) {
                        matchingLocations[i][j].setChoosen(false);
                    }
                    if (matchingLocations[i][j].isMatched() == true) {
                        matchingLocations[i][j].setMatched(false);
                    }
                }
            }
        }
        
        
                switch (value) {
                    case "00":
                        if (matchingLocations[0][0].isMatched() == true) {
                            System.out.println("This choice has already been matched,"
                                    + "\nplease choose another choice.");
                            break;
                        }
                        else
                            matchingLocations[0][0].setChoosen(true);
                        break;
                    case "01":
                        if (matchingLocations[0][1].isMatched() == true) {
                            System.out.println("This choice has already been matched,"
                                    + "\nplease choose another choice.");
                            break;
                        }
                        else
                            matchingLocations[0][1].setChoosen(true);
                        break;
                    case "02":
                        if (matchingLocations[0][2].isMatched() == true) {
                            System.out.println("This choice has already been matched,"
                                    + "\nplease choose another choice.");
                            break;
                        }
                        else
                            matchingLocations[0][2].setChoosen(true);
                        break;
                    case "03":
                        if (matchingLocations[0][3].isMatched() == true) {
                            System.out.println("This choice has already been matched,"
                                    + "\nplease choose another choice.");
                            break;
                        }
                        else
                            matchingLocations[0][3].setChoosen(true);
                        break;
                    case "04":
                        if (matchingLocations[0][4].isMatched() == true) {
                            System.out.println("This choice has already been matched,"
                                    + "\nplease choose another choice.");
                            break;
                        }
                        else
                            matchingLocations[0][4].setChoosen(true);
                        break;
                    case "10":
                        if (matchingLocations[1][0].isMatched() == true) {
                            System.out.println("This choice has already been matched,"
                                    + "\nplease choose another choice.");
                            break;
                        }
                        else
                            matchingLocations[1][0].setChoosen(true);
                        break;
                    case "11":
                        if (matchingLocations[1][1].isMatched() == true) {
                            System.out.println("This choice has already been matched,"
                                    + "\nplease choose another choice.");
                            break;
                        }
                        else
                            matchingLocations[1][1].setChoosen(true);
                        break;
                    case "12":
                        if (matchingLocations[1][2].isMatched() == true) {
                            System.out.println("This choice has already been matched,"
                                    + "\nplease choose another choice.");
                            break;
                        }
                        else
                            matchingLocations[1][2].setChoosen(true);
                        break;
                    case "13":
                        if (matchingLocations[1][3].isMatched() == true) {
                            System.out.println("This choice has already been matched,"
                                    + "\nplease choose another choice.");
                            break;
                        }
                        else
                            matchingLocations[1][3].setChoosen(true);
                        break;
                    case "14":
                        if (matchingLocations[1][4].isMatched() == true) {
                            System.out.println("This choice has already been matched,"
                                    + "\nplease choose another choice.");
                            break;
                        }
                        else
                            matchingLocations[1][4].setChoosen(true);
                        break;
                    case "20":
                        if (matchingLocations[2][0].isMatched() == true) {
                            System.out.println("This choice has already been matched,"
                                    + "\nplease choose another choice.");
                            break;
                        }
                        else
                            matchingLocations[2][0].setChoosen(true);
                        break;
                    case "21":
                        if (matchingLocations[2][1].isMatched() == true) {
                            System.out.println("This choice has already been matched,"
                                    + "\nplease choose another choice.");
                            break;
                        }
                        else
                            matchingLocations[2][1].setChoosen(true);
                        break;
                    case "22":
                        if (matchingLocations[2][2].isMatched() == true) {
                            System.out.println("This choice has already been matched,"
                                    + "\nplease choose another choice.");
                            break;
                        }
                        else
                            matchingLocations[2][2].setChoosen(true);
                        break;
                    case "23":
                        if (matchingLocations[2][3].isMatched() == true) {
                            System.out.println("This choice has already been matched,"
                                    + "\nplease choose another choice.");
                            break;
                        }
                        else
                            matchingLocations[2][3].setChoosen(true);
                        break;
                    case "24":
                        if (matchingLocations[2][4].isMatched() == true) {
                            System.out.println("This choice has already been matched,"
                                    + "\nplease choose another choice.");
                            break;
                        }
                        else
                            matchingLocations[2][4].setChoosen(true);
                        break;
                    case "30":
                        if (matchingLocations[3][0].isMatched() == true) {
                            System.out.println("This choice has already been matched,"
                                    + "\nplease choose another choice.");
                            break;
                        }
                        else
                            matchingLocations[3][0].setChoosen(true);
                        break;
                    case "31":
                        if (matchingLocations[3][1].isMatched() == true) {
                            System.out.println("This choice has already been matched,"
                                    + "\nplease choose another choice.");
                            break;
                        }
                        else
                            matchingLocations[3][1].setChoosen(true);
                        break;
                    case "32":
                        if (matchingLocations[3][2].isMatched() == true) {
                            System.out.println("This choice has already been matched,"
                                    + "\nplease choose another choice.");
                            break;
                        }
                        else
                            matchingLocations[3][2].setChoosen(true);
                        break;
                    case "33":
                        if (matchingLocations[3][3].isMatched() == true) {
                            System.out.println("This choice has already been matched,"
                                    + "\nplease choose another choice.");
                            break;
                        }
                        else
                            matchingLocations[3][3].setChoosen(true);
                        break;
                    case "34":
                        if (matchingLocations[3][4].isMatched() == true) {
                            System.out.println("This choice has already been matched,"
                                    + "\nplease choose another choice.");
                            break;
                        }
                        else
                            matchingLocations[3][4].setChoosen(true);
                        break;
                    case "40":
                        if (matchingLocations[4][0].isMatched() == true) {
                            System.out.println("This choice has already been matched,"
                                    + "\nplease choose another choice.");
                            break;
                        }
                        else
                            matchingLocations[4][0].setChoosen(true);
                        break;
                    case "41":
                        if (matchingLocations[4][1].isMatched() == true) {
                            System.out.println("This choice has already been matched,"
                                    + "\nplease choose another choice.");
                            break;
                        }
                        else
                            matchingLocations[4][1].setChoosen(true);
                        break;
                    case "42":
                        if (matchingLocations[4][2].isMatched() == true) {
                            System.out.println("This choice has already been matched,"
                                    + "\nplease choose another choice.");
                            break;
                        }
                        else
                            matchingLocations[4][2].setChoosen(true);
                        break;
                    case "43":
                        if (matchingLocations[4][3].isMatched() == true) {
                            System.out.println("This choice has already been matched,"
                                    + "\nplease choose another choice.");
                            break;
                        }
                        else
                            matchingLocations[4][3].setChoosen(true);
                        break;
                    case "44":
                        if (matchingLocations[4][4].isMatched() == true) {
                            System.out.println("This choice has already been matched,"
                                    + "\nplease choose another choice.");
                            break;
                        }
                        else
                            matchingLocations[4][4].setChoosen(true);
                        break;
                    case "50":
                        if (matchingLocations[5][0].isMatched() == true) {
                            System.out.println("This choice has already been matched,"
                                    + "\nplease choose another choice.");
                            break;
                        }
                        else
                            matchingLocations[5][0].setChoosen(true);
                        break;
                    case "51":
                        if (matchingLocations[5][1].isMatched() == true) {
                            System.out.println("This choice has already been matched,"
                                    + "\nplease choose another choice.");
                            break;
                        }
                        else
                            matchingLocations[5][1].setChoosen(true);
                        break;
                    case "52":
                        if (matchingLocations[5][2].isMatched() == true) {
                            System.out.println("This choice has already been matched,"
                                    + "\nplease choose another choice.");
                            break;
                        }
                        else
                            matchingLocations[5][2].setChoosen(true);
                        break;
                    case "53":
                        if (matchingLocations[5][3].isMatched() == true) {
                            System.out.println("This choice has already been matched,"
                                    + "\nplease choose another choice.");
                            break;
                        }
                        else
                            matchingLocations[5][3].setChoosen(true);
                        break;
                    case "54":
                        if (matchingLocations[5][4].isMatched() == true) {
                            System.out.println("This choice has already been matched,"
                                    + "\nplease choose another choice.");
                            break;
                        }
                        else
                            matchingLocations[5][4].setChoosen(true);
                        break;
                    case "60":
                        if (matchingLocations[6][0].isMatched() == true) {
                            System.out.println("This choice has already been matched,"
                                    + "\nplease choose another choice.");
                            break;
                        }
                        else
                            matchingLocations[6][0].setChoosen(true);
                        break;
                    case "61":
                        if (matchingLocations[6][1].isMatched() == true) {
                            System.out.println("This choice has already been matched,"
                                    + "\nplease choose another choice.");
                            break;
                        }
                        else
                            matchingLocations[6][1].setChoosen(true);
                        break;
                    case "62":
                        if (matchingLocations[6][2].isMatched() == true) {
                            System.out.println("This choice has already been matched,"
                                    + "\nplease choose another choice.");
                            break;
                        }
                        else
                            matchingLocations[6][2].setChoosen(true);
                        break;
                    case "63":
                        if (matchingLocations[6][3].isMatched() == true) {
                            System.out.println("This choice has already been matched,"
                                    + "\nplease choose another choice.");
                            break;
                        }
                        else
                            matchingLocations[6][3].setChoosen(true);
                        break;
                    case "64":
                        if (matchingLocations[6][4].isMatched() == true) {
                            System.out.println("This choice has already been matched,"
                                    + "\nplease choose another choice.");
                            break;
                        }
                        else
                            matchingLocations[6][4].setChoosen(true);
                        break;
                    case "70":
                        if (matchingLocations[7][0].isMatched() == true) {
                            System.out.println("This choice has already been matched,"
                                    + "\nplease choose another choice.");
                            break;
                        }
                        else
                            matchingLocations[7][0].setChoosen(true);
                        break;
                    case "71":
                        if (matchingLocations[7][1].isMatched() == true) {
                            System.out.println("This choice has already been matched,"
                                    + "\nplease choose another choice.");
                            break;
                        }
                        else
                            matchingLocations[7][1].setChoosen(true);
                        break;
                    case "72":
                        if (matchingLocations[7][2].isMatched() == true) {
                            System.out.println("This choice has already been matched,"
                                    + "\nplease choose another choice.");
                            break;
                        }
                        else
                            matchingLocations[7][2].setChoosen(true);
                        break;
                    case "73":
                        if (matchingLocations[7][3].isMatched() == true) {
                            System.out.println("This choice has already been matched,"
                                    + "\nplease choose another choice.");
                            break;
                        }
                        else
                            matchingLocations[7][3].setChoosen(true);
                        break;
                    case "74":
                        if (matchingLocations[7][4].isMatched() == true) {
                            System.out.println("This choice has already been matched,"
                                    + "\nplease choose another choice.");
                            break;
                        }
                        else
                            matchingLocations[7][4].setChoosen(true);
                        break;
                }
    }
}
