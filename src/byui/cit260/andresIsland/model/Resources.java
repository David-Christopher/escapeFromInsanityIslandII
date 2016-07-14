/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.andresIsland.model;

import java.util.ArrayList;

/**
 *
 * @author andrenell
 */
public class Resources {

    private static ArrayList stuff = new ArrayList();

    public static ArrayList getStuff() {
        return stuff;
    }

    public static void setStuff(ArrayList stuff) {
        Resources.stuff = stuff;
    }
    
}
