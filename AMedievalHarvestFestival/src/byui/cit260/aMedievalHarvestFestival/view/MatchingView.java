/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package byui.cit260.aMedievalHarvestFestival.view;

import byui.cit260.aMedievalHarvestFestival.control.GameControl;
import byui.cit260.aMedievalHarvestFestival.control.MatchingControl;
import byui.cit260.aMedievalHarvestFestival.model.MatchingGameLocation;
import java.util.Scanner;

/**
 *
 * @author Kurt
 */
public class MatchingView{
    private static final String MENU = "\n"
                                     + "\n-----------------------"
                                     + "\n| Matching Menu |"
                                     + "\n## - Select a Number to Match"
                                     + "\n99 - Exit to Game Menu"
                                    + "\n-----------------------";


    public void display() {
GameMenuView gameMenuView = new GameMenuView();
        String selection = "  ";
        do {
            System.out.println(MENU);
            gameMenuView.displayMatchingGame();
            String input = this.getInput();
            selection = input.substring(0);
            this.doAction(selection);
        } while (!"99".equals(selection));
       
    }
     public String getInput() {
        boolean valid = false;
        String mainInput = null;
        Scanner keyboard = new Scanner(System.in);
        
        while(!valid) {
            
            mainInput = keyboard.nextLine();
            mainInput = mainInput.trim();
            
            if (mainInput.length() != 2) {
                System.out.println("Invalid selection - the selection must be non blank" +
                                   " and only two character in length.");
            }
            
            else {
                valid = true;
            }
        }
        return mainInput;
       
    }
     public void doAction(String value) {
          MatchingGameLocation[][] matchingLocations = GameControl.getMatchingGameLocations();
        switch (value) {
            case "00":
                
                //break;
            case "01":
                
                //break;
            case "02":
                
                //break;
            case "03":
                
                //break;
            case "04":
                
                //break;
            case "10":
                
                //break;
            case "11":
                
                //break;
            case "12":
                
                //break;
            case "13":
                
                //break;
            case "14":
                
                //break;
            case "20":
                
                //break;
            case "21":
                
                //break;
            case "22":
                
                //break;
            case "23":
                
                //break;
            case "24":
                
                //break;
            case "30":
                
                //break;
            case "31":
                
                //break;
            case "32":
                
                //break;
            case "33":
                
                //break;
            case "34":
                
                //break;
            case "40":
                
                //break;
            case "41":
                
                //break;
            case "42":
                
                //break;
            case "43":
                
                //break;
            case "44":
                
                //break;
            case "50":
                
                //break;
            case "51":
                
                //break;
            case "52":
                
                //break;
            case "53":
                
                //break;
            case "54":
                
                //break;
            case "60":
                
                //break;
            case "61":
                
                //break;
            case "62":
                
                //break;
            case "63":
                
                //break;
            case "64":
                
                //break;
            case "70":
                
                //break;
            case "71":
                
                //break;
            case "72":
                
                //break;
            case "73":
                
                //break;
            case "74":
                MatchingControl matchingControl = new MatchingControl();
                matchingControl.showSelection(value);
                break;    
            case "99":
                for (int i = 0; i < 8; i++) {
                    for (int j = 0; j < 5; j++) {
                        if (matchingLocations[i][j].isChoosen() == true) {
                            matchingLocations[i][j].setChoosen(false);
                    
                        }
                    }
                
                }
                return;
            default:
                System.out.print("\n*** Invalid selction *** Try Again");
                break;
        }
    }
     
}