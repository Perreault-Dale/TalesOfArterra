/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.talesofarterra.view;

import java.util.Scanner;
import byui.cit260.talesofarterra.model.Character;
import byui.cit260.talesofarterra.control.CharacterControl;
/**
 *
 * @author Lucas
 */
public class FeatsMenuView {
    private final Character char1;
             

    public FeatsMenuView(Character char1) {
        this.displayMenu();
        int feature = this.menuChoice();
        this.char1 = char1;
        this.enableFeats(feature);
    }
    
    public void enableFeats(int feature){
        CharacterControl charControl = new CharacterControl();
        charControl.enableFeats(char1, feature);
    }
    
    
    public void displayMenu()
    {
        System.out.println(
            "\n****************************************************************"
          + "\n*                      FEATS MENU                              *"
          + "\n*       Select the new feat your character will learn:         *"         
          + "\n*==============================================================*"
          + "\n*     KEY TO PRESS                           FEAT              *"
          + "\n*--------------------------------------------------------------*"
          + "\n*       \"1\"............................COMBAT CASTING        *"
          + "\n*       \"2\"............................GREAT FORTITUDE       *"
          + "\n*       \"3\"............................IMPROVED INITIATIVE   *"
          + "\n*       \"4\"............................IRON WILL             *"
          + "\n*       \"5\"............................LIGHTNING REFLEXES    *"
          + "\n*       \"6\"............................SPELL FOCUS           *"
          + "\n*       \"7\"............................SPELL PENETRATION     *"
          + "\n*       \"8\"............................STEALTHY              *"
          + "\n*       \"9\"............................TOUGHNESS             *"
          + "\n*                                                              *"
          + "\n*       \"H\"............................HELP                  *"                    
          + "\n****************************************************************");
    }

    public int menuChoice()
    {
        displayMenu();
        char choice;
        int feature = 0;
        boolean valid = false;
        do
        {
           System.out.print( "Please enter an option: " );
           Scanner reader = new Scanner(System.in);
           choice = reader.next(".").charAt(0);
         
           switch(choice)
           {
            case '1':
            case '2':
            case '3':
            case '4':
            case '5':
            case '6':
            case '7':
            case '8':
            case '9': feature = java.lang.Character.getNumericValue(choice) - 1;
                      valid = true;
                          break;
            case 'H':
            case 'h': featsHelp();
                          break;                          
            default: System.out.println( "ERROR: That is not a valid choice!" );
            }
           }
           while (!valid);
        
        return feature;

    }
    public void featsHelp()
    {
        System.out.println("\n*** createNewGame stub function called ***");
    }
}

