/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.talesofarterra.control;

import byui.cit260.talesofarterra.model.Game;
import byui.cit260.talesofarterra.model.Location;

/**
 *
 * @author Dale
 */
public class GameControl {
    public void restHours (Game game) {
        game.setTime(game.getTime() + 8);
        if (game.getTime() > 23) {
            game.setTime(game.getTime() - 24);
            game.setDays(game.getDays() + 1);
        }
    }
    public void changeLocation(Game game, Location location) {
        game.setCurrentMap(location.getMapID());
        game.setCurrentLocation(location.getLocationID());
    }
}
