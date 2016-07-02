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
import talesofarterra.TalesofArterra;
//import java.util.ArrayList;
//import java.util.Arrays;

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
    public static void createNewGame(Player player){
        Game game = new Game();
        
        CharacterControl cc = new CharacterControl();
        Character playerChar = cc.loadCharacter("playerChar.ser");
        player.setPlayerChar(playerChar);
        
        game.setPlayer(player);
        
        QuestControl qc = new QuestControl();
        game.setJournal(qc.loadQuests());
        
        Map map = Map.Outside;
        game.setCurrentMap(map);
        
        Location location = Location.OutsideStart;
        game.setCurrentLocation(location);
        
        TalesofArterra.setGame(game);
    }
    /* autho carlos part of inventory itlist
    public static BagItem[] createBagList () {
        //array for bag items
        BagItem[] bag = new BagItem[6];
        
        
        BagItem curePot = new BagItem();
        curePot.setDescription("Potion of Cure Wounds");
        curePot.setQuantityInstock(0);
        bag[Bitem.curePot.ordinal()] = curePot;
        
        BagItem lorePot = new BagItem();
        lorePot.setDescription("Potion of Lore");
        lorePot.setQuantityInstock(0);
        bag[Bitem.lorePot.ordinal()] = lorePot;
            
        BagItem healKit = new BagItem();
        healKit.setDescription("Healer’s Kit");
        healKit.setQuantityInstock(0);
        bag[Bitem.healKit.ordinal()] = healKit;
          
        BagItem mmWand = new BagItem();
        mmWand.setDescription("Wand of Magic Missile");
        mmWand.setQuantityInstock(0);
        bag[Bitem.mmWand.ordinal()] = mmWand;
          
        BagItem noIdWand = new BagItem();
        noIdWand.setDescription("wand "+"(unidentified)");
        noIdWand.setQuantityInstock(0);
        bag[Bitem.noIdWand.ordinal()] = noIdWand;
         
        BagItem noIdRing = new BagItem();
        noIdRing.setDescription("ring "+"(unidentified");
        noIdRing.setQuantityInstock(0);
        bag[Bitem.noIdRing.ordinal()] = noIdRing;
        
        return bag;
        
       
    }

      public enum Bitem {
        curePot,
        lorePot,
        healKit,
        mmWand,
        noIdWand,
        noIdRing;
    }
    */
}

