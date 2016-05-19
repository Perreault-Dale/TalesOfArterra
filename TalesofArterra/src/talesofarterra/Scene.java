package talesofarterra;

import java.io.Serializable;
import java.util.Arrays;

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

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 59 * hash + Arrays.hashCode(this.description);
        hash = 59 * hash + this.numMonsters;
        hash = 59 * hash + Arrays.hashCode(this.bossName);
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
        final Scene other = (Scene) obj;
        if (this.numMonsters != other.numMonsters) {
            return false;
        }
        if (!Arrays.equals(this.description, other.description)) {
            return false;
        }
        if (!Arrays.equals(this.bossName, other.bossName)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Scene{" + "description=" + description + ", numMonsters=" + numMonsters + ", bossName=" + bossName + '}';
    }

}
