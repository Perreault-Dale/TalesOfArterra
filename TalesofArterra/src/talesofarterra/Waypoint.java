package talesofarterra;

import java.io.Serializable;

/**
 *
 * @author Dale
 */
public class Waypoint extends Location {

    //private member variables
    private int mapID;
    private int mapDestination;
    private int locationDestination;

    //public getter and setter functions
    public Waypoint{} {
    }

    public int getMapID() {
        return mapID;
    }

    public void setMapID(int mapID) {
        this.mapID = mapID;
    }

    public int getMapDestination() {
        return mapDestination;
    }

    public void setMapDestination(int mapDestination) {
        this.mapDestination = mapDestination;
    }

    public int getLocationDestination() {
        return locationDestination;
    }

    public void setLocationDestination(int locationDestination) {
        this.locationDestination = locationDestination;
    }

}
