/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.escapeFromInsanityIsland.view;

import byui.cit260.escapeFromInsanityIsland.control.GameControl;
import escapefrominsanityisland.EscapeFromInsanityIsland;
import java.util.Scanner;

/**
 *
 * @author andrenell
 */
public class MainMenuView extends View {
    
    public MainMenuView() {
        super("\n"
                + "\n------------------------------------------------"
                + "\n| Main Menu                                    |"
                + "\n------------------------------------------------"
                + "\nN - Start New Game"    
                + "\nG - Continue Saved Game" 
                + "\nH - Get Help With How to Play"
                + "\nS - Save Game"
                + "\nQ - Quit"                
                + "\n------------------------------------------------");
    }

    @Override
    public boolean doAction(String value) {
        value.toUpperCase(); // convert choice to upper case
        
        switch (value) {
            case "N": // create and start a new game
                this.startNewGame();
                break;   
            case "G": // get and start an existing game
                this.startExistingGame();
                break;
            case "H": // display help menu
                this.displayHelpMenu();
                break;
            case "S": // save the game
                this.saveGame();
                break;
            default:
                System.out.println("\n*** Invalid selection *** Try again");
                break;
        }
        return false; 
    }
    
    private void startNewGame() {
        /*System.out.println("\n*** startNewGame() function called ***");*/
       
            //Generating a new game
        GameControl.createNewGame(EscapeFromInsanityIsland.getPlayer());
        
            //Get and display game menu
        GameMenuView gameMenu = new GameMenuView();
        gameMenu.displayGameMenu();
        
    }
        
    private void startExistingGame() {
        System.out.println("\n*** startExistingGame() function called ***");
    }

    private void saveGame() {
        System.out.println("\n*** saveGame() function called ***");
    }

    private void displayHelpMenu() {
        //System.out.println("\n*** displayHelpMenu() function called ***");
             //Get and display help menu
        GameHelpMenuView helpMenu = new GameHelpMenuView();
        helpMenu.displayHelpMenu();
        
    }

}
