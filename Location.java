package talesofarterra;

import java.io.Serializable;

/**
 *
 * @author Dale
 */
public class Location implements Serializable {

    //private member variables
    private int locationID;
    private int mapID;
    private int[] coordinates;
    private boolean isWaypoint;
    private boolean visitted;
    private boolean blocked;
    private char[] description;

    //public getter and setter functions
    public Location{} {
    }

    public int getLocationID() {
        return locationID;
    }

    public void setLocationID(int locationID) {
        this.locationID = locationID;
    }

    public int getMapID() {
        return mapID;
    }

    public void setMapID(int mapID) {
        this.mapID = mapID;
    }

    public int[] getCoordinates() {
        return coordinates;
    }

    public void setCoordinates(int[] coordinates) {
        this.coordinates = coordinates;
    }

    public boolean isIsWaypoint() {
        return isWaypoint;
    }

    public void setIsWaypoint(boolean isWaypoint) {
        this.isWaypoint = isWaypoint;
    }

    public boolean isVisitted() {
        return visitted;
    }

    public void setVisitted(boolean visitted) {
        this.visitted = visitted;
    }

    public boolean isBlocked() {
        return blocked;
    }

    public void setBlocked(boolean blocked) {
        this.blocked = blocked;
    }

    public char[] getDescription() {
        return description;
    }

    public void setDescription(char[] description) {
        this.description = description;
    }

}
