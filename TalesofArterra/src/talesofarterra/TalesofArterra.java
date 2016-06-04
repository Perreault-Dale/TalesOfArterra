/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package talesofarterra;

import byui.cit260.talesofarterra.model.Game;
import byui.cit260.talesofarterra.model.Player;
//import byui.cit260.talesofarterra.view.StartMenuView;
import byui.cit260.talesofarterra.view.Welcome;


import java.util.Scanner;

/**
 *
 * @author Dale
 */
public class TalesofArterra {

    private static Game currentGame = null;
    private static Player player = null;
    
    
    public static void main(String[] args) {
        /*StartMenuView startMenuView = new StartMenuView();
        startMenuView.displayMenuView();
        */
        
        Scanner input = new Scanner(System.in);
                
		Welcome welcomeObject = new Welcome();
		//User input
                welcomeObject.displayBanner();
		System.out.println("By what name shall thy glory be remembered?: ");
		//temp value from user
		String tempName = input.nextLine();
		//sends the temp name to welcome class 
		welcomeObject.setPlayerName(tempName);
		//gets the output from welcome class with the inputed name.
		welcomeObject.display();
                System.out.println();
        
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
