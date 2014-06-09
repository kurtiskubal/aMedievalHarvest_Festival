/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package byui.cit260.aMedievalHarvestFestival.view;

import byui.cit260.aMedievalHarvestFestival.control.PuzzleControl;
import java.util.Scanner;

/**
 *
 * @author Kurt
 */
public class PuzzleView {
    public Integer getPlayerSolution() {
        boolean valid = false;
        int puzzleInput;
        int compared = 0;
        System.out.println("Sample math problem input your solution in the form of an integer.");
//compared will be retrieved from PuzzleControl when it is implemented
        Scanner keyboard = new Scanner(System.in);
        
        while(!valid) {
            puzzleInput = keyboard.nextInt();
            PuzzleControl puzzleTest = new PuzzleControl();
            puzzleTest.randomMathProblem(puzzleInput);
            
            if (puzzleInput < 1 || puzzleInput > 400) {
                System.out.println("Invalid - this is not a number between 1" +
                                   " and 400.");
                return -1;
            }
            
            else if (puzzleInput != compared)
                    return null;
            
            else {
                valid = true;
            }
        }
        return null;
        
        
    }
}

