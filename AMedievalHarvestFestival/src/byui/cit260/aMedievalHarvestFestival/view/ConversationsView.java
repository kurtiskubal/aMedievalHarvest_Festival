/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package byui.cit260.aMedievalHarvestFestival.view;

import amedievalharvestfestival.AMedievalHarvestFestival;
import byui.cit260.aMedievalHarvestFestival.control.ConversationControl;
import byui.cit260.aMedievalHarvestFestival.model.Actors;

/**
 *
 * @author Adam Decker
 */
public class ConversationsView extends MenuView {

    public ConversationsView(String menu) {
        super(menu);
    }

    @Override
    public void doAction(char value) {
        Actors[] actorsNear = AMedievalHarvestFestival.getPlayer().getPlayerLocation().getActors();
        ConversationControl control = new ConversationControl();
        String x = "" + value;
        int pass = 0;
        if(value == 'Q'){
            return;
        }
        //take selection and pass the actor object to the function in 
        // ConversationControl to get String
        try {
            
            pass = Integer.parseInt(x);
        } catch(NumberFormatException ex) {
            System.out.println("Invalid character entered."
                    + "Must be a number or \"Q\"");
        } finally {
            try {
        String actorSays = control.startConversation(actorsNear[pass]);
//        Display String.
        System.out.println(actorSays);
            } catch(NullPointerException ex) {
                System.out.println("Invalid character entered."
                    + "Must be a number or \"Q\"");
                return;
            }
        }
    }
}
