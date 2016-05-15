package talesofarterra;

import java.io.Serializable;

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

}
