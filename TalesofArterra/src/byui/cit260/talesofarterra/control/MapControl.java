/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.talesofarterra.control;
import byui.cit260.talesofarterra.model.Location;
import byui.cit260.talesofarterra.model.Map;
/**
 *
 * @author Dale
 */
public class MapControl {
    
    public void drawMap(Map newMap)
    {
        //ASCII map
        System.out.println(newMap);
    }
    
    public Location[][] createMap(Map currentMap) {
        
        // get the map's dimensions
        int rows = currentMap.getSize()[0];
        int cols = currentMap.getSize()[1];
        
        //create a two-dimensional array of the Locations on the map
        Location[][] locs = new Location[rows][cols];
        for (Location loc : Location.values()) {
            if (loc.getMapID() == currentMap.getMapID()) {
                int r = loc.getCoordinates()[1];
                int c = loc.getCoordinates()[0];
                locs[r][c] = loc;
            }
        }
        return locs;
    }
}
