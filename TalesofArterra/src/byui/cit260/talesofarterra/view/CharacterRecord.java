/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.talesofarterra.view;

import byui.cit260.talesofarterra.control.CharacterControl;
import byui.cit260.talesofarterra.exceptions.CharacterControlException;
import byui.cit260.talesofarterra.model.Character;
import byui.cit260.talesofarterra.model.Item;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import talesofarterra.TalesofArterra;

/**
 *
 * @author Dale
 */
class CharacterRecord extends View {

    public CharacterRecord() {
        super("\n*****************************************************************"
          + "\n*                   Character Record                            *"
          + "\n*===============================================================*"
          + "\n*     KEY TO PRESS                           ACTION             *"
          + "\n*---------------------------------------------------------------*"
          + "\n*       \"1\"................................Player Character   *"
          + "\n*       \"2\"................................Henchman 1         *"
          + "\n*       \"3\"................................Henchman 2         *"
          + "\n*       \"4\"................................Henchman 3         *"
          + "\n*       \"P\"................................Print Player Sheet *"
          + "\n*       \"Q\"................................Quit Game          *"
          + "\n*****************************************************************");
    }
    
    @Override
    public boolean doAction(String value) {
        boolean done = false;
        value = value.toUpperCase();
        switch(value) {
            case "1":
                done = drawCharSheet("playerChar.ser");
                break;
            case "2":
                done = drawCharSheet("char_evanine.ser");
                break;
            case "3":
                done = drawCharSheet("char_montador.ser");
                break;
            case "4":
                done = drawCharSheet("char_persey.ser");
                break;
            case "P":
                done = printCharSheet();
            case "Q":
                return true;
            default:
                this.console.println( "ERROR: That is not a valid choice!" );
                return false;
        }
        return done;
    }

    private boolean drawCharSheet(String fileName) {
        CharacterControl cc = new CharacterControl();
        Character char1 = null;
        try {
            char1 = cc.loadCharacter(fileName);
        } catch (CharacterControlException ex) {
            this.console.println("Error reading input: " + ex.getMessage());
        }
        if (char1 == null) {
            this.console.println("ERROR: File not found.");
            return false;
        }
        int [] able = char1.getAbilities();
        int [] align = char1.getAlignment();
        int [] skill = char1.getSkills();
        boolean [] feat = char1.getFeats();
        String feats = checkFeats(feat);
        boolean [] weapons = char1.getUseWeapons();
        String availWeapon = checkWeapons(weapons);
        
        Item armor = char1.getArmor();
        Item gloves = char1.getGloves();
        Item shield = char1.getShield();
        Item shoes = char1.getShoes();
        Item weapon = char1.getWeapon();
                
        this.console.println(
            "\n*******************************************************"
          + "\n*              Character Record                       *"
          + "\n*=====================================================*"
          + "\n* Name:                  " + char1.getName()
          + "\n* Gender:                " + char1.getGender()
          + "\n* Class:                 " + char1.getCharClass()
          + "\n* Alignment:             " + setAlignment(align)
          + "\n* Level:                 " + char1.getLevel()
          + "\n* Experience:            " + char1.getExperience()
          + "\n* Hit Points:            " + char1.getHitPoints() + " / " + char1.getMaxHP()
          + "\n* Armor Class:           " + cc.calcArmorClass(char1)
          + "\n* Max Physical Damage:   " + cc.calcMaxDamage(char1)
          + "\n* Spell Slots:           " + cc.calcSpellSlots(char1)
        + "\n\n* Character Abilities:   "
          + "\n* Strength:              " + able[0]
          + "\n* Constitution:          " + able[1]
          + "\n* Wisdom:                " + able[2]
          + "\n* Dexterity:             " + able[3]
          + "\n* Intelligence:          " + able[4]
          + "\n* Charisma:              " + able[5]
        + "\n\n* Character Skills:      "
          + "\n* Concentration:         " + skill[0]
          + "\n* Lore:                  " + skill[1]
          + "\n* Sneak:                 " + skill[2]
          + "\n* Detect:                " + skill[3]
          + "\n* Persuade:              " + skill[4]
          + "\n* Heal:                  " + skill[5]
        + "\n\n* Feats:                 "
          + "\n*                        " + feats
        + "\n\n* Weapons Available:     "
          + "\n*                        " + availWeapon
          + "\n*******************************************************");
        
        return true;
    }

