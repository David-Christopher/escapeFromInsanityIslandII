/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.andresIsland.view;

import byui.cit260.andresIsland.model.Game;
import byui.cit260.andresIsland.model.Item;

/**
 *
 * @author andrenell
 */
public class ApplyInventoryView extends View {

    public ApplyInventoryView() {
        super("applyInventory.txt", true);
    }

    @Override
    public boolean doAction(String value) {
        value = value.toUpperCase();
        try {
            //Meets requirement for Lesson 10 Team - Convert string
            int itemAt = Integer.parseInt(value);

            // Casting to convert an object into an item
            Item toUse = (Item) Game.me.getBag().getItemAt(itemAt);

            if (itemAt >= 0 && itemAt < Game.me.getBag().balanceOfItems()) {
                Game.me.getBag().useItem(toUse);
            }
        } catch (NumberFormatException er){
            System.err.println("Error: Invalid entry. Please enter a number.");
        } catch (Exception er) {
            System.err.println("Error: " + er.getMessage());
        }
        return true;

    }
}
