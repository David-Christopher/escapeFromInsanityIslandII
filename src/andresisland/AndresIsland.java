/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package andresisland;

import byui.cit260.andresIsland.model.Game;
import byui.cit260.andresIsland.model.Player;
import byui.cit260.andresIsland.view.StartProgramView;

/**
 *
 * @author andrenell
 */
public class AndresIsland {

    /**
     * @param args the command line arguments
     */

    //class instance variables
    
    private static Game currentGame = null;
    private static Player player = null;
    
    public static void main(String[] args) {
            
        // create StartProgramView and display the start program view
        StartProgramView startProgramView = new StartProgramView();
        startProgramView.display();
        
        //player class
        //Player playerOne = new Player();


    }

    public static Game getCurrentGame() {
        return currentGame;
    }

    public static void setCurrentGame(Game currentGame) {
        AndresIsland.currentGame = currentGame;
    }

    public static Player getPlayer() {
        return player;
    }

    public static void setPlayer(Player player) {
        AndresIsland.player = player;
    }
    
}
