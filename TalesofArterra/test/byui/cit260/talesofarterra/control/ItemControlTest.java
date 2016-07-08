/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.talesofarterra.control;

import byui.cit260.talesofarterra.exceptions.ItemControlException;
import byui.cit260.talesofarterra.model.Character;
import byui.cit260.talesofarterra.model.Item;
import byui.cit260.talesofarterra.view.ErrorView;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Dale
 */
public class ItemControlTest {
    
    public ItemControlTest() {
    }

    /**
     * Test of calcLore method, of class ItemControl.
     */
    @Test
    public void testCalcLore() {
        System.out.println("calcLore");
        Character playerChar = new Character();
        
        int abilities[] = new int[] { 8, 12, 10, 8, 12, 17 };
        playerChar.setAbilities(abilities);
        int alignment[] = new int[] { 85, 50 };
        playerChar.setAlignment(alignment);
        playerChar.setArmorClass(10);
        playerChar.setBaseAttack(4);
        playerChar.setExperience(36500);
        playerChar.setGender('m');
        playerChar.setHitPoints(49);
        boolean feats[] = new boolean[] { true, true, false, false, true, false, false, true, true };
        playerChar.setFeats(feats);
        playerChar.setLevel(5);
        playerChar.setMaxHP(63);
        playerChar.setName("David Bowie");
        int skills[] = new int[] { 12, 12, 12, 12, 0, 0, 0, 0, 0 };
        playerChar.setSkills(skills);
        boolean weapons[] = new boolean[] { true, true, false, false, true, false, false, true, true };
        playerChar.setUseWeapons(weapons);
        
        ItemControl instance = new ItemControl();
        
        int lowResult = skills[3] + 1 + (abilities[4] - 10) / 2;
        int highResult = skills[3] + 20 + (abilities[4] - 10) / 2;
        int result;
        try {
            result = instance.calcLore(playerChar);
            assertEquals(true, (result > lowResult && result < highResult));
        } catch (ItemControlException ex) {
            ErrorView.display(this.getClass().getName(), "Error reading input: " + ex.getMessage());
        }
        // TODO review the generated test code and remove the default call to fail.
        // fail("The test case is a prototype.");
    }

    /**
     * Test of calcIdentified method, of class ItemControl.
     */
    @Test
    public void testCalcIdentified() {
        System.out.println("calcIdentified");
        Item broadsword = new Item();
                
        broadsword.setItemType(1);
        broadsword.setCost(7500);
        broadsword.setDescription("It's a really big sword, yet it feels very light to the touch.");
        broadsword.setLoreCount(25);
        broadsword.setIsIdentified(false);
        
        int lore = 30;
        ItemControl instance = new ItemControl();
        instance.calcIdentified(broadsword, lore);
        // TODO review the generated test code and remove the default call to fail.
        // fail("The test case is a prototype.");
    }

    /**
     * Test of calcEquipped method, of class ItemControl.
     */
    @Test
    public void testCalcEquipped() {
        System.out.println("calcEquipped");
        Item broadsword = new Item();
                
        broadsword.setItemType(1);
        broadsword.setCost(7500);
        broadsword.setDescription("It's a really big sword, yet it feels very light to the touch.");
        broadsword.setLoreCount(25);
        broadsword.setIsIdentified(false);
        
        ItemControl instance = new ItemControl();
        instance.calcEquipped(broadsword);
        // TODO review the generated test code and remove the default call to fail.
        // fail("The test case is a prototype.");
    }
    
}
