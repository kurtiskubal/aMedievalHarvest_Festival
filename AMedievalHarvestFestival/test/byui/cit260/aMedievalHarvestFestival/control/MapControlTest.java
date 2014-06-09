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
 * @author zev
 */
public class MapControlTest {
    
    public MapControlTest() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of calcSqFootageOfRoom method, of class MapControl.
     */
    @Test
    public void testCalcSqFootageOfRoom() {
        System.out.println("calcSqFootageOfRoom test 1");
        double roomWidth = 10.0;
        double roomLength = 5.0;
        MapControl instance = new MapControl();
        double expResult = 50.0;
        double result = instance.calcSqFootageOfRoom(roomWidth, roomLength);
        assertEquals(expResult, result, 0.0);
        
        System.out.println("calcSqFootageOfRoom test 2");
        roomWidth = 10.0;
        roomLength = -1.0;
        expResult = -1.0;
        result = instance.calcSqFootageOfRoom(roomWidth, roomLength);
        assertEquals(expResult, result, 0.0);
    
        System.out.println("calcSqFootageOfRoom test 3");
        roomWidth = -1.0;
        roomLength = 5.0;
        expResult = -1.0;
        result = instance.calcSqFootageOfRoom(roomWidth, roomLength);
        assertEquals(expResult, result, 0.0);
    
        System.out.println("calcSqFootageOfRoom test 4");
        roomWidth = 120.0;
        roomLength = 50.0;
        expResult = -2.0;
        result = instance.calcSqFootageOfRoom(roomWidth, roomLength);
        assertEquals(expResult, result, 0.0);
        
        System.out.println("calcSqFootageOfRoom test 5");
        roomWidth = 10.0;
        roomLength = 0.0;
        expResult = 0.0;
        result = instance.calcSqFootageOfRoom(roomWidth, roomLength);
        assertEquals(expResult, result, 0.0);
    
        System.out.println("calcSqFootageOfRoom test 6");
        roomWidth = 0.0;
        roomLength = 32.0;
        expResult = 0.0;
        result = instance.calcSqFootageOfRoom(roomWidth, roomLength);
        assertEquals(expResult, result, 0.0);
        
        System.out.println("calcSqFootageOfRoom test 7");
        roomWidth = 100.0;
        roomLength = 50.0;
        expResult = 5000.0;
        result = instance.calcSqFootageOfRoom(roomWidth, roomLength);
        assertEquals(expResult, result, 0.0);
    
    }
    
    /**
     * Test of calcVolumeOfPool method, of class MapControl.
     */
    @Test
    public void testCalcVolumeOfPool() {
        System.out.println("calcVolumeOfPool test 1");
        double poolWidth = 38.0;
        double poolLength = 75.0;
        double poolDepth = 18.0;
        MapControl instanceTwo = new MapControl();
        double expResult = 51300.0;
        double result = instanceTwo.calcVolumeOfPool(poolWidth, poolLength, poolDepth);
        assertEquals(expResult, result, 0.0);
        
        System.out.println("calcVolumeOfPool test 2");
        poolWidth = 28.0;
        poolLength = -1.0;
        poolDepth = 12.0;
        expResult = -1.0;
        result = instanceTwo.calcVolumeOfPool(poolWidth, poolLength, poolDepth);
        assertEquals(expResult, result, 0.0);
        
        System.out.println("calcVolumeOfPool test 3");
        poolWidth = 37.0;
        poolLength = 78.0;
        poolDepth = -1.0;
        expResult = -1.0;
        result = instanceTwo.calcVolumeOfPool(poolWidth, poolLength, poolDepth);
        assertEquals(expResult, result, 0.0);
        
        System.out.println("calcVolumeOfPool test 4");
        poolWidth = 41.0;
        poolLength = 77.0;
        poolDepth = 19.0;
        expResult = -2.0;
        result = instanceTwo.calcVolumeOfPool(poolWidth, poolLength, poolDepth);
        assertEquals(expResult, result, 0.0);
        
        System.out.println("calcVolumeOfPool test 5");
        poolWidth = 25.0;
        poolLength = 0.0;
        poolDepth = 0.0;
        expResult = 0.0;
        result = instanceTwo.calcVolumeOfPool(poolWidth, poolLength, poolDepth);
        assertEquals(expResult, result, 0.0);
        
        System.out.println("calcVolumeOfPool test 6");
        poolWidth = 0.0;
        poolLength = 0.0;
        poolDepth = 20.0;
        expResult = 0.0;
        result = instanceTwo.calcVolumeOfPool(poolWidth, poolLength, poolDepth);
        assertEquals(expResult, result, 0.0);
        
        System.out.println("calcVolumeOfPool test 7");
        poolWidth = 40.0;
        poolLength = 80.0;
        poolDepth = 20.0;
        expResult = 64000.0;
        result = instanceTwo.calcVolumeOfPool(poolWidth, poolLength, poolDepth);
        assertEquals(expResult, result, 0.0);
        
    }
        
        /**
     * Test of calcSqFootageOfYard method, of class MapControl.
     */
    @Test
    public void testCalcSqFootageOfYard() {
        System.out.println("calcSqFootageOfYard test 1");
        double yardWidth = 75.0;
        double yardLength = 194.0;
        MapControl instanceThree = new MapControl();
        double expResult = 14550.0;
        double result = instanceThree.calcSqFootageOfYard(yardWidth, yardLength);
        assertEquals(expResult, result, 0.0);
        
        System.out.println("calcSqFootageOfYard test 2");
        yardWidth = 56.0;
        yardLength = -1.0;
        expResult = -1.0;
        result = instanceThree.calcSqFootageOfYard(yardWidth, yardLength);
        assertEquals(expResult, result, 0.0);
        
        System.out.println("calcSqFootageOfYard test 3");
        yardWidth = -1.0;
        yardLength = 150.0;
        expResult = -1.0;
        result = instanceThree.calcSqFootageOfYard(yardWidth, yardLength);
        assertEquals(expResult, result, 0.0);
        
        System.out.println("calcSqFootageOfYard test 4");
        yardWidth = 182.0;
        yardLength = 120.0;
        expResult = -2.0;
        result = instanceThree.calcSqFootageOfYard(yardWidth, yardLength);
        assertEquals(expResult, result, 0.0);
        
        System.out.println("calcSqFootageOfYard test 5");
        yardWidth = 89.0;
        yardLength = 0.0;
        expResult = 0.0;
        result = instanceThree.calcSqFootageOfYard(yardWidth, yardLength);
        assertEquals(expResult, result, 0.0);
        
        System.out.println("calcSqFootageOfYard test 6");
        yardWidth = 0.0;
        yardLength = 196.0;
        expResult = 0.0;
        result = instanceThree.calcSqFootageOfYard(yardWidth, yardLength);
        assertEquals(expResult, result, 0.0);
        
        System.out.println("calcSqFootageOfYard test 7");
        yardWidth = 100.0;
        yardLength = 200.0;
        expResult = 20000.0;
        result = instanceThree.calcSqFootageOfYard(yardWidth, yardLength);
        assertEquals(expResult, result, 0.0);
    }
    
    
}
