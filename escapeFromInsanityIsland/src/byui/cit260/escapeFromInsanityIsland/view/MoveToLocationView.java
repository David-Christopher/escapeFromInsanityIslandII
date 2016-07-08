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
public class MoveToLocationView {
    protected final PrintWriter console = 
            EscapeFromInsanityIsland.getOutFile();    
    
    public void displayMoveToLocationView() {
    this.console.println("\n*** displayMoveToLocation() function called ***");
    }
}
