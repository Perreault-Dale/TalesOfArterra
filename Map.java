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
        
}
