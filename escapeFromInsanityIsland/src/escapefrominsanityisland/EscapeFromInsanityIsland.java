/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package escapefrominsanityisland;

import byui.cit260.escapeFromInsanityIsland.model.Boat;
import byui.cit260.escapeFromInsanityIsland.model.Game;
import byui.cit260.escapeFromInsanityIsland.model.GameCharacter;
import byui.cit260.escapeFromInsanityIsland.model.HealthSyringe;
import byui.cit260.escapeFromInsanityIsland.model.Location;
import byui.cit260.escapeFromInsanityIsland.model.Map;
import byui.cit260.escapeFromInsanityIsland.model.Player;
import byui.cit260.escapeFromInsanityIsland.model.ResourceTypeScene;
import byui.cit260.escapeFromInsanityIsland.model.Scene;
import byui.cit260.escapeFromInsanityIsland.model.Tool;
import byui.cit260.escapeFromInsanityIsland.model.TrackSign;
import byui.cit260.escapeFromInsanityIsland.model.WarehouseTypeScene;
import byui.cit260.escapeFromInsanityIsland.model.Weapon;
import byui.cit260.escapeFromInsanityIsland.view.StartProgramView;

/**
 *
 * @authors Christopher and Andre
 */
public class EscapeFromInsanityIsland {

    //class instance variables
    
    private static Game currentGame = null;
    private static Player player = null;
    
    public static void main(String[] args) {
            
        // create StartProgramView and display the start program view
        StartProgramView startProgramView = new StartProgramView();
        startProgramView.displayStartProgramView();
        
        //player class
        Player playerOne = new Player();


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
