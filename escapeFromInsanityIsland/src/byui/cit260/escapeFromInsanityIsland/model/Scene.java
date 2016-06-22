/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.escapeFromInsanityIsland.model;

import java.io.Serializable;
import java.util.Objects;
/**
 *
 * @author Christopher
 */
public class Scene implements Serializable {
     // Class instance variables
    private String description;
    private double travelTime;
    private String blockedLocation;
    private String displaySymbol;
    private Location[] location;

    private void setMapSymbol(String st) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void setBlocked(boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public enum SceneType {
        start,
        forest,
        hilltop,
        shoreline,
        cave,
        well,
        buriedTreasure,
        grove,
        lake,
        waterfall,
        valley,
        finish;
    }
    
    public static Scene[] createScenes(){
        Scene[] scenes = new Scene[SceneType.values().length];
        
        Scene startingScene = new Scene();
        startingScene.setDescription(
                  "You don't know how you arrived here but here you are."
                + "Now is the time to be resourceful and figure out how"
                + "to get back. As you explore Insanity Island, you will"
                + "discover tools and clues to get back home.");
        startingScene.setMapSymbol("ST");
        startingScene.setBlocked(false);
        startingScene.setTravelTime(240);
        scenes[SceneType.start.ordinal()] = startingScene;
        
        Scene finishingScene = new Scene();
        finishingScene.setDescription(
                  "Congratulations. You made it off the Island alive -    "
                + "well for the most part at least. You may never recover "
                + "but you will never forget your experience on . . . . . "
                + "Insanity Island.");
        finishingScene.setMapSymbol("FN");
        finishingScene.setBlocked(false);
        finishingScene.setTravelTime(Double.POSITIVE_INFINITY);
        scenes[SceneType.finish.ordinal()] = finishingScene;
        
        return scenes;
    }

    private static void assignScenesToLocations(Map map, Scene[] scenes) {
        Location[][] locations = map.getLocations();
        
        //start point
        locations[0][0].setScene(scenes[SceneType.start.ordinal()]);
        locations[0][1].setScene(scenes[SceneType.forest.ordinal()]);
        locations[0][2].setScene(scenes[SceneType.hilltop.ordinal()]);
        locations[0][3].setScene(scenes[SceneType.shoreline.ordinal()]);
        locations[0][4].setScene(scenes[SceneType.cave.ordinal()]);
        locations[1][0].setScene(scenes[SceneType.well.ordinal()]);
        locations[1][1].setScene(scenes[SceneType.buriedTreasure.ordinal()]);
        locations[1][2].setScene(scenes[SceneType.grove.ordinal()]);
        locations[1][3].setScene(scenes[SceneType.lake.ordinal()]);
        locations[1][4].setScene(scenes[SceneType.waterfall.ordinal()]);
        locations[2][0].setScene(scenes[SceneType.valley.ordinal()]);
        locations[2][1].setScene(scenes[SceneType.forest.ordinal()]);
        locations[2][2].setScene(scenes[SceneType.forest.ordinal()]);
        locations[2][3].setScene(scenes[SceneType.forest.ordinal()]);
        locations[2][4].setScene(scenes[SceneType.hilltop.ordinal()]);
        locations[3][0].setScene(scenes[SceneType.shoreline.ordinal()]);
        locations[3][1].setScene(scenes[SceneType.cave.ordinal()]);
        locations[3][2].setScene(scenes[SceneType.well.ordinal()]);
        locations[3][3].setScene(scenes[SceneType.buriedTreasure.ordinal()]);
        locations[3][4].setScene(scenes[SceneType.grove.ordinal()]);
        locations[4][0].setScene(scenes[SceneType.lake.ordinal()]);
        locations[4][1].setScene(scenes[SceneType.waterfall.ordinal()]);
        locations[4][2].setScene(scenes[SceneType.valley.ordinal()]);
        locations[4][3].setScene(scenes[SceneType.forest.ordinal()]);
        locations[4][4].setScene(scenes[SceneType.finish.ordinal()]);
    }
    
    
    public Location[] getLocation() {
        return location;
    }

    public void setLocation(Location[] location) {
        this.location = location;
    }
    
    public Scene() {
    }
    
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getTravelTime() {
        return travelTime;
    }

    public void setTravelTime(double travelTime) {
        this.travelTime = travelTime;
    }

    public String getBlockedLocation() {
        return blockedLocation;
    }

    public void setBlockedLocation(String blockedLocation) {
        this.blockedLocation = blockedLocation;
    }

    public String getDisplaySymbol() {
        return displaySymbol;
    }

    public void setDisplaySymbol(String displaySymbol) {
        this.displaySymbol = displaySymbol;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + Objects.hashCode(this.description);
        hash = 97 * hash + (int) (Double.doubleToLongBits(this.travelTime) ^ (Double.doubleToLongBits(this.travelTime) >>> 32));
        hash = 97 * hash + Objects.hashCode(this.blockedLocation);
        hash = 97 * hash + Objects.hashCode(this.displaySymbol);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Scene other = (Scene) obj;
        if (Double.doubleToLongBits(this.travelTime) != Double.doubleToLongBits(other.travelTime)) {
            return false;
        }
        if (!Objects.equals(this.description, other.description)) {
            return false;
        }
        if (!Objects.equals(this.blockedLocation, other.blockedLocation)) {
            return false;
        }
        if (!Objects.equals(this.displaySymbol, other.displaySymbol)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Scene{" + "description=" + description + ", travelTime=" + travelTime + ", blockedLocation=" + blockedLocation + ", displaySymbol=" + displaySymbol + '}';
    }
       
    
}
