/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.talesofarterra.view;

import byui.cit260.talesofarterra.control.CharacterControl;

/**
 *
 * @author Dale
 */
public class GenderView extends View {

    public GenderView() {
        super("\nSelect a gender for your human character:"
                + "\n\nM – Male"
                + "\nF – Female\n");
    }
    
    @Override
    public boolean doAction(String choice) {
        
        choice = choice.toUpperCase();
        CharacterControl charCtl = new CharacterControl();
        
        switch (choice) {
            case "M":
                charCtl.inputGender(playerChar,'M');
                return true;
            case "F":
                charCtl.inputGender(playerChar,'F');
                return true;
            default:
                System.out.println("\n*** Invalid selection *** Try again");
                break;
        }
        return false;
    }
}
