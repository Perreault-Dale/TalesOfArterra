/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.talesofarterra.control;

import byui.cit260.talesofarterra.model.Quest;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Dale
 */
public class QuestControlTest {
    
    public QuestControlTest() {
    }

    /**
     * Test of acceptQuest method, of class QuestControl.
     */
    @Test
    public void testAcceptQuest() {
        System.out.println("acceptQuest");
        Quest quest = new Quest();
        QuestControl instance = new QuestControl();
        instance.acceptQuest(quest);
        assertEquals(true,quest.isAccepted());
        // TODO review the generated test code and remove the default call to fail.
        // fail("The test case is a prototype.");
    }

    /**
     * Test of completeQuest method, of class QuestControl.
     */
    @Test
    public void testCompleteQuest() {
        System.out.println("completeQuest");
        Quest quest = new Quest();
        QuestControl instance = new QuestControl();
        instance.completeQuest(quest);
        assertEquals(true,quest.isComplete());
        // TODO review the generated test code and remove the default call to fail.
        // fail("The test case is a prototype.");
    }

    /**
     * Test of setInfo method, of class QuestControl.
     */
    @Test
    public void testSetInfo() {
        System.out.println("setInfo");
        Quest quest = new Quest();
        int id = 1;
        String title = "Steal Ring";
        String description = "Steal the gold ring from the Bedime estate.";
        QuestControl instance = new QuestControl();
        instance.setInfo(quest, id, title, description);
        assertEquals(id,quest.getQuestID());
        assertEquals(title,quest.getTitle());
        assertEquals(description,quest.getDescription());
        // TODO review the generated test code and remove the default call to fail.
        // fail("The test case is a prototype.");
    }

    /**
     * Test of updateDescription method, of class QuestControl.
     */
    @Test
    public void testUpdateDescription() {
        System.out.println("updateDescription");
        Quest quest = new Quest();
        quest.setDescription("Steal the gold ring from the Bedime estate.");
        String update = "You completed the quest successfully.";
        QuestControl instance = new QuestControl();
        instance.updateDescription(quest, update);
        assertEquals("Steal the gold ring from the Bedime estate.\nYou completed the quest successfully.",quest.getDescription());
        // TODO review the generated test code and remove the default call to fail.
        // fail("The test case is a prototype.");
    }
    
}
