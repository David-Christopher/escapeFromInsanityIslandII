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
public class GameMenuView {
   
    private String gameMenu;
    private String promptMessage = "Enter your selection below";
   
    public GameMenuView() {
        this.gameMenu = "\n"
                  + "\n------------------------------------------------"
                  + "\n| Game Menu                                    |"
                  + "\n------------------------------------------------"
                  + "\nV - View Map"
                  + "\nI - View Inventory" 
                  + "\nS - Craft Health Syringe"
                  + "\nT - Construct Tools"
                  + "\nW - Construct Weapon"
                  + "\nU - Use Tool, Weapon, or Syringe"
                  + "\nB - Construct Boat"
                  + "\nM - Move to Location"
                  + "\n------------------------------------------------";
    }
    public void displayGameMenu() {
        boolean done = false; // set flag to not done
        do {
            System.out.println(gameMenu);
            //prompt for and get the players name
            String gameMenuOption = this.getGameMenuOption();
            if (gameMenuOption.toUpperCase().equals("Q")) // user wants to quit
                return; // Take them back a screen
            
            // do the requested action and display the next view
            done = this.doAction(gameMenuOption);
            
        } while (!done);
    }
    private String getGameMenuOption() {
        
        Scanner keyboard = new Scanner(System.in); // get infile for keyboard
        String value = ""; // value to be returned
        boolean valid = false; // initialize to not valid

        while (!valid) { // loop whilean invalid value is entered
            System.out.println("\n" + this.promptMessage);
            
            value = keyboard.nextLine(); // get next line typed on keyboard
            value = value.trim(); // trim off leading and trailing blanks

            if (value.length() < 1) { // value is blank
                System.out.println("\nInvalid value: value can not be blank");
                continue;
            }
            
            break; // end the loop
               
        }
        return value; // return the value entered
                        
    }
    private boolean doAction(String choice) {
        choice.toUpperCase(); // convert choice to upper case
        
        switch (choice) {
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
    
    private void viewMap() {
           ViewMapView viewMap = new ViewMapView();
        viewMap.displayViewMap();     
    }
        
    private void viewInventory(){
           ViewInventoryView viewInventory = new ViewInventoryView();
        viewInventory.displayViewInventory();  
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
            ConstructBoatView constructBoat = new ConstructBoatView();
        constructBoat.displayConstructBoatView();
    }
    private void moveToLocation() {
            MoveToLocationView moveToLocation = new MoveToLocationView();
        moveToLocation.displayMoveToLocationView();
    }
}

