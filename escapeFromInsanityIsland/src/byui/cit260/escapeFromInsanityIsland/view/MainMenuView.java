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
        /* this.promptMessage = "\nPlease enter your selection: ";
        // display the banner when view created
        this.displayBanner();
       */
        super("\n"
                + "\n------------------------------------------------"
                + "\n| Main Menu                                    |"
                + "\n------------------------------------------------"
                + "\nN - Start New Game"    
                + "\nG - Continue Saved Game" 
                + "\nH - Get Help With How to Play"
                + "\nS - Save Game"
                + "\nQ - Quit"               
                + "\n------------------------------------------------"
                + "\n Please enter your selection:");
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
                ErrorView.display(this.getClass().getName(),"\n*** Invalid selection *** Try again");
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
        gameMenu.display();
        
    }
        
    private void startExistingGame() {
        this.console.println("\n\nEnter the file path for the saved game.");
        
        String filePath = this.getInput();
        
        try{
            //Start saved game
            GameControl.getSavedGame(filePath);
        }catch (Exception ex) {
            ErrorView.display("MainMenuView", ex.getMessage());
        }
        
        GameMenuView gameMenu = new GameMenuView();
        gameMenu.display();
    }

    private void saveGame() {
        this.console.println("\n\nEnter the file path for file where the game"
                            + "is needing to be saved.");
        String filePath = this.getInput();
        
        try{
            //save the gam to location
            GameControl.saveGame(EscapeFromInsanityIsland.getCurrentGame(), filePath);
        } catch (Exception ex){
            ErrorView.display("MainMenuView", ex.getMessage());
        }
    }

    private void displayHelpMenu() {
        //System.out.println("\n*** displayHelpMenu() function called ***");
             //Get and display help menu
        GameHelpMenuView helpMenu = new GameHelpMenuView();
        helpMenu.display();
        
    }

}
