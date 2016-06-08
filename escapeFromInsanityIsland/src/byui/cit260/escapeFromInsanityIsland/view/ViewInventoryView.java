/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.escapeFromInsanityIsland.view;

import java.util.ArrayList;

/*
 *
 * @author Christopher
 */
public class ViewInventoryView {

    private static Object pocketKnife;
    private static Object stick;
    private static Object coconut;
    public static void displayViewInventory() {
        //System.out.println("\n*** displayViewInventory() function called ***");
        ArrayList Items = new ArrayList ();
        //add items to arraylist
        Items.add("pocketKnife");
        Items.add("stick");
        Items.add("coconut");
        
        System.out.println("Here are your available items: " + Items.size() + ".";
                          
        
    }

}
