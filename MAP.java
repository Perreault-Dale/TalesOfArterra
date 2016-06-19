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

public class ExploredViewMenu extends View {

    public ExploredViewMenu(String displayMessage) {
       super("\n****************************************************************"
          + "\n*                        MAP MENU                              *"
          + "\n*                                                              *"         
          + "\n*==============================================================*"
          + "\n*                                                              *"
          + "\n*--------------------------------------------------------------*"
          + "\n* ______________________                                       *"               
          + "\n*|     __________       |                                     |*"
          + "\n*|    ||        ||      |                                     |*"
          + "\n*|    ||        ||      |__________                           |*"
          + "\n*|____||______  || _____|          |                          |*"
          + "\n*|      |     |D||D|               |                          |*"
          + "\n*|      |_                         |                          |*"
          + "\n*|      D_                         |                          |*"
          + "\n*|______|                          |                          |*"
          + "\n*|     |                           |                          |*"
          + "\n*|     |                           |                          |*"
          + "\n*|     |                           |                          |*"
          + "\n*|     |_________________________  |                          |*"
          + "\n*|                       ________|D|___________               |*"
          + "\n*|                      |                      |              |*"
          + "\n*|                      |            ________|D|_____         |*"
          + "\n*|                      |           |                |        |*"
          + "\n*|                      |           |                |        |*"
          + "\n*|                      |           |                |        |*"
          + "\n*|______________________|___________|_______|∏|______|________|*"
          + "\n********************************************|∏|*****************"
          + "\n*                D ----------- DOORWAY                         *"
          + "\n****************************************************************");
    }
    
    
     @Override
    public boolean doAction(String value) {
        
         return false;
        }
       
    
}
