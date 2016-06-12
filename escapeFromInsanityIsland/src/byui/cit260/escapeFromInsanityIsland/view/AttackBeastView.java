/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.escapeFromInsanityIsland.view;

import byui.cit260.escapeFromInsanityIsland.control.AttackBeastControl;
import byui.cit260.escapeFromInsanityIsland.model.GameBeasts;
import byui.cit260.escapeFromInsanityIsland.model.Player;
import byui.cit260.escapeFromInsanityIsland.model.Items;
import java.util.Random;
import java.util.Scanner;


/**
 *
 * @author Christopher
 */
public class AttackBeastView {
    
    Scanner keyboard = new Scanner(System.in); // get infile for keyboard
    Scanner userKeyboard = new Scanner(System.in); // get infile for keyboard
    Random rand = new Random (); 
    
    public void displayAttackBeast() {
        
    //Beast variables
    String[] jungleBeasts = { "Serpent", "Lion", "Wild Cat", "Gorilla" };
    
    //Beast Variables
    GameBeasts gameBeastsObject = new GameBeasts ();

    //Player variables
    Player playerObject = new Player ();
          
    //Item Variables
    Items itemsObject = new Items();
    
    boolean running = true;
    
    System.out.println("Be cautious... Dangerous beasts are lurking about in the jungle!");
    
    JUNGLE: //GAME PLAY - BEAST BATTLES
    while(running) {
        System.out.println("-------------------------------------------");

        System.out.println("Are you wearing your leather armor worth 2 armor,");
        System.out.println("jungle wood armor worth 4 armor or smelted iron armor worth 6 armor?");
        System.out.println("Enter your armor's value below:");
        
        if (keyboard.hasNextInt(2)){ 
            playerObject.setArmor(keyboard.nextInt());
            System.out.println("//////////////////////////////////////////");            
            System.out.println("Your armor is now set to " + playerObject.getArmor() + ".");
            System.out.println("//////////////////////////////////////////");            
        } 
        else if (keyboard.hasNextInt(4)){
            playerObject.setArmor(keyboard.nextInt());
            System.out.println("//////////////////////////////////////////");            
            System.out.println("Your armor is now set to " + playerObject.getArmor() + ".");  
            System.out.println("//////////////////////////////////////////");            
        }
        
        else if (keyboard.hasNextInt(6)){
            playerObject.setArmor(keyboard.nextInt());
            System.out.println("//////////////////////////////////////////");
            System.out.println("Your armor is now set to " + playerObject.getArmor() + ".");
            System.out.println("//////////////////////////////////////////");            
        }
        
        else {      
            System.out.print("Please enter a valid armor value: ");
            keyboard.nextLine();
        }
        
        int beastHealth = rand.nextInt(gameBeastsObject.getMaxBeastHealth());

        String battle = jungleBeasts[rand.nextInt(jungleBeasts.length)];
        System.out.println(battle + " attacked! Prepare to defend yourself.\n");
        System.out.println("-------------------------------------------");        
        
        while(beastHealth > 0){
            System.out.println("*Your health " + playerObject.getHealth());
            System.out.println("*" + battle + "'s health is " + beastHealth);
            System.out.println("===========================================");            
            System.out.println("What would you like to do next?");
            System.out.println("");            
            System.out.println("1. Attack?");
            System.out.println("2. Use Health Syringe");
            System.out.println("3. Run and hide!");
            System.out.println("");
            System.out.println("Enter your choice here:");
                        
            String input = userKeyboard.nextLine();
            if(input.equals("1")){
                int attackDamageGiven = rand.nextInt(playerObject.getAttackDamage());
                int damageReceived = rand.nextInt(gameBeastsObject.getMaxBeastAttack());
                
                //algorithm **needs to be in a control layer**
                beastHealth -= attackDamageGiven;
                playerObject.setHealth(playerObject.getHealth() - damageReceived + playerObject.getArmor());
                
                System.out.println("You attacked the " + battle + " and gave " + attackDamageGiven + " damage.");
                System.out.println("Your armor didn't protect you all the way and you were hurt. Your Health is now " + playerObject.getHealth() + ".");
        
                if(playerObject.getHealth () < 1){
                    System.out.println("The island is dangerous and you have not survived!");
                    
                }
            }
            else if(input.equals("2")){
                if(itemsObject.getNumberHealthSyringes() > 0) {
                    
                    playerObject.setHealth(playerObject.getHealth() + itemsObject.getHealthSyringesHealAmount());
                    itemsObject.setNumberHealthSyringes(itemsObject.getNumberHealthSyringes() - 1);
                    System.out.println("You used a health syringe. Your health is now at " + playerObject.getHealth () + ".");
                    System.out.println(itemsObject.getNumberHealthSyringes() + " health syringes left.");
                }
                
                else {
                    System.out.println("There are no more health syringes left. You must fight the beast.");
                }
                
        }
            else if(input.equals("3")){
                System.out.println("You escaped the " + battle + "!");
                System.out.println("But in order to escape the jungle you must defeat a beast to escape.");
                continue JUNGLE;
        }
            else{
                System.out.println("Invalid entry.");
        }            
    }
        if(playerObject.getHealth () < 1) {
            System.out.println("Insanity Island comsumes you. Play again to exscape from Insantiy Island!");
            break;
        }
        System.out.println("-------------------------------------------");
        System.out.println("You defeated the " + battle + ".");
        
        if(itemsObject.getHealthSyringesDropChance() > rand.nextInt(100)){
        
        itemsObject.setNumberHealthSyringes(itemsObject.getNumberHealthSyringes() + 1);
        
        System.out.println("After defeating the " + battle + " you found a health syringe.");
        
        }
        break;
    }
    }

}