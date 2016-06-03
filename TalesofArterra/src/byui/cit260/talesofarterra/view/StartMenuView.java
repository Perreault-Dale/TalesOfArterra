/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.talesofarterra.view;

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
          + "\n****************************************************************";
        );
    }
    
}
