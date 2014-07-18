/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package byui.cit260.aMedievalHarvestFestival.control;

import amedievalharvestfestival.AMedievalHarvestFestival;
import byui.cit260.aMedievalHarvestFestival.model.Actors;
import byui.cit260.aMedievalHarvestFestival.model.Constants;
import byui.cit260.aMedievalHarvestFestival.model.InventoryItem;

/**
 *
 * @author Adam Decker
 */
public class ConversationControl {
    
    public String startConversation(Actors person){
        boolean evidence = person.isEvidence();
        InventoryItem[] plyrInventory;
        plyrInventory = AMedievalHarvestFestival.getCurrentGame().getInventory();
        
        boolean gift = false;
        String actorSays = null;
        if(plyrInventory[Constants.GIFT].getItemQuanity() > 0 
                || plyrInventory[Constants.GENERIC_GIFT].getItemQuanity() > 0
                || plyrInventory[Constants.AWESOME_GIFT].getItemQuanity() > 0){
            gift = true;
        }
        double happiness = person.getHappiness();
        
        if(evidence == true){
            actorSays = person.getDialogueEvidence();
            switch (person.getName()) {
                case "Queen Williams":
                    plyrInventory[Constants.EVIDENCE_THREE_ITEM].setItemQuanity(1);
                    
                    person.setEvidence(false);
                    break;
                case "Princess Williams":
                    plyrInventory[Constants.EVIDENCE_FOUR_ITEM].setItemQuanity(1);
                    person.setEvidence(false);
                    break;
            }
        }
        
        else if(happiness > 5){
            actorSays = person.getDialogueHappy();
        }
        
        else if((person.getName().matches("Lord Canaway") || 
                person.getName().matches("Princess Williams") ||
                person.getName().matches("Lady Violet")) && gift == true){
            switch (person.getName()) {
                case "Lord Canaway":
                    plyrInventory[Constants.GENERIC_GIFT].setItemQuanity(0);
                    person.setHappiness(10);
                    actorSays = person.getDialogueGift();
                    break;
                case "Princess Williams":
                    plyrInventory[Constants.GIFT].setItemQuanity(0);
                    person.setHappiness(10);
                    actorSays = person.getDialogueGift();
                    break;
                case "Lady Violet":
                    plyrInventory[Constants.AWESOME_GIFT].setItemQuanity(0);
                    person.setHappiness(10);
                    actorSays = person.getDialogueGift();
                    break;
            }
        }
        
        else if(plyrInventory[Constants.EVIDENCE_FOUR_ITEM].getItemQuanity() > 0 && "Servant Charles".equals(person.getName())){
            actorSays = "Thank you for saving our Princess. The King has reviewed your "
                    + "evidence and found you to not be guilty. Know that the traitor Duke will "
                    + "be punished and that you will inherit all his land and property. "
                    + "The traitor's family will lose all titles and honor. "
                    + "\nPlease join us at the thrice celebratory dinner tonight where you will sit next to the royal "
                    + "family as the honored guest. On top of being raised to rank Duke tonight "
                    + "the King will announce the traitor's lands now belong to you. Also, please "
                    + "have your one wish that is granted by the King to all honored guests prepared by that time."
                    + "\nNote: we have not created such a dinner event for this game. If we had, such choices to you would have been:"
                    + "\n Will you choose money to improve your new lands glory?"
                    + "\n Will you choose to marry the traitor Duke's soon to be widow and ease the takeover of his lands "
                    + "and keep an educated family above the rank of serf?"
                    + "\n Will you ask the King to use his authority over the Dukes to have the hand of Lady Violet in marriage?"
                    + "\n Will you be so bold as to ask the hand of the princess and so ensure your seat as heir to the throne?"
                    + "\n Will you show mercy to the traitor Dukes' family and ask the King to return the lands and honor "
                    + "to the soon to be widow?"
                    + "\n Will you ask to split your lands with your lifetime friend Lord Canaway and so raise him to rank Duke as well?"
                    + "\n Will you simply ask the King to create a mercy law for the times when crops fail and so Dukes will not need to "
                    + "act out in desperation. ";
        }
        
        else {
            actorSays = person.getDialogue();
        }
        return actorSays;
    }
        
}
