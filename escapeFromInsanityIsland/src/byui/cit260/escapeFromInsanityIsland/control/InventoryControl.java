/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.escapeFromInsanityIsland.control;

/**
 *
 * @author Christopher and Andre
 */
public class InventoryControl {
    
    public double calcVolumeOfBarrel(double height, double radius) {
       if(height < 0) {
            return -1;
        }
        if(radius < 0 || radius > 18) {
            return -1;
        }
        double volume = (Math.PI * Math.pow(radius, 2) * height) / 1728;
            return volume;
    }
    
    public double surfaceAreaOfRaftTest(double longLogLength, 
            double logDiameter, double noLongLogLengths){
        
        if(longLogLength < 5.5 || longLogLength > 5.5){
            return -1;
        }
        if(noLongLogLengths < 7 || noLongLogLengths > 7){
            return -1;
        }
        double surfaceAreaOfRaft = (longLogLength * (logDiameter * noLongLogLengths));
            return surfaceAreaOfRaft;
    }
        public static void axeItem() {
        System.out.println("\n*** axeItem stub function called ***");
    }
        public static void hammerItem() {
        System.out.println("\n*** hammerItem stub function called ***");
    }
        public static void sawItem() {
        System.out.println("\n*** sawItem stub function called ***");
    }
        public static void spearItem() {
        System.out.println("\n*** spearItem stub function called ***");
    }
        public static void bowItem() {
        System.out.println("\n*** bowItem stub function called ***");
    }
        public static void swordItem() {
        System.out.println("\n*** swordItem stub function called ***");
    }
        public static void shieldItem() {
        System.out.println("\n*** shieldItem stub function called ***");
    }
        public static void syringeItem() {
        System.out.println("\n*** syringeItem stub function called ***");
    }        
}
