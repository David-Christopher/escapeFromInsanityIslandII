/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.andresIsland.control;

import byui.cit260.andresIsland.model.Game;
import byui.cit260.andresIsland.model.Item;

/**
 *
 * @author andrenell
 */
public class ApplyInventoryControl {
    public static boolean hasNeededItem(Item toAdd){
        boolean result = true;
        if(toAdd == Item.none){
            return false;
        } else if (toAdd == Item.vines){
            result = Game.me.getBag().hasItem(Item.knife);
        } else if (toAdd == Item.longLogs) {
            result = Game.me.getBag().hasItem(Item.saw);
        } else if (toAdd == Item.shortLogs) {
            result = Game.me.getBag().hasItem(Item.saw);
        } else if (toAdd == Item.sushi) {
            result = Game.me.getBag().hasItem(Item.spear);
        } else if (toAdd == Item.raft) {
            result = Game.me.getBag().hasItem(Item.vines) 
                    && Game.me.getBag().hasItem(Item.shortLogs) 
                    && Game.me.getBag().hasItem(Item.longLogs);
        }        
        return result;
    }
}
