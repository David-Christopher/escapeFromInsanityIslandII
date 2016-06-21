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
        System.out.println("*** called createInventoryList() in GameControl ***");
        return null;
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
    

