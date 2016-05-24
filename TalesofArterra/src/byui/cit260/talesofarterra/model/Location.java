package byui.cit260.talesofarterra.model;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Objects;

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
    private String description;

    //public getter and setter functions
    public Location() {
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 43 * hash + this.locationID;
        hash = 43 * hash + this.mapID;
        hash = 43 * hash + Arrays.hashCode(this.coordinates);
        hash = 43 * hash + (this.isWaypoint ? 1 : 0);
        hash = 43 * hash + (this.visitted ? 1 : 0);
        hash = 43 * hash + (this.blocked ? 1 : 0);
        hash = 43 * hash + Objects.hashCode(this.description);
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
        final Location other = (Location) obj;
        if (this.locationID != other.locationID) {
            return false;
        }
        if (this.mapID != other.mapID) {
            return false;
        }
        if (this.isWaypoint != other.isWaypoint) {
            return false;
        }
        if (this.visitted != other.visitted) {
            return false;
        }
        if (this.blocked != other.blocked) {
            return false;
        }
        if (!Arrays.equals(this.coordinates, other.coordinates)) {
            return false;
        }
        if (!Objects.equals(this.description, other.description)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Location{" + "locationID=" + locationID + ", mapID=" + mapID + ", coordinates=" + coordinates + ", isWaypoint=" + isWaypoint + ", visitted=" + visitted + ", blocked=" + blocked + ", description=" + description + '}';
    }

}
