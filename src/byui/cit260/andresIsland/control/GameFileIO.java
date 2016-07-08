/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.andresIsland.control;

import byui.cit260.andresIsland.model.Item;
import byui.cit260.andresIsland.model.Location;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author andrenell
 */
public class GameFileIO {

    public static Location[][] loadMap(String filename) {
        Location[][] result = null;
        try {
            Scanner fin = new Scanner(new File(filename));
            int x = Integer.parseInt(fin.nextLine());
            int y = Integer.parseInt(fin.nextLine());

            result = new Location[x][y];
            System.out.println("Creating Map: " + x + " by " + y);
            while (fin.hasNextLine()) {
                for (int i = 0; i < y; i++) {

                    String aLine = fin.nextLine();
                    for (int j = 0; j < x; j++) {
                        result[i][j] = new Location("" + aLine.charAt(j));

                        Item addItem = ResourcesControl.findResource(i,j);
                        
                        if (addItem != null)
                        {
                            result[i][j].setResources(addItem);
                        }
                        else
                        {
                            result[i][j].setResources(Item.none);
                        }

                    }
                }
            }
            fin.close();
        } catch (FileNotFoundException ex) {
            System.err.println("Error. File Not Found.");
        }
        return result;
    }
}

