/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.andresIsland.model;

/**
 *
 * @author andrenell
 */
import java.io.Serializable;

public class GameCharacter implements Serializable {
    private int health;
    private int coordX;
    private int coordY;
    private int direction;

    private Inventory bag = new Inventory();

    @Override
    public String toString() {
        return "GameCharacter[" + "health=" + health + ", coordX=" + coordX + 
                ", coordY=" + coordY + ']';
    }
    
//------------------------------------------------------------------------------    

    public GameCharacter() {
        this.coordX = 0;
        this.coordY = 0;
        this.health = 100;
        bag.addItem(Item.spear);
        bag.addItem(Item.berriesRed);
        bag.addItem(Item.berriesBlue);
    }
    
    public GameCharacter(int coordX, int coordY) {
        this.coordX = coordX;
        this.coordY = coordY;
        this.health = 100;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int life) {
        this.health = life;
    }

    public int getCoordX() {
        return coordX;
    }

    public void setCoordX(int coordX) {
        this.coordX = coordX;
    }

    public int getCoordY() {
        return coordY;
    }   
    
    public void setCoordY(int coordY) {
        this.coordY = coordY;
    }

    public void setDirection(int direction) {
        this.direction = direction;
    }       

    public int getDirection() {
        return direction;
    }
    
    public Inventory getBag() {
        return bag;
    }

    public void move() {
        switch (direction) {
            case Move.NORTH:
                this.coordY--;
                break;
            case Move.SOUTH:
                this.coordY++;
                break;
            case Move.EAST:
                this.coordX++;
                break;
            case Move.WEST:
                this.coordX--;
                break;
        }
    }
}
