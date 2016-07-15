/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.andresIsland.view;

import byui.cit260.andresIsland.control.GameControl;
import byui.cit260.andresIsland.exceptions.MyOtherException;
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
            GameControl.useItem(value);
        }catch (MyOtherException er) {
            System.err.println("My Other Error: " + er.getMessage());
        } catch (NumberFormatException er){
            System.err.println("Error: Invalid entry. Please enter a number.");
        } catch (Exception er) {
            System.err.println("Error: " + er.getMessage());
        }
        return true;

    }
}
