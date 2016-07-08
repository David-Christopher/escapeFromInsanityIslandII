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
import byui.cit260.escapeFromInsanityIsland.model.Items;
import byui.cit260.escapeFromInsanityIsland.view.StartProgramView;
import byui.cit260.escapeFromInsanityIsland.view.StartGameView;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @authors Christopher and Andre
 */
public class EscapeFromInsanityIsland {

    //class instance variables
    
    private static Game currentGame = null;
    private static Player player = null;
    
    private static PrintWriter outFile = null;
    private static BufferedReader inFile = null;

    private static PrintWriter logFile = null;
    
    public static void main(String[] args) {
        try {
            // open character stream files for input and output
            EscapeFromInsanityIsland.inFile =
                    new BufferedReader(new InputStreamReader(System.in));

            EscapeFromInsanityIsland.outFile = 
                    new PrintWriter(System.out, true);
            
            //Open log file
            String filePath = "log.txt";
            EscapeFromInsanityIsland.logFile = new PrintWriter(filePath);

            // create StartProgramView and display the start program view
            StartProgramView startProgramView = new StartProgramView();
            startProgramView.display();

            //player class
            Player playerOne = new Player();
            return;
        }
        
        catch (Throwable e){
            System.out.println("Exception: " + e.toString() +
                               "\nCause: " + e.getCause() +
                               "\nMessage: " + e.getMessage());
            
            e.printStackTrace();
        }
        
        finally {
            try {
                if (EscapeFromInsanityIsland.inFile != null);
                    EscapeFromInsanityIsland.inFile.close();
                
                if (EscapeFromInsanityIsland.outFile != null);
                    EscapeFromInsanityIsland.outFile.close();    
                
                if (EscapeFromInsanityIsland.logFile != null);
                    EscapeFromInsanityIsland.logFile.close();                     
                
            } catch (IOException ex) {
                    System.out.println("Error closing files.");
                    return;
            }
        }
        
    }

    public static PrintWriter getOutFile() {
        return outFile;
    }

    public static void setOutFile(PrintWriter outFile) {
        EscapeFromInsanityIsland.outFile = outFile;
    }

    public static PrintWriter getLogFile() {
        return logFile;
    }

    public static void setLogFile(PrintWriter logFile) {
        EscapeFromInsanityIsland.logFile = logFile;
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
    
    public static BufferedReader getInFile() {
        return inFile;
    }

    public static void setInFile(BufferedReader inFile) {
        EscapeFromInsanityIsland.inFile = inFile;
    }
}
