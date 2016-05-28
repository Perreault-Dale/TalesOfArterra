/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.talesofarterra.control;

import byui.cit260.talesofarterra.model.Quest;

/**
 *
 * @author Dale Perreault
 */
public class QuestControl {
    
    public void acceptQuest(Quest quest) {
        quest.setAccepted(true);
    }
    
    public void completeQuest(Quest quest) {
        quest.setComplete(true);
    }
    
    public void setInfo(Quest quest, int id, String title, String description) {
        quest.setQuestID(id);
        quest.setTitle(title);
        quest.setDescription(description);
    }
    
    public void updateDescription(Quest quest, String update) {
        quest.setDescription(quest.getDescription() + "\n" + update);
    }
}