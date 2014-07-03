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
public class TestFillingFactorView extends MenuView{
    public TestFillingFactorView() {
        super("\n"
        + "\n-------------------------------"
        + "\n|Filling Factor Tests|"
        + "\nA - Test Food Items"
        + "\nS - Test Beverage Items"
        + "\nQ - Exit to Game Menu"
        + "\n-------------------------------");
    }
    @Override
    public void doAction(char value) {
        switch (value) {
            case 'A':
                FoodFillView foodView = new FoodFillView();
                foodView.display();
                break;
            case 'S':
                BeverageFillView bevView = new BeverageFillView();
                bevView.display();
                break;
            default:
                System.out.print("\n*** Invalid selction *** Try Again");
                break;
        }
    }
    
    
}