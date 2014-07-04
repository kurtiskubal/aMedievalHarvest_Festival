/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package byui.cit260.aMedievalHarvestFestival.view;

import byui.cit260.aMedievalHarvestFestival.control.ConsumableControl;
import byui.cit260.aMedievalHarvestFestival.control.MapControl;
import byui.cit260.aMedievalHarvestFestival.exceptions.ViewLayerException;
import java.util.Scanner;

/**
 *
 * @author Kurt
 */
public class MapDimensionsView extends MenuView{
    public MapDimensionsView() {
        super("\n|What Type of Location would you like to Find Dimensions For|"
        + "\nA - Square Footage of Room"
        + "\nS - Volume of Pool"
        + "\nD - Square Footage of Yard"
        + "\nQ - Exit");
    }
    @Override
    public void doAction(char value) {
        Scanner keyboard = new Scanner(System.in);
        String width;
        String length;
        String depth;
        double volOrSqFt;
        
        switch (value) {
            case 'A':
                System.out.println("Enter the width of the room:");
                width = keyboard.nextLine();
                width = width.trim();
                System.out.println("Enter the length of the room:");
                length = keyboard.nextLine();
                length = length.trim();
                
        try {
            volOrSqFt = MapControl.calcSqFootageOfRoom(width, length);
            System.out.println("The square footage of the room would be " + volOrSqFt + ".");
        } catch (ViewLayerException ex) {
            System.out.println(ex.getMessage());
        }
                break;
            case 'S':
                System.out.println("Enter the width of the pool:");
                width = keyboard.nextLine();
                width = width.trim();
                System.out.println("Enter the length of the pool:");
                length = keyboard.nextLine();
                length = length.trim();
                System.out.println("Enter the depth of the pool:");
                depth = keyboard.nextLine();
                depth = depth.trim();
                
         try {
            volOrSqFt = MapControl.calcVolumeOfPool(width, length, depth);
            System.out.println("The square footage of the pool would be " + volOrSqFt + ".");
        } catch (ViewLayerException ex) {
            System.out.println(ex.getMessage());
        }
                break;
            case 'D':
                System.out.println("Enter the width of the yard:");
                width = keyboard.nextLine();
                width = width.trim();
                System.out.println("Enter the length of the yard:");
                length = keyboard.nextLine();
                length = length.trim();
                
            try {
               volOrSqFt = MapControl.calcSqFootageOfYard(width, length);
            System.out.println("The square footage of the yard would be " + volOrSqFt + ".");
        } catch (ViewLayerException ex) {
            System.out.println(ex.getMessage());
        }
                break;
            
            
        }
        
        
    }
    
}
