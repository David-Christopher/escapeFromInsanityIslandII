/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.escapeFromInsanityIsland.model;

import java.io.FileNotFoundException;
import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author andrenell
 */
public class Player implements Serializable{
    //class instance variables
    private static String playersName;
    private static Game game = null;

    public Game getGame() {
        return game;
    }

    public void setGame(Game game) {
        this.game = game;
    }
   
    public Player() throws FileNotFoundException {
        game = new Game();
    }
    
    public static String getPlayersName() {
        return playersName;
    }

    public void setPlayersName(String playersName) {
        this.playersName = playersName;
    }

}
