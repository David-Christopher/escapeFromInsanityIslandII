/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.escapeFromInsanityIsland.view;

import byui.cit260.escapeFromInsanityIsland.model.GameBeasts;
import byui.cit260.escapeFromInsanityIsland.model.Player;
import byui.cit260.escapeFromInsanityIsland.model.Items;
import escapefrominsanityisland.EscapeFromInsanityIsland;
import java.util.Random;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author Christopher
 */
public class AttackBeastView {
       
    protected final BufferedReader keyboard = 
                EscapeFromInsanityIsland.getInFile();
        
    protected final PrintWriter console = 
                EscapeFromInsanityIsland.getOutFile(); 
    
    Random rand = new Random (); 
    
    public void displayAttackBeast() throws IOException {

    //Beast variables
    String[] jungleBeasts = { "Serpent", "Lion", "Wild Cat", "Gorilla" };
    
    //Beast Variables
    GameBeasts gameBeastsObject = new GameBeasts ();

    //Player variables
    Player playerObject = new Player ();
          
    //Item Variables
    Items itemsObject = new Items();
    
    boolean running = true;
    
    this.console.println("Be cautious... Dangerous beasts are lurking about in the jungle!");
    
    JUNGLE: //GAME PLAY - BEAST BATTLES
    while(running) {
        this.console.println("\n-------------------------------------------");

        this.console.println("Are you wearing your leather armor worth 3 armor,");
        this.console.println("jungle wood armor worth 4 armor or smelted iron armor worth 6 armor?");
        this.console.println("Enter your armor's value below:");
        
        String armV = keyboard.readLine();
        int armorValue = Integer.parseInt(armV);
        
        if (armorValue == 3) {         
                playerObject.setArmor(armorValue);
                this.console.println("//////////////////////////////////////////");
                this.console.println("Your armor is now set to " + playerObject.getArmor() + ".");
                this.console.println("//////////////////////////////////////////");
        }
       
        else if (armorValue == 4) {
                playerObject.setArmor(armorValue);
                this.console.println("//////////////////////////////////////////");
                this.console.println("Your armor is now set to " + playerObject.getArmor() + ".");
                this.console.println("//////////////////////////////////////////");
        }
        else if (armorValue == 6) {
                playerObject.setArmor(armorValue);
                this.console.println("//////////////////////////////////////////");
                this.console.println("Your armor is now set to " + playerObject.getArmor() + ".");
                this.console.println("//////////////////////////////////////////");
        }
        else{
                this.console.print("Please enter a valid armor value:");
                this.keyboard.readLine();
                continue JUNGLE;
        }
        
        
        int beastHealth = rand.nextInt(gameBeastsObject.getMaxBeastHealth());

        String battle = jungleBeasts[rand.nextInt(jungleBeasts.length)];
        this.console.println(battle + " attacked! Prepare to defend yourself.\n");
        this.console.println("-------------------------------------------");        
        
        while(beastHealth > 0){
            this.console.println("*Your health " + playerObject.getHealth());
            this.console.println("*" + battle + "'s health is " + beastHealth);
            this.console.println("===========================================");            
            this.console.println("What would you like to do next?");
            this.console.println("");            
            this.console.println("1. Attack?");
            this.console.println("2. Use Health Syringe");
            this.console.println("3. Run and hide!");
            this.console.println("");
            this.console.println("Enter your choice here:");
                        
            String input = this.keyboard.readLine();
            if(input.equals("1")){
                int attackDamageGiven = rand.nextInt(playerObject.getAttackDamage());
                int damageReceived = rand.nextInt(gameBeastsObject.getMaxBeastAttack());
                
                //algorithm **needs to be in a control layer**
                beastHealth -= attackDamageGiven;
                playerObject.setHealth(playerObject.getHealth() - damageReceived + playerObject.getArmor());
                
                this.console.println("You attacked the " + battle + " and gave " + attackDamageGiven + " damage.");
                this.console.println("Your armor didn't protect you all the way and you were hurt. Your Health is now " + playerObject.getHealth() + ".");
        
                if(playerObject.getHealth () < 1){
                    this.console.println("The island is dangerous and you have not survived!");
                    break;
                }
            }
            else if(input.equals("2")){
                if(itemsObject.getNumberHealthSyringes() > 0) {
                    
                    playerObject.setHealth(playerObject.getHealth() + itemsObject.getHealthSyringesHealAmount());
                    itemsObject.setNumberHealthSyringes(itemsObject.getNumberHealthSyringes() - 1);
                    this.console.println("You used a health syringe. Your health is now at " + playerObject.getHealth () + ".");
                    this.console.println(itemsObject.getNumberHealthSyringes() + " health syringes left.");
                }
                
                else {
                    this.console.println("There are no more health syringes left. You must fight the beast.");
                }
                
        }
            else if(input.equals("3")){
                this.console.println("You escaped the " + battle + "!");
                this.console.println("But in order to escape the jungle you must defeat a beast to escape.");
                continue JUNGLE;
        }
            else{
                ErrorView.display(this.getClass().getName(), "Invalid entry.");
        }            
    }
        if(playerObject.getHealth () < 1) {
            this.console.println("Insanity Island comsumes you. Play again to exscape from Insantiy Island!");
            break;
        }
        this.console.println("-------------------------------------------");
        this.console.println("You defeated the " + battle + ".");
        
        if(itemsObject.getHealthSyringesDropChance() > rand.nextInt(100)){
        
        itemsObject.setNumberHealthSyringes(itemsObject.getNumberHealthSyringes() + 1);
        
        this.console.println("After defeating the " + battle + " you found a health syringe.");
        this.console.println("-------------------------------------------");        
        }
        break;
    }
    }

}