/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.talesofarterra.view;

import byui.cit260.talesofarterra.control.CharacterControl;
import byui.cit260.talesofarterra.model.Character;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Dale
 */
class AbilitiesMenuView extends View {
    
    private Character playerChar;
    private int abilityPoints;
    private final int initialPoints;

    public AbilitiesMenuView() {
        super("\n****************************************************************"
          + "\n*                                                              *"
          + "\n* Abilities Selection Menu                                     *"
          + "\n*                                                              *"
          + "\n****************************************************************"
          + "\n\nShall we proceed to set your character's abilities?"
          + "\nSelect Y to proceed, Q to quit the game.\n");
        this.abilityPoints = 1;
        this.initialPoints = this.abilityPoints;
    }
    
    public AbilitiesMenuView(int abilityPoints) {
        super("\n****************************************************************"
          + "\n*                                                              *"
          + "\n* Abilities Selection Menu                                     *"
          + "\n*                                                              *"
          + "\n****************************************************************"
          + "\n\nShall we proceed to set your character's abilities?"
          + "\nSelect Y to proceed, Q to quit the game.\n");
        this.abilityPoints = abilityPoints;
        this.initialPoints = this.abilityPoints;
    }
    
    @Override
    public boolean doAction(String value) {
        boolean done = false;
        value = value.toUpperCase();
        switch (value) {
            case "Y": {
                do {
                    int [] able = upgradeAbilities();
                    done = this.confirmAbilities(able);
                }
                while(!done);
                break;
            }
            case "Q":
                done = true;
                break;
            default:
                System.out.println("\nPlease select a valid entry (Y,Q)");
        }
        return done;
    }

    private int [] upgradeAbilities() {
        CharacterControl cc = new CharacterControl();
        playerChar = cc.loadCharacter("playerChar.ser");
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
                "You have " + abilityPoints + " ability point(s) to use. "
                    + "Please select the ability to increase: (1-6)\n\nH - Help\n";
        
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
                case "1":
                case "2":
                case "3":
                case "4":
                case "5":
                case "6": {
                    int i = Integer.parseInt(value) - 1;
                    able[i] = checkPoints(able[i]);
                    break;
                }
                case "H": {
                    abilityHelpMenu();
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
        if (score > 15 && playerChar.getLevel() == 1) {
            drop = 3;
        }
        else if ((score == 14 || score == 15) && playerChar.getLevel() == 1) {
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

    private boolean confirmAbilities(int [] able) {
        String menu = "\nYour abilities:\n\n" +
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
        
        do {
            System.out.println(menu);
            
            value = keyboard.nextLine();
            value = value.trim();
            value = value.toUpperCase();
            
            switch (value) {
            case "R":
                this.resetAbility(able);
                return false;
            case "C":
                playerChar.setAbilities(able);
                CharacterControl cc = new CharacterControl();
                cc.saveCharacter(playerChar,"playerChar.ser");
                valid = true;
                break;
            default:
                System.out.println("\n*** Invalid selection *** Try again");
                valid = false;
                break;
            }
        }
        while (!valid);
        return true;
    }

    private void resetAbility(int[] able) {
        able = new int[] {8,8,8,8,8,8};
        playerChar.setAbilities(able);
        abilityPoints = initialPoints;
    }
    
    private void abilityHelpMenu() {
        AbilityHelpMenu abilityHelp = new AbilityHelpMenu();
        abilityHelp.display();
    }
}
