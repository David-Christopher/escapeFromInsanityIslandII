/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.andresIsland.model;

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
//    private static GameCharacter gameCharacter = new GameCharacter();

    public Game getGame() {
        return game;
    }

    public void setGame(Game game) {
        this.game = game;
    }

//    public static GameCharacter getGameCharacter() {
//        return gameCharacter;
//    }
//
//    public void setGameCharacter(GameCharacter gameCharacter) {
//        this.gameCharacter = gameCharacter;
//    }
//    
//    
    public Player() throws FileNotFoundException {
//        gameCharacter = new GameCharacter();
        game = new Game();
    }
    
    public static String getPlayersName() {
        return playersName;
    }

    public void setPlayersName(String playersName) {
        this.playersName = playersName;
    }

}
