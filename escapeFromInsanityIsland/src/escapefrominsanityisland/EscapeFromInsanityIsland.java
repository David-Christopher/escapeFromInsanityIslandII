/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package escapefrominsanityisland;

import byui.cit260.escapeFromInsanityIsland.model.Location;
import byui.cit260.escapeFromInsanityIsland.model.Player;
import byui.cit260.escapeFromInsanityIsland.model.ResourceTypeScene;
import byui.cit260.escapeFromInsanityIsland.model.Scene;
import byui.cit260.escapeFromInsanityIsland.model.TrackSign;
import byui.cit260.escapeFromInsanityIsland.model.WarehouseTypeScene;

/**
 *
 * @authors Christopher and Andre
 */
public class EscapeFromInsanityIsland {

    //class instance variables
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Player playerOne = new Player();
        
        playerOne.setName("Fred");
        playerOne.setBestTime(7.00);
        
        String playerInfo = playerOne.toString();
        System.out.println(playerInfo);
        
        Location locationOne = new Location();
        
        locationOne.setRow(1);
        locationOne.setColumn(1);
        locationOne.setVisited("Been there.");
        locationOne.setAmountRemaining(7.00);
        
        String locationInfo = locationOne.toString();
        System.out.println(locationInfo);
        
        Scene sceneOne = new Scene();
        
        sceneOne.setDescription("Awesome!");
        sceneOne.setTravelTime(7.00);
        sceneOne.setBlockedLocation("Restricted Area");
        sceneOne.setDisplaySymbol("Awesome!");
        
        String sceneInfo = sceneOne.toString();
        System.out.println(sceneInfo);

        WarehouseTypeScene warehouseTypeSceneOne = new WarehouseTypeScene();
        
        warehouseTypeSceneOne.setNoOfItems("Empty");
        warehouseTypeSceneOne.setAttribute("Hairy");
        
        String warehouseTypeSceneInfo = warehouseTypeSceneOne.toString();
        System.out.println(warehouseTypeSceneInfo);
        
        ResourceTypeScene resourceTypeSceneOne = new ResourceTypeScene();
        
        resourceTypeSceneOne.setAmountAvailable(5);
        resourceTypeSceneOne.setResourceType("Food");
        
        String resourceTypeSceneInfo = resourceTypeSceneOne.toString();
        System.out.println(resourceTypeSceneInfo);
        
        TrackSign trackSignOne = new TrackSign();
        
        trackSignOne.setType("Animal Print");
        trackSignOne.setAge(7);
        trackSignOne.setZoom("In");
        
        String trackSignInfo = trackSignOne.toString();
        System.out.println(trackSignInfo);
    }
    
}
