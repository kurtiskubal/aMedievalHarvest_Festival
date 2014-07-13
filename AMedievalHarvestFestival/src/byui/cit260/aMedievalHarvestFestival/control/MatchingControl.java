/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package byui.cit260.aMedievalHarvestFestival.control;

import amedievalharvestfestival.AMedievalHarvestFestival;
import byui.cit260.aMedievalHarvestFestival.exceptions.MatchingControlException;
import static byui.cit260.aMedievalHarvestFestival.model.Constants.APPLE;
import byui.cit260.aMedievalHarvestFestival.model.InventoryItem;
import byui.cit260.aMedievalHarvestFestival.model.MatchingGameLocation;
import byui.cit260.aMedievalHarvestFestival.view.GameMenuView;

/**
 *
 * @author Kurt
 */
public class MatchingControl {

    public String showSelection(String[] value) throws MatchingControlException {
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
        
        Integer row;
        Integer column;
        row = Integer.parseInt(value[0]);
        column = Integer.parseInt(value[1]);
        
        if (row < 0 || (row > 7 ) ||
            column < 0 || (column > 4 )) {
            throw new MatchingControlException("Invalid row or Column");
        }
        
        if (row == 9 && column == 9) {
         for (int i = 0; i < 8; i++) {
                    for (int j = 0; j < 5; j++) {
                        if (matchingLocations[i][j].isChoosen() == true) {
                            matchingLocations[i][j].setChoosen(false);
                        }
                    }
                }
                GameMenuView gameMenuView = new GameMenuView();
                gameMenuView.displayMatchingGame();
                return " ";
        }
        
        if (matchingLocations[row][column].isMatched() == true) {
                            return ("This choice has already been matched,"
                                    + "\nplease choose another choice.");
        }
        else {
            matchingLocations[row][column].setChoosen(true);
        }
        
        return "";
        
    }
}
