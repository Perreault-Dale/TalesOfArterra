package byui.cit260.talesofarterra.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

/**
 *
 * @author Dale
 */
public class Player implements Serializable {

    //private member variables
    private String name;
    private int bank;
    private Character playerChar;
    private ArrayList<Character> henchmen;

    //public getter and setter functions
    public Player() {
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBank() {
        return bank;
    }

    public void setBank(int bank) {
        this.bank = bank;
    }

    public Character getPlayerChar() {
        return playerChar;
    }

    public void setPlayerChar(Character playerChar) {
        this.playerChar = playerChar;
    }

    public ArrayList<Character> getHenchmen() {
        return henchmen;
    }

    public void setHenchmen(ArrayList<Character> henchmen) {
        this.henchmen = henchmen;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 41 * hash + Objects.hashCode(this.name);
        hash = 41 * hash + this.bank;
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
        final Player other = (Player) obj;
        if (this.bank != other.bank) {
            return false;
        }
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Player{" + "name=" + name + ", bank=" + bank + '}';
    }

}
