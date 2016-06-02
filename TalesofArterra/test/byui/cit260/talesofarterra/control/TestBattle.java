package byui.cit260.talesofarterra.control;

/*
not sure why this is not running by itself, but this is the quick test battle i created to get some idead going.
@carlos
*/

import java.util.Random;
import java.util.Scanner;


public class TestBattle {
    
    public static void main(String[] args) {
        
        //system objects
        
        Scanner in = new Scanner(System.in);
        Random rand = new Random();
        
        // Game variables
        String[] badGuys = {"Wolf", "Spider", "Trog", "Thief"};
        int maxBadGuyHealth = 75;
        int badGuyDamage = 25;
        
        // player variables
        int health = 100;
        int attackDamage = 50;
        // carry over from the home class, but added static for now.
        int numHealthPotions = 3;
        int healthPotionHealAmount = 30;
        // we can use this to create a loot table
        int healthPotionDropChance = 50; // percentage
        
        
        boolean combat = true;
        
        System.out.println("You have entered the plains of Edinburg");
        
        BATTLE:
        // while to make enemies appear
        while(combat) {
            System.out.println("--------------------------------------------");
            
            int enemyHealth = rand.nextInt(maxBadGuyHealth);
            
            String badGuy = badGuys[rand.nextInt(badGuys.length)];
            // backlash and a t will tab the line
            // bacllasn n moves to other line
            System.out.println("\t** " + badGuy + " comes at ya! **\n");
            
            // battle dmg
            // control+shift+ down arrow copies line code
            while(enemyHealth > 0) {
                System.out.println("\tYour HP; " + health);
                System.out.println("\t" + badGuy + "'s HP: " + enemyHealth);
                System.out.println("\n\tWhat would you like to do?");
                System.out.println("\t 1. Attack, man mode");
                System.out.println("\t 2. Drink health potion, woops");
                System.out.println("\t 3. Run!, ya coward");
               
                // !!!!!!input from user!!!!!!
                String input = in.nextLine();
                // what that choice does in the game
                
                // damage done to enemy and taken
                if(input.equals("1")){
                    int damageDone = rand.nextInt(attackDamage);
                    int damageTaken = rand.nextInt(badGuyDamage);
                    
                    enemyHealth -= damageDone;
                    health -= damageTaken;
                    
                    System.out.println("\t> You hit the " + badGuy + " for " + damageDone + "damage." );
                    System.out.println("\t > You got" + damageTaken + " damage in the Battle.");
                    
                    if (health < 1) {
                        
                        System.out.println("\t > You took a nasty one and are down for the count!.");
                        break;
                    }
                
                }
                // drinks potion raises health and track number of pots
                else if(input.equals("2")) {
                    if(numHealthPotions > 0) {
                        health += healthPotionHealAmount;
                        numHealthPotions --;
                        System.out.println("\t> You drink a health potion, health goes up to" + healthPotionHealAmount
                                            + "\n\t> You now have " + health +"hp"
                                            + "\n\t> You have " + numHealthPotions + "health potions left.\n");
                    }
                    else{
                        System.out.println("\t You have no health potions left! Take out Bad guys to get more.\n");
                    }
               
                
                
                }               
                else if(input.equals("3")) {
                    System.out.println("\tYou run away from the " + badGuy + "!");
                    //starts the loop from the label, ie GAME
                    continue BATTLE;
                }
                else {
                    System.out.println("\tYou chosed poorly");
                }
            }
            //break out of the loop, in this case low health
            if(health <1) {
                System.out.println("you crawl out of the fight");
                break;
            }
            // original brek
            System.out.println("--------------------------------------------");
            System.out.println(" # "  + badGuy + " was defeated! # ");
            System.out.println(" # you have " + health + "hp left. #");
            
            // random potion drop chance
            if(rand.nextInt(100) < healthPotionDropChance) {
                numHealthPotions++;
                System.out.println(" # The " + badGuy + " dropped a health potion! #");
                System.out.println(" # You now have " + numHealthPotions + "health potion(s). #");
            }
            System.out.println("--------------------------------------------");
            // maybe we can add the other options on the map
            System.out.println("What would you like to do now?");
            System.out.println("1. Push Forward");
            System.out.println("2. Exit Area");
       
            String input = in.nextLine();
            
            while(!input.equals("1") && !input.equals("2")) {
                System.out.println("You have chosen poorly");
                input = in.nextLine();
                
            }
            if(input.equals("1")) {
                System.out.println("Atta boy!");
            }
            else if(input.equals("2")){
                System.out.println("Fine you sissy");
                break;
            }
            
        }
        
        System.out.println("###########################");
        System.out.println("That'll do pig, that'll do.");
        System.out.println("###########################");
        
    }
    
}