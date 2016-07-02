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
    
    public void setInfo(Quest quest, String title, String description) {
        quest.setTitle(title);
        quest.setDescription(description);
    }
    
    public void updateDescription(Quest quest, String update) {
        quest.setDescription(quest.getDescription() + "\n" + update);
    }
    
    public Quest[] loadQuests() {
        Quest[] journal = null;
        int index = 0;
        
        String title = "Getting a Job";
        String description = "Now that you have arrived in Edinburg, you need to find work. Ask around, I'm sure someone's hiring.";
        setInfo(journal[index],title,description);
        index++;
        
        title = "To Tell The Truth";
        description = "You witness an incident between a child and a wealthy noble. Winifred Bedime thinks the child, named Raffie, has stolen her gold ring. The guard wants your opinion on what happened.";
        setInfo(journal[index],title,description);
        index++;
        
        title = "Tales of Rising Evil";
        description = "You hear rumors from the people of rising evil in Edinburg.";
        setInfo(journal[index],title,description);
        index++;
        
        title = "The Golden Goblet";
        description = "Ameril asks you to steal a golden goblet from the Goldberg estate in the Noble's District. This is your first test toward becoming a member of the Bloody Daggers.";
        setInfo(journal[index],title,description);
        index++;
        
        title = "Get Kyra's Report";
        description = "Ameril sends you to the Deep Slums. His operative Kyra is collecting intelligence on the Shadow Weavers there.";
        setInfo(journal[index],title,description);
        index++;
        
        title = "Ceremony at the Temple";
        description = "Ameril asks you to accompany him to the Temple of Numminen to witness the ceremony of the one-year anniversary of the death of Safana Moonbow.";
        setInfo(journal[index],title,description);
        index++;
        
        title = "Patrol the Noble's District";
        description = "Captain Thorin asks you to patrol the Noble's District during th evening hours. There have been reports of thieves entering homes.";
        setInfo(journal[index],title,description);
        index++;
        
        title = "Fight at the Belching Boar";
        description = "Captain Thorin asks you to investigate a fight between a guard, Braden, and a beggar named Jake at the Belching Boar pub in the Slums.";
        setInfo(journal[index],title,description);
        index++;
        
        title = "Ceremony at the Temple";
        description = "Ameril asks you to accompany him to the Temple of Numminen to witness the ceremony of the one-year anniversary of the death of Safana Moonbow.";
        setInfo(journal[index],title,description);
        index++;
        
        return journal;
    }
    
}