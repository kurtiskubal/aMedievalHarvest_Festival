/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package byui.cit260.aMedievalHarvestFestival.view;

import byui.cit260.aMedievalHarvestFestival.control.ConsumableControl;
import byui.cit260.aMedievalHarvestFestival.exceptions.ViewLayerException;
import java.util.Scanner;

/**
 *
 * @author Kurt
 */
public class FoodFillView extends MenuView{
    public FoodFillView() {
        super("\nList of Food Items"
        + "\nA - Apple"              
        + "\nB - Beans"              
        + "\nC - Bread"              
        + "\nD - Corn"               
        + "\nE - Peas"
        + "\nQ - Exit");
    }
    @Override
    public void doAction(char value) {
        Scanner keyboard = new Scanner(System.in);
        String weight;
        double factor;
        int type;
       
        switch (value) {
            case 'A':
                System.out.println("Enter the weight of the Apple:");
                weight = keyboard.nextLine();
                weight = weight.trim();
                
        try {
            factor = ConsumableControl.calcFillingFoodItem(1, weight);
            System.out.println("The filling factor of an Apple of " + weight + " weight is " + factor + ".");
        } catch (ViewLayerException ex) {
            System.out.println(ex.getMessage());
        }
                break;
            case 'B':
                System.out.println("Enter the weight of the Beans:");
                weight = keyboard.nextLine();
                weight = weight.trim();
         try {
            factor = ConsumableControl.calcFillingFoodItem(4, weight);
            System.out.println("The filling factor of Beans of " + weight + " weight is " + factor + ".");
        } catch (ViewLayerException ex) {
            System.out.println(ex.getMessage());
        }
                break;
            case 'C':
                System.out.println("Enter the weight of the Bread:");
                weight = keyboard.nextLine();
                weight = weight.trim();
                
            try {
            factor = ConsumableControl.calcFillingFoodItem(2, weight);
            System.out.println("The filling factor of Bread of " + weight + " weight is " + factor + ".");
        } catch (ViewLayerException ex) {
            System.out.println(ex.getMessage());
        }
                break;
            case 'D':
                System.out.println("Enter the weight of the Corn:");
                weight = keyboard.nextLine();
                weight = weight.trim();
                
            try {
            factor = ConsumableControl.calcFillingFoodItem(3, weight);
            System.out.println("The filling factor of Corn of " + weight + " weight is " + factor + ".");
        } catch (ViewLayerException ex) {
            System.out.println(ex.getMessage());
        }
                break;
            case 'E':
                System.out.println("Enter the weight of the Peas:");
                weight = keyboard.nextLine();
                weight = weight.trim();
            try {
            factor = ConsumableControl.calcFillingFoodItem(5, weight);
            System.out.println("The filling factor of Peas of " + weight + " weight is " + factor + ".");
        } catch (ViewLayerException ex) {
            System.out.println(ex.getMessage());
        }
                break;
        }
    }
    
}
