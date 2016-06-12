/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.escapeFromInsanityIsland.model;

import java.io.Serializable;

/**
 *
 * @author Christopher
 */
public class GameBeasts implements Serializable{
    
    //Beast variables - Serpents, Lions, Wild Cats, Gorillas.
    int maxBeastHealth = 150;
    int maxBeastAttack = 20;

    public int getMaxBeastHealth() {
        return maxBeastHealth;
    }

    public void setMaxBeastHealth(int maxBeastHealth) {
        this.maxBeastHealth = maxBeastHealth;
    }

    public int getMaxBeastAttack() {
        return maxBeastAttack;
    }

    public void setMaxBeastAttack(int maxBeastAttack) {
        this.maxBeastAttack = maxBeastAttack;
    }
    
}
