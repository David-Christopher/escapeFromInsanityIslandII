/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.escapeFromInsanityIsland.control;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author andrenell
 */
public class IOTextFile {

    public static String loadFromFile(String filename) throws FileNotFoundException {
        String result = "";

        Scanner fin = new Scanner(new File(filename));
        while (fin.hasNextLine()) {
            String inLine = fin.nextLine();
            result += "\n" + inLine;
        }

        fin.close();

        return result;
    }

}
