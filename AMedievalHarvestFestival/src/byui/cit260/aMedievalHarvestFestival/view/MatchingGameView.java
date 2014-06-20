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
public class MatchingGameView extends MenuView {
    public MatchingGameView() {
    super("\n"
            + "\n--------------------------"
            + "\n| Matching Game           "
            + "\nC - Choose a Match        "
            + "\nQ - Leave the Matching Game"
            + "\n--------------------------");
    }
    
    public void doMatchingAction(String selection) {
        switch (selection) {
            case "00":
             //   MatchingControl. = ;
            break;    
        }
        
    }

    @Override
    public void doAction(char value) {
        switch(value) {
            case 'C':
            System.out.println("\nPlease select a location using the coodinates of"
                             + "\nshown in matching game map.     ");
            this.doMatchingAction(null);
            break;
        }
        
    }
    
            
        
    
}
