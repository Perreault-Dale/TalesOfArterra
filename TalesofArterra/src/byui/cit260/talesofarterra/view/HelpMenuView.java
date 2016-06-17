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

public class HelpMenuView extends View {
    
    public HelpMenuView() {
      super("\n****************************************************************"
          + "\n*                      HELP MENU                               *"
          + "\n*==============================================================*"
          + "\n*     KEY TO PRESS                           ACTION            *"
          + "\n*--------------------------------------------------------------*"
          + "\n*       \"O\"..................................OBJECTIVE       *"
          + "\n*       \"M\"..................................MOVEMENT        *"
          + "\n*       \"H\"..................................HENCHMEN        *"
          + "\n*       \"R\"..................................RESTING/HEALING *"
          + "\n*       \"B\"..................................BACK TO GAME    *"
          + "\n****************************************************************"
          + "\n*                  Please enter an option:                     *" );
    }
    
    @Override
    public boolean doAction(String value)
    {
        boolean exit = false;
        
          switch(value)
           {
            case "O":
            case "o": objective();
                      break;
            case "M":
            case "m": movement();
                      break;
            case "H":
            case "h": henchmen();
                          break;
            case "R":
            case "r": resting();
                          break;
            case "B":
            case "b": exit = true;
                      break;
            default: System.out.println( "ERROR: That is not a valid value!" );
            }
                 /*(!"o".equals(value) || !"O".equals(value) 
                   || !"m".equals(value) || !"M".equals(value)
                   || !"h".equals(value) || !"H".equals(value)
                   || !"r".equals(value) || !"R".equals(value)
                   || !"b".equals(value) || !"B".equals(value));
                 */
        return exit;
    }


    private void objective() {
        System.out.println("\n*** objective stub function called ***");
    }

    private void movement() {
        System.out.println("\n*** movement stub function called ***");
    }

    private void henchmen() {
        System.out.println("\n*** henchmen stub function called ***");
    }

    private void resting() {
        System.out.println("\n*** resting stub function called ***");
    }
}
 
