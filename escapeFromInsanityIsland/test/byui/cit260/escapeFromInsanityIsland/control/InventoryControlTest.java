/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.escapeFromInsanityIsland.control;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Christopher
 */
public class InventoryControlTest {
    
    public InventoryControlTest() {
    }

    /**
     * Test of calcVolumeOfBarrel method, of class InventoryControl.
     */
    @Test
    public void testCalcVolumeOfBarrel() {
        System.out.println("calcVolumeOfBarrel");
        double height = -1.0;
        double radius = 6.0;
        InventoryControl instance = new InventoryControl();
        double expResult = -1;
        double result = instance.calcVolumeOfBarrel(height, radius);
        assertEquals(expResult, result, 0.0001);
        // TODO review the generated test code and remove the default call to fail.

    }
    
}
