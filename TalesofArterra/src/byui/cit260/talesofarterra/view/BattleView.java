/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.talesofarterra.view;

import byui.cit260.talesofarterra.control.AttackControl;
import byui.cit260.talesofarterra.control.ItemControl;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Portal
 */
public class BattleView {
    
    private String battleMenu;
    
    //Scanner in = new Scanner(System.in);
    Random rand = new Random();
   
    public BattleView() {
        this.battleMenu = "\n "
                + "\n****************************************************"
                + "\n| Battle Menu                                      |"
                + "\n****************************************************"
                + "\nA. Attack, man mode"
                + "\nD. Drink health potion, woops"
                + "\nR. Run!, ya coward!"
                + "\n****************************************************"
                
                ;
        }
    void displayBattleMenuView() {
        
        boolean done = false;
        
        do {
            String menuOption = this.getMenuOption();
            
            if (menuOption.toUpperCase().equals("R"))
                return;
            
            done = this.doAction(menuOption);
                } while (!done);       
        }
    
    private String getMenuOption() {
        
        Scanner keyboard = new Scanner(System.in);
        String value = "";
        boolean valid = true;
        
        while (!valid){
            System.out.println("\n" + this.battleMenu);
            
            value = keyboard.nextLine();
            value = value.trim();
            
            if (value.length()<1) {
                System.out.println("\nYou must choose wisely...letter.");
                continue;
            }
            break;
        }
        return value;
    }
    
    private boolean doAction(String choice) {
        
        choice = choice.toUpperCase();
        
        switch (choice) {
            case "A" :
                this.startNewAttack();
                break;
            case "D" :
                this.drinkPotion();
                break;
            case "R" :
                this.exitCombat();
                break;
            default :
                System.out.println("\n*** you have chosen poorly *** Try again");
                break;
        }
        return false;
    }   
   
    private void startNewAttack() {
    
        AttackControl attackControlObject = new AttackControl ();
        attackControlObject.createNewAttack();
        
       
        }

    private void drinkPotion (){
        ItemControl potion = new ItemControl ();
        potion.addsToHealth();
    }
    
    
    
    private void exitCombat() {
        System.out.println("\n*** startExistingGame function called ***");
    }
}
