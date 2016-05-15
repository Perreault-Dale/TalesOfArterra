/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package talesofarterra;

import java.io.Serializable;

/**
 *
 * @author Dale
 */
public class Game implements Serializable {
    
    //private member variables
    private int time;
    private int days;
    
    //public getter and setter functions
    public Game() {
    }
    
    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public int getDays() {
        return days;
    }

    public void setDays(int days) {
        this.days = days;
    }
    
    
}
