/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.escapeFromInsanityIsland.view;

import byui.cit260.escapeFromInsanityIsland.control.GameControl;
import byui.cit260.escapeFromInsanityIsland.model.Player;
import java.io.FileNotFoundException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author andrenell
 */
public final class StartProgramView  extends View{
    
    public StartProgramView(){
    
        super("\n****************************************************"
                  + "\n* This is the game of Escape From Insanity Island   *"
                  + "\n* You have been shipwrecked and made your way to   *"
                  + "\n* this island. You do not know where you are.      *"
                  + "\n* There are food sources on the island. Be careful.*"
                  + "\n* Not all food sources are good for you.           *"
                  + "\n* As you explore the island, look for clues for    *"
                  + "\n* escaping. If you work hard and take some risks   *"
                  + "\n* you can get off the island and will likely live  *"
                  + "\n* to tell your grandchildren your adventure.       *"
                  + "\n* Watch your health. If it drops below zero, you   *"
                  + "\n* will die. You have been warned.                  *"
                  + "\n* Good luck on Insanity Island.                     *"
                  + "\n*                                                  *"
                  + "\n****************************************************"
                  + "\nPlease enter your name: ");
            }
 
    @Override
    public boolean doAction(String value) {
        value.toUpperCase(); // convert choice to upper case

        if(value.length() < 2){
            System.out.println("\nInvalid players name: "
            + "The name must be greater than one character in length");
            return false;
        }

        // create Player with specified name
        Player player = null;
        try {
            player = new Player();
        } catch (FileNotFoundException ex) {
            System.err.println("Error: " + ex.getMessage());
        }
        if (player == null) { // if unsuccessful then
            System.out.println("\nError creating the player.");
            return false;
        } else
            player.setPlayersName(value);

            
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
