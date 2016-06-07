/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.escapeFromInsanityIsland.view;

import java.util.Scanner;

/**
 *
 * @author Christopher
 */
public class GameMenuView {
   
    private String gameMenu;
    private String promptMessage = "Enter your selection below";
   
    public GameMenuView() {
        this.gameMenu = "\n"
                  + "\n------------------------------------------------"
                  + "\n| Game Menu                                    |"
                  + "\n------------------------------------------------"
                  + "\nV - View Map"
                  + "\nI - View Inventory" 
                  + "\nS - Craft Health Syringe"
                  + "\nT - Construct Tools"
                  + "\nW - Construct Weapon"
                  + "\nU - Use Tool, Weapon, or Syringe"
                  + "\nB - Construct Boat"
                  + "\nM - Move to Location"
                  + "\n------------------------------------------------";
    }
    public void displayGameMenu() {
        boolean done = false; // set flag to not done
        do {
            System.out.println(gameMenu);
            //prompt for and get the players name
            String gameMenuOption = this.getGameMenuOption();
            if (gameMenuOption.toUpperCase().equals("Q")) // user wants to quit
                return; // Take them back a screen
            
            // do the requested action and display the next view
            done = this.doAction(gameMenuOption);
            
        } while (!done);
    }
    private String getGameMenuOption() {
        
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

}