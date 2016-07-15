/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.andresIsland.model;

import java.util.ArrayList;

/**
 *
 * @author andrenell
 */
public class Inventory {
    private ArrayList stuff = new ArrayList();
    
    public boolean isDuplicated(Item something) {
        boolean result = false;
        if(stuff.contains(something)){
            return true;
        }
        return result;
    }

    public void addItem(Item something){
        if(!isDuplicated(something)) {
            stuff.add(something);
        }
    }
        
    public Object getItemAt(int itemAt){
        return stuff.get(itemAt);
    }
    
    public void useItem(Item something){
        Game.me.setHealth(Game.me.getHealth() + something.getHealthChange());
        stuff.remove(something);
    }
    

    public int balanceOfItems(){
        return stuff.size();
    }

    public boolean hasItem(Item something) {
        return stuff.indexOf(something) != -1;
        
    }
    
    public void autoItem(Item something){
        Game.me.setHealth(Game.me.getHealth() + something.getHealthChange());
    }    
    
    @Override
    public String toString() {
        String result = "";
        for (Object object : stuff) {
            result += "\n" + object;
        }
        return result;
    }
    
}
