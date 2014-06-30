/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package byui.cit260.aMedievalHarvestFestival.view;

import amedievalharvestfestival.AMedievalHarvestFestival;
import byui.cit260.aMedievalHarvestFestival.control.ConversationControl;
import byui.cit260.aMedievalHarvestFestival.model.Actors;
import java.util.Scanner;

/**
 *
 * @author Adam Decker
 */
public class ConversationsView {
    
    public void haveConv(){
        Actors[] actorsNear = AMedievalHarvestFestival.getPlayer().getPlayerLocation().getActors();
        
        Scanner keyboard = new Scanner(System.in);
        
        System.out.println("Would you like to talk to:");
        //loop for moving through an array
        for (int i = 0; i < actorsNear.length; i++){
            // Need to print a number and a name for each actor in array.
            System.out.println("\n" + i + " - " + actorsNear[i].getName());
        }
           
        int selection = keyboard.nextInt();
        ConversationControl control = new ConversationControl();
        
        //take selection and pass the actor object to the function in 
        // ConversationControl to get String
        String actorSays = control.startConversation(actorsNear[selection]);
//        Display String.
        System.out.println(actorSays);
    }
}
