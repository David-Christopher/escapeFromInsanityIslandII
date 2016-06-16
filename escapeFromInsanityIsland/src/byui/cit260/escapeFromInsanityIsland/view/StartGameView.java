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

public class StartGameView extends View {
    
    public StartGameView() {
        super("\n****************************************************"
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
          + "\n****************************************************");
    }
    
    @Override
    public boolean doAction(String value) {
        value.toUpperCase(); // convert choice to upper case
        
        switch (value) {
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