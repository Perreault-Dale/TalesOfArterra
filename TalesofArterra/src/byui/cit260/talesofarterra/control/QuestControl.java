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
    
    public void updateDescription(Quest quest, String update) {
        quest.setDescription(quest.getDescription() + "\n" + update);
    }
    
    public Quest[] loadQuests() {
        Quest[] journal = new Quest[25];
        int index = 0;
        for (int i = 0; i < journal.length; i++) {
            journal[i] = new Quest();
        }
        
        String title = "Leaving Home";
        String description = "You grew up as an orphan on a farm raised by your loving stepparents, Tobias and Margo. Your stepmother passed away years ago. Your stepfather died when he torched your home to save you from a werewolf only days ago. Cast out into the world, you travel to the city of Edinburg. ";
        journal[index].setTitle(title);
        journal[index].setDescription(description);
        index++;
        
        title = "Getting a Job";
        description = "Now that you have arrived in Edinburg, you need to find work. Ask around, I'm sure someone's hiring.";
        journal[index].setTitle(title);
        journal[index].setDescription(description);
        index++;
        
        title = "To Tell The Truth";
        description = "You witness an incident between a child and a wealthy noble. Winifred Bedime thinks the child, named Raffie, has stolen her gold ring. The guard wants your opinion on what happened.";
        journal[index].setTitle(title);
        journal[index].setDescription(description);
        index++;
        
        title = "Tales of Rising Evil";
        description = "You hear rumors from the people of rising evil in Edinburg.";
        journal[index].setTitle(title);
        journal[index].setDescription(description);
        index++;
        
        title = "The Golden Goblet";
        description = "Ameril asks you to steal a golden goblet from the Goldberg estate in the Noble's District. This is your first test toward becoming a member of the Bloody Daggers.";
        journal[index].setTitle(title);
        journal[index].setDescription(description);
        index++;
        
        title = "Get Kyra's Report";
        description = "Ameril sends you to the Deep Slums. His operative Kyra is collecting intelligence on the Shadow Weavers there.";
        journal[index].setTitle(title);
        journal[index].setDescription(description);
        index++;
        
        title = "Ceremony at the Temple";
        description = "Ameril asks you to accompany him to the Temple of Numminen to witness the ceremony of the one-year anniversary of the death of Safana Moonbow.";
        journal[index].setTitle(title);
        journal[index].setDescription(description);
        index++;
        
        title = "Patrol the Noble's District";
        description = "Captain Thorin asks you to patrol the Noble's District during th evening hours. There have been reports of thieves entering homes.";
        journal[index].setTitle(title);
        journal[index].setDescription(description);
        index++;
        
        title = "Fight at the Belching Boar";
        description = "Captain Thorin asks you to investigate a fight between a guard, Braden, and a beggar named Jake at the Belching Boar pub in the Slums.";
        journal[index].setTitle(title);
        journal[index].setDescription(description);
        index++;
        
        title = "Ceremony at the Temple";
        description = "Captain Thorin asks you to accompany him to the Temple of Numminen to witness the ceremony of the one-year anniversary of the death of Safana Moonbow.";
        journal[index].setTitle(title);
        journal[index].setDescription(description);
        index++;
        
        return journal;
    }
    
}