/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package byui.cit260.aMedievalHarvestFestival.view;

import amedievalharvestfestival.AMedievalHarvestFestival;
import byui.cit260.aMedievalHarvestFestival.control.ProgramControl;
import byui.cit260.aMedievalHarvestFestival.model.Player;
import java.util.Scanner;

/**
 *
 * @author Kurt
 */
public class StartProgramView {
 
   public void startProgram() {
    this.displayBanner();
    
    
    String playersName = this.getPlayersName();
    if (playersName == null)
        return;
    
    Player player = ProgramControl.createPlayer(playersName);
    
    AMedievalHarvestFestival.setPlayer(player);
    
    this.displayWelcomeMessage(player);
    
    MainMenuView mainMenuView = new MainMenuView();
    mainMenuView.display();
   }
    public void displayBanner(){
      
      System.out.println("\n\n***********************************************");
      
      System.out.println("*                                                 *"
                      +"\n*This is the game A Medieval Harvest Festival.    *"   
                      +"\n*In this game you will take the role of Lord      *"
                      +"\n*Pharaoh, who was invited to the Williams' Castle.*"
                      +"\n*The Princess has gone missing and you will have  *"
                      +"\n*find out what has happened to her.               *");
      System.out.println("*                                                 *"
                      +"\n*In order to find where the Princess is and what  *"
                      +"\n*happened to her, you will have to explore the    *"
                      +"\n*castle, inside and out. You will have to         *"
                      +"\n*examine objects and various rooms in order to    *"
                      +"\n*find evidence. You will also have to talk to     *"
                      +"\n*various guests and servants in order to find     *"
                      +"\n*out key pieces of information that will also     *"
                      +"\n*serve as evidence. As you are looking for clues  *"
                      +"\n*you will have to keep Lord Pharaoh fed and       *"  
                      +"\n*quenched.                                        *");
      System.out.println("*                                                 *"
                      +"\n*May thy journey fare thee well!                  *"
                      +"\n*                                                 *");
    }
    public String getPlayersName() {
        boolean valid = false;
        String playersName = null;
        Scanner keyboard = new Scanner(System.in);
        
        while(!valid) {
            System.out.println("Enter the player's name below:");
            
            playersName = keyboard.nextLine();
            playersName = playersName.trim();
            
            if (playersName.toUpperCase().equals("Q")) {
                return null;
            }
            
            if (playersName.length() < 2) {
                System.out.println("Invalid name - the name must be non blank" +
                                   " and greater than one character in length.");
            }
            
            else {
                valid = true;
            }
        }
        
        return playersName;
    }

    public void displayWelcomeMessage(Player player) {
        System.out.println("\n\n===============================");
        System.out.println("\tWelcome to the game " + player.getName());
        System.out.println("\tHave a good time!");
        System.out.println("===============================");
    }
    
}
