/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.talesofarterra.control;

import byui.cit260.talesofarterra.model.Character;
import byui.cit260.talesofarterra.model.Item;
import java.util.Random;


/**
 *
 * @author Dale
 */
public class ItemControl {
    public int calcLore(Character char1) {
        Random r = new Random();
        int d20 = r.nextInt(20) + 1;
        int [] ability = char1.getAbilities();
        int intMod = (ability[4] - 10) / 2;
        int [] skill = char1.getSkills();
        return skill[3] + intMod + d20;
    }
    
    public void calcIdentified(Item item, int lore) {
        if (lore < item.getLoreCount()) {
            item.setIsIdentified(false);
            return;
        }
        item.setIsIdentified(true);
    }
}
