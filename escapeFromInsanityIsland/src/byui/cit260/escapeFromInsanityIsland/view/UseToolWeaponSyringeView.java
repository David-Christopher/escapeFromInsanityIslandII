/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.escapeFromInsanityIsland.view;
import byui.cit260.escapeFromInsanityIsland.control.InventoryControl;
import java.util.Scanner;
/**
 *
 * @author Christopher
 */
    
public final class UseToolWeaponSyringeView  extends View{
    
    public UseToolWeaponSyringeView(){
    
        super("\n"
                + "\n------------------------------------------------"
                + "\n| Choose Your Tool, Weapon or Health Syringe|"
                + "\n------------------------------------------------"
                + "\n1. Axe"    
                + "\n2. Hammer" 
                + "\n3. Saw"
                + "\n4. Spear"
                + "\n5. Bow and Arrow"
                + "\n6. Sword"
                + "\n7. Shield"
                + "\n8. Health Syringes"
                + "\nQ - Quit"
                + "\nPlease enter your selection:"
                + "\n------------------------------------------------");
    }
     
    @Override
    public boolean doAction(String value) {
        value.toUpperCase(); // convert choice to upper case
        
        switch (value) {
            case "1": // choose axe
                this.axeItem();
                break;   
            case "2": // choose hammer
                this.hammerItem();
                break;
            case "3": // display help menu
                this.sawItem();
                break;
            case "4": // save the game
                this.spearItem();
                break;
            case "5": // create and start a new game
                this.bowItem();
                break;   
            case "6": // get and start an existing game
                this.swordItem();
                break;
            case "7": // display help menu
                this.shieldItem();
                break;
            case "8": // save the game
                this.syringeItem();
                break;                
            default:
                System.out.println("\n*** Invalid selection *** Try again");
                break;
        }
        return false; 
    }
        private void axeItem() {       
            //Find axeItem
        InventoryControl.axeItem();
    }
        
        private void hammerItem() {       
            //Find axeItem
        InventoryControl.hammerItem();
    }

        private void sawItem() {       
            //Find sawItem
        InventoryControl.sawItem();
    }

        private void spearItem() {       
            //Find spearItem
        InventoryControl.spearItem();
    }
        private void bowItem() {       
            //Find bowItem
        InventoryControl.bowItem();
    }
        
        private void swordItem() {       
            //Find swordItem
        InventoryControl.swordItem();
    }

        private void shieldItem() {       
            //Find shieldItem
        InventoryControl.shieldItem();
    }

        private void syringeItem() {       
            //Find syringeItem
        InventoryControl.syringeItem();
    }        
}
