/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.escapeFromInsanityIsland.control;

import byui.cit260.escapeFromInsanityIsland.model.Player;
import escapefrominsanityisland.EscapeFromInsanityIsland;

/**
 *
 * @author andrenell
 */
public class GameControl {
    
    public static void createNewGame(Player player) {
        System.out.println("\n*** createNewGame stub function called ***");
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
