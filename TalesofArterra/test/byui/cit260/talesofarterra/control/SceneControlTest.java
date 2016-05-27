/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.talesofarterra.control;

import byui.cit260.talesofarterra.model.Character;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Lucas
 */
public class SceneControlTest {
    
    public SceneControlTest() {
    }

    /**
     * Test of generateMonster method, of class SceneControl.
     */
    @Test
    public void testGenerateMonster() {
        System.out.println("generateMonster");
        Character monster = null;
        SceneControl instance = new SceneControl();
        boolean expResult = false;
        boolean result = instance.generateMonster(monster);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of generateBoss method, of class SceneControl.
     */
    @Test
    public void testGenerateBoss() {
        System.out.println("generateBoss");
        Character monster = new troll;
        SceneControl instance = new SceneControl();
        boolean expResult = false;
        boolean result = instance.generateBoss(monster);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
