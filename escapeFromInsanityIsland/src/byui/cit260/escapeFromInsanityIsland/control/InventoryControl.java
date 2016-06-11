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
}
