/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package byui.cit260.aMedievalHarvestFestival.view;

/**
 *
 * @author Adam Decker
 */
public class NurseryRhymes extends MenuView{
    
    public NurseryRhymes(){
        super("\n" 
            + "\n----------------------------------------------" 
            + "\n| Nursery Rhyme Menu |" 
            + "\nT - Twinkle Twinkle Little Star" 
            + "\nJ - Jack be Nimble" 
            + "\nD - Do you Know the Muffin Man" 
            + "\nH - Humpty Dumpty" 
            + "\nB - Hush Little Baby" 
            + "\nL - Little Miss Muffet" 
            + "\nQ - Exit to Main Menu" 
            + "\n----------------------------------------------");
    }
    
    @Override
    public void doAction(char value) {
        switch (value) {
            case 'T':
                this.star();

                break;
            case 'J':
                this.jack();
                 
                break;
                case 'D':
                this.muffinMan();
                
                break;
            case 'H':
                this.humpty();
                
                break;
            case 'B':
                this.baby();
                
                break;
            case 'L':
                this.missMuffet();
                
                break;
            case 'Q':
                return;
            default:
                System.out.print("\n*** Invalid selction *** Try Again");
                break;
        }
    }

    private void star() {
        System.out.println("\n" 
            + "\n----------------------------------------------" 
            + "\n| Twinkle Twinkle Little Star |"
            + "\n"
            + "\nTwinkle, twinkle, little star," 
            + "\nHow I wonder what you are." 
            + "\nUp above the world so high," 
            + "\nLike a diamond in the sky." 
            + "\n" 
            + "\nWhen the blazing sun is gone," 
            + "\nWhen the nothing shins upon," 
            + "\nThen you show your little light," 
            + "\nTwinkle, twinkle, all the night." 
            + "\n" 
            + "\nThen the traveller in the dark," 
            + "\nThanks you for your tiny spark," 
            + "\nHe could not see which way to go," 
            + "\nIf you did not twinkle so." 
            + "\n" 
            + "\nIn the dark blue sky you keep," 
            + "\nAnd often through my curtains peep," 
            + "\nFor you never shut your eye," 
            + "\nTill the sun is in the sky." 
            + "\n"
            + "\nAs your bright and tiny spark," 
            + "\nLights the traveller in the dark." 
            + "\nThough I know not what you are," 
            + "\nTwinkle, twinkle, little star." 
            + "\n"
            + "\nTwinkle, twinkle, little star," 
            + "\nHow I wonder what you are" 
            + "\nUp above the world so high" 
            + "\nLike a diamond in the sky." 
            + "\n" 
            + "\nTwinkle, twinkle, little star," 
            + "\nHow I wonder what you are" 
            + "\nHow I wonder what you are" 
            + "\n"
            + "\n----------------------------------------------");
    }

    private void jack() {
        System.out.println("\n" 
            + "\n----------------------------------------------" 
            + "\n| Jack be Nimble |"
            + "\n"
            + "\nJack be nimble," 
            + "\nJack, be quick," 
            + "\nJack, jump over" 
            + "\nThe candlestick."
            + "\n"
            + "\nJack jumped high," 
            + "\nJack jumped low," 
            + "\nJack jumped over"
            + "\nand burned his toe."
            + "\n----------------------------------------------");
    }

    private void muffinMan() {
        System.out.println("\n" 
            + "\n----------------------------------------------" 
            + "\n| Do You Know The Muffin Man |"
            + "\n"
            + "\nDo you know the Muffin Man," 
            + "\nThe Muffin Man,"
            + "\nThe Muffin Man?"
            + "\nDo you know the Muffin Man" 
            + "\nWho lives in Drury Lane?"
            + "\n"
            + "\nYes, I know the Muffin Man," 
            + "\nThe Muffin Man,"
            + "\nThe Muffin Man."
            + "\nYes, I know the Muffin Man"
            + "\nWho lives in Drury Lane."
            + "\n----------------------------------------------");
    }

    private void humpty() {
        System.out.println("\n" 
            + "\n----------------------------------------------" 
            + "\n| Humpty Dumpty |"
            + "\n"
            + "\nHumpty Dumpty sat on a wall," 
            + "\nHumpty Dumpty had a great fall."
            + "\nAll the king's horses and all the king's men"
            + "\nCouldn't put Humpty together again."
            + "\n----------------------------------------------");
    }

    private void baby() {
        System.out.println("\n" 
            + "\n----------------------------------------------" 
            + "\n| Hush Little Baby |"
            + "\n"
            + "\nHush, little baby, don't say a word," 
            + "\nMama's going to buy you a mocking bird."
            + "\nAnd if that mockingbird won't sing,"
            + "\nMama's going to buy you a diamond ring." 
            + "\nAnd if that diamond rinf turns to brass,"
            + "\nMama's going to buy you a looking glass."
            + "\nAnd if that looking glass gets broke," 
            + "\nMama's going to buy you a billy goat."
            + "\nAnd if that billy goat won't pull,"
            + "\nMama's going to buy you a cart and bull."
            + "\nAnd if that cart and bull turn over,"
            + "\nMama's going to buy you a dog named Rover." 
            + "\nAnd if that dog named Rover won;t bark,"
            + "\nMama's going to buy you a horse and cart."
            + "\nAnd if that horse and cart fall down," 
            + "\nYou'll still be the sweetest little baby in town."
            + "\n----------------------------------------------");
    }

    private void missMuffet() {
        System.out.println("\n" 
            + "\n----------------------------------------------" 
            + "\n| Little Miss Muffet |"
            + "\n"
            + "\nLittle Miss Muffet" 
            + "\nSat on a tuffet,"
            + "\nEating her curds and whey;"
            + "\nAlong came a spider,"
            + "\nWho sat down beside her"
            + "\nAnd frightened Miss Muffet away."
            + "\n----------------------------------------------");
    }
    
}
