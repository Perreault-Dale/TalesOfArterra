/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.talesofarterra.view;

import byui.cit260.talesofarterra.control.CharacterControl;
import byui.cit260.talesofarterra.model.Character;
import java.io.*;

/**
 *
 * @author Dale
 */
public class CharacterCreateView extends View {
    
    private final int abilityPoints;
    
    public CharacterCreateView() {
        super("\n****************************************************************"
          + "\n*                                                              *"
          + "\n* Character Creation Menu                                      *"
          + "\n*                                                              *"
          + "\n****************************************************************"
          + "\n\nPlease enter your character's name: \n");
        this.abilityPoints = 30;
    }

    @Override
    public boolean doAction(String value) {
        Character playerChar = CharacterControl.createPlayer(value);
        if (playerChar == null) {
            System.out.println("\nError: Failed to create the character.");
            return false;
        }
        CharacterControl cc = new CharacterControl();
        return cc.saveCharacter(playerChar,"playerChar.ser");
    } 
}
