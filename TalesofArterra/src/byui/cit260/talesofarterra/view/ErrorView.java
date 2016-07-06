
package byui.cit260.talesofarterra.view;

import java.io.PrintWriter;

/**
 *
 * @author Carlos
 */
public class ErrorView {
    
    private static final PrintWriter errorFile = talesofarterra.TalesofArterra.getOutFile();
    private static final PrintWriter logFile = talesofarterra.TalesofArterra.getLogFile();
    public static void display(String className, String errorMessage) {
        
        errorFile.println(
                    "----------------------------------------------------"
                + "\n- ERROR - " + errorMessage
                + "\n----------------------------------------------------");
        //log error
        logFile.println(className + " - " + errorMessage);
    }
    
}
