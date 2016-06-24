/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.escapeFromInsanityIsland.control;

import byui.cit260.escapeFromInsanityIsland.model.Map;
import byui.cit260.escapeFromInsanityIsland.model.Scene;
import static byui.cit260.escapeFromInsanityIsland.model.Scene.createScenes;

/**
 *
 * @author christopherdavid and andrenell
 */
public class MapControl {
    
    public static Map createMap() {
        //create map
        Map map = new Map (5, 5);
        
        //create list of scenes
        Scene[] scenes = createScenes();
        
        //assign scenes to locations in map
        Scene.assignScenesToLocations(map, scenes);
        return map;
    }
                       
    public static void moveGameCharacterToStartingLocation(Map map) {
    System.out.println("*** called moveGameCharacterToStartingLocation() in GameControl ***");
    }




}
