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
public class MyOtherException extends Exception{

    public MyOtherException() {
        super("Invalid entry. Must be greater than -1.");
    }
    
    public MyOtherException(String message) {
        super(message);
    }

    public MyOtherException(String message, Throwable cause) {
        super(message, cause);
    }

    public MyOtherException(Throwable cause) {
        super(cause);
    }

    public MyOtherException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
  
}
