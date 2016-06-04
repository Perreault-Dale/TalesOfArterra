/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package talesofarterra;

import byui.cit260.talesofarterra.model.Game;
import byui.cit260.talesofarterra.model.Player;
import byui.cit260.talesofarterra.view.StartMenuView;


import java.util.Scanner;

/**
 *
 * @author Dale
 */
public class TalesofArterra {

    private static Game currentGame = null;
    private static Player player = null;
    
    
    public static void main(String[] args) {
        StartMenuView startMenuView = new StartMenuView();
        startMenuView.displayMenuView();
    }
    
    
    public static Game getCurrentGame() {
        return currentGame;
    }

    public static void setCurrentGame(Game currentGame) {
        TalesofArterra.currentGame = currentGame;
    }

    public static Player getPlayer() {
        return player;
    }

    public static void setPlayer(Player player) {
        TalesofArterra.player = player;
    }
    
}
