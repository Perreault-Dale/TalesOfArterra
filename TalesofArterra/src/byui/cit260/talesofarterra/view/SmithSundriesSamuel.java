/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.talesofarterra.view;

import byui.cit260.talesofarterra.exceptions.SceneControlException;
import byui.cit260.talesofarterra.model.Game;
import byui.cit260.talesofarterra.view.StoreView;
import talesofarterra.TalesofArterra;
/**
 *
 * @author Lucas
 */

    
 
public class SmithSundriesSamuel extends View {

    public SmithSundriesSamuel() {
        super("---------- What would you like to do? ----------\n\n"
                + "1 - Show Store Inventory\n"
                + "2 - Get back to your quest!\n"                
                );
        this.display();
    }
    
     @Override
    public boolean doAction(String value) {
        boolean done = false;
        StoreView storeView = new StoreView();
        
        try {
            int i = Integer.parseInt(value);
        } catch(NumberFormatException ne) {
            this.console.println("\nPlease select a valid entry (1-3)");
        }
        
        switch(value) {
            case "1": {
                StoreView sc = new StoreView();    
                sc.display();
                        try {
                            sc.storeInventory();
                            //SceneControl.storeInventory();
                        } catch(SceneControlException sce) {
                            ErrorView.display(this.getClass().getName(), "Error reading input: " + sce.getMessage());
                        }
        break;
            }
            case "2":
                done = true;
        }
        
        return done;
    }
}
