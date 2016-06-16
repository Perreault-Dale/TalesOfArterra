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
                System.out.println(playerChar.toString());
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
        System.out.println(
            "\n****************************************************************"
          + "\n*                                                              *"
          + "\n* Abilities Help Menu                                          *"
          + "\n*                                                              *"
          + "\n****************************************************************"
          + "\n\n1.	Strength: 		\n" +
            "2.	Constitution:           \n" +
            "3.	Wisdom: 		\n" +
            "4.	Dexterity:		\n" +
            "5.	Intelligence:		\n" +
            "6.	Charisma:		\n" +
            "\nSelect Q to return to the abilities menu.\n");
        getHelpInput();
    }
    
    private void getHelpInput() {
        Scanner keyboard = new Scanner(System.in);
        String value = "";
        boolean valid = false;
        
        // while a valid name has not been entered
        while(!valid) {
            //get value from keyboard entry
            value = keyboard.nextLine();
            value = value.trim();
            value = value.toUpperCase();
            
            if (value.length() < 1) { //blank value entered
                System.out.println("Sorry, you must enter a value.");
                continue;
            }
            if (value.equals("Q"))
                valid = true;
            else if (Integer.parseInt(value) < 1 || Integer.parseInt(value) > 6)
                System.out.println("\nPlease select a valid entry (1-6,Q)");
            else
                showHelp(value);
        }
    }
    
    private void showHelp(String value) {
        switch (value) {
            case "1":
                strengthHelp();
                break;
            case "2":
                constitutionHelp();
                break;
            case "3":
                wisdomHelp();
                break;
            case "4":
                dexterityHelp();
                break;
            case "5":
                intelligenceHelp();
                break;
            case "6":
                charismaHelp();
                break;
            default:
                System.out.println("\nPlease select a valid entry (1-6,Q)");
        }
    }
    
    private void strengthHelp() {
        System.out.println("Strength measures the muscle and physical power of a character. "
                + "This ability is especially important for fighters, barbarians, paladins, "
                + "rangers, and monks because it helps them prevail in combat.");
    }

    private void constitutionHelp() {
        System.out.println("Constitution represents the health and stamina of a character. "
                + "High constitution increases the number of hit points a character has "
                + "(affecting how much damage they can take), and this makes it important "
                + "for everyone, but especially so for fighters. If constitution ever "
                + "increases, hit points increase retroactively as well. Spellcasters also "
                + "need strong constitution to keep their spells from being interrupted "
                + "during combat.");
    }

    private void wisdomHelp() {
        System.out.println("Wisdom describes a character's willpower, common sense, "
                + "\nperception, and intuition, whereas intelligence represents the "
                + "\nability to analyze information. An \"absent-minded professor\" has "
                + "\nlow wisdom and high intelligence. A simpleton with low intelligence "
                + "\nmight nevertheless be very perceptive (have high wisdom). Wisdom is "
                + "\nimportant for clerics and druids, affecting the strength and number of "
                + "\ntheir spells, and is also significant for paladins and rangers. It is "
                + "\nvery important for monks as well, modifying many of their abilities. "
                + "\nThe wise character is capable of intuitively understanding others, "
                + "\noccasionally having insights into their motivations.");
    }

    private void dexterityHelp() {
        System.out.println("Dexterity measures agility, reflexes, and balance. This ability "
                + "is most important for rogues, but also for characters who typically wear "
                + "light or medium armor (barbarians and rangers) or none at all (monks, "
                + "wizards, and sorcerers), or for any character who wants to be a skilled "
                + "archer.");
    }

    private void intelligenceHelp() {
        System.out.println("Intelligence determines how well a character learns and reasons. "
                + "Intelligence is important for wizards because it affects how many spells "
                + "they can cast, how hard their spells are to resist, and how powerful their "
                + "spells can be. It is also important for any character who wants to have a "
                + "strong assortment of skills; however increasing intelligence will not "
                + "grant bonus skill points retroactively.");
    }

    private void charismaHelp() {
        System.out.println("Charisma measures a character's force of personality, "
                + "persuasiveness, ability to lead, and physical attractiveness. It "
                + "represents actual personal strength, not merely how one is perceived by "
                + "others in a social setting. Charisma is most important for paladins, "
                + "sorcerers, and bards. It is also important for clerics, as it affects "
                + "their ability to turn undead. All characters benefit from having a high "
                + "charisma when speaking with others in the world. Charisma affects an "
                + "NPC's initial reaction to the player and it modifies the player's "
                + "persuasion skill checks.");
    }
}
