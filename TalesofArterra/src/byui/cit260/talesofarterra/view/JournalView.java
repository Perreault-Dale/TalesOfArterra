/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.talesofarterra.view;

import byui.cit260.talesofarterra.control.QuestControl;
import byui.cit260.talesofarterra.model.Quest;
import java.util.ArrayList;
import talesofarterra.TalesofArterra;

/**
 *
 * @author Dale
 */
public class JournalView extends View {

    public JournalView() {
        super("\n*****************************************************************"
          + "\n*                      Journal View                             *"
          + "\n*===============================================================*"
          + "\n*     KEY TO PRESS                           ACTION             *"
          + "\n*---------------------------------------------------------------*"
          + "\n*       \"A\"................................Active             *"
          + "\n*       \"C\"................................Completed          *"
          + "\n*       \"Q\"................................Go Back            *"
          + "\n*****************************************************************");
    }
    
    @Override
    public boolean doAction(String value) {
        boolean done = false;
        value = value.toUpperCase();
        switch(value) {
            case "A":
                done = this.activeQuests();
                break;
            case "S":
                done = this.completeQuests();
                break;
            case "Q":
                return true;
            default: 
                System.out.println( "ERROR: That is not a valid choice!" );
        }
        return done;
    }

    private boolean activeQuests() {
        QuestControl qc = new QuestControl();
        ArrayList<Quest> questList = new ArrayList<>();
        for (Quest quest : TalesofArterra.getGame().getJournal()) {
            if (quest.isAccepted() && !quest.isComplete()) {
                questList.add(quest);
            }
        }
        
        for (Quest quest : questList) {
            System.out.println("\n" + quest.getTitle());
            System.out.println(quest.getDescription() + "\n");
        }
        return true;
    }

    private boolean completeQuests() {
        QuestControl qc = new QuestControl();
        ArrayList<Quest> questList = new ArrayList<>();
        for (Quest quest : TalesofArterra.getGame().getJournal()) {
            if (quest.isAccepted() && quest.isComplete()) {
                questList.add(quest);
            }
        }
        
        for (Quest quest : questList) {
            System.out.println("\n" + quest.getTitle());
            System.out.println(quest.getDescription() + "\n");
        }
        return true;
    }
    
}
