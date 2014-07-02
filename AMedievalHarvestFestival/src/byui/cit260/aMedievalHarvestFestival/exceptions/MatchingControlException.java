/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package byui.cit260.aMedievalHarvestFestival.exceptions;

/**
 *
 * @author Kurt
 */
public class MatchingControlException extends Exception {
    
    public MatchingControlException() {
        
    }
    
    public MatchingControlException(String message) {
        super(message);
    }
    
    public MatchingControlException(Throwable cause) {
        super(cause);
    }
    
    public MatchingControlException(String message, Throwable cause) {
        super(message, cause);
    }
        
}
