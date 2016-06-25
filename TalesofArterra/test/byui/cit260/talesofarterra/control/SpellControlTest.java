/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.talesofarterra.control;

import byui.cit260.talesofarterra.model.Character;
import byui.cit260.talesofarterra.model.Spell;
import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Dale
 */
public class SpellControlTest {
    
    public SpellControlTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of calcDamage method, of class SpellControl.
     */
    @Test
    public void testCalcDamage() {
        System.out.println("calcDamage\n");
        
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
        
        Spell fireBall = Spell.MagicMissile;
                
        SpellControl instance = new SpellControl();
        int lowResult = 4 * playerChar.getLevel() + 1;
        int highResult = (3 + fireBall.getDamagePerLevel()) * playerChar.getLevel() + fireBall.getBaseDamage();
        int result = instance.calcDamage(playerChar, fireBall);
        System.out.println(lowResult + " < " + result + " < " + highResult);
        assertEquals(true, (result > lowResult && result < highResult));
        // TODO review the generated test code and remove the default call to fail.
        // fail("The test case is a prototype.");
    }

    /**
     * Test of spellList method, of class SpellControl.
     */
    @Test
    public void testSpellList() {
        System.out.println("spellList\n");
        
        Character playerChar = new Character();
        int abilities[] = new int[] { 8, 12, 10, 8, 12, 17 };
        playerChar.setAbilities(abilities);
        int alignment[] = new int[] { 85, 50 };
        playerChar.setAlignment(alignment);
        playerChar.setArmorClass(10);
        playerChar.setBaseAttack(4);
        playerChar.setExperience(6800);
        playerChar.setGender('m');
        playerChar.setHitPoints(49);
        boolean feats[] = new boolean[] { true, true, false, false, true, false, false, true, true };
        playerChar.setFeats(feats);
        playerChar.setLevel(4);
        playerChar.setMaxHP(63);
        playerChar.setName("David Bowie");
        int skills[] = new int[] { 12, 12, 12, 12, 0, 0 };
        playerChar.setSkills(skills);
        boolean weapons[] = new boolean[] { true, true, false, false, true, false, false, true, true };
        playerChar.setUseWeapons(weapons);
        
        Spell fireBall = Spell.Fireball;
                
        SpellControl instance = new SpellControl();
        ArrayList<Spell> spellList = new ArrayList<>();
        spellList = instance.spellList(playerChar);
        assertNotNull(spellList);
        for (Spell spell : spellList) {
            System.out.println(spellList.indexOf(spell) + " - " + spell.name() + " - " + spell.getLevel());
        }
    }
}
