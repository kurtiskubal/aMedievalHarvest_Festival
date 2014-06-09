/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package byui.cit260.aMedievalHarvestFestival.view;

import byui.cit260.aMedievalHarvestFestival.control.ConsumableControl;
import java.util.Scanner;

/**
 *
 * @author Adam Decker
 */
public class ConsumableView {
    
    public void determineConsumableValue() {
        boolean valid = false;
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Would you like to check the value of a B-Beverage or a F-Food?");
        String foodType = keyboard.nextLine();
        foodType = foodType.trim();
        foodType = foodType.toUpperCase();
        ConsumableControl control = new ConsumableControl();
        
        while(!valid) {
        
            if ((char)foodType.charAt(0) == 'B') {
                System.out.println("What is the Volume of the drink?");
                int volume = keyboard.nextInt();
                System.out.println("What is the Type or effectivness of the drink?");
                int type = keyboard.nextInt();
            
            
                int factor = control.calcQuenchBeverageItem(type, volume);
                
                if (factor == -1) System.out.println("The value entered for Type is less than 1");
                else if (factor == -2) System.out.println("The value entered for Volume is less than 1");
                else if (factor == -3) System.out.println("The value entered for Type is greater than than 5");
                else if (factor == -4) System.out.println("The value entered for Volume is greater than 10");
            
                else {
                    System.out.println("Your Beverage item will decrease your Thirst by: " + factor);
                
                    valid = true;
                }
            }
            else if ((char)foodType.charAt(0) == 'F') {
                System.out.println("What is the Weight of the drink?");
                int weight = keyboard.nextInt();
                System.out.println("What is the Type or effectivness of the drink?");
                int type = keyboard.nextInt();
            
            
                int factor = control.calcFillingFoodItem(type, weight);
                
                if (factor == -1) System.out.println("The value entered for Type is less than 1");
                else if (factor == -2) System.out.println("The value entered for Weight is less than 1");
                else if (factor == -3) System.out.println("The value entered for Type is greater than than 5");
                else if (factor == -4) System.out.println("The value entered for Weight is greater than 10");
            
                else {
                    System.out.println("Your Food item will decrease your Hunger by: " + factor);
                
                
                    valid = true;
                }
            }
            else {

               System.out.println("You did not select a Food or Beverage");

               return;

            }

        }
    }
}

