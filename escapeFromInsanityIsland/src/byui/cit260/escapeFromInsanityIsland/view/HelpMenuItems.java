/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.escapeFromInsanityIsland.view;

import escapefrominsanityisland.EscapeFromInsanityIsland;
import java.io.PrintWriter;

/**
 *
 * @author Christopher
 */
public class HelpMenuItems {
    
    protected final PrintWriter console = 
                EscapeFromInsanityIsland.getOutFile();
        
    public void displaySeeGoal() {
        this.console.println (
                "In order to progress, you must choose to explore the island, find resources\n" +
                "to make tools, medicine, weapons, armor, and find a way to escape the island.\n" +
                "There are traps and beasts prowling the jungle that you will need to avoid.\n" +
                "While searching for a way out clues will be given for example: foot patterns to \n" +
                "follow, bent weeds and grass to give you a hint of where to go providing more \n" +
                "ideas as to who you are and how you got there. When you make it to the end of \n" +
                "the island a boat can be made with the materials that were found. You will then\n" +
                "be able to escape from Insanity Island.");    
    }

    public void displayHowToMove() {
        this.console.println (
                "In this game you will be able to move from location to location. There are \n" + 
                "options to move forwards, backwards, left, or right by typing in F, B, L, or\n" +
                "R when prompted to move.");  
    }

    public void displayToolsAvailable() {
        this.console.println (
                "To be able to build the boat you must create the tools needed for the\n" +
                "boat such as axe, hammer, and saw. Other tools you can create are actual\n" +
                "weapons such as a spear, bow and arrow, sword, and shield. The last \n" + 
                "tools available are health syringes which are crafted or found.");  
    }
    public void displayConstructingTools() {
        this.console.println (
                "The Construct Tools option will show you the tools needing to be aquired.\n" +
                "You will need to collect certain items along the way to construct tools.\n" +
                "When you collect the items required to construct a certain tool a pop\n" +
                "up will appear indicating you have acquired all the items required for a\n" +
                "certain tool.");
    }
    public void displayViewMap() {
        this.console.println (
                "When View Map is selected, a map will be shown on the screen. Only the areas\n" +
                "that have been explored will appear on the map. An “x” button will be on the \n" +
                "upper left corner of the map. Clicking this will close the map.");
    }
    public void displayAvoidingTrapsBeasts() {
        String newLine = System.getProperty("line.separator");//This will retrieve line separator dependent on OS.

        this.console.println(
                "When a trap is encountered, you will have the options to jump, go left around,\n" +
                "right around, under, or above it. You may also need to dodge projectiles (arrows,\n" +
                "spears),and hang from a rope. These options will help you to avoid the traps.\n" +
                "When facing a trap, use one of the options based on what the trap is. There will \n" +
                "be a 5 second time limit to react to the trap. If the trap is a hole with spikes\n" +
                "on the ground you'll need to determine if it is short enough to jump over or if\n" +
                "it is neccessary to go around it. If the trap is too long then you'll have to go\n" +
                "above it by hanging from a rope. Traps vary from a hole with spike on the ground,\n" +
                "quicksand, lava pond, net on the ground, and string trigger of arrows and spears.\n" +
               
        
                 "\n" +
        
                "When you travel through a location on the map there will be wild beasts that\n" +
                "pop up. You can avoid them or fight them with one of the weapons that are\n" +
                "available. Beasts will range from serpents, lions, wild cats, and gorillas.\n" +
                "Each beast has its own level of damage, serpent being the lowest and gorillas\n" +
                "the highest. If you face a beast you can, using the options, select the shield\n" +
                "and cover the beast’s attack,then you can attack with one of the weapons. All \n" +
                "these moves must be done quickly in order to avoid loss of health and possibly\n" +
                "death. The shield can only partially cover against the gorilla, so your attacks\n" +
                "need to be fast one after another to avoid taking excessive damage.");
    }
}
