/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.escapeFromInsanityIsland.model;

import byui.cit260.escapeFromInsanityIsland.control.GameControl;
import java.io.Serializable;

/**
 *
 * @author andrenell
 */
public class Game implements Serializable{
    
    //class instance variables
    private double totalTime;
    private double noPeople;
    
    private Boat boat;
    private Map map;
    private Player[] player;
    private Items[] items;

    public Game() {
    }

    public Boat getBoat() {
        return boat;
    }

    public void setBoat(Boat boat) {
        this.boat = boat;
    }

    public Map getMap() {
        return map;
    }

    public void setMap(Map map) {
        this.map = map;
    }

    public Player[] getPlayer() {
        return player;
    }

    public void setPlayer(Player[] player) {
        this.player = player;
    }

    public Items[] getItems() {
        return items;
    }

    public void setItems(Items[] items) {
        this.items = items;
    }
    
    

    public double getTotalTime() {
        return totalTime;
    }

    public void setTotalTime(double totalTime) {
        this.totalTime = totalTime;
    }

    public double getNoPeople() {
        return noPeople;
    }

    public void setNoPeople(double noPeople) {
        this.noPeople = noPeople;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 29 * hash + (int) (Double.doubleToLongBits(this.totalTime) ^ (Double.doubleToLongBits(this.totalTime) >>> 32));
        hash = 29 * hash + (int) (Double.doubleToLongBits(this.noPeople) ^ (Double.doubleToLongBits(this.noPeople) >>> 32));
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
        final Game other = (Game) obj;
        if (Double.doubleToLongBits(this.totalTime) != Double.doubleToLongBits(other.totalTime)) {
            return false;
        }
        if (Double.doubleToLongBits(this.noPeople) != Double.doubleToLongBits(other.noPeople)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Game{" + "totalTime=" + totalTime + ", noPeople=" + noPeople + '}';
    }
}