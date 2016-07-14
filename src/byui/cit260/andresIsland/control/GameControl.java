/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.andresIsland.control;

import andresisland.AndresIsland;
import byui.cit260.andresIsland.model.Game;
import byui.cit260.andresIsland.model.Item;
import byui.cit260.andresIsland.model.Player;
import java.io.FileNotFoundException;



/**
 *
 * @author andrenell
 */
public class GameControl {
    
    public static void createNewGame(){
        
    }
    
    public static void createNewGame(Player player) throws FileNotFoundException {
        
        Game game = new Game(); //Create new game
        AndresIsland.setCurrentGame(game); //save in EscapeFromInsanityIsland
    }
    
    
    public static void createPlayer(){
        System.out.println("Creating Player . . .");
    }
    
    public static Player createPlayer(String playersName) throws FileNotFoundException {
 
        if (playersName == null) {
            return null;
        }
        
        Player player = new Player();
        player.setPlayersName(playersName);
        
        AndresIsland.setPlayer(player); // save the player
        
        return player;
    }

}
    

