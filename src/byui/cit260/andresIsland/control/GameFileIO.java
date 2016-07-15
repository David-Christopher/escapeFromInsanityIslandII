/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.andresIsland.control;

import byui.cit260.andresIsland.model.GameCharacter;
import byui.cit260.andresIsland.model.Item;
import byui.cit260.andresIsland.model.Location;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

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

                        Item addItem = ResourcesControl.findResource(i, j);

                        if (addItem != null) {
                            result[i][j].setResources(addItem);
                        } else {
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

    public static void printReport(String filename, Location[][] inData, GameCharacter player) {
        try {
            PrintWriter fout = new PrintWriter(new File(filename));
            fout.println("ESCAPE FROM INSANITY ISLAND");

            for (char k = 'A'; k < 'K'; k++) {
                fout.print(" " + k + " ");
            }
            fout.println();

            for (int i = 0; i < inData.length; i++) {
                fout.print("" + i + "\t");

                for (int j = 0; j < inData[i].length; j++) {
                    if (player.getCoordX() == j && player.getCoordY() == i) {
                        fout.print(new Location("♀"));
                    } else {
                        fout.print(inData[i][j]);
                    }
                }
                fout.println();
            }
            fout.close();

        } catch (FileNotFoundException ex) {
            Logger.getLogger(GameFileIO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void saveGameCharacter(String filename, GameCharacter toSave) {
        try {
            ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(filename));
            out.writeObject(toSave);
            out.close();
        } catch (IOException ex) {
            Logger.getLogger(GameFileIO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    //===========================================================================================
    public static void saveGameObject(String filename, Object toSave) {
        try {
            ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(filename));
            out.writeObject(toSave);
            out.close();
        } catch (IOException ex) {
            Logger.getLogger(GameFileIO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    //============================================================================================
    public static GameCharacter loadGameCharacter(String filename) throws ClassNotFoundException {
        GameCharacter result = null;
        ObjectInputStream in = null;
        try {

            in = new ObjectInputStream(new FileInputStream(filename));
            result = (GameCharacter) in.readObject();

        } catch (IOException ex) {
            Logger.getLogger(GameFileIO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                in.close();
            } catch (IOException ex) {
                Logger.getLogger(GameFileIO.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return result;
    }

}
