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
public class BoatControlTest {
    
    public BoatControlTest() {
    }

    /**
     * Test of calcTreesToMoveBoat method, of class BoatControl.
     */
    @Test
    public void testCalcTreesToMoveBoat() {
        System.out.println("calcTreesToMoveBoat");
        double length = 180.0;
        double radius = 4.5;
        BoatControl instance = new BoatControl();
        double expResult = 6.593400000000001;
        double result = instance.calcTreesToMoveBoat(length, radius);
        assertEquals(expResult, result, 0.0);

    }
    
}
