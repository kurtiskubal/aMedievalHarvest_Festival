/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package byui.cit260.aMedievalHarvestFestival.view;

/**
 *
 * @author Kurt
 */
public class HelpMenuView extends MenuView{

    public HelpMenuView() {
        super("\n"
            + "\n----------------------------------------------"
            + "\n| How to Play                                |"
            + "\nG - How do I beat the game?"
            + "\nM - How do I move throughout the game?"
            + "\nT - How do I talk to other characters in the game?"
            + "\nF - How do I feed my character and estimate how "
            + "\nhungry and thirsty he is?"
            + "\nE - How do I look into my inventory?"
            + "\nI - How do I get items and how do I use them?"
            + "\nL - How do I determine my location in the game?"
            + "\nS - How do I save my progress?"
            + "\nQ - Leave the How to Play menu"
            + "\n----------------------------------------------");
    }

   
    @Override
    public void doAction(char selection) {
        switch (selection) {
            case 'G':
                System.out.println("\n\nIn order to beat the game, you must find evidence"
                                  +"\nwhich can be found in and outside of the castle "
                                  +"\nby examining items and objects that could have   "
                                  +"\nplayed a role in the disappearance of the princess."
                                  +"\nThis process is refered to in the game as gathering"
                                  +"\nevidence. Evidence can also be gathered from talking"
                                  +"\nto other characters that know important information.");
                break;
            case 'M':
                System.out.println("\n\nIn the Game Menu, you will have the option,"
                                  +"\nby pressing 'M', to move to a new location.  "
                                  +"\nWhen this option is selected, you will have the option"
                                  +"\nof going directly to a previously visited location or"
                                  +"\nyou will be able to view a map that show different room"
                                  +"\nlocations.");
                break;
            case 'T':
                System.out.println("\n\nTo talk to other characters you will have to"
                                  +"\nselect the option 'P' in the Game Menu. This will"
                                  +"\nbring you to the Dialogue Menu, giving you several"
                                  +"\nof who to talk to based on who is in the room. From"
                                  +"\nthis general Dialogue Menu you will have the option"
                                  +"\nto return to the Game Menu. Once in the Dialogue Menu,"
                                  +"\nyou can select a specific person to talk to based on the"
                                  +"\nnumber displayed next to their name in the Dialogue Menu.");
                break;
            case 'F':
                System.out.println("\n\nTo use food or beverage items you have to select"
                                  +"\nthe 'U' Use Item option in the Game Menu. If an item"
                                  +"\nis edible, you will have the option from there to consume"
                                  +"\nit. To view how hungry your character is you have to select"
                                  +"\nthe 'H' option in the Game Menu. To view how thirsty your"
                                  +"\ncharacter is you have to select the 'T' option in the Game"
                                  +"\nmenu.");
                break;
            case 'E':
                System.out.println("\n\nYour inventory, which contains all the items your"
                                  +"\nplayer can carry, is able to be viewed from the Game"
                                  +"\nMenu by selecting the 'V' option.");
                break;
            case 'I':
                System.out.println("\n\nTo get items you will first have to find them in"
                                  +"\nthe various rooms and locations they can be found in."
                                  +"\nOnce you are in a location, you can use the 'Examine Location'"
                                  +"\noption found in the Game Menu to see the items in the location."
                                  +"\nYou will then be able to examine items and pick them up by using"
                                  +"\nthe 'EI' command in the Game Menu. This will give you a description"
                                  +"\nof the item also with the options to put the item into the inventory,"
                                  +"\nif it can be picked up, or to do nothing with the item.");
                break;
            case 'L':
                System.out.println("\n\nTo determine your location in the game"
                                  +"\nyou can use the 'Examine Location' command"
                                  +"\n(E) to find out where you currently are.");
                break;
            case 'S':
                System.out.println("\n\nYou can either save your progress at the Main"
                                  +"\nMenu by selecting 'S' or you can select 'S' in "
                                  +"\nthe Game Menu.");
                break;
            case 'Q':
                return;
            default:
                System.out.print("\n*** Invalid selction *** Try Again");
                break;
        }
    }
}

