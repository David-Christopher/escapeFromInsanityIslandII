/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.escapeFromInsanityIsland.view;


import java.util.Scanner;

/**
 * Display the start game view
 * @author andrenell
 */
public class StartGameView {
    
    private String menu;
    private String promptMessage = "Enter your selection below";
       
    public StartGameView() {

    this.menu=
            "\n****************************************************"
          + "\n* How are you feeling? Depending on how you are    *"
          + "\n* feeling, you will receive an inventory item.     *"
          + "\n*                                                  *"
          + "\n* I am feeling:                                    *"
          + "\n*                                                  *"
          + "\n* C - Confused                                     *"
          + "\n* A - Angry                                        *"
          + "\n* W - Worried                                      *"
          + "\n* H - Happy                                        *"
          + "\n*                                                  *"
          + "\n* Q - Quit The Game                                *"
          + "\n****************************************************";
    }
    public void displayStartGameView() {
        boolean done = false; // set flag to not done
        do {
            System.out.println(menu);
            //prompt for and get the players name
            String menuOption = this.getInput();
            if (menuOption.toUpperCase().equals("Q")) // user wants to quit
                return; // exit the game
            
            // do the requested action and display the next view
            done = this.doAction(menuOption);
            
        } while (!done);
    }
    private String getInput() {
        
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
    private boolean doAction(String menuOption) {
        menuOption.toUpperCase(); // convert choice to upper case
        
        switch (menuOption) {
            case "C": // create and start a new game
                this.confused();
                break;   
            case "A": // get and start an existing game
                this.angry();
                break;
            case "W": // display help menu
                this.worried();
                break;
            case "H": // save the game
                this.happy();
                break;
            default:
                System.out.println("\n*** Invalid selection *** Try again");
                break;
        }
        return false; 
    }

    private void confused() {
        System.out.println("\n*** confused() function called ***");
    }

    private void angry() {
        System.out.println("\n*** angry() function called ***");
    }

    private void worried() {
        System.out.println("\n*** worried() function called ***");
    }

    private void happy() {
        System.out.println("\n*** happy() function called ***");
    }

    private void quit() {
        System.out.println("\n*** quit() function called ***");
    }
}