/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.talesofarterra.control;

import byui.cit260.talesofarterra.model.Character;
import byui.cit260.talesofarterra.model.Spell;
import java.util.Random;

/**
 *
 * @author Dale
 */
public class SpellControl {
    public int calcDamage(Character char1, Spell spell) {
        Random r = new Random();
        int [] ability = char1.getAbilities();
        int intMod = (ability[5] - 10) / 2;
        float dice = (float) (r.nextFloat() * (float)spell.getDamagePerLevel() + (float)intMod + 1.0);
        return (int) (dice * char1.getLevel() + spell.getBaseDamage());
    }
}
