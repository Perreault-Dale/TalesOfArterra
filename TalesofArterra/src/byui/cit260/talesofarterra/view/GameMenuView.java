/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.talesofarterra.view;
import java.util.Scanner;
/**
 *
 * @author Portal
 */
public class GameMenuView {

    void displayMenu() {
    {
        System.out.println(
            "\n*****************************************************************"
          + "\n*                      GAME MENU                                *"
          + "\n*===============================================================*");
        System.out.println("MAP");
        
        System.out.println(
            "\n*     KEY TO PRESS                           ACTION             *"
          + "\n*---------------------------------------------------------------*"
          + "\n*       \"X\"..................................EXPLORE          *"
          + "\n*       \"R\"..................................REST             *"
          + "\n*       \"T\"..................................TALK TO          *"
          + "\n*       \"B\"..................................LIST BAG CONTENTS*"
          + "\n*       \"W\"..................................LIST WEAPONS     *"
          + "\n*       \"C\"..................................CHECK HENCHMEN   *"
          + "\n*       \"#\"..................................GO TO: LOCATION  *"
          + "\n*       \"J\"..................................DISPLAY JOURNAL  *"
          + "\n*       \"S\"..................................SAVE GAME        *"
          + "\n*       \"Q\"..................................QUIT GAME        *"
          + "\n*                                                               *"
          + "\n*       \"H\"..................................HELP             *"                    
          + "\n*****************************************************************");
    }
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
            case 'X':
            case 'x': explore();
                      break;
            case 'R':
            case 'r': rest();
                      break;
            case 'T':
            case 't': talkto();
                          break;
            case 'B':
            case 'b': bagContent();
                          break;
            case 'W':
            case 'w': listWeapons();
                          break;                          
            case 'C':
            case 'c': checkHenchmen();
                          break;
            case '#': goTo();
                      break;
            case 'J':
            case 'j': displayJournal();
                      break;
            case 'S':
            case 's': saveGame();
                          break;
            case 'Q':
            case 'q': quitGame();
                          break;
            case 'H':
            case 'h': displayHelp();
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

    private void explore() {
        System.out.println("\n*** createNewGame stub function called ***");
    }

    private void rest() {
        System.out.println("\n*** createNewGame stub function called ***");
    }

    private void talkto() {
        System.out.println("\n*** createNewGame stub function called ***");
    }

    private void bagContent() {
        System.out.println("\n*** createNewGame stub function called ***");
    }

    private void listWeapons() {
        System.out.println("\n*** createNewGame stub function called ***");
    }

    private void checkHenchmen() {
        System.out.println("\n*** createNewGame stub function called ***");
    }

    private void goTo() {
        System.out.println("\n*** createNewGame stub function called ***");
    }

    private void displayJournal() {
        System.out.println("\n*** createNewGame stub function called ***");
    }
    
    private void saveGame() {
        System.out.println("\n*** createNewGame stub function called ***");
    }

    private void quitGame() {
        System.out.println("\n*** createNewGame stub function called ***");
    }

    private void displayHelp() {
        System.out.println("\n*** createNewGame stub function called ***");
    }
}
