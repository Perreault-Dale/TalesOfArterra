/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.talesofarterra.model;

import java.io.Serializable;
import java.util.Objects;
import java.util.ArrayList;
import java.util.Arrays;
/**
 *
 * @author Dale
 */
public class Game implements Serializable {
    
    //private member variables
    private int time;
    private int days;
    private Map currentMap;
    private Location currentLocation;
    private Player player;
   /* author carlos Iteminventory item havintg a compile error with BagItem
    private BagItem[] bag;
    */
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

    public Map getCurrentMap() {
        return currentMap;
    }

    public void setCurrentMap(Map currentMap) {
        this.currentMap = currentMap;
    }

    public Location getCurrentLocation() {
        return currentLocation;
    }

    public void setCurrentLocation(Location currentLocation) {
        this.currentLocation = currentLocation;
    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    /*part of the inventory system
    public BagItem[] getBag() {
        return bag;
    }

    public void setBag(BagItem[] bag) {
        this.bag = bag;
    }
    */

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 41 * hash + this.time;
        hash = 41 * hash + this.days;
        hash = 41 * hash + Objects.hashCode(this.currentMap);
        hash = 41 * hash + Objects.hashCode(this.currentLocation);
        hash = 41 * hash + Objects.hashCode(this.player);
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
        if (!Objects.equals(this.player, other.player)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Game{" + "time=" + time + ", days=" + days + ", currentMap=" + currentMap + ", currentLocation=" + currentLocation + ", player=" + player + '}';
    }
}
