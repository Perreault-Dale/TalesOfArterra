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
    public boolean doAction(String charName) {
        Character playerChar = CharacterControl.createPlayer(charName);
        if (playerChar == null) {
            System.out.println("\nError: Failed to create the character.");
            return false;
        }
        saveCharacter(playerChar);
        return true;
    }

    private void saveCharacter(Character playerChar) {
        String characterFileName = "playerChar.ser";
        FileOutputStream fileOutputStream = null;
        ObjectOutputStream objectOutputStream = null;
        
        try
        {
            fileOutputStream = new FileOutputStream(characterFileName);
            objectOutputStream = new ObjectOutputStream(fileOutputStream);
            //The object is being persisted here
            objectOutputStream.writeObject(playerChar);
            objectOutputStream.close();
            System.out.println("Object serialized in file : " + characterFileName);
        }
        catch(IOException ioe)
        {
            //Close all I/O streams
            ioe.printStackTrace();
            //Handle the exception here
        }
    }
        
}
