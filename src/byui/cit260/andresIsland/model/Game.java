/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.andresIsland.model;

import byui.cit260.andresIsland.control.GameFileIO;
import byui.cit260.andresIsland.control.ResourcesControl;
import java.io.FileNotFoundException;
import java.io.Serializable;

/**
 *
 * @author andrenell
 */
public class Game implements Serializable{
    
    // 
    public static GameCharacter me = null;
    public static Map myMap = null;
    
    public Game() throws FileNotFoundException {
        ResourcesControl.loadResourcesFromFile("Resources.txt");
        me = new GameCharacter();
        myMap = new Map();
        myMap.setMap(GameFileIO.loadMap("map.txt"));
    }

    public Map getMyMap() {
        return myMap;
    }

}
