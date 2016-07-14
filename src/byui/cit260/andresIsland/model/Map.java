/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.andresIsland.model;

import java.util.Scanner;

/**
 *
 * @author andrenell
 */
public class Map {
    private static Location [] [] map = null;

    public static Location[][] getMap() {
        return map;
    }

    public static void setMap(Location[][] map) {
        Map.map = map;
    }
}
