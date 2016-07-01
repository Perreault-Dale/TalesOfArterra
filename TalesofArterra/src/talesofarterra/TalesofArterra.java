/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package talesofarterra;

import byui.cit260.talesofarterra.model.Game;
import byui.cit260.talesofarterra.model.Player;
import byui.cit260.talesofarterra.view.StartMenuView;

/**
 *
 * @author Dale
 */
public class TalesofArterra {
    
    private static Game game = null;
    private static Player player = null;

    public static void main(String[] args) {
        StartMenuView startItUp = new StartMenuView();
       try {
        
            startItUp.display();
       } catch (Throwable te) {
           System.out.println(te.getMessage());
           te.printStackTrace();
           startItUp.display();
        
       }
    }

    public static Game getGame() {
        return game;
    }

    public static void setGame(Game game) {
        TalesofArterra.game = game;
    }

    public static Player getPlayer() {
        return player;
    }

    public static void setPlayer(Player player) {
        TalesofArterra.player = player;
    }
}
