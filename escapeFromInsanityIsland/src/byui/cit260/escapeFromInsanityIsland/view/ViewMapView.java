/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.escapeFromInsanityIsland.view;

import byui.cit260.escapeFromInsanityIsland.model.Game;
import byui.cit260.escapeFromInsanityIsland.model.Location;
import byui.cit260.escapeFromInsanityIsland.model.Map;
import escapefrominsanityisland.EscapeFromInsanityIsland;

/**
 *
 * @author Christopher
 */
public class ViewMapView {
    
    public void displayViewMap(Game game) {
        StringBuilder line;
        
        Location currentLocation = map.getLocation();
        Map map = game.getMap();
        
        //get the map locations from the current game 
        this.console.println("*************************"); 
        this.console.println("View Map");
        this.console.println("*************************");
        
        line = new StringBuilder("                   ");
                line.insert(0, "0");
                line.insert(1, "1");
                line.insert(2, "2");
                line.insert(3, "3");
                line.insert(4, "4");
        this.console.println(line.toString());
        
        /*for ()
             FOR every row in map
             DISPLAY row divider
             DISPLAY row number
             FOR every column in row
             DISPLAY column divider
             location = locations[row][column]
             IF location has been visited
             DISPLAY the map symbol for location
             ELSE
             DISPLAY " ?? "
             ENDIF
             DISPLAY ending column divider
             ENDFOR
             DISPLAY ending row divider */
        return;
    }

    void displayViewMap() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
