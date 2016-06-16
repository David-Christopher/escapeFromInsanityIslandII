/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.escapeFromInsanityIsland.control;

/**
 *
 * @author andrenell
 */
public class BoatManufacture {

    public int testTotalVine(int numShortLogs, int numLongLogs, int numStrands) {
        
        int requiredTotalVineLength = 270;
        int indVineLength = 6;
        int x = 0;
        if(numShortLogs * numLongLogs * numStrands * indVineLength < requiredTotalVineLength) {
            x = -1;
        }
        else if(numShortLogs * numLongLogs * numStrands * indVineLength > requiredTotalVineLength) {
            x = -1;
        }
        else if(numShortLogs * numLongLogs * numStrands * indVineLength == requiredTotalVineLength) {
            x = 1;
        }       
        return x;
    }
}
