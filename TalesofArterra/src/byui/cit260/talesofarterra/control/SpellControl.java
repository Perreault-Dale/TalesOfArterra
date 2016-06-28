/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.talesofarterra.control;

import byui.cit260.talesofarterra.model.Character;
import byui.cit260.talesofarterra.model.Spell;
import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author Dale
 */
public class SpellControl {
    public int calcDamage(Character char1, Spell spell) {
        Random r = new Random();
        int [] ability = char1.getAbilities();
        if (ability[5] < 10 || char1.getLevel() < 1) {
            return -1;
        }
        else {
            int intMod = (ability[5] - 10) / 2;
            float dice = (float) (r.nextFloat() * (float)spell.getDamagePerLevel() + (float)intMod + 1.0);
            float dice2 = (float) (r.nextFloat() * (float)spell.getBaseDamage());
            return (int) (dice * char1.getLevel() + dice2);
        }
    }
    
    public ArrayList<Spell> spellList(Character char1) {
        ArrayList<Spell> listSpells = new ArrayList<>();
        for (Spell spell : Spell.values()) {
            if (spell.getLevel() == 1 && char1.getLevel() < 9) {
                listSpells.add(spell);
            }
            else if (char1.getLevel() / 2 >= spell.getLevel())
                listSpells.add(spell);
        }
        return listSpells;
    }
    
    public ArrayList<Spell> sortByType(String type) {
        ArrayList<Spell> spellType = new ArrayList<>();
        for (Spell spell : Spell.values()) {
            if (spell.getDamageType().equals(type)) {
                spellType.add(spell);
            }
        }
        for (int i = 0; i < spellType.size() - 1; i++)
        {
            int index = i;
            for (int j = i + 1; j < spellType.size(); j++)
                if (spellType.get(j).getLevel() > spellType.get(index).getLevel())
                    index = j;
      
            Spell largerLevel = spellType.get(index); 
            spellType.set(index, spellType.get(i));
            spellType.set(i, largerLevel);
        }
        return spellType;
    }
}