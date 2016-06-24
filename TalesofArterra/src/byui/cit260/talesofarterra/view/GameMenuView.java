/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.talesofarterra.view;
import byui.cit260.talesofarterra.control.MapControl;
import byui.cit260.talesofarterra.model.Game;
import byui.cit260.talesofarterra.model.Location;
import talesofarterra.TalesofArterra;
/**
 *
 * @author Portal
 */
public class GameMenuView extends View {

    public GameMenuView() {
            
       super("\n"
          +  "\n*****************************************************************"
          + "\n*                      GAME MENU                                *"
          + "\n*===============================================================*"
          + "\nMAP"
          + "\n*     KEY TO PRESS                           ACTION             *"
          + "\n*---------------------------------------------------------------*"
          + "\n*       \"X\"..................................EXPLORE          *"
          + "\n*       \"R\"..................................REST             *"
          + "\n*       \"B\"..................................LIST INVENTORY   *"
          + "\n*       \"C\"..................................CHECK CHARACTER  *"
          + "\n*       \"#\"..................................GO TO: LOCATION  *"
          + "\n*       \"J\"..................................DISPLAY JOURNAL  *"
          + "\n*       \"S\"..................................SAVE GAME        *"
          + "\n*       \"Q\"..................................QUIT GAME        *"
          + "\n*                                                               *"
          + "\n*       \"H\"..................................HELP             *"                    
          + "\n*****************************************************************");
    
   }

@Override
public boolean doAction(String choice) {
        choice = choice.toUpperCase();
        
           switch(choice)
           {
            
            case "X": 
                this.displayMap();
                break;
           
            case "R": 
                this.rest(); 
                break;
            
            case "B": 
                this.bagContent();
                break;
            
            case "C": 
                this.charSheet();
                break; 
                
            case "#": 
                this.goTo();
                break;
            
            case "J": 
                this.displayJournal();
                break;
            
            case "S": 
                this.saveGame();
                break;
           
            case "Q": 
                this.quitGame();
                break;
            
            case "H": 
                this.displayHelp();
                break;                                              
            default: 
                System.out.println( "ERROR: That is not a valid choice!" );
            }
           
           return false;

    }

    private void displayMap() {
        Game game = TalesofArterra.getGame();
        
        // get the map's dimensions
        MapControl mc = new MapControl();
        Location[][] locs = mc.createMap(game.getCurrentMap());
        
        System.out.println(game.getCurrentMap().name() + "\n");
        System.out.print("|");
        for (int j = 0; j < locs[0].length; j++) {
            System.out.print("--");
        }
        System.out.print("\n");
        for (int i = 0; i < locs.length; i++) {
            System.out.print("|");
            for (int j = 0; j < locs[0].length; j++) {
                // print location ID if a location is on the map
                if (locs[i][j] == null) {
                    System.out.print(" ");
                }
                else {
                    // print X if current location
                    if (locs[i][j] != game.getCurrentLocation()) {
                        System.out.print(locs[i][j].getLocationID());
                    }
                    else {
                        System.out.print("X");
                    }
                }
                // print a column separator
                System.out.print("|");
                // print end line
                if (j == locs[0].length - 1) {
                    System.out.print("\n");
                }
            }
            // print row separator
            System.out.print("|");
            for (int j = 0; j < locs[0].length; j++) {
                System.out.print("--");
            }
            System.out.print("\n");
        }
        
        for (int i = 0; i < locs.length; i++) {
            for (int j = 0; j < locs[0].length; j++) {
                if (locs[i][j] != game.getCurrentLocation() && locs[i][j] != null) {
                    System.out.println(locs[i][j].getLocationID() 
                            + " - " 
                            + locs[i][j].getDescription());
                }
            }
        }
    }

    private void rest() {
        RestView restView = new RestView();
        restView.display();
        restView.doAction("playerChar.ser");
    }
    private void bagContent() {
        System.out.println("\n*** bagContent stub function called ***");
    }

    private void charSheet() {
        CharacterRecord charSheet = new CharacterRecord();
        charSheet.display();
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
