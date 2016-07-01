/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.escapeFromInsanityIsland.control;

import citbyui.cit260.escapeFromInsanityIsland.exceptions.BoatControlException;

/**
 *
 * @author Christopher
 */
public class BoatControl {
    public double calcTreesToMoveBoat(double length, double radius) 
            throws BoatControlException {
       if(length < 126) {
            throw new BoatControlException ("The length can not be smaller than"
                                           +"126 to be used as a roller.");
        }
        if(radius < 4.0 || radius > 5) {
            throw new BoatControlException ("Radius can not be smaller"
                                           +"than 4 or greater than 5.");
        }
        double treeRollers = 198 / (radius * 2) * .333;
            return treeRollers;
    }    
}