/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.talesofarterra.model;

import java.io.Serializable;

/**
 *
 * @author Dale
 */
public class Game implements Serializable {
    
    //private member variables
    private int time;
    private int days;
    private int currentMap;
    private int currentLocation;
    
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

    public int getCurrentMap() {
        return currentMap;
    }

    public void setCurrentMap(int currentMap) {
        this.currentMap = currentMap;
    }

    public int getCurrentLocation() {
        return currentLocation;
    }

    public void setCurrentLocation(int currentLocation) {
        this.currentLocation = currentLocation;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 11 * hash + this.time;
        hash = 11 * hash + this.days;
        hash = 11 * hash + this.currentMap;
        hash = 11 * hash + this.currentLocation;
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
        final Game other = (Game) obj;
        if (this.time != other.time) {
            return false;
        }
        if (this.days != other.days) {
            return false;
        }
        if (this.currentMap != other.currentMap) {
            return false;
        }
        if (this.currentLocation != other.currentLocation) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Game{" + "time=" + time + ", days=" + days + '}';
    }
    
}
