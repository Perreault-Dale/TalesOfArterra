/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.talesofarterra.view;

import byui.cit260.talesofarterra.control.CharacterControl;
import byui.cit260.talesofarterra.model.Character;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Dale
 */
public class SkillsView extends View {
    
    private Character playerChar;
    private int skillPoints;
    private int initialSkills;

    public SkillsView() {
        super("\n****************************************************************"
          + "\n*                                                              *"
          + "\n* Skills Selection Menu                                        *"
          + "\n*                                                              *"
          + "\n****************************************************************"
          + "\n\nShall we proceed to set your character's skills?"
          + "\nSelect Y to proceed, Q to quit the game.\n");
    }
    
    @Override
    public boolean doAction(String value) {
        boolean done = false;
        value = value.toUpperCase();
        switch (value) {
            case "Y": {
                do {
                    int [] skills = upgradeSkills();
                    done = this.saveSkills(skills);
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

    private int [] upgradeSkills() {
        CharacterControl cc = new CharacterControl();
        try {
            playerChar = cc.loadCharacter("playerChar.ser");
        } catch (IOException | ClassNotFoundException ex) {
            ErrorView.display(this.getClass().getName(), "Error reading input: " + ex.getMessage());
        }
        int [] skills = playerChar.getSkills();
        int [] able = playerChar.getAbilities();
        skillPoints = 1 + ((able[4] - 10) / 2);
        initialSkills = skillPoints;
        String menu;
        
        while (skillPoints > 0) {
            menu = "Your character skills:\n\n" +
                "	Concentration: 		" + skills[0] + "\n" +
                "	Lore:                   " + skills[1] + "\n" +
                "\nYou have " + skillPoints + " additional skill point(s), please select " +
                  "the following skills to learn\n\n" +
                "1.	Sneak: 			" + skills[2] + "\n" +
                "2.	Detect:			" + skills[3] + "\n" +
                "3.	Persuade:		" + skills[4] + "\n" +
                "4.	Heal:			" + skills[5] + "\n\n" +
                "Please select the ability to increase: (1-4)\n\nH - Help\n";
        
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
                case "4": {
                    try {
                        int i = Integer.parseInt(value) + 1;
                        skills[i] = checkPoints(skills[i]);
                        break;
                    } catch(NumberFormatException ne) {
                        this.console.println("\nPlease select a valid entry (1-4,H)");
                    }
                }
                case "H": {
                    skillsHelpMenu();
                    break;
                }
                default:
                    this.console.println("\nPlease select a valid entry (1-4,H)");
            }
        }
        return skills;
    }
    
    private int checkPoints(int score) {
        String notEnoughPoints = "You don't have enough points to increase that ability.";
        if (score / playerChar.getLevel() == 1) {
            this.console.println(notEnoughPoints);
        }
        else {
            score++;
            skillPoints--;
        }
        return score;
    }

    private boolean saveSkills(int[] skills) {
        playerChar.setSkills(skills);
        CharacterControl cc = new CharacterControl();
        return cc.saveCharacter(playerChar,"playerChar.ser");
    }

    private void skillsHelpMenu() {
        this.console.println("Skills Menu stub function called.");
    }
}
