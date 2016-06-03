/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.escapeFromInsanityIsland.view;

import java.util.Scanner;

/**
 *
 * @author andrenell
 */
public class MainMenuView {
    
    private String menu;
    private String promptMessage;
    
    public MainMenuView() {
        this.menu = "\n"
                  + "\n------------------------------------------------"
                  + "\n| Main Menu                                    |"
                  + "\n------------------------------------------------"
                  + "\nN - Start New Game"    
                  + "\nG - Get and Start Saved Game" 
                  + "\nH - Get help with how to play the Game"
                  + "\nS - Save the Game"
                  + "\nQ - Quit"                
                  + "\n------------------------------------------------";
    }

    void displayMainMenuView() {
        boolean done = false; // set flag to not done
        do {
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
