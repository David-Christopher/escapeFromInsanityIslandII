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
public enum Item {
  none(0),
  spear(0),
  knife(0),
  oysters(0),
  oar(0),
  sushi(0),
  water(0),
  map(0),
  raft(0),
  saw(0),
  longLogs(0),
  shortLogs(0),
  vines(0),
  jellyfish(-100),
  goat(-20),
  fever(-100),
  berriesRed(-100),
  berriesBlue(100);
  
  
  private final int healthChange;
  
  Item(int amount){
      this.healthChange = amount;
  }
  
  public int getHealthChange(){
      return healthChange;
  }
}    
