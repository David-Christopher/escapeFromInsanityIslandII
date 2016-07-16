/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.escapeFromInsanityIsland.model;

import java.util.Scanner;

/**
 *
 * @author andrenell
 */
public class Map {
    //Meets requirement Lesson 9 ArrayList
    private static Location [] [] map = null;

    public static Location[][] getMap() {
        return map;
    }

    public static void setMap(Location[][] map) {
        Map.map = map;
    }
}
