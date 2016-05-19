/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package talesofarterra;

import java.io.Serializable;
import java.util.Arrays;

/**
 *
 * @author Dale
 */
public class Map implements Serializable {
    
    // private class variables
    private int mapID;
    private int[] size;
    private boolean city;
    private boolean explored;
    
    // public getter and setter functions
    public Map() {
    }
    
    public int getMapID() {
        return mapID;
    }

    public void setMapID(int mapID) {
        this.mapID = mapID;
    }

    public int[] getSize() {
        return size;
    }

    public void setSize(int[] size) {
        this.size = size;
    }

    public boolean isCity() {
        return city;
    }

    public void setCity(boolean city) {
        this.city = city;
    }

    public boolean isExplored() {
        return explored;
    }

    public void setExplored(boolean explored) {
        this.explored = explored;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 23 * hash + this.mapID;
        hash = 23 * hash + Arrays.hashCode(this.size);
        hash = 23 * hash + (this.city ? 1 : 0);
        hash = 23 * hash + (this.explored ? 1 : 0);
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
        final Map other = (Map) obj;
        if (this.mapID != other.mapID) {
            return false;
        }
        if (this.city != other.city) {
            return false;
        }
        if (this.explored != other.explored) {
            return false;
        }
        if (!Arrays.equals(this.size, other.size)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Map{" + "mapID=" + mapID + ", size=" + size + ", city=" + city + ", explored=" + explored + '}';
    }
        
}
