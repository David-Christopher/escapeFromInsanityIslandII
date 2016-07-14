/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.andresIsland.model;

/**
 *
 * @author andrenell
 */
public class MyExceptions extends Exception{
    public MyExceptions() {
        super("You tried to move off the map. You cannot do that.");
    }
    
}
