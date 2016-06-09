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
    private final int abilityPoints;

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
            int [] able = upgradeAbilities(playerChar,abilityPoints);
            done = this.confirmAbilities(playerChar,able);
        }
        while(!done);
    }

    private int [] upgradeAbilities(Character playerChar, int abilityPoints) {
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
            String notEnoughPoints = "You don't have enough points to increase that ability.";
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
            
            switch(value) {
                case "1": {
                    if (able[0] == 14 || able[0] == 15) {
                        if (abilityPoints < 2) {
                            System.out.println(notEnoughPoints);
                        }
                        else {
                            able[0]++;
                            abilityPoints -= 2;
                        }
                    }
                    else if (able[0] > 15) {
                        if (abilityPoints < 3) {
                            System.out.println(notEnoughPoints);
                        }
                        else {
                            able[0]++;
                            abilityPoints -= 3;
                        }
                    }
                    else {
                        if (abilityPoints < 1) {
                            System.out.println(notEnoughPoints);
                        }
                        else {
                            able[0]++;
                            abilityPoints--;
                        }
                    }
                    break;
                }
                case "2": {
                    if (able[1] == 14 || able[1] == 15) {
                        if (abilityPoints < 2) {
                            System.out.println(notEnoughPoints);
                        }
                        else {
                            able[1]++;
                            abilityPoints -= 2;
                        }
                    }
                    else if (able[1] > 15) {
                        if (abilityPoints < 3) {
                            System.out.println(notEnoughPoints);
                        }
                        else {
                            able[1]++;
                            abilityPoints -= 3;
                        }
                    }
                    else {
                        if (abilityPoints < 1) {
                            System.out.println(notEnoughPoints);
                        }
                        else {
                            able[1]++;
                            abilityPoints--;
                        }
                    }
                    break;
                }
                case "3": {
                    if (able[2] == 14 || able[2] == 15) {
                        if (abilityPoints < 2) {
                            System.out.println(notEnoughPoints);
                        }
                        else {
                            able[2]++;
                            abilityPoints -= 2;
                        }
                    }
                    else if (able[2] > 15) {
                        if (abilityPoints < 3) {
                            System.out.println(notEnoughPoints);
                        }
                        else {
                            able[2]++;
                            abilityPoints -= 3;
                        }
                    }
                    else {
                        if (abilityPoints < 1) {
                            System.out.println(notEnoughPoints);
                        }
                        else {
                            able[2]++;
                            abilityPoints--;
                        }
                    }
                    break;
                }
                case "4": {
                    if (able[3] == 14 || able[3] == 15) {
                        if (abilityPoints < 2) {
                        System.out.println(notEnoughPoints);
                        }
                        else {
                            able[3]++;
                            abilityPoints -= 2;
                        }
                    }
                    else if (able[3] > 15) {
                        if (abilityPoints < 3) {
                            System.out.println(notEnoughPoints);
                        }
                        else {
                            able[3]++;
                            abilityPoints -= 3;
                        }
                    }
                    else {
                        if (abilityPoints < 1) {
                            System.out.println(notEnoughPoints);
                        }
                        else {
                            able[3]++;
                            abilityPoints--;
                        }
                    }
                    break;
                }
                case "5": {
                    if (able[4] == 14 || able[4] == 15) {
                        if (abilityPoints < 2) {
                            System.out.println(notEnoughPoints);
                        }
                        else {
                            able[4]++;
                            abilityPoints -= 2;
                        }
                    }
                    else if (able[4] > 15) {
                        if (abilityPoints < 3) {
                            System.out.println(notEnoughPoints);
                        }
                        else {
                            able[4]++;
                            abilityPoints -= 3;
                        }
                    }
                    else {
                        if (abilityPoints < 1) {
                            System.out.println(notEnoughPoints);
                        }
                        else {
                            able[4]++;
                            abilityPoints--;
                        }
                    }
                    break;
                }
                case "6": {
                    if (able[5] == 14 || able[5] == 15) {
                        if (abilityPoints < 2) {
                            System.out.println(notEnoughPoints);
                        }
                        else {
                            able[5]++;
                            abilityPoints -= 2;
                        }
                    }
                    else if (able[5] > 15) {
                        if (abilityPoints < 3) {
                            System.out.println(notEnoughPoints);
                        }
                        else {
                            able[5]++;
                            abilityPoints -= 3;
                        }
                    }
                    else {
                        if (abilityPoints < 1) {
                            System.out.println(notEnoughPoints);
                        }
                        else {
                            able[5]++;
                            abilityPoints--;
                        }
                    }
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

    private boolean confirmAbilities(Character playerChar, int[] able) {
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
                upgradeAbilities(playerChar,abilityPoints);
                return true;
            default:
                System.out.println("\n*** Invalid selection *** Try again");
                break;
        }
        return false;
    }
    
}
