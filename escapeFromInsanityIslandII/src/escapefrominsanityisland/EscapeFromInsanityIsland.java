/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package escapefrominsanityisland;

import byui.cit260.escapeFromInsanityIsland.control.GameFileIO;
import byui.cit260.escapeFromInsanityIsland.model.Game;
import byui.cit260.escapeFromInsanityIsland.model.Player;
import byui.cit260.escapeFromInsanityIsland.view.StartProgramView;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author andrenell
 */
public class EscapeFromInsanityIsland {

    /**
     * @param args the command line arguments
     */

    //class instance variables
    
    private static Game currentGame = null;
    private static Player player = null;
    
    public static void main(String[] args) {
        
        try {
            
        } catch (Exception er) {
            System.err.println("Error: "+er.getMessage());
            Logger.getLogger(EscapeFromInsanityIsland.class.getName()).log(Level.SEVERE, null, er);
        }
            
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
        EscapeFromInsanityIsland.currentGame = currentGame;
    }

    public static Player getPlayer() {
        return player;
    }

    public static void setPlayer(Player player) {
        EscapeFromInsanityIsland.player = player;
    }
    
}
