/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.escapeFromInsanityIsland.view;

import byui.cit260.escapeFromInsanityIsland.control.GameControl;
import java.util.Scanner;

/**
 *
 * @author andrenell
 */
public class MainMenuView {
    
    private String menu;
    private String promptMessage = "Enter your selection below";
    
    public MainMenuView() {
        this.menu = "\n"
                  + "\n------------------------------------------------"
                  + "\n| Main Menu                                    |"
                  + "\n------------------------------------------------"
                  + "\nN - Start New Game"    
                  + "\nG - Continue Saved Game" 
                  + "\nH - Get Help With How to Play"
                  + "\nS - Save Game"
                  + "\nQ - Quit"                
                  + "\n------------------------------------------------";
    }

    public void displayMainMenuView() {
        boolean done = false; // set flag to not done
        do {
            System.out.println(menu);
            //prompt for and get the players name
            String menuOption = this.getMenuOption();
            if (menuOption.toUpperCase().equals("Q")) // user wants to quit
                return; // exit the game
            
            // do the requested action and display the next view
            done = this.doAction(menuOption);
            
        } while (!done);
    }



    private String getMenuOption() {
        
        Scanner keyboard = new Scanner(System.in); // get infile for keyboard
        String value = ""; // value to be returned
        boolean valid = false; // initialize to not valid

        while (!valid) { // loop whilean invalid value is entered
            System.out.println("\n" + this.promptMessage);
            
            value = keyboard.nextLine(); // get next line typed on keyboard
            value = value.trim(); // trim off leading and trailing blanks

            if (value.length() < 1) { // value is blank
                System.out.println("\nInvalid value: value can not be blank");
                continue;
            }
            
            break; // end the loop
               
        }
        return value; // return the value entered
                        
    }

    private boolean doAction(String choice) {
        choice.toUpperCase(); // convert choice to upper case
        
        switch (choice) {
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
        System.out.println("\n*** startNewGame() function called ***");
        /* IN PROGRESS PAGE 46-48 CURRENT ERROR ON GameControl.createNewGame line
            //Generating a new game
        GameControl.createNewGame(EscapeFromInsanityIsland.getPlayer());
        
            //Get and display game menu
        GameMenuView gameMenu = new GameMenuView();
        gameMenu.displayMenu();
        */
    }
        
    private void startExistingGame() {
        System.out.println("\n*** startExistingGame() function called ***");
    }

    private void saveGame() {
        System.out.println("\n*** saveGame() function called ***");
    }

    private void displayHelpMenu() {
        System.out.println("\n*** displayHelpMenu() function called ***");
    }

}
