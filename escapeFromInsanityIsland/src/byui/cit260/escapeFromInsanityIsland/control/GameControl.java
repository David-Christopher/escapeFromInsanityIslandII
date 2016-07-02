/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.escapeFromInsanityIsland.control;

import byui.cit260.escapeFromInsanityIsland.model.Boat;
import byui.cit260.escapeFromInsanityIsland.model.Game;
import byui.cit260.escapeFromInsanityIsland.model.Map;
import byui.cit260.escapeFromInsanityIsland.model.Location;
import byui.cit260.escapeFromInsanityIsland.model.Player;
import byui.cit260.escapeFromInsanityIsland.model.Scene;
import escapefrominsanityisland.EscapeFromInsanityIsland;
import byui.cit260.escapeFromInsanityIsland.model.Items;

/**
 *
 * @author andrenell
 */
public class GameControl {
    
    public static void createNewGame(Player player) {
        
        Game game = new Game(); //Create new game
        EscapeFromInsanityIsland.setCurrentGame(game); //save in EscapeFromInsanityIsland
        
        game.setPlayer(player); // save player in game
        
        //Create new invenory list and save in the game
        Items[] inventoryList = GameControl.createInventoryList();
        game.setInventory(inventoryList);
        
        Boat boat = new Boat(); //create boat
        game.setBoat(boat); //save boat
        
       MapControl.createMap();

    }
    
    public static Items[] createInventoryList() {
            // created array of inventory
            Items[] inventory = new Items[13];
            
            Items longLogs = new Items();
            longLogs.setDescription("Long Logs");
            inventory[Item.longLogs.ordinal()] = longLogs;
            
            Items shortLogs = new Items();
            shortLogs.setDescription("Short Logs");
            inventory[Item.shortLogs.ordinal()] = shortLogs;
            
            Items strands = new Items();
            strands.setDescription("Vine Strands");
            inventory[Item.strands.ordinal()] = strands;            
            
            Items sickle = new Items();
            sickle.setDescription("Sickle");
            inventory[Item.sickle.ordinal()] = sickle;     
            
            Items saw = new Items();
            saw.setDescription("Saw");
            inventory[Item.saw.ordinal()] = saw;            
                        
            Items ore = new Items();
            ore.setDescription("Ore");
            inventory[Item.ore.ordinal()] = ore;        
            
            Items axe = new Items();
            axe.setDescription("Axe");
            inventory[Item.axe.ordinal()] = axe;                

            Items hammer = new Items();
            hammer.setDescription("Hammer");
            inventory[Item.hammer.ordinal()] = hammer;

            Items spear = new Items();
            spear.setDescription("Spear");
            inventory[Item.spear.ordinal()] = spear; 

           Items bowArrow = new Items();
            bowArrow.setDescription("Bow and Arrow");
            inventory[Item.bowArrow.ordinal()] = bowArrow;            
        
            Items sword = new Items();
            sword.setDescription("Sword");
            inventory[Item.sword.ordinal()] = sword;    
            
            Items shield = new Items();
            shield.setDescription("Shield");
            inventory[Item.shield.ordinal()] = shield; 
            
            Items healthSyringe = new Items();
            healthSyringe.setDescription("Health Syringe");
            inventory[Item.healthSyringe.ordinal()] = healthSyringe;    
            
            return inventory;
    }
    
    public enum Item {
        longLogs,
        shortLogs,
        strands,
        sickle,
        saw,
        ore,
        axe,
        hammer,
        spear,
        bowArrow,
        sword,
        shield,
        healthSyringe;        
    }
    
    public static Items[] getSortedInventoryList() {
        
        // get inventory list for the current game
        Items[] originalInventoryList = 
                EscapeFromInsanityIsland.getCurrentGame().getInventory();
        
        // clone (make a copy) orignalList
        Items[] inventoryList = originalInventoryList.clone();
        
       // using a BubbleSort to sort the list of inventoryList by name
        Items tempInventoryItem;
        for (int i = 0; i < inventoryList.length-1; i++) {
            for (int x = 0; x < inventoryList.length-1-i; x++) {
                if (inventoryList[x].getDescription().
                    compareToIgnoreCase(inventoryList[x + 1].getDescription()) > 0) {
                    tempInventoryItem = inventoryList[x];
                    inventoryList[x] = inventoryList[x+1];
                    inventoryList[x+1] = tempInventoryItem;
                }
            }
        }
        
        return inventoryList;
    }
            
    public static Player createPlayer(String playersName) {
 
        if (playersName == null) {
            return null;
        }
        
        Player player = new Player();
        player.setPlayersName(playersName);
        
        EscapeFromInsanityIsland.setPlayer(player); // save the player
        
        return player;
    }

}
    

