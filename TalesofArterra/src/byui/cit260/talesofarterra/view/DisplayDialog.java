/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.talesofarterra.view;

import byui.cit260.talesofarterra.control.LocationControl;
import java.io.BufferedReader;
import java.io.PrintWriter;
import java.util.concurrent.TimeUnit;
import talesofarterra.TalesofArterra;

/**
 *
 * @author Dale
 */
class DisplayDialog {

    protected static final PrintWriter console = TalesofArterra.getOutFile();
    
    static void display() {
        LocationControl lc = new LocationControl();
        String[] dialog = TalesofArterra.getGame().getDialogue();
        
        if (dialog.length > 0) {
            for (String line : dialog) {
                line = replaceText(line);
                console.println(line);
                try {
                    TimeUnit.MILLISECONDS.sleep(500);
                } catch (InterruptedException ex) {
                    ErrorView.display("DisplayDialog", "Error reading input: " + ex.getMessage());
                }
            }
        } else {
            console.println("No dialogue for this location.");
        }
    }

    private static String replaceText(String line) {
        String firstName = null;
        String name = TalesofArterra.getGame().getPlayer().getPlayerChar().getName();
        
        if (name.contains(" ")) {
            firstName = name.substring(0,name.indexOf(" "));
        } else {
            firstName = name;
        }
        line = line.replace("<FirstName>",firstName);
        
        if (TalesofArterra.getGame().getPlayer().getPlayerChar().getGender() == 'M') {
            line = line.replace("<lad/lass>","lad");
        } else {
            line = line.replace("<lad/lass>","lass");
        }
        return line;
    }
    
}
