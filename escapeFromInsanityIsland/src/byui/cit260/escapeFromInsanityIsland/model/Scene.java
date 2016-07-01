/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.escapeFromInsanityIsland.model;
import byui.cit260.escapeFromInsanityIsland.model.Map;

import java.io.Serializable;
import java.util.Objects;
/**
 *
 * @author Christopher
 */
public class Scene implements Serializable {
     // Class instance variables
    private String description;
    private String displaySymbol;
    private Location[] location;

    private String MapSymbol;
   
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
        river,
        finish;
    }
    
    public static Scene[] createScenes(){
        Scene[] scenes = new Scene[SceneType.values().length];
        
        Scene startingScene = new Scene();
        startingScene.setDescription(
                  "You don't know how you arrived here but here you are. "
                + "Now is the time to be resourceful and figure out how "
                + "to get back. As you explore Insanity Island, you will "
                + "discover tools and clues to get back home.");
        startingScene.setMapSymbol("ST");
        scenes[SceneType.start.ordinal()] = startingScene;

        Scene forestScene = new Scene();
        forestScene.setDescription(
                  "You traveled into a dense forest where wood is abundant. "
                + "Look around and you may find the pieces of logs you need "
                + "to escape off the island. Be careful of the beasts!");
        forestScene.setMapSymbol("FR");
        scenes[SceneType.forest.ordinal()] = forestScene;

        Scene hilltopScene = new Scene();
        hilltopScene.setDescription(
                  "You traveled to the top of a hill. Here there are old  "
                + "ruins. Others may have lived here before you arrived. "
                + "Keep an eye out for useful items like tools or weapons.");
        hilltopScene.setMapSymbol("HT");
        scenes[SceneType.hilltop.ordinal()] = hilltopScene;

        Scene shorelineScene = new Scene();
        shorelineScene.setDescription(
                  "Here we are back at the shoreline. You still can't escape "
                + "yet but keep on looking for the proper resources in order "
                + "to construct a boat. Once you have the right resources "
                + "escaping the island will be possible.");
        shorelineScene.setMapSymbol("HT");
        scenes[SceneType.shoreline.ordinal()] = shorelineScene;        

        Scene caveScene = new Scene();
        caveScene.setDescription(
                  "What a creepy place. You stumble open the opening of the "
                + "dark cave and wander inside with hope that ore and other "
                + "resources will be discovered. Rather dangerous so be "
                + "quick or you may find yourself cornered by a beast!");
        caveScene.setMapSymbol("CV");
        scenes[SceneType.cave.ordinal()] = caveScene;     
        
        Scene wellScene = new Scene();
        wellScene.setDescription(
                  "The new area you travel to has a well. What a nice, peaceful "
                + " spot. Rest here for a while before moving onward.");
        wellScene.setMapSymbol("WL");
        scenes[SceneType.well.ordinal()] = wellScene; 

        Scene buriedTreasureScene = new Scene();
        buriedTreasureScene.setDescription(
                  "What is that? There seems to be a big 'X' drawn out into "
                + "the soil. Have a look around. You may come across some "
                + "hidden treasures that can help with escaping.");
        buriedTreasureScene.setMapSymbol("BT");
        scenes[SceneType.buriedTreasure.ordinal()] = buriedTreasureScene;    
        
        Scene groveScene = new Scene();
        groveScene.setDescription(
                  "You walk into a secluded grove of trees. It's not to "
                + "thick and you feel comfortable because you can see all "
                + "around through the trees. Are those trees the perfect "
                + "size to build a boat out of? Maybe, there are some vines! "
                + "If so you'll need to harvest some.");
        groveScene.setMapSymbol("GV");
        scenes[SceneType.grove.ordinal()] = groveScene;         
        
        Scene lakeScene = new Scene();
        lakeScene.setDescription(
                  "There's a lake! Right in the middle of the island. "
                + "This may be a popular watering hole for most the "
                + "animals and beasts. Look around but be alert.");
        lakeScene.setMapSymbol("LK");
        scenes[SceneType.lake.ordinal()] = lakeScene;          
        
        Scene waterfallScene = new Scene();
        waterfallScene.setDescription(
                  "How beautiful. You come across a large waterfall that "
                + "displays a wonderful rainbow from its mist. What is this?"
                + "Is there a hideout behind the waterfall?");
        waterfallScene.setMapSymbol("WF");
        scenes[SceneType.waterfall.ordinal()] = waterfallScene;    
        
        Scene valleyScene = new Scene();
        valleyScene.setDescription(
                  "Do you feel that? It appears to be a rushing wind "
                + "coming through this valley. You're afraid that your "
                + "scent is being carried on the wind towards nearby"
                + "beasts. Run through as fast you can to avoid being"
                + "caught.");
        valleyScene.setMapSymbol("VY");
        scenes[SceneType.valley.ordinal()] = valleyScene;
        
        Scene riverScene = new Scene();
        riverScene.setDescription(
                  "Here is a winding river that extends from the shore "
                + "and inland. There seems to be a lot of brush which may "
                + "be helpful in your search for resources. If all else "
                + "you can follow the river to reach the shoreline in "
                + "the near future.");
        riverScene.setMapSymbol("RV");
        scenes[SceneType.river.ordinal()] = riverScene;        
        
        Scene finishingScene = new Scene();
        finishingScene.setDescription(
                  "Congratulations. You made it off the Island alive -    "
                + "well for the most part at least. You may never recover "
                + "but you will never forget your experience on . . . . . "
                + "Insanity Island.");
        finishingScene.setMapSymbol("FN");
        scenes[SceneType.finish.ordinal()] = finishingScene;
        
        return scenes;
    }

    public static void assignScenesToLocations(Map map, Scene[] scenes) {
        Location[][] locations = map.getLocation ();
        
        //start point
        locations[0][0].setScene(scenes[SceneType.start.ordinal()]);
        locations[0][1].setScene(scenes[SceneType.forest.ordinal()]);
        locations[0][2].setScene(scenes[SceneType.forest.ordinal()]);
        locations[0][3].setScene(scenes[SceneType.forest.ordinal()]);
        locations[0][4].setScene(scenes[SceneType.shoreline.ordinal()]);
        locations[1][0].setScene(scenes[SceneType.forest.ordinal()]);
        locations[1][1].setScene(scenes[SceneType.forest.ordinal()]);
        locations[1][2].setScene(scenes[SceneType.grove.ordinal()]);
        locations[1][3].setScene(scenes[SceneType.buriedTreasure.ordinal()]);
        locations[1][4].setScene(scenes[SceneType.shoreline.ordinal()]);
        locations[2][0].setScene(scenes[SceneType.valley.ordinal()]);
        locations[2][1].setScene(scenes[SceneType.lake.ordinal()]);
        locations[2][2].setScene(scenes[SceneType.waterfall.ordinal()]);
        locations[2][3].setScene(scenes[SceneType.river.ordinal()]);
        locations[2][4].setScene(scenes[SceneType.shoreline.ordinal()]);
        locations[3][0].setScene(scenes[SceneType.cave.ordinal()]);
        locations[3][1].setScene(scenes[SceneType.river.ordinal()]);
        locations[3][2].setScene(scenes[SceneType.well.ordinal()]);
        locations[3][3].setScene(scenes[SceneType.buriedTreasure.ordinal()]);
        locations[3][4].setScene(scenes[SceneType.shoreline.ordinal()]);
        locations[4][0].setScene(scenes[SceneType.grove.ordinal()]);
        locations[4][1].setScene(scenes[SceneType.forest.ordinal()]);
        locations[4][2].setScene(scenes[SceneType.buriedTreasure.ordinal()]);
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

    public String getDisplaySymbol() {
        return displaySymbol;
    }

    public void setDisplaySymbol(String displaySymbol) {
        this.displaySymbol = displaySymbol;
    }

    public String getMapSymbol() {
        return MapSymbol;
    }

    public void setMapSymbol(String MapSymbol) {
        this.MapSymbol = MapSymbol;
    }    
    
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + Objects.hashCode(this.description);
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
        final Scene other = (Scene) obj;{
        }
        
        if (!Objects.equals(this.description, other.description)) {
            return false;
        }
        if (!Objects.equals(this.displaySymbol, other.displaySymbol)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Scene{" + "description=" + description + ", displaySymbol=" + displaySymbol + '}';
    }
       
    
}
