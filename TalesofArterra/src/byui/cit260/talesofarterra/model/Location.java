package byui.cit260.talesofarterra.model;

import java.io.Serializable;
import java.util.Arrays;

/**
 *
 * @author Dale
 */
public enum Location implements Serializable {
    
    //list of Locations
    OutsideStart(0,1,2,1,false,"Starting Location"),
    OutsideNorthGate(0,2,2,4,false,"North Gate to Edinburg"),
    CityCenterNorthGate(1,1,4,1,false,"Inside North Gate to Edinburg"),
    CityCenterBedimes(1,2,5,2,false,"A noble couple and their servant"),
    CityCenterEastGate(1,3,9,4,false,"Gate to Slums"), 
    CityCenterSouthGate(1,4,7,9,false,"Gate to Merchant District"),
    CityCenterWestGate(1,5,0,7,false,"Gate to Government District"),
    CityCenterStore(1,6,2,3,false,"Samuel's Smith & Sundries"),
    CityCenterPub(1,7,4,4,false,"Lazy Lion Pub");

    //private member variables
    private final int mapID;
    private final int locationID;
    private final int[] coordinates;
    private final boolean blocked;
    private final String description;

    //public getter and setter functions
    private Location(int mapID, int locationID, int row, int column, boolean blocked, String description) {
        this.mapID = mapID;
        this.locationID = locationID;
        int [] coord = new int[] {row,column};
        this.coordinates = coord;
        this.blocked = blocked;
        this.description = description;
    }

    public int getMapID() {
        return mapID;
    }

    public int getLocationID() {
        return locationID;
    }

    public int[] getCoordinates() {
        return coordinates;
    }

    public boolean isBlocked() {
        return blocked;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return "Location{" + "mapID=" + mapID + ", coordinates=" + Arrays.toString(coordinates) + ", blocked=" + blocked + ", description=" + description + '}';
    }

}
