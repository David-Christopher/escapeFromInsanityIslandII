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
public class RaftManufacture {

    public boolean testTotalVine(int numShortLogs, int numLongLogs, int numStrands) {
        
        int requiredTotalVineLength = 270;
        int indVineLength = 6;
        boolean x = false;
        if(numShortLogs * numLongLogs * numStrands * indVineLength < requiredTotalVineLength) {
            x = false;
        }
        else if(numShortLogs * numLongLogs * numStrands * indVineLength > requiredTotalVineLength) {
            x = false;
        }
        else if(numShortLogs * numLongLogs * numStrands * indVineLength == requiredTotalVineLength) {
            x = true;
        }       
        return x;
    }
}
