/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.talesofarterra.view;

//import java.util.Scanner;
import byui.cit260.talesofarterra.model.Character;
import byui.cit260.talesofarterra.control.CharacterControl;
import byui.cit260.talesofarterra.model.Game;
import byui.cit260.talesofarterra.control.GameControl;
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
        //This sets the Characters HP to full HP
        Character fullHealCharacter = new Character();
        CharacterControl setFullHeal = new CharacterControl();
        setFullHeal.healFull(fullHealCharacter);
         
         //This adds 8 hours to the game time 
         Game game = new Game();
         GameControl addHours = new GameControl();
         addHours.advanceHours(game, 8);
  
         return true;
    }
    
}

