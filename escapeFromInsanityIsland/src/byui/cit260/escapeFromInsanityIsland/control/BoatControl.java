/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.escapeFromInsanityIsland.control;

/**
 *
 * @author Christopher
 */
public class BoatControl {
    public double calcTreesToMoveBoat(double length, double radius) {
       if(length < 126) {
            return -1;
        }
        if(radius < 4.0 || radius > 5) {
            return -1;
        }
        double treeRollers = 198 / (radius * 2) * .333;
            return treeRollers;
    }    
}