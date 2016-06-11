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
    Random rand = new Random (); 
    
    public void displayAttackBeast() {
        
    //Beast variables
    String[] jungleBeasts = {"Serpents", "Lions", "Wild Cats", "Gorillas"};
    
    //Beast Variables
    GameBeasts GameBeastsObject = new GameBeasts ();
    GameBeastsObject.beastStats();
    
    //Player variables
    Player PlayerObject = new Player ();
    PlayerObject.playerStats();
    
    //Item Variables
    Items ItemsObject = new Items ();
    ItemsObject.healthSyringeStats();
        
    boolean running = true;
    
    System.out.println("Be cautious... Dangerous beasts are lurking about in the jungle!");
    
   /* JUNGLE:
    while(running) {
        System.out.println("-------------------------------------------");
        
        int beastHealth = rand.nextInt(maxBeastHealth);

        String jungleBeasts = jungleBeasts[rand.nextInt(jungleBeasts.length)];
        System.out.println(jungleBeasts + " attacked! Prepare to defend yourself.\n");
        
        while(beastHealth > 0){
            System.out.println("*Your health " + health);
            System.out.println("*" + jungleBeasts + "'s health is " + beastHealth);
            System.out.println("What would you like to do next?");
            System.out.println("1. Attack again");
            System.out.println("2. Use Health Syringe");
            System.out.println("3. Run and hide!");
            
            String input = keyboard.nextLine();
            if(input.equals("1")){
                int attackDamageGiven = rand.nextInt(attackDamage);
                int damageReceived = rand.nextInt(maxBeastAttack);
                
                //algorithm **needs to be in a control layer**
                beastHealth -= attackDamageGiven;
                health -= damageReceived + armor;
                
                System.out.println("You attacked the " + jungleBeasts + " and gave " + attackDamageGiven + " damage.");
                System.out.println("Your armor didn't protect you all the way and you were hurt. Your Health is now " + health + ".");
        
                if(health < 1){
                    System.out.println("The island is dangerous and you have not survived!");
                }
            }
            else if(input.equals("2")){
                if(numberHealthSyringes > 0) {
                    health += healthSyringesHealAmount;
                    numberHealthSyringes--;
                    
                    System.out.println("You used a health syringe. Your health is now at" + health + ".");
                    System.out.println(healthSyringesHealAmount + " health syringes left.");
                }
                
                else {
                    System.out.println("There are no more health syringes left. You must fight the beast.");
                }
                
        }
            else if(input.equals("3")){
                System.out.println("You escaped the " + jungleBeasts + "!");
                continue JUNGLE;
        }
            else{
                System.out.println("Invalid entry.");
        }            

    }
        if(health < 1) {
            System.out.println("Insanity Island comsumes you. Play again to exscape from Insantiy Island!");
            break;
        }
        System.out.println("-------------------------------------------");
        System.out.println("You defeated the " + jungleBeasts + ".");
        if(rand.nextInt(100) < healthSyringesDropChance){
        numberHealthSyringes++;
        }
        
        System.out.println("After defeating the " + jungleBeasts + "you found a health syring.");
    }*/
    }

}