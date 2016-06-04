/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.talesofarterra.view;
import java.util.Scanner;
//import java.io.*;
/**
 *
 * @author Lucas
 */
public class HelpMenuView {
    
    public void displayMenu()
    {
        System.out.println(
            "\n****************************************************************"
          + "\n*                      HELP MENU                               *"
          + "\n*==============================================================*"
          + "\n*     KEY TO PRESS                           ACTION            *"
          + "\n*--------------------------------------------------------------*"
          + "\n*       \"O\"..................................OBJECTIVE       *"
          + "\n*       \"M\"..................................MOVEMENT        *"
          + "\n*       \"H\"..................................HENCHMEN        *"
          + "\n*       \"R\"..................................RESTING/HEALING *"
          + "\n*       \"B\"..................................BACK TO GAME    *"
          + "\n****************************************************************");
    }

    public void menuChoice()
    {
        displayMenu();
        char choice;
        do
        {
           System.out.print( "Please enter an option: " );
           Scanner reader = new Scanner(System.in);
           choice = reader.next(".").charAt(0);

           switch(choice)
           {
            case 'O':
            case 'o': objective();
                      break;
            case 'M':
            case 'm': movement();
                      break;
            case 'H':
            case 'h': henchmen();
                          break;
            case 'R':
            case 'r': resting();
                          break;
            case 'B':
            case'b': resumeGame();
                          break;
            default: System.out.println( "ERROR: That is not a valid choice!" );
            }
           }
           while (choice != 'o' || choice != 'O' 
                   || choice != 'm' || choice != 'M'
                   || choice != 'h' || choice != 'H'
                   || choice != 'r' || choice != 'R'
                   || choice != 'b' || choice != 'B');

    }

    private void objective() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void movement() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void henchmen() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void resting() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void resumeGame() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
 
