/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.escapeFromInsanityIsland.control;

import byui.cit260.escapeFromInsanityIsland.model.Map;

/**
 *
 * @author andrenell
 */
public class MapControl {
    
    public static Map createMap() {
        //create map
        Map map = new Map (25, 25);
        
        //create list of scenes
        Scene[] scenes = createScenes();
        
        //assign scenes to locations in map
        assignScenesToLocations(map, scenes);
        return map;
    }
    
}
