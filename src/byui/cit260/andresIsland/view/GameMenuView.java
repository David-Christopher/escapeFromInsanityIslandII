/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.andresIsland.view;

import byui.cit260.andresIsland.model.Player;

/**
 *
 * @author andrenell
 */
public class GameMenuView extends View{ 
  
    
        public GameMenuView() {
        /* this.promptMessage = "\nPlease enter your selection: ";
        // display the banner when view created 
           this.displayBanner();
       */
        super("\n"
                  + "\n------------------------------------------------"
                  + "\n| Game Menu                                    |"
                  + "\n------------------------------------------------"
                  + "\nV - View Map"
                  + "\nI - View Inventory" 
                  + "\nH - View Health"
                  + "\nU - Use Item from Inventory"
                  + "\nB - Construct Raft"
                  + "\nM - Move to Location"
                  + "\nQ - Go Back"                
                  + "\n------------------------------------------------"
                  + "\n Please enter your selection:");
    }

    @Override
    public boolean doAction(String value) {
        value.toUpperCase(); // convert choice to upper case
        
        switch (value) {
            case "V": // View the map
                this.viewMap();
                break;   
            case "I": // View inventory
                this.viewInventory();
                break;
            case "U": // Use item from inventory
                this.useInventoryItem();
                break;
            case "B": // Construct the raft
                this.constructRaft();
                break;
            case "M": // Move to another location
                this.moveToLocation();
                break;
            default:
                System.out.println("\n*** Invalid selection *** Try again");
                break;       }
        return false; 
    }
    


    private void constructRaft() {
            ConstructRaftView constructBoat = new ConstructRaftView();
            constructBoat.display();
    
    }

    private void viewMap() {
        ViewMapView gameMap = new ViewMapView();
//        gameMap.setPlayer(Player.getGameCharacter());
        gameMap.display();

    }

    private void viewInventory() {
        ViewInventoryView scene = new ViewInventoryView();
        scene.display();
    }

    private void useInventoryItem() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void moveToLocation() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}