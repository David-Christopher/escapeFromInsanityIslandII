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
 * Display the start game view
 * @author andrenell
 */
public class StartGameView {
   
    //create a new game
    int value = GameControl.startNewGame(EscapeFromInsanityIsland.getPlayer());
    if (value < 0)
    private String promptMessage;
    private String startGameMenuChoices;
{
        System.out.println("Error - Failed to create a new game");
    } else {
        // display the banner when view created
        this.displayStartGameBanner();
    
    }
    
    public void displayStartGameBanner() {

        System.out.println(
                "\n****************************************************"
              + "\n* How are you feeling? Depending on how you are    *"
              + "\n* feeling, you will receive an inventory item      *"
              + "\n* to store for use later in the game.              *"
              + "\n****************************************************"
              );
        this.promptMessage = "\nPlease select an option: ";
        // display the banner when view created
        this.startGameBannerChoices();

        }        
   
    public StartGameView() {
        this.startGameMenuChoices = "\n"
                  + "\n------------------------------------------------"
                  + "\n| How are you feeling                          |"
                  + "\n------------------------------------------------"
                  + "\nC - Confused"
                  + "\nA - Angry" 
                  + "\nW - Worried"
                  + "\nH - Happy"
                  + "\nQ - Quit The Game"
                  + "\n------------------------------------------------";
    }
    public void displayStartGameMenu() {
        boolean done = false; // set flag to not done
        do {
            System.out.println(startGameMenuChoices);
            //prompt for and get the selected option
            String startGameMenuChoice = this.getStartGameMenuChoice();
            if (startGameMenuChoice.toUpperCase().equals("Q")) // user wants to quit
                return; // Take them back a screen
            
            // do the requested action and display the next view
            done = this.doAction(startGameMenuChoice);
            
        } while (!done);
    }
    private String getGameMenuChoice() {
        
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
            case "C": // Confused Selection
                this.confusedSelection();
                break;   
            case "A": // Angry Selection
                this.angrySelection();
                break;
            case "W": // Worried Selection
                this.worriedSelection();
                break;
            case "H": // Happy Selection
                this.happySelection();
                break;
            default:
                System.out.println("\n*** Invalid selection *** Try again");
                break;
        }
        return false; 
    }
    

    private void startGameBannerChoices() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private String getStartGameMenuChoice() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void confusedSelection() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void worriedSelection() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void happySelection() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void angrySelection() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }


    
}