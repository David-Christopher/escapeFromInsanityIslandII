/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.andresIsland.control;

import andresisland.AndresIsland;
import byui.cit260.andresIsland.exceptions.MyExceptions;
import byui.cit260.andresIsland.exceptions.MyOtherException;
import byui.cit260.andresIsland.model.Game;
import byui.cit260.andresIsland.model.Item;
import byui.cit260.andresIsland.model.Move;
import byui.cit260.andresIsland.model.Player;
import java.io.FileNotFoundException;



/**
 *
 * @author andrenell
 */
public class GameControl {
    
    public static void createNewGame(){
        
    }
    
    public static void useItem(String value) throws MyOtherException {

    //Meets requirement for Lesson 10 Team - Convert string
        int itemAt = Integer.parseInt(value);
        if (itemAt < 0) throw new MyOtherException();
        // Casting to convert an object into an item
        Item toUse = (Item) Game.me.getBag().getItemAt(itemAt);

        if (itemAt >= 0 && itemAt < Game.me.getBag().balanceOfItems()) {
            Game.me.getBag().useItem(toUse);
        }
    }
    
    
    //Meets requirement for Lesson 10 Team - 'Catch the custom exception thrown...
    public static void moveOnMap() throws MyExceptions {
        if((Game.me.getCoordX() == 0 & Game.me.getDirection() == Move.WEST)
                || (Game.me.getCoordX() == 4 & Game.me.getDirection() == Move.EAST)
                || (Game.me.getCoordY() == 0 & Game.me.getDirection() == Move.NORTH)
                || (Game.me.getCoordY() == 4 & Game.me.getDirection() == Move.SOUTH)) {
                throw new MyExceptions();
            }else {
                Game.me.move();
                Game.me.setHealth(Game.me.getHealth() -10);
            }   
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
    

