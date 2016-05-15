package talesofarterra;

import java.io.Serializable;

/**
 *
 * @author Dale
 */
public class Scene implements Serializable {

    //private member variables
    private char[] description;
    private int numMonsters;
    private char[] bossName;

    //public getter and setter functions
    public Scene{} {
    }

    public char[] getDescription() {
        return description;
    }

    public void setDescription(char[] description) {
        this.description = description;
    }

    public int getNumMonsters() {
        return numMonsters;
    }

    public void setNumMonsters(int numMonsters) {
        this.numMonsters = numMonsters;
    }

    public char[] getBossName() {
        return bossName;
    }

    public void setBossName(char[] bossName) {
        this.bossName = bossName;
    }

}
