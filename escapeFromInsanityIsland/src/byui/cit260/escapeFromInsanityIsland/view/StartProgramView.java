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
public final class StartProgramView  extends View{
    
    public StartProgramView(){
    
       /* this.promptMessage = "\nPlease enter your name: ";
        // display the banner when view created
        this.displayBanner();
       */
    
        super("\n****************************************************"
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
                  + "\nPlease enter your name: ");
            }
 
    @Override
    public boolean doAction(String value) {
        value.toUpperCase(); // convert choice to upper case

        if(value.length() < 2){
            ErrorView.display(this.getClass().getName(), "\nInvalid players name: "
            + "The name must be greater than one character in length");
            return false;
        }

        // create Player with specified name
        Player player = GameControl.createPlayer(value);
        if (player == null) { // if unsuccessful then
            ErrorView.display(this.getClass().getName(),"\nError creating the player.");
            return false;
        }
           
        this.displayNextView(player);
        return true;
    }

    private void displayNextView(Player player) {
        // Print a customized welcome message
        this.console.println("\n==============================================="
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
