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
    public Waypoint() {
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

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 89 * hash + this.mapID;
        hash = 89 * hash + this.mapDestination;
        hash = 89 * hash + this.locationDestination;
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
        final Waypoint other = (Waypoint) obj;
        if (this.mapID != other.mapID) {
            return false;
        }
        if (this.mapDestination != other.mapDestination) {
            return false;
        }
        if (this.locationDestination != other.locationDestination) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Waypoint{" + "mapID=" + mapID + ", mapDestination=" + mapDestination + ", locationDestination=" + locationDestination + '}';
    }

}
