/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.escapeFromInsanityIsland.view;

import java.util.Scanner;

/**
 *
 * @author Christopher
 */
public class GameMenuView extends View {
  
    
        public GameMenuView() {
        /* this.promptMessage = "\nPlease enter your selection: ";
        // display the banner when view created 
           this.displayBanner();
       */
        super("\n"
                  + "\n------------------------------------------------"
                  + "\n| Game Menu                                    |"
                  + "\n------------------------------------------------"
                  + "\nA - Attack Beast"
                  + "\nV - View Map"
                  + "\nI - View Inventory" 
                  + "\nS - Craft Health Syringe"
                  + "\nT - Construct Tools"
                  + "\nW - Construct Weapon"
                  + "\nU - Use Tool, Weapon, or Syringe"
                  + "\nB - Construct Boat"
                  + "\nM - Move to Location"
                  + "\n------------------------------------------------");
    }

    @Override
    public boolean doAction(String value) {
        value.toUpperCase(); // convert choice to upper case
        
        switch (value) {
            case "A": // Attack beast; not a permanent menu item.
                this.attackBeast();
                break;             
            case "V": // View the map
                this.viewMap();
                break;   
            case "I": // View inventory
                this.viewInventory();
                break;
            case "S": // Craft health syringes
                this.craftHealthSyringe();
                break;
            case "T": // Construct tools
                this.constructTools();
                break;
            case "W": // Construct weapons
                this.constructWeapon();
                break;
            case "U": // Use tool/weapon/syringe
                this.useToolWeaponSyringe();
                break;
            case "B": // Construct the boat
                this.constructBoat();
                break;
            case "M": // Move to another location
                this.moveToLocation();
                break;
            default:
                System.out.println("\n*** Invalid selection *** Try again");
                break;
        }
        return false; 
    }
    
    private void attackBeast() {
           AttackBeastView attackBeast = new AttackBeastView();
        attackBeast.displayAttackBeast();     
    }
    
    private void viewMap() {
           ViewMapView viewMap = new ViewMapView();
        viewMap.displayViewMap();     
    }
        
    private void viewInventory(){
           ViewInventoryView viewInventory = new ViewInventoryView();
        viewInventory.displayViewInventoryView();  
    }

    private void craftHealthSyringe() {
           CraftHealthSyringeView craftHealthSyringe = new CraftHealthSyringeView();
        craftHealthSyringe.displayCraftHealthSyringeView();
    }

    private void constructTools() {
           ConstructToolsView constructTools = new ConstructToolsView();
        constructTools.displayConstructToolsView();
    }
    
    private void constructWeapon() {
            ConstructWeaponView constructWeapon = new ConstructWeaponView();
        constructWeapon.displayConstructWeaponView();
    }

    private void useToolWeaponSyringe() {
            UseToolWeaponSyringeView useToolWeaponSyringe = new UseToolWeaponSyringeView();
        useToolWeaponSyringe.displayUseToolWeaponSyringeView();
    }
    private void constructBoat() {
    /*        ConstructBoatView constructBoat = new ConstructBoatView();
        constructBoat.displayConstructBoatView();
    */
    }
    private void moveToLocation() {
            MoveToLocationView moveToLocation = new MoveToLocationView();
        moveToLocation.displayMoveToLocationView();
    }
}

