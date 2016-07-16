/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.escapeFromInsanityIsland.model;

/**
 *
 * @author andrenell
 */
public class ItemOnMap {

    private int X;
    private int Y;
    private Item object;

    public ItemOnMap(int X, int Y, Item object) {
        this.X = X;
        this.Y = Y;
        this.object = object;
    }

    public int getX() {
        return X;
    }

    public int getY() {
        return Y;
    }

    public Item getObject() {
        return object;
    }

    @Override
    public String toString() {
        return "ITEM[X=" + X + ", Y=" + Y + "] is " + object + "";
    }
    
}
