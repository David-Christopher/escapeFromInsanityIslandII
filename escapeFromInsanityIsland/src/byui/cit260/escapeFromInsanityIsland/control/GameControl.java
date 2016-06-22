/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.escapeFromInsanityIsland.control;

import byui.cit260.escapeFromInsanityIsland.model.Boat;
import byui.cit260.escapeFromInsanityIsland.model.Game;
import byui.cit260.escapeFromInsanityIsland.model.Map;
import byui.cit260.escapeFromInsanityIsland.model.Player;
import escapefrominsanityisland.EscapeFromInsanityIsland;

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
        InventoryItem[] inventoryList = GameControl.createInventoryList();
        game.setInventory(inventoryList);
        
        Boat boat = new Boat(); //create boat
        game.setBoat(boat); //save boat
        
        Map map = MapControl.createMap(); //create and initilalize a new map
        game.setMap(map); // save map in game
        
        //move characters to starting position in the map
        MapControl.moveGameCharacterToStartingLocation(map);
    }
    
    public static InventoryItem[] createInventoryList() {
            // created array of inventory
            Game.InventoryItem[] inventory =
                new Game.InventoryItem[13];
            
            Game.InventoryItem longLogs = new Game.InventoryItem();
            longLogs.setDescription("Long Logs");
            longLogs.setQuantityInStock(0);
            longLogs.setRequiredAmount(5);
            inventory[Item.longLogs.ordinal()] = longLogs;
            
            Game.InventoryItem shortLogs = new Game.InventoryItem();
            shortLogs.setDescription("Short Logs");
            shortLogs.setQuantityInStock(0);
            shortLogs.setRequiredAmount(3);
            inventory[Item.shortLogs.ordinal()] = shortLogs;
            
            Game.InventoryItem strands = new Game.InventoryItem();
            strands.setDescription("Vine Strands");
            strands.setQuantityInStock(0);
            strands.setRequiredAmount(0);
            inventory[Item.strands.ordinal()] = strands;            
            
            Game.InventoryItem sickle = new Game.InventoryItem();
            sickle.setDescription("Sickle");
            sickle.setQuantityInStock(0);
            sickle.setRequiredAmount(0);
            inventory[Item.sickle.ordinal()] = sickle;     
            
            Game.InventoryItem saw = new Game.InventoryItem();
            saw.setDescription("Saw");
            saw.setQuantityInStock(0);
            saw.setRequiredAmount(0);
            inventory[Item.saw.ordinal()] = saw;            
                        
            Game.InventoryItem ore = new Game.InventoryItem();
            ore.setDescription("Ore");
            ore.setQuantityInStock(0);
            ore.setRequiredAmount(0);
            inventory[Item.ore.ordinal()] = ore;        
            
            Game.InventoryItem axe = new Game.InventoryItem();
            axe.setDescription("Axe");
            axe.setQuantityInStock(0);
            axe.setRequiredAmount(0);
            inventory[Item.axe.ordinal()] = axe;                

            Game.InventoryItem hammer = new Game.InventoryItem();
            hammer.setDescription("Hammer");
            hammer.setQuantityInStock(0);
            hammer.setRequiredAmount(0);
            inventory[Item.hammer.ordinal()] = hammer;

            Game.InventoryItem spear = new Game.InventoryItem();
            spear.setDescription("Spear");
            spear.setQuantityInStock(0);
            spear.setRequiredAmount(0);
            inventory[Item.spear.ordinal()] = spear; 

            Game.InventoryItem bowArrow = new Game.InventoryItem();
            bowArrow.setDescription("Bow and Arrow");
            bowArrow.setQuantityInStock(0);
            bowArrow.setRequiredAmount(0);
            inventory[Item.bowArrow.ordinal()] = bowArrow;            
        
            Game.InventoryItem sword = new Game.InventoryItem();
            sword.setDescription("Sword");
            sword.setQuantityInStock(0);
            sword.setRequiredAmount(0);
            inventory[Item.sword.ordinal()] = sword;    
            
            Game.InventoryItem shield = new Game.InventoryItem();
            shield.setDescription("Shield");
            shield.setQuantityInStock(0);
            shield.setRequiredAmount(0);
            inventory[Item.shield.ordinal()] = shield; 
            
            Game.InventoryItem healthSyringe = new Game.InventoryItem();
            healthSyringe.setDescription("Health Syringe");
            healthSyringe.setQuantityInStock(0);
            healthSyringe.setRequiredAmount(0);
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
    