    private String checkFeats(boolean[] feat) {
        String feats = "";
        String [] featNames = { "Combat Casting","Great Fortitude","Improved Initiative",
        "Iron Will","Lightning Reflexes","Spell Focus","Spell Penetration","Stealthy",
        "Toughness" };
        
        for (int i = 0; i < 9; i++) {
            if (feat[i])
                feats = feats + featNames[i] + ",";
        }
        if (feats != null)
            return feats.substring(0, feats.length()-1);
        else
            return "";
    }

    private String checkWeapons(boolean[] weapons) {
        String availWeapon = "";
        String [] weaponNames = { "Longsword","Shortsword","Axe",
        "Mace","Dagger","Staff","Bow","Crossbow","Sling" };
        
        for (int i = 0; i < 9; i++) {
            if (weapons[i])
                availWeapon = availWeapon + weaponNames[i] + ",";
        }
        if (availWeapon != null)
            return availWeapon.substring(0, availWeapon.length()-1);
        else
            return "";
    }

    private String setAlignment(int[] align) {
        String alignment = "";
        if (align[1] < 30)
            alignment = "Chaotic ";
        else if (align[1] > 70)
            alignment = "Lawful ";
        else
            alignment = "Neutral ";
        
        if (align[0] < 30)
            alignment += "Evil";
        else if (align[0] > 70)
            alignment += "Good";
        else
            alignment += "Neutral";
        
        if (alignment.equals("Neutral Neutral"))
            alignment = "True Neutral";
        
        return alignment;
    }

    private boolean printCharSheet() {
        PrintWriter charSheet = null;
        CharacterControl cc = new CharacterControl();
        boolean done = false;
        this.console.println("Enter the location for the character sheet.");
        String fileName = this.getInput();
        try {
            charSheet = new PrintWriter(fileName);
        } catch (FileNotFoundException ex) {
            ErrorView.display(this.getClass().getName(),ex.getMessage());
        }
        Character char1 = TalesofArterra.getGame().getPlayer().getPlayerChar();
        int [] able = char1.getAbilities();
        int [] align = char1.getAlignment();
        int [] skill = char1.getSkills();
        boolean [] feat = char1.getFeats();
        String feats = checkFeats(feat);
        boolean [] weapons = char1.getUseWeapons();
        String availWeapon = checkWeapons(weapons);
        
        Item armor = char1.getArmor();
        Item gloves = char1.getGloves();
        Item shield = char1.getShield();
        Item shoes = char1.getShoes();
        Item weapon = char1.getWeapon();
                
        charSheet.println(
            "\r\n*******************************************************"
          + "\r\n*              Character Record                       *"
          + "\r\n*=====================================================*"
          + "\r\n* Name:                  " + char1.getName()
          + "\r\n* Gender:                " + char1.getGender()
          + "\r\n* Class:                 " + char1.getCharClass()
          + "\r\n* Alignment:             " + setAlignment(align)
          + "\r\n* Level:                 " + char1.getLevel()
          + "\r\n* Experience:            " + char1.getExperience()
          + "\r\n* Hit Points:            " + char1.getHitPoints() + " / " + char1.getMaxHP()
          + "\r\n* Armor Class:           " + cc.calcArmorClass(char1)
          + "\r\n* Max Physical Damage:   " + cc.calcMaxDamage(char1)
          + "\r\n* Spell Slots:           " + cc.calcSpellSlots(char1)
        + "\r\n\r\n* Character Abilities:   "
          + "\r\n* Strength:              " + able[0]
          + "\r\n* Constitution:          " + able[1]
          + "\r\n* Wisdom:                " + able[2]
          + "\r\n* Dexterity:             " + able[3]
          + "\r\n* Intelligence:          " + able[4]
          + "\r\n* Charisma:              " + able[5]
        + "\r\n\r\n* Character Skills:      "
          + "\r\n* Concentration:         " + skill[0]
          + "\r\n* Lore:                  " + skill[1]
          + "\r\n* Sneak:                 " + skill[2]
          + "\r\n* Detect:                " + skill[3]
          + "\r\n* Persuade:              " + skill[4]
          + "\r\n* Heal:                  " + skill[5]
        + "\r\n\r\n* Feats:                 "
          + "\r\n*                        " + feats
        + "\r\n\r\n* Weapons Available:     "
          + "\r\n*                        " + availWeapon
          + "\r\n*******************************************************");
        
        charSheet.close();
        return done;
    }
    
}
