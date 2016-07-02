/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.talesofarterra.control;

import byui.cit260.talesofarterra.exceptions.PlayerControlException;
import byui.cit260.talesofarterra.model.Item;
import byui.cit260.talesofarterra.model.Player;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Dale
 */
public class PlayerControlTest {
    
    public PlayerControlTest() {
    }

    /**
     * Test of inputName method, of class PlayerControl.
     */
    @Test
    public void testInputName() {
        System.out.println("inputName");
        Player player = new Player();
        String name = "Alien";
        PlayerControl instance = new PlayerControl();
        PlayerControl.inputName(player, name);
        assertEquals(player.getName(),name);
        // TODO review the generated test code and remove the default call to fail.
        // fail("The test case is a prototype.");
    }

    /**
     * Test of calcBank method, of class PlayerControl.
     */
    @Test
    public void testCalcBank() {
        System.out.println("calcBank");
        Player pc = new Player();
        pc.setBank(100);
        Item item = new Item();
        item.setCost(60);
        char code = 's';
        PlayerControl instance = new PlayerControl();
        try {
            instance.calcBank(pc, item, code);
        } catch (PlayerControlException ex) {
            System.out.println(ex.getMessage());
        }
        assertEquals(pc.getBank(),160);
        code = 'p';
        try {
            instance.calcBank(pc, item, code);
        } catch (PlayerControlException ex) {
            System.out.println(ex.getMessage());
        }
        assertEquals(pc.getBank(),100);
    }
    
}
