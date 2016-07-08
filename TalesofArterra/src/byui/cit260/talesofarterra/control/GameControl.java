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
import byui.cit260.talesofarterra.model.Character;
import byui.cit260.talesofarterra.view.ErrorView;
import java.io.FileNotFoundException;
import java.io.IOException;
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
     * @throws java.io.IOException
     * @throws java.io.FileNotFoundException
     * @throws java.lang.ClassNotFoundException
     */
    public static void createNewGame(Player player) throws IOException, FileNotFoundException, ClassNotFoundException{
        Game game = new Game();
        ErrorView ev = new ErrorView();
        CharacterControl cc = new CharacterControl();
        Character playerChar;
        playerChar = cc.loadCharacter("playerChar.ser");
        player.setPlayerChar(playerChar);
        
        game.setPlayer(player);
        
        QuestControl qc = new QuestControl();
        game.setJournal(qc.loadQuests());
        game.getJournal()[0].setAccepted(true);
        
        Map map = Map.Outside;
        game.setCurrentMap(map);
        
        Location location = Location.OutsideStart;
        game.setCurrentLocation(location);
        
        TalesofArterra.setGame(game);
    }
}