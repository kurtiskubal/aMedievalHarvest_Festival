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
    
    @Override
    public void doAction(char value) {
        switch(value) {
            case 'C':
                System.out.println("\nPlease select a location using the coodinates of"
                             + "\nshown in matching game map.     ");
                MatchingView matchingView = new MatchingView();
                matchingView.display();
                break;
            case 'Q':
                return;
            default:
                System.out.print("\n*** Invalid selction *** Try Again");
                break;
        }
        
    }
    
    
        
            
        
    
}
