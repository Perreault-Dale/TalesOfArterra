/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.talesofarterra.view;

/**
 *
 * @author Lucas
 */
public class HelpMenuView {
    
    private String promptListMember;
    
    public void helpMenuView()
    {
        this.displayMenu();
        this.promptListMember = "\nPlease select an option: ";
    }
    
    private void displayMenu()
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
}
