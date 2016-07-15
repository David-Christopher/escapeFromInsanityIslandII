/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.andresIsland.view;

import byui.cit260.andresIsland.control.ApplyInventoryControl;
import byui.cit260.andresIsland.control.SceneControl;
import byui.cit260.andresIsland.model.Game;
import byui.cit260.andresIsland.model.Item;
import byui.cit260.andresIsland.model.Location;
import byui.cit260.andresIsland.model.Player;

/**
 *
 * @author andrenell
 */
public class SceneView extends View {

    public SceneView(String description) {
        super(description);
    }
    
    @Override
    public void display() {
        boolean done = false;
        System.out.println("" + Player.getPlayersName() + ": " + Game.me.toString());

        int x = Game.me.getCoordX();
        int y = Game.me.getCoordY();        
        Location place;
        place = Game.myMap.getMap()[y][x];
        
        System.out.println("Details: " + place.getResources());        
        
        Item toAdd = place.getResources();        
        
        if (this.displayMessage.contains("Press Y ")) {
            do {

                String value = this.getInput();
                if (value.toUpperCase().equals("N")) {
                    return;
                }

                done = this.doAction(value);

            } while (!done);
        } else {
            Game.me.getBag().autoItem(toAdd);            
            System.out.println(this.displayMessage);
        }
    }

    @Override
    public boolean doAction(String value) {
        value.toUpperCase(); // convert choice to upper case

        switch (value) {
            case "Y": // Take Resource
                takeResource();
                break;
            case "N": // Leave Resource
                break;
            default:
                System.out.println("\n*** Invalid selection *** Try again");
                break;
        }
        return true;
    }

    private void takeResource() {
        System.out.println("Press Y ");
        int x = Game.me.getCoordX();
        int y = Game.me.getCoordY();
        Location place;
        place = Game.myMap.getMap()[y][x];
        
        System.out.println("X="+x+" ,Y="+y+" "+place.toString());
        

        Item toAdd = place.getResources();
        if (ApplyInventoryControl.hasNeededItem(toAdd)) {
            Game.me.getBag().addItem(toAdd);
        } else
        {
            System.out.println("Unfortunately you are missing the required items...");
        }
        System.out.println("Details: " + place.getResources());        
        
    }    
    
}
