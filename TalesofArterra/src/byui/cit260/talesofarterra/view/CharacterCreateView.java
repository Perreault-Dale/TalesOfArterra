/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.talesofarterra.view;

import byui.cit260.talesofarterra.control.CharacterControl;
import byui.cit260.talesofarterra.exceptions.CharacterControlException;
import byui.cit260.talesofarterra.model.Character;
import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;

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
        Character playerChar = null;
        boolean done = false;
        try {
            playerChar = CharacterControl.createPlayer(value);
        } catch(CharacterControlException cce) {
            this.console.println(cce.getMessage());
            return false;
        }
        CharacterControl cc = new CharacterControl();
        try {
            done =  cc.saveCharacter(playerChar,"playerChar.ser");
        } catch (CharacterControlException ex) {
            ErrorView.display(this.getClass().getName(), "Error reading input: " + ex.getMessage());
        }
        return done;
    } 
}
