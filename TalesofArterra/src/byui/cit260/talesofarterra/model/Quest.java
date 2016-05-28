package byui.cit260.talesofarterra.model;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Objects;

/**
 *
 * @author Dale
 */
public class Quest implements Serializable {

    //private member variables
    private int questID;
    private boolean accepted;
    private boolean complete;
    private String title;
    private String description;

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

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isComplete() {
        return complete;
    }

    public void setComplete(boolean complete) {
        this.complete = complete;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 79 * hash + this.questID;
        hash = 79 * hash + (this.accepted ? 1 : 0);
        hash = 79 * hash + (this.complete ? 1 : 0);
        hash = 79 * hash + Objects.hashCode(this.title);
        hash = 79 * hash + Objects.hashCode(this.description);
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
        if (this.complete != other.complete) {
            return false;
        }
        if (!Objects.equals(this.title, other.title)) {
            return false;
        }
        if (!Objects.equals(this.description, other.description)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Quest{" + "questID=" + questID + ", accepted=" + accepted + ", complete=" + complete + ", title=" + title + ", description=" + description + '}';
    }

}
