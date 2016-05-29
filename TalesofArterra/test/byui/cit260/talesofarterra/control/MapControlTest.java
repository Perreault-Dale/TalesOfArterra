/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.talesofarterra.control;

import byui.cit260.talesofarterra.model.Map;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Lucas
 */
public class MapControlTest {
    
    public MapControlTest() {
    }

    /**
     * Test of drawMap method, of class MapControl.
     */
    @Test
    public void testDrawMap() {
        System.out.println("drawMap");
        Map newMap = null;
        MapControl instance = new MapControl();
        instance.drawMap(newMap);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
