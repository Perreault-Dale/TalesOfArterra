package talesofarterra;

import java.io.Serializable;
import java.util.Arrays;

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

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 59 * hash + this.questID;
        hash = 59 * hash + (this.accepted ? 1 : 0);
        hash = 59 * hash + Arrays.hashCode(this.title);
        hash = 59 * hash + Arrays.hashCode(this.description);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Quest other = (Quest) obj;
        if (this.questID != other.questID) {
            return false;
        }
        if (this.accepted != other.accepted) {
            return false;
        }
        if (!Arrays.equals(this.title, other.title)) {
            return false;
        }
        if (!Arrays.equals(this.description, other.description)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Quest{" + "questID=" + questID + ", accepted=" + accepted + ", title=" + title + ", description=" + description + '}';
    }

}
