/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package byui.cit260.aMedievalHarvestFestival.view;

import java.util.Scanner;

/**
 *
 * @author Decker
 */
public abstract class MenuView implements MenuInterface{
    
    private String menu;
    
    public MenuView() {
        
    }
    
    public MenuView(String menu) {
        this.menu = menu;
    }

    @Override
    public void display() {
        char selection = ' ';
        do {
            
            System.out.println(menu);
            
            String input = this.getInput();
            selection = input.charAt(0);
            
            this.doAction(selection);
        } while (selection != 'Q');
    }

    @Override
    public String getInput() {
        boolean valid = false;
        String mainInput = null;
        Scanner keyboard = new Scanner(System.in);
        
        while(!valid) {
            
            mainInput = keyboard.nextLine();
            mainInput = mainInput.trim();
            
            if (mainInput.length() != 1) {
                System.out.println("Invalid selection - the selection must be non blank" +
                                   " and only one character in length.");
            }
            
            else {
                valid = true;
            }
        }
        
        return mainInput.toUpperCase();
    }

    
    
}
