package byui.cit260.talesofarterra.model;

import java.io.Serializable;
import java.util.Arrays;

/**
 *
 * @author Dale
 */
public enum Location implements Serializable {
    
    //list of Locations
    OutsideStart(0,1,2,1,"Starting Location"),
    OutsideCityCenterGate(0,2,2,4,"North Gate to Edinburg"),
    CityCenterNorthGate(1,1,4,1,"Inside North Gate to Edinburg"),
    CityCenterBedimes(1,2,5,2,"A noble couple and their servant"),
    CityCenterSlumsGate(1,3,9,4,"Gate to Slums"), 
    CityCenterMerchantGate(1,4,7,9,"Gate to Merchant District"),
    CityCenterGovernmentGate(1,5,0,7,"Gate to Government District"),
    CityCenterSmithSundriesDoor(1,6,2,3,"Samuel's Smith & Sundries"),
    CityCenterLazyLionDoor(1,7,4,4,"Lazy Lion Pub"),
    LazyLionCityCenterDoor(2,1,0,0,"Entrance to Lazy Lion"),
    LazyLionLando(2,2,1,1,"Lando the Lion"),
    SmithSundriesCityCenterDoor(3,1,0,0,"Entrance to Smith's Sundries"),
    SmithSundriesSamuel(3,2,1,1,"Samuel Smith, shopkeeper/owner");

    //private member variables
    private final int mapID;
    private final int locationID;
    private final int[] coordinates;
    private final String description;

    //public getter and setter functions
    private Location(int mapID, int locationID, int row, int column, String description) {
        this.mapID = mapID;
        this.locationID = locationID;
        int [] coord = new int[] {row,column};
        this.coordinates = coord;
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

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return "Location{" + "mapID=" + mapID + ", coordinates=" + Arrays.toString(coordinates) + ", description=" + description + '}';
    }

}
