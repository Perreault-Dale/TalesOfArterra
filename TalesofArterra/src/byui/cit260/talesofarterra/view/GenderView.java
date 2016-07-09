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
public class GenderView extends View {

    public GenderView() {
        super("\nSelect a gender for your human character:"
                + "\n\nM – Male"
                + "\nF – Female\n");
    }
    
    @Override
    public boolean doAction(String choice) {
        boolean done = false;
        choice = choice.toUpperCase();
        CharacterControl charCtl = new CharacterControl();
        Character playerChar = null;
        try {
            playerChar = charCtl.loadCharacter("playerChar.ser");
        } catch (CharacterControlException ex) {
            ErrorView.display(this.getClass().getName(), "Error reading input: " + ex.getMessage());
        }
        
        switch (choice) {
            case "M":
            case "F":
                charCtl.inputGender(playerChar,choice.charAt(0));
                try {
                    done = charCtl.saveCharacter(playerChar,"playerChar.ser");
                } catch (CharacterControlException ex) {
                    ErrorView.display(this.getClass().getName(), "Error reading input: " + ex.getMessage());
                }
                break;
            default:
                this.console.println("\n*** You entered " + choice + ". Invalid selection *** Try again");
                break;
        }
        return done;
    }
}
