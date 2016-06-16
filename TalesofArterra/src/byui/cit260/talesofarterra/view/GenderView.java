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
public class GenderView extends View {

    public GenderView() {
        super("\nSelect a gender for your human character:"
                + "\n\nM – Male"
                + "\nF – Female\n");
    }
    
    @Override
    public boolean doAction(String choice) {
        
        choice = choice.toUpperCase();
        CharacterControl charCtl = new CharacterControl();
        Character playerChar = null;
        playerChar = charCtl.loadCharacter("playerChar.ser");
        
        switch (choice) {
            case "M":
            case "F":
                charCtl.inputGender(playerChar,choice.charAt(0));
                return charCtl.saveCharacter(playerChar,"playerChar.ser");
            default:
                System.out.println("\n*** Invalid selection *** Try again");
                break;
        }
        return false;
    }
}
