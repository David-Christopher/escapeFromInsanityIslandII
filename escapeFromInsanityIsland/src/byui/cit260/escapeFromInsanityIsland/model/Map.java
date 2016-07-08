/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.escapeFromInsanityIsland.model;

import byui.cit260.escapeFromInsanityIsland.view.ErrorView;
import escapefrominsanityisland.EscapeFromInsanityIsland;
import java.io.PrintWriter;
import java.io.Serializable;

/**
 *
 * @author andrenell
 */
public class Map implements Serializable{
    protected final PrintWriter console = 
        EscapeFromInsanityIsland.getOutFile();
    
    //class instance variable
    private double rowCount;
    private double columnCount;
    private Location[][] locations;
    
    private Game[] game;

    public Map() {
    }

    public Map(int rowCount, int columnCount) {
        
        if(rowCount < 0 || columnCount < 0){
            ErrorView.display(this.getClass().getName(), "The number of rows and columns must be greater than 1.");
            return;
        }
        
        this.rowCount = rowCount;
        this.columnCount = columnCount;
        
        //create 2d array for location objects
        this.locations = new Location[rowCount][columnCount];
        
        for(int row = 0; row < rowCount; row++) {
            for(int column = 0; column < columnCount; column++) {
                // create and initialize new  Location object instant
                Location location = new Location();
                location.setColumn(columnCount);
                location.setRow(rowCount);
                location.setVisited(false);
                
                // assign the location  object to  the current position in the array
                locations [rowCount][columnCount] = location;
            }
        }
    }

    public Location[][] getLocations() {
        return locations;
    }

    public void setLocations(Location[][] locations) {
        this.locations = locations;
    }
        

    public Game[] getGame() {
        return game;
    }

    public void setGame(Game[] game) {
        this.game = game;
    }
    
    
    public double getRowCount() {
        return rowCount;
    }

    public void setRowCount(double rowCount) {
        this.rowCount = rowCount;
    }

    public double getColumnCount() {
        return columnCount;
    }

    public void setColumnCount(double columnCount) {
        this.columnCount = columnCount;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 23 * hash + (int) (Double.doubleToLongBits(this.rowCount) ^ (Double.doubleToLongBits(this.rowCount) >>> 32));
        hash = 23 * hash + (int) (Double.doubleToLongBits(this.columnCount) ^ (Double.doubleToLongBits(this.columnCount) >>> 32));
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Map other = (Map) obj;
        if (Double.doubleToLongBits(this.rowCount) != Double.doubleToLongBits(other.rowCount)) {
            return false;
        }
        if (Double.doubleToLongBits(this.columnCount) != Double.doubleToLongBits(other.columnCount)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Map{" + "rowCount=" + rowCount + ", columnCount=" + columnCount + "}";
    }
    
    
    
}
