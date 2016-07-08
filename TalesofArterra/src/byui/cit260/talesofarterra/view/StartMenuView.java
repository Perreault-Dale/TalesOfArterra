/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.talesofarterra.view;

import byui.cit260.talesofarterra.control.PlayerControl;
import byui.cit260.talesofarterra.exceptions.PlayerControlException;
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
          + "\n* Your character will be a sorcerer, so those bloodthirsty     *"
          + "\n* souls may be disappointed, but don't be dissuaded. You will  *"
          + "\n* have opportunities to gain experience without going on       *"
          + "\n* boring rat-killing quests. Hint: Go everyplace you can, and  *"
          + "\n* talk to everyone. You may even find people who will come with*"
          + "\n* you on further quests.                                       *"
          + "\n*                                                              *"
          + "\n****************************************************************"
          + "\n\nPlease enter your name:\n");
    }

    @Override
    public boolean doAction(String playerName) {
        PlayerControl pc = new PlayerControl();
        Player player = new Player();
        try {
            player = PlayerControl.createPlayer(playerName);
        } catch(PlayerControlException pce) {
            ErrorView.display(this.getClass().getName(), "Error reading input: " + pce.getMessage());
            return false;
        }
        this.displayNextView(player);
        return true;
    }

    private void displayNextView(Player player) {
        this.console.println("\n****************************************************************"
                +          "\n* Welcome to the game, " + player.getName()
                +          "\n* We hope you enjoy playing!"
                +          "\n****************************************************************"
        );
        
        MainMenuView mainMenuView = new MainMenuView();
        mainMenuView.display();
    }
    
}
