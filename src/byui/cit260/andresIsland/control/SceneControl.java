/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.andresIsland.control;

import byui.cit260.andresIsland.model.Location;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author andrenell
 */
public class SceneControl {

    public static String getLocationFileName(int x, int y) {
        String result = "";
        if (x >= 0 && y >= 0) {
            //Perform a calculation to determine the filename
            result = "" + (char) ((int) ('A') + y) + "" + (x + 1) + ".txt";
        }
        return result;
    }

    public static String getDescription(int x, int y) {
        String result = "";
        String filename = getLocationFileName(x, y);
        if (filename != "") {
            try {
                Scanner fin = new Scanner(new File(filename));

                System.out.println("Creating Map: " + x + " by " + y);
                while (fin.hasNextLine()) {
                        String aLine = fin.nextLine();
                        result += "\n" + aLine;
                }
                fin.close();
            } catch (FileNotFoundException ex) {
                System.err.println("Error. File Not Found.");
            }

        }
        return result;
    }
}
