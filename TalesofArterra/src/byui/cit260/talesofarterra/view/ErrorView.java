
package byui.cit260.talesofarterra.view;

import java.io.*;
import talesofarterra.TalesofArterra;

/**
 *
 * @author Carlos
 */
public class ErrorView {
    
    private static final PrintWriter errorFile = TalesofArterra.getOutFile();
    private static final PrintWriter logFile = TalesofArterra.getLogFile();
    public static void display(String className, String errorMessage) {
        
        errorFile.println(
                    "----------------------------------------------------"
                + "\n- ERROR - " + errorMessage
                + "\n----------------------------------------------------");
        //log error
        logFile.println(className + " - " + errorMessage);
    }
    
}
