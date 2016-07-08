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

public class GameHelpMenuView extends View {
    
    public GameHelpMenuView() {
        super("\n"
                  + "\n------------------------------------------------"
                  + "\n| Help Menu                                    |"
                  + "\n------------------------------------------------"
                  + "\nG - What Is The Goal of The Game?"    
                  + "\nM - How to Move?" 
                  + "\nT - Tools Available to Construct"
                  + "\nC - Constructing Tools"
                  + "\nV - View Map"
                  + "\nA - Avoiding Traps/Beasts"
                  + "\nQ - Quit the game"
                  + "\n------------------------------------------------");
    }

    @Override
    public boolean doAction(String value) {
        value.toUpperCase(); // convert choice to upper case
        
        switch (value) {
            case "G": // See goal of game
                this.seeGoal();
                break;   
            case "M": // Get help on how to move
                this.howToMove();
                break;
            case "T": // See what tools are available
                this.toolsAvailable();
                break;
            case "C": // Get help on how to construct tools
                this.constructingTools();
                break;
            case "V": // See how to use map
                this.viewMap();
                break;
            case "A": // Learn about traps and beasts
                this.avoidingTrapsBeasts();
                break;
            default:
                this.console.println("\n*** Invalid selection *** Try again");
                break;
        }
        return false; 
    }
    
    private void seeGoal() {
           HelpMenuItems seeGoal = new HelpMenuItems();
        seeGoal.displaySeeGoal();     
    }
        
    private void howToMove(){
           HelpMenuItems howToMove = new HelpMenuItems();
        howToMove.displayHowToMove();  
    }

    private void toolsAvailable() {
           HelpMenuItems toolsAvailable = new HelpMenuItems();
        toolsAvailable.displayToolsAvailable();
    }

    private void constructingTools() {
           HelpMenuItems constructingTools = new HelpMenuItems();
        constructingTools.displayConstructingTools();
    }
    
    private void viewMap() {
            HelpMenuItems viewMap = new HelpMenuItems();
        viewMap.displayViewMap();
    }

    private void avoidingTrapsBeasts() {
            HelpMenuItems avoidingTrapsBeasts = new HelpMenuItems();
        avoidingTrapsBeasts.displayAvoidingTrapsBeasts();
    }
}