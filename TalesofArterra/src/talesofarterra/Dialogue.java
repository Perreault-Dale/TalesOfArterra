package talesofarterra;

import java.io.Serializable;
import java.util.Arrays;

/**
 *
 * @author Dale
 */
public class Dialogue implements Serializable {

    //private member variables
    private int dialogueID;
    private int lineID;
    private char[] speaker;
    private char[] dialogue;

    //public getter and setter functions
    public Dialogue{} {
    }

    public int getDialogueID() {
        return dialogueID;
    }

    public void setDialogueID(int dialogueID) {
        this.dialogueID = dialogueID;
    }

    public int getLineID() {
        return lineID;
    }

    public void setLineID(int lineID) {
        this.lineID = lineID;
    }

    public char[] getSpeaker() {
        return speaker;
    }

    public void setSpeaker(char[] speaker) {
        this.speaker = speaker;
    }

    public char[] getDialogue() {
        return dialogue;
    }

    public void setDialogue(char[] dialogue) {
        this.dialogue = dialogue;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 89 * hash + this.dialogueID;
        hash = 89 * hash + this.lineID;
        hash = 89 * hash + Arrays.hashCode(this.speaker);
        hash = 89 * hash + Arrays.hashCode(this.dialogue);
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
        final Dialogue other = (Dialogue) obj;
        if (this.dialogueID != other.dialogueID) {
            return false;
        }
        if (this.lineID != other.lineID) {
            return false;
        }
        if (!Arrays.equals(this.speaker, other.speaker)) {
            return false;
        }
        if (!Arrays.equals(this.dialogue, other.dialogue)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Dialogue{" + "dialogueID=" + dialogueID + ", lineID=" + lineID + ", speaker=" + speaker + ", dialogue=" + dialogue + '}';
    }

}
