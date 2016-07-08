/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.escapeFromInsanityIsland.view;

import escapefrominsanityisland.EscapeFromInsanityIsland;
import java.io.BufferedReader;
import java.io.PrintWriter;

/**
 *
 * @author andrenell
 */

    public abstract class View implements ViewInterface {
        
        protected String displayMessage;
        
        protected final BufferedReader keyboard = 
                EscapeFromInsanityIsland.getInFile();
        
        protected final PrintWriter console = 
                EscapeFromInsanityIsland.getOutFile();
        
        private boolean message;
        
        public View() {
        
        }    
        
        public View(String message) {
            this.displayMessage = message;
        }

        @Override
        public void display() {
        boolean done = false; // set flag to not done
        
        do {
            //Display the prompt message
            this.console.println(this.message);
            
            //prompt for and get the players name
            String value = this.getInput();
            
            if (value.toUpperCase().equals("Q")) // user wants to quit
                return; // Take them back a screen
            
            // do the requested action and display the next view
            done = this.doAction(value);
            
        } while (!done);
    }
        
        @Override
        public String getInput() {           
            String value = ""; // value to be returned
            boolean valid = false; // initialize to not valid
            
            try {
            while (!valid) { // loop whilean invalid value is entered
                this.console.println("\n" + this.displayMessage);

                value = this.keyboard.readLine(); // get next line typed on keyboard
                value = value.trim(); // trim off leading and trailing blanks

                if (value.length() < 1) { // value is blank
                    ErrorView.display(this.getClass().getName(),"\nInvalid value: value can not be blank");
                    continue;
                }

                break; // end the loop

            }
            return value; // return the value entered
            } catch (Exception e) {
                this.console.println("Error reading input: " + e.getMessage());
            }
            
            return value;
        }    
        
        public void setDisplayMessage(String message){
            this.displayMessage = message;
        };
    
}
    
