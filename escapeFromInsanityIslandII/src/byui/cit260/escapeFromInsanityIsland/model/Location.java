/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.escapeFromInsanityIsland.model;

/**
 *
 * @author andrenell
 */
public class Location {

    public void setResources(Item resources) {
        this.resources = resources;
    }
    String cell;
    Item resources;

    public Location() {
      cell = "";
      resources = Item.none;
    }

    public Location(String inCell) {
        this.cell = inCell;
        
    }

    public Item getResources() {
        return resources;
    }

    
    @Override
    public String toString() {
        return " " + cell + " ";
    }      
}
