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
public class BeverageFillView extends MenuView{
    public BeverageFillView() {
        super("\nList of Beverage Items"
        + "\nA - Ale"              
        + "\nB - Cider"              
        + "\nC - Mead"              
        + "\nD - Water"               
        + "\nE - Wine"
        + "\nQ - Exit");
    }
    @Override
    public void doAction(char value) {Scanner keyboard = new Scanner(System.in);
        String volume;
        double factor;
        int type;
       
        switch (value) {
            case 'A':
                System.out.println("Enter the volume of the Ale:");
                volume = keyboard.nextLine();
                volume = volume.trim();
                
        try {
            factor = ConsumableControl.calcQuenchBeverageItem(1, volume);
            System.out.println("The quench factor of Ale of " + volume + " volume is " + factor + ".");
        } catch (ViewLayerException ex) {
            System.out.println(ex.getMessage());
        }
                break;
            case 'B':
                System.out.println("Enter the volume of the Cider:");
                volume = keyboard.nextLine();
                volume = volume.trim();
                
        try {
            factor = ConsumableControl.calcQuenchBeverageItem(3, volume);
            System.out.println("The quench factor of Cider of " + volume + " volume is " + factor + ".");
        } catch (ViewLayerException ex) {
            System.out.println(ex.getMessage());
        }
                break;
            case 'C':
                System.out.println("Enter the volume of the Mead:");
                volume = keyboard.nextLine();
                volume = volume.trim();
                
        try {
            factor = ConsumableControl.calcQuenchBeverageItem(2, volume);
            System.out.println("The quench factor of Mead of " + volume + " volume is " + factor + ".");
        } catch (ViewLayerException ex) {
            System.out.println(ex.getMessage());
        }
                break;
            case 'D':
                System.out.println("Enter the volume of the Water:");
                volume = keyboard.nextLine();
                volume = volume.trim();
                
        try {
            factor = ConsumableControl.calcQuenchBeverageItem(5, volume);
            System.out.println("The quench factor of Water of " + volume + " volume is " + factor + ".");
        } catch (ViewLayerException ex) {
            System.out.println(ex.getMessage());
        }
                break;
            case 'E':
                System.out.println("Enter the volume of the Wine:");
                volume = keyboard.nextLine();
                volume = volume.trim();
        try {
            factor = ConsumableControl.calcQuenchBeverageItem(4, volume);
            System.out.println("The quench factor of Wine of " + volume + " volume is " + factor + ".");
        } catch (ViewLayerException ex) {
            System.out.println(ex.getMessage());
        }
                break;
        }
    }
}
