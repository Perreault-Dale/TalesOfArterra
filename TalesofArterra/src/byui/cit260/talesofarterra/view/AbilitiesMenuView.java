/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.talesofarterra.view;

import byui.cit260.talesofarterra.control.CharacterControl;
import byui.cit260.talesofarterra.exceptions.CharacterControlException;
import byui.cit260.talesofarterra.model.Character;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

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
                this.console.println("\nPlease select a valid entry (Y,Q)");
        }
        return done;
    }

    private int [] upgradeAbilities() {
        CharacterControl cc = new CharacterControl();
        try {
            playerChar = cc.loadCharacter("playerChar.ser");
        } catch (CharacterControlException ex) {
            ErrorView.display("AbilitiesMenuView", ex.getMessage());
        }
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
        
            String value = "";
            
            boolean valid = false;
            while (!valid){
                try {
                    this.console.println(menu);
                    
                    value = this.keyboard.readLine();
                    value = value.trim();
                    value = value.toUpperCase();
                    
                    if (value.length()<1) {
                        this.console.println("\nPlease enter a value.");
                        continue;
                    }
                    break;
                } catch (IOException ex) {
                    ErrorView.display(this.getClass().getName(), "Error reading input: " + ex.getMessage());
                }
            }
            
            switch(value) {
                case "1":
                case "2":
                case "3":
                case "4":
                case "5":
                case "6": {
                    try {
                        int i = Integer.parseInt(value) - 1;
                        able[i] = checkPoints(able[i]);
                        break;
                    } catch(NumberFormatException ne) {
                        this.console.println("\nPlease select a valid entry (1-6,H)");
                    }
                }
                case "H": {
                    abilityHelpMenu();
                    break;
                }
                default:
                    this.console.println("\nPlease select a valid entry (1-6,H)");
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
            this.console.println(notEnoughPoints);
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
        
        String value = "";
        boolean valid = false;
        
        do {
            try {
                this.console.println(menu);
                
                value = this.keyboard.readLine();
                value = value.trim();
                value = value.toUpperCase();
                
                switch (value) {
                    case "R":
                        this.resetAbility(able);
                        return false;
                    case "C":
                        playerChar.setAbilities(able);
                        CharacterControl cc = new CharacterControl();
                        cc.addHP(playerChar);
                {
                    try {
                        cc.saveCharacter(playerChar,"playerChar.ser");
                    } catch (CharacterControlException ex) {
                        ErrorView.display(this.getClass().getName(), "Error reading input: " + ex.getMessage());
                    }
                }
                        valid = true;
                        break;
                    default:
                        this.console.println("\n*** Invalid selection *** Try again");
                        valid = false;
                        break;
                }
            } catch (IOException ex) {
                ErrorView.display(this.getClass().getName(), "Error reading input: " + ex.getMessage());
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
