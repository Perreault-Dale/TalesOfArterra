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
           + "\n*                WOULD YOU LIKE TO REST??                      *"
           + "\n****************************************************************"
           + "\n*   IT WILL TAKE UP 8 HOURS AND YOUR HEALTH WILL BE RESTORED   *"
           + "\n*       Select Y to proceed, Q to quit to the main menu.       *"
           + "\n****************************************************************");
            }

    @Override
    public boolean doAction(String value)
    {
         boolean exit = false;
        switch (value) {
            case "Y":
            case "y":    
                
                        Character fullHealCharacter = new Character();   

//Uncomment out this lines to test the health change                   
                        //System.out.println(fullHealCharacter.getHitPoints());   
                                                
                        //This sets the Characters HP to full HP
                        CharacterControl setFullHeal = new CharacterControl();
                        setFullHeal.healFull(fullHealCharacter);
                        
//Uncomment out this line to test the health change  
                        //System.out.println(fullHealCharacter.getHitPoints());

                         //This adds 8 hours to the game time 
                         Game game = new Game();
                         GameControl addHours = new GameControl();
                         addHours.advanceHours(game, 8);

                        exit = true;
                        break;
                       
                case "Q":
                case "q":     
                    exit = true;
                    break;
                default:
                    System.out.println("\nPlease select a valid entry (Y,Q)");
        }
        return exit;
      
    }
    
}

