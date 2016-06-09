/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package talesofarterra;

import byui.cit260.talesofarterra.model.Character;
import byui.cit260.talesofarterra.view.StartMenuView;

/**
 *
 * @author Dale
 */
public class TalesofArterra {

    private static Character playerChar = null;
    
    
    public static void main(String[] args) {
        StartMenuView startItUp = new StartMenuView();
        startItUp.displayMenuView();
        
    }

    public static Character getPlayerChar() {
        return playerChar;
    }

    public static void setPlayerChar(Character playerChar) {
        TalesofArterra.playerChar = playerChar;
    }
    
    
    
}
