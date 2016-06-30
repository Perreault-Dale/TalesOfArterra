/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.talesofarterra.model;

import java.io.Serializable;
import java.util.Arrays;

/**
 *
 * @author Dale
 */
public enum Map implements Serializable {
    
    //list of Maps
    Outside(0,5,5,true,true),
    CityCenter(1,10,10,true,false),
    NonWorking(98,0,0,true,false),
    NoLocations(99,5,5,true,false);
    
    // private class variables
    private final int mapID;
    private final int[] size;
    private final boolean city;
    private final boolean explored;
    
    // public getter and setter functions
    private Map(int mapID, int rows, int columns, boolean city, boolean explored) {
        this.mapID = mapID;
        int [] squares = new int[] {rows,columns};
        this.size = squares;
        this.city = city;
        this.explored = explored;
    }
    
    public int getMapID() {
        return mapID;
    }

    public int[] getSize() {
        return size;
    }

    public boolean isCity() {
        return city;
    }

    public boolean isExplored() {
        return explored;
    }

    @Override
    public String toString() {
        return "Map{" + "mapID=" + mapID + ", size=" + Arrays.toString(size) + ", city=" + city + ", explored=" + explored + '}';
    }
}
