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
        
        //player class
        Player playerOne = new Player();
        
        
        //to test Player Class
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
        //boat class
        Boat boatOne = new Boat();
        
        //to test Boat Class
        boatOne.setDescription("Raft");
        boatOne.setWidth(6);
        boatOne.setLength(18);
        
        String boatInfo = boatOne.toString();
        System.out.println(boatInfo);
        
        //game class 
        Game gameOne = new Game();
        
        //to test Game Class
        gameOne.setTotalTime(60);
        gameOne.setNoPeople(1);
        
        String gameInfo = gameOne.toString();
        System.out.println(gameInfo);
        
        ///map class
        Map mapOne = new Map();
        
        //to test Map Class
        mapOne.setRowCount(1);
        mapOne.setColumnCount(20);
        
        String mapInfo = mapOne.toString();
        System.out.println(mapInfo);

        //Character class
        GameCharacter gameCharacterOne = new GameCharacter();
        
        //to test Character Class
        gameCharacterOne.setName("Cyril");
        gameCharacterOne.setDescription("African Warlord");
        gameCharacterOne.setCoordinates(123876);
        
        String gameCharacterInfo = gameCharacterOne.toString();
        System.out.println(gameCharacterInfo);
        
        //Tools Class
        Tool toolOne = new Tool();
        
        //To Test Tool Class
        toolOne.setName("Hammer");
        toolOne.setDescription("Used to hammer in nails");
        
        String toolInfo = toolOne.toString();
        System.out.println(toolInfo);

        //Weapon Class
        Weapon WeaponOne = new Weapon();
        
        //To Test Tool Class
        WeaponOne.setName("Spear");
        WeaponOne.setDescription("Impail wild pigs");
        
        String WeaponInfo = WeaponOne.toString();
        System.out.println(WeaponInfo);

        //HealthSyringe
        HealthSyringe HealthSyringeOne = new HealthSyringe();
        
        //To Test Tool Class
        HealthSyringeOne.setName("Blood Infusion");
        HealthSyringeOne.setDescription("Restores 5 pints of blood");
        
        String HealthSyringeInfo = HealthSyringeOne.toString();
        System.out.println(HealthSyringeInfo);

    }
    
}
