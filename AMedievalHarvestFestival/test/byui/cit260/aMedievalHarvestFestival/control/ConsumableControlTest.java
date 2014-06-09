/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package byui.cit260.aMedievalHarvestFestival.control;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Adam Decker
 */
public class ConsumableControlTest {
    
    public ConsumableControlTest() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of calcFillingFoodItem method, of class ConsumableControl.
     */
    @Test
    public void testCalcFillingFoodItem() {
        System.out.println("calcFillingFoodItem Null");
        Integer foodType = null;
        Integer weight = null;
        ConsumableControl instance = new ConsumableControl();
        Integer expResult = null;
        Integer result = instance.calcFillingFoodItem(foodType, weight);
        assertEquals(expResult, result);
        
        System.out.println("calcFillingFoodItem 1");
        foodType = 2;
        weight = 5;
        expResult = 10;
        result = instance.calcFillingFoodItem(foodType, weight);
        assertEquals(expResult, result);
         
        System.out.println("calcFillingFoodItem 2");
        foodType = -1;
        weight = 5;
        expResult = -1;
        result = instance.calcFillingFoodItem(foodType, weight);
        assertEquals(expResult, result); 
        
        System.out.println("calcFillingFoodItem 3");
        foodType = 2;
        weight = -1;
        expResult = -2;
        result = instance.calcFillingFoodItem(foodType, weight);
        assertEquals(expResult, result);
         
        System.out.println("calcFillingFoodItem 4");
        foodType = 6;
        weight = 5;
        expResult = -3;
        result = instance.calcFillingFoodItem(foodType, weight);
        assertEquals(expResult, result);
        
        System.out.println("calcFillingFoodItem 5");
        foodType = 2;
        weight = 11;
        expResult = -4;
        result = instance.calcFillingFoodItem(foodType, weight);
        assertEquals(expResult, result);
        
    }

    /**
     * Test of calcQuenchBeverageItem method, of class ConsumableControl.
     */
    @Test
    public void testCalcQuenchBeverageItem() {
        System.out.println("calcQuenchBeverageItem null");
        Integer beverageType = null;
        Integer volume = null;
        ConsumableControl instance = new ConsumableControl();
        Integer expResult = null;
        Integer result = instance.calcQuenchBeverageItem(beverageType, volume);
        assertEquals(expResult, result);
       
        System.out.println("calcQuenchBeverageItem 1");
        beverageType = 2;
        volume = 5;
        expResult = 10;
        result = instance.calcQuenchBeverageItem(beverageType, volume);
        assertEquals(expResult, result);
       
        System.out.println("calcQuenchBeverageItem 2");
        beverageType = -1;
        volume = 5;
        expResult = -1;
        result = instance.calcQuenchBeverageItem(beverageType, volume);
        assertEquals(expResult, result);
       
        System.out.println("calcQuenchBeverageItem 3");
        beverageType = 2;
        volume = -1;
        expResult = -2;
        result = instance.calcQuenchBeverageItem(beverageType, volume);
        assertEquals(expResult, result);
       
        System.out.println("calcQuenchBeverageItem 4");
        beverageType = 6;
        volume = 5;
        expResult = -3;
        result = instance.calcQuenchBeverageItem(beverageType, volume);
        assertEquals(expResult, result);
       
        System.out.println("calcQuenchBeverageItem 5");
        beverageType = 2;
        volume = 11;
        expResult = -4;
        result = instance.calcQuenchBeverageItem(beverageType, volume);
        assertEquals(expResult, result);
       
    }
    
}
