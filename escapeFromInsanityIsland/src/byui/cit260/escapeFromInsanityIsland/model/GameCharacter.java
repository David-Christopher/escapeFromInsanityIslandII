/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.escapeFromInsanityIsland.model;

import java.awt.Point;
import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author andrenell
 */
public class GameCharacter implements Serializable {
   
    
    /*Wilson("It is the name of the volleyball in Castaway."),
    Andre("A participant with a strange accent from DEEP DEEP south."),
    Christopher("A hairy Yeti."),
    Bro_Jackson("The wise sage.");*/
    // We already have a character name by getting name
    //class instance variable
    
    private String name;
    private final String description;
    private final Point coordinates;
    
    private GameCharacter[] gamecharacter;
    private Location[] location;

    GameCharacter(String description) {
        this.description = description;
        coordinates = new Point(0,0);
    }

    public GameCharacter[] getGamecharacter() {
        return gamecharacter;
    }

    public void setGamecharacter(GameCharacter[] gamecharacter) {
        this.gamecharacter = gamecharacter;
    } 
    
    public String getName() {
        return name;
    }
    
    public void setName (String name){
        this.name = name;
    }
    
    public Location[] getLocation() {
        return location;
    }

    public void setLocation(Location[] location) {
        this.location = location;
    }

    
    
    public String getDescription() {
        return description;
    }


    public Point getCoordinates() {
        return coordinates;
    }

    @Override
        public String toString() {
        return "Character{" + "name=" + name + ", description=" + description + ", coordinates=" + coordinates + '}';
    }    
}
