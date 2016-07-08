/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.talesofarterra.control;
import byui.cit260.talesofarterra.exceptions.MapControlException;
import byui.cit260.talesofarterra.model.Location;
import byui.cit260.talesofarterra.model.Map;
import java.util.ArrayList;
/**
 *
 * @author Dale
 */
public class MapControl {
    
    public Location[][] createMap(Map currentMap) throws MapControlException {
        
        // get the map's dimensions
        int rows = currentMap.getSize()[0];
        int cols = currentMap.getSize()[1];
        if (rows < 1 || cols < 1) {
            throw new MapControlException("Map " + currentMap.name() + " is smaller than 1x1. That will never do.");
        }
        
        //create a two-dimensional array of the Locations on the map
        Location[][] locs = new Location[rows][cols];
        ArrayList<Location> mapLocs = new ArrayList<>();
        
        for (Location loc : Location.values()) {
            if (loc.getMapID() == currentMap.getMapID()) {
                mapLocs.add(loc);
                int r = loc.getCoordinates()[1];
                int c = loc.getCoordinates()[0];
                locs[r][c] = loc;
            }
        }
        
        if (mapLocs.isEmpty()) {
            throw new MapControlException("Map " + currentMap.name() + " has no locations, and that's no fun at all.");
        }
        return locs;
    }
}
