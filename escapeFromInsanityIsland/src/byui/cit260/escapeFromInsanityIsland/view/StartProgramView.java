/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.escapeFromInsanityIsland.view;

import byui.cit260.escapeFromInsanityIsland.control.GameControl;
import byui.cit260.escapeFromInsanityIsland.model.Player;
import java.util.Scanner;

/**
 *
 * @author andrenell
 */
public final class StartProgramView {

    private final String promptMessage;
    
    public StartProgramView(){
    
        this.promptMessage = "\nPlease enter your name: ";
        // display the banner when view created
        this.displayBanner();
    }

    public void displayBanner() {
         
            System.out.println(
                    "\n****************************************************"
                  + "\n* This is the game of Escape From Insanity Island  *"
                  + "\n* You wake up from a deep sleep and have no        *"
                  + "\n* memory of who you are. All you know is that      *"
                  + "\n* you are trapped on this Island and you are       *"
                  + "\n* not sure how you got there. In order to get off  *"
                  + "\n* the Island, you will need to explore and find    *"
                  + "\n* resources to make tools, weapons, medicine,      *"
                  + "\n* armor, and find a way to escape. But be careful, *"
                  + "\n* there are traps and wild beasts prowling the     *"
                  + "\n* jungle. You can avoid these dangers by searching *"
                  + "\n* for tracks. Ultimately, you will need to find    *"
                  + "\n* material to build a boat so you can get back     *"
                  + "\n* home.                                            *"
                  + "\n****************************************************"
                  );
            }
    public void displayStartProgramView() {

        boolean done = false; // set flag to not done
	do {
		// Prompt for and get the players name
                String playersName = this.getPlayersName();
		if (playersName.toUpperCase().equals("Q")) // user wants to quit
                    return; // player exits the game
                    
		// do the action and display the next view
                done = this.doAction(playersName);
        } while (!done);        
    }

    private String getPlayersName() {
        
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

    private boolean doAction(String playersName) {

        if(playersName.length() < 2){
            System.out.println("\nInvalid players name: "
            + "The name must be greater than one character in length");
            return false;
        }

        // create Player with specified name
        Player player = GameControl.createPlayer(playersName);
        if (player == null) { // if unsuccessful then
            System.out.println("\nError creating the player.");
            return false;
        }
           
        this.displayNextView(player);
        return true;
    }

    private void displayNextView(Player player) {
        // Print a customized welcome message
        System.out.println("\n==============================================="
                          + "\n Welcome to the game " + player.getPlayersName()
                          + "\n We hope you enjoy it and have fun!"
                          + "\n==============================================="
        );

	// Create the MainMenuView
        MainMenuView mainMenuView = new MainMenuView();
                
	// Display the MainMenuVIew
        mainMenuView.display();
    }
}
