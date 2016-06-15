/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.talesofarterra.view;

import byui.cit260.talesofarterra.control.PlayerControl;
import byui.cit260.talesofarterra.model.Player;

/**
 *
 * @author Dale
 */
public class StartMenuView extends View {

    public StartMenuView() {
        super("\n****************************************************************"
          + "\n*                                                              *"
          + "\n* Welcome to Tales of Arterra! In this game, loosely based on  *"
          + "\n* Dungeons and Dragons, you will play the role of a farm boy   *"
          + "\n* whose life has been turned upside-down by tragedy. With the  *"
          + "\n* magic he learned on the farm, and a bit of money, he starts  *"
          + "\n* a new life in the city of Edinburg, which is dealing with    *"
          + "\n* tragedies of its own.                                        *"
          + "\n*                                                              *"
          + "\n****************************************************************"
          + "\n\nPlease enter your name:\n");
    }

    @Override
    public boolean doAction(String playerName) {
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
        mainMenuView.display();
    }
    
}
