/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.escapeFromInsanityIsland.view;

import byui.cit260.escapeFromInsanityIsland.model.Game;

/**
 *
 * @author andrenell
 */
public class ViewInventoryView extends View {

    public ViewInventoryView() {
    
            super("\n"
                  + "\n------------------------------------------------"
                  + "\n| Items In Your Bag                            |"
                  + "\n------------------------------------------------"
                  + "\n A - Use Item"
                  + "\n D - Drop Item"
                  + "\n Q - Go Back"                  
                  + "\n------------------------------------------------"
                  + "\n Please enter your selection:");
                displayBag();
    }

    @Override
    public boolean doAction(String value) {
        value.toUpperCase(); // convert choice to upper case
        
        switch (value) {
            case "A": // Apply Item
                this.applyItem();
                break;   
            case "D": // Drop Item
                this.dropItem();
                break;
            default:
                System.out.println("\n*** Invalid selection *** Try again");
                break;       }
        return false; 
    }

    private void applyItem() {
        ApplyInventoryView scene = new ApplyInventoryView();
        scene.display();
    }

    private void dropItem() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    //Meets requirement for lesson 9 Ind 
    public void displayBag() {
        for (int i = 0; i < Game.me.getBag().balanceOfItems(); i++) {
            //Neets requirement for Lesson 9 Individual - Get position of Index
            //Meets requirement for Lesson 9 Individual - Call a function to display result
            System.out.println("" + i + " - " + Game.me.getBag().getItemAt(i));   
        }
    }
}
