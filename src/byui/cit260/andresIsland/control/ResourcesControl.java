/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.andresIsland.control;

import byui.cit260.andresIsland.model.Item;
import byui.cit260.andresIsland.model.ItemOnMap;
import byui.cit260.andresIsland.model.Resources;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author andrenell
 */
public class ResourcesControl {

    public static Item findResource(int X, int Y) {
        Item result = null;
        System.out.print("Finding Resource: ["+X+","+Y+"]");
        //Met the requirement for Lesson 9 Individual - For Each Loop
        for (Object object : Resources.getStuff()) {
            ItemOnMap toCheck = (ItemOnMap) (object);
            
            if (toCheck.getX() == X && toCheck.getY() == Y) {
                result = toCheck.getObject();
            }
        }
        System.out.println(" has: "+result);
        return result;
    }

    public static void loadResourcesFromFile(String filename) throws FileNotFoundException {
        Scanner fin = new Scanner(new File(filename));
        while (fin.hasNextLine()) {
            String inLine = fin.nextLine();
            String[] fields = inLine.split(" ");
            int x = Integer.parseInt(fields[0]);
            int y = Integer.parseInt(fields[1]);

            ItemOnMap aResource = new ItemOnMap(x, y, Item.valueOf(fields[2]));
            Resources.getStuff().add(aResource);
        }

        fin.close();
    }    
    
}
