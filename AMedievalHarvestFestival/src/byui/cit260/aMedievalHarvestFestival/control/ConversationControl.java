/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package byui.cit260.aMedievalHarvestFestival.control;

import amedievalharvestfestival.AMedievalHarvestFestival;
import byui.cit260.aMedievalHarvestFestival.model.Actors;
import byui.cit260.aMedievalHarvestFestival.model.Game;
import byui.cit260.aMedievalHarvestFestival.model.InventoryItem;

/**
 *
 * @author Adam Decker
 */
public class ConversationControl {
    
    public String startConversation(Actors person){
        boolean evidence = person.isEvidence();
        Game thisGame = AMedievalHarvestFestival.getCurrentGame();
        InventoryItem[] plyrInventory = thisGame.getInventory();
        boolean gift = false;
        String actorSays = null;
        if(plyrInventory[8].getItemQuanity() > 0 
                || plyrInventory[7].getItemQuanity() > 0
                || plyrInventory[11].getItemQuanity() > 0){
            gift = true;
        }
        double happiness = person.getHappiness();
        
        if(evidence == true && person.getDialogueEvidence() != null){
            actorSays = person.getDialogueEvidence();
            if(person.getName() == "Queen Williams"){
                plyrInventory[13].setItemQuanity(1);
                person.setEvidence(false);
            }
            else if(person.getName() == "Princess Williams"){
                plyrInventory[12].setItemQuanity(1);
                person.setEvidence(false);
            }
        }
        
        else if(gift == true && person.getDialogueGift() != null){
            actorSays = person.getDialogueGift();
            if(person.getName() == "Lord Canaway"){
                plyrInventory[7].setItemQuanity(0);
            }
            else if(person.getName() == "Princess Williams"){
                plyrInventory[8].setItemQuanity(0);
            }
            else if(person.getName() == "Lady Violet"){
                plyrInventory[11].setItemQuanity(0);
            }
        }
        
        else if(happiness > 5 && person.getDialogueHappy() != null){
            actorSays = person.getDialogueHappy();
        }
         
        else {
            actorSays = person.getDialogue();
        }
        return actorSays;
    }
        
}
