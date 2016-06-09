/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.talesofarterra.view;

import byui.cit260.talesofarterra.model.Character;
import java.util.Scanner;

/**
 *
 * @author Dale
 */
class AbilitiesMenuView {
    
    private final String promptMessage;
    private final Character playerChar;
    private int abilityPoints;

    public AbilitiesMenuView(Character playerChar) {
        this.displayBanner();
        this.promptMessage = "Please select your character's abilities.";
        this.playerChar = playerChar;
        this.abilityPoints = 1;
    }
    
    public AbilitiesMenuView(Character playerChar, int abilityPoints) {
        this.displayBanner();
        this.promptMessage = "Please select your character's abilities.";
        this.playerChar = playerChar;
        this.abilityPoints = abilityPoints;
    }
    
    private void displayBanner() {
        System.out.println(
            "\n****************************************************************"
          + "\n*                                                              *"
          + "\n* Abilities Selection Menu                                     *"
          + "\n*                                                              *"
          + "\n****************************************************************");
    }
    
    public void displayMenuView() {
        boolean done = false;
        do {
            int [] able = upgradeAbilities();
            done = this.confirmAbilities(able);
        }
        while(!done);
    }

    private int [] upgradeAbilities() {
        int [] able = playerChar.getAbilities();
        String menu;
        
        while (abilityPoints > 0) {
            menu = "Your abilities:\n\n" +
                "1.	Strength: 		" + able[0] + "\n" +
                "2.	Constitution:           " + able[1] + "\n" +
                "3.	Wisdom: 		" + able[2] + "\n" +
                "4.	Dexterity:		" + able[3] + "\n" +
                "5.	Intelligence:		" + able[4] + "\n" +
                "6.	Charisma:		" + able[5] + "\n\n" +
                "You have " + abilityPoints + " ability point(s) to use. Please select the ability to increase: (1-6)\n\nH - Help";
        
            Scanner keyboard = new Scanner(System.in);
            String value = "";
            
            boolean valid = false;
            while (!valid){
                System.out.println(menu);
            
                value = keyboard.nextLine();
                value = value.trim();
                value = value.toUpperCase();
            
                if (value.length()<1) {
                    System.out.println("\nPlease enter a value.");
                    continue;
                }
                break;
            }
            
            switch(value) {
                case "1": {
                    able[0] = checkPoints(able[0]);
                    break;
                }
                case "2": {
                    able[1] = checkPoints(able[1]);
                    break;
                }
                case "3": {
                    able[2] = checkPoints(able[2]);
                    break;
                }
                case "4": {
                    able[3] = checkPoints(able[3]);
                    break;
                }
                case "5": {
                    able[4] = checkPoints(able[4]);
                    break;
                }
                case "6": {
                    able[5] = checkPoints(able[5]);
                    break;
                }
                case "H": {
                    AbilityHelpMenu abilityHelpMenu = new AbilityHelpMenu();
                    abilityHelpMenu.displayMenuView();
                    break;
                }
                default:
                    System.out.println("\nPlease select a valid entry (1-6,H)");
            }
        }
        return able;
    }
    
    private int checkPoints(int score) {
        String notEnoughPoints = "You don't have enough points to increase that ability.";
        int drop;
        if (score > 15) {
            drop = 3;
        }
        else if (score == 14 || score == 15) {
            drop = 2;
        }
        else {
            drop = 1;
        }
        if (abilityPoints < drop) {
            System.out.println(notEnoughPoints);
        }
        else {
            score++;
            abilityPoints -= drop;
        }
        return score;
    }

    private boolean confirmAbilities(int[] able) {
        String menu = "Your abilities:\n\n" +
        "1.	Strength: 		" + able[0] + "\n" +
        "2.	Constitution:           " + able[1] + "\n" +
        "3.	Wisdom: 		" + able[2] + "\n" +
        "4.	Dexterity:		" + able[3] + "\n" +
        "5.	Intelligence:		" + able[4] + "\n" +
        "6.	Charisma:		" + able[5] + "\n\n" +
        "Please confirm that you are satisfied with your choice.\n" + 
        "C - Confirm\n" + 
        "R - Revert\n\n";
        
        Scanner keyboard = new Scanner(System.in);
        String value = "";
        boolean valid = false;
        
        while (!valid){
            System.out.println(menu);
            
            value = keyboard.nextLine();
            value = value.trim();
            
            if (value.length()<1) {
                System.out.println("\nPlease enter a value.");
                continue;
            }
            break;
        }
        String choice = value.toUpperCase();
        
        switch (choice) {
            case "C":
                playerChar.setAbilities(able);
                return true;
            case "R":
                upgradeAbilities();
                return true;
            default:
                System.out.println("\n*** Invalid selection *** Try again");
                break;
        }
        return false;
    }
    
}
