/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.escapeFromInsanityIsland.exceptions;

/**
 *
 * @author Christopher
 */
public class BoatControlException extends Exception{

    public BoatControlException() {
    }

    public BoatControlException(String string) {
        super(string);
    }

    public BoatControlException(String string, Throwable thrwbl) {
        super(string, thrwbl);
    }

    public BoatControlException(Throwable thrwbl) {
        super(thrwbl);
    }

    public BoatControlException(String string, Throwable thrwbl, boolean bln, boolean bln1) {
        super(string, thrwbl, bln, bln1);
    }
    
}
