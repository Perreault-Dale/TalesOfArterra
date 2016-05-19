package talesofarterra;

import java.io.Serializable;

/**
 *
 * @author Dale
 */
public class Player implements Serializable {

    //private member variables
    private char[] name;
    private int bank;

    //public getter and setter functions
    public Player() {
    }
    
    public char[] getName() {
        return name;
    }

    public void setName(char[] name) {
        this.name = name;
    }

    public int getBank() {
        return bank;
    }

    public void setBank(int bank) {
        this.bank = bank;
    }

}
