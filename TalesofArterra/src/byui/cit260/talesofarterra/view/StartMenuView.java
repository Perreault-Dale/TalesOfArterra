/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.talesofarterra.view;

import byui.cit260.talesofarterra.control.PlayerControl;
import byui.cit260.talesofarterra.model.Player;
import java.util.Scanner;

/**
 *
 * @author Dale
 */
public class StartMenuView {

    private final String promptMessage;

    public StartMenuView() {
        this.displayBanner();
        this.promptMessage = "\nPlease enter your name: ";
    }

    private void displayBanner() {
        System.out.println(
            "\n****************************************************************"
          + "\n*                                                              *"
          + "\n* Welcome to Tales of Arterra! In this game, loosely based on  *"
          + "\n* Dungeons and Dragons, you will play the role of a farm boy   *"
          + "\n* whose life has been turned upside-down by tragedy. With the  *"
          + "\n* magic he learned on the farm, and a bit of money, he starts  *"
          + "\n* a new life in the city of Edinburg, which is dealing with    *"
          + "\n* tragedies of its own.                                        *"
          + "\n*                                                              *"
          + "\n****************************************************************"
        );
    }

    public void displayMenuView() {
        boolean done = false;
        do {
            String playerName = this.getPlayerName();
            if (playerName.toUpperCase().equals("Q")) {
                return;
            }
            done = this.doAction(playerName);
        }
        while(!done);
    }

    private String getPlayerName() {
        Scanner keyboard = new Scanner(System.in);
        String value = "";
        boolean valid = false;
        
        while(!valid) {
            System.out.println(this.promptMessage);
            
            value = keyboard.nextLine();
            value = value.trim();
            
            if (value.length() < 1) {
                System.out.println("Sorry, your name cannot be blank.");
                continue;
            }
            
            break;
        }
        return value;
    }

    private boolean doAction(String playerName) {
        Player player = PlayerControl.createPlayer(playerName);
        if (player == null) {
            System.out.println("\nError: Failed to create the player.");
            return false;
        }
        
        this.displayNextView(player);
        
        return true;
    }

    private void displayNextView(Player player) {
        System.out.println("\n****************************************************************"
                +          "\n* Welcome to the game, " + player.getName()
                +          "\n* We hope you enjoy playing!"
                +          "\n****************************************************************"
        );
        
        MainMenuView mainMenuView = new MainMenuView();
        mainMenuView.displayMainMenuView();
    }
    
}
