/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.talesofarterra.view;

//import java.util.Scanner;
import byui.cit260.talesofarterra.model.Character;
import byui.cit260.talesofarterra.control.CharacterControl;
/**
 *
 * @author Lucas
 */
public class RestView extends View {
             

    public RestView() {
       super("\n****************************************************************"
           + "\n*                       REST MENU                              *"
           + "\n   YOU ARE FULLY HEALED AND HEALTHY! HOPE TO SEE YOU AGAIN!    *"
           + "\n****************************************************************");
            }

 @Override
    public boolean doAction(String value)
    {
        Character fullHealCharacter = new Character();
        CharacterControl setFullHeal = new CharacterControl();
        setFullHeal.healFull(fullHealCharacter);
         //maxHPChar = true;
         
         return true;
    }
    
}

