/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.escapeFromInsanityIsland.control;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author andrenell
 */
public class InventoryControlTest {
    
    public InventoryControlTest() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of calcVolumeOfBarrel method, of class InventoryControl.
     */
    @Test
    public void testCalcVolumeOfBarrel() {
        System.out.println("calcVolumeOfBarrel");
        double height = 0.0;
        double radius = 0.0;
        InventoryControl instance = new InventoryControl();
        double expResult = 0.0;
        double result = instance.calcVolumeOfBarrel(height, radius);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        // fail("The test case is a prototype.")
    }

    /**
     * Test of surfaceAreaOfRaftTest method, of class InventoryControl.
     */
    @Test
    public void testSurfaceAreaOfRaftTest() {
        System.out.println("surfaceAreaOfRaftTest");
        double longLogLength = 5.5;
        double logDiameter = .5;
        double noLongLogLengths = 7;
        InventoryControl instance = new InventoryControl();
        double expResult = 19.25;
        double result = instance.surfaceAreaOfRaftTest(longLogLength, logDiameter, noLongLogLengths);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        // fail("The test case is a prototype.")
    }
    
}
