package talesofarterra;

import java.io.Serializable;

/**
 *
 * @author Dale
 */
public class Quest implements Serializable {

    //private member variables
    private int questID;
    private boolean accepted;
    private char[] title;
    private char[] description;

    //public getter and setter functions
    public Quest() {
    }
    
    public int getQuestID() {
        return questID;
    }

    public void setQuestID(int questID) {
        this.questID = questID;
    }

    public boolean isAccepted() {
        return accepted;
    }

    public void setAccepted(boolean accepted) {
        this.accepted = accepted;
    }

    public char[] getTitle() {
        return title;
    }

    public void setTitle(char[] title) {
        this.title = title;
    }

    public char[] getDescription() {
        return description;
    }

    public void setDescription(char[] description) {
        this.description = description;
    }

}
