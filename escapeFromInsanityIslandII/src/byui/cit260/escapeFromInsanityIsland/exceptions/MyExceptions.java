/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.escapeFromInsanityIsland.exceptions;

/**
 *
 * @author andrenell
 */


//Meet requirement for Leson 10 Team "Create a custom exception that inherits from 
// the super class ...
public class MyExceptions extends Exception{

    public MyExceptions() {
        super("You tried to move off the map. You cannot do that.");
    }
    
    public MyExceptions(String message) {
        super(message);
    }

    public MyExceptions(String message, Throwable cause) {
        super(message, cause);
    }

    public MyExceptions(Throwable cause) {
        super(cause);
    }

    public MyExceptions(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
  
}
