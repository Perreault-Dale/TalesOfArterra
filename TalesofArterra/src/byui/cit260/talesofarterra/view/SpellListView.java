/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.talesofarterra.view;

import byui.cit260.talesofarterra.control.SpellControl;
import byui.cit260.talesofarterra.exceptions.SpellControlException;
import byui.cit260.talesofarterra.model.Spell;
import byui.cit260.talesofarterra.model.Character;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import talesofarterra.TalesofArterra;

/**
 *
 * @author Dale
 */
public class SpellListView extends View {

    public SpellListView() {
        super("\n*****************************************************************"
          + "\n*                      Spell Lists                              *"
          + "\n*===============================================================*"
          + "\n*     KEY TO PRESS                           ACTION             *"
          + "\n*---------------------------------------------------------------*"
          + "\n*       \"A\"................................All Spells         *"
          + "\n*       \"S\"................................Spells By Type     *"
          + "\n*       \"T\"................................Test Invalid Input *"
          + "\n*       \"Q\"................................Go Back            *"
          + "\n*****************************************************************");
    }
    
    @Override
    public boolean doAction(String value) {
        boolean done = false;
        value = value.toUpperCase();
        switch(value) {
            case "A":
                done = this.allSpells();
                break;
            case "S":
                done = this.spellsByType();
                break;
            case "T":
                done = this.badSpells();
                break;
            case "Q":
                return true;
            default: 
                this.console.println( "ERROR: That is not a valid choice!" );
        }
        return done;
    }

    private boolean allSpells() {
        SpellControl instance = new SpellControl();
        ArrayList<Spell> spellList = new ArrayList<>();
        
        try {
            spellList = instance.spellList(TalesofArterra.getPlayer().getPlayerChar());
        } catch(SpellControlException sce) {
            ErrorView.display(this.getClass().getName(), "Error reading input: " + sce.getMessage());
        }
        
        for (Spell spell : spellList) {
            this.console.println(spellList.indexOf(spell) + " - " + spell.name() + " - " + spell.getLevel());
        }
        return true;
    }

    private boolean spellsByType() {
        String menu = "\n*****************************************************************"
          + "\n*                   Spells By Type                              *"
          + "\n*===============================================================*"
          + "\n*     KEY TO PRESS                           ACTION             *"
          + "\n*---------------------------------------------------------------*"
          + "\n*       \"1\"................................Fire               *"
          + "\n*       \"2\"................................Cold               *"
          + "\n*       \"3\"................................Electrical         *"
          + "\n*       \"4\"................................Acid               *"
          + "\n*       \"5\"................................Magical            *"
          + "\n*       \"6\"................................Negative           *"
          + "\n*       \"Q\"................................Quit Menu          *"
          + "\n*****************************************************************";
            String value = "";
            String type = "";
            
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
                    type = "Fire";
                    break;
                case "2":
                    type = "Cold";
                    break;
                case "3":
                    type = "Electrical";
                    break;
                case "4":
                    type = "Acid";
                    break;
                case "5":
                    type = "Magical";
                    break;
                case "6":
                    type = "Negative";
                    break;
                case "Q": {
                    return true;
                }
                default:
                    this.console.println("\nPlease select a valid entry (1-6,Q)");
            }
        SpellControl instance = new SpellControl();
        ArrayList<Spell> spellList = new ArrayList<>();
        
        try {
            spellList = instance.sortByType(TalesofArterra.getPlayer().getPlayerChar(),type);
        } catch(SpellControlException sce) {
            ErrorView.display(this.getClass().getName(), "Error reading input: " + sce.getMessage());
        }
        
        for (Spell spell : spellList) {
            this.console.println(spellList.indexOf(spell) + " - " + spell.name() + " - " + spell.getLevel());
        }
        return true;
    }

    private boolean badSpells() {
        SpellControl instance = new SpellControl();
        ArrayList<Spell> spellList = new ArrayList<>();
        Character badChar = new Character();
        badChar.setLevel(0);
        
        try {
            spellList = instance.spellList(badChar);
        } catch(SpellControlException sce) {
            ErrorView.display(this.getClass().getName(), "Error reading input: " + sce.getMessage());
        }
        
        for (Spell spell : spellList) {
            this.console.println(spellList.indexOf(spell) + " - " + spell.name() + " - " + spell.getLevel());
        }
        
        try {
            instance.calcDamage(badChar, Spell.Fireball);
        } catch(SpellControlException ex) {
            ErrorView.display(this.getClass().getName(), "Error reading input: " + ex.getMessage());
        }
        
        int[] abilities = new int[] { 8,12,8,12,14,18 };
        badChar.setAbilities(abilities);
        try {
            instance.calcDamage(badChar, Spell.Fireball);
        } catch(SpellControlException ex) {
            ErrorView.display(this.getClass().getName(), "Error reading input: " + ex.getMessage());
        }
        
        return true;
    }
}
