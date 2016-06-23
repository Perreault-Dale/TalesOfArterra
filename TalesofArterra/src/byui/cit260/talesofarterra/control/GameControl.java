/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.talesofarterra.control;

import byui.cit260.talesofarterra.model.Game;
import byui.cit260.talesofarterra.model.Location;
import byui.cit260.talesofarterra.model.Map;
import byui.cit260.talesofarterra.model.Player;
import talesofarterra.TalesofArterra;

/**
 *
 * @author Dale
 */
public class GameControl {
    public void advanceHours (Game game, int hours) {
        game.setTime(game.getTime() + hours);
        if (game.getTime() > 23) {
            game.setTime(game.getTime() - 24);
            game.setDays(game.getDays() + 1);
        }
    }
    /**
     *
     * @param player
     */
   public void createNewGame(Player player){
    //public static void createNewGame(){ will change once create new game is built
        Game game = new Game();
        game.setPlayer(player);
        
        Map map = Map.Outside;
        game.setCurrentMap(map);
        
        Location location = Location.OutsideStart;
        game.setCurrentLocation(location);
        
        TalesofArterra.setGame(game);
    }
}

