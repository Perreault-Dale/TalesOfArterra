/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.talesofarterra.view;
import byui.cit260.talesofarterra.control.GameControl;
import byui.cit260.talesofarterra.control.MapControl;
import byui.cit260.talesofarterra.model.Game;
import byui.cit260.talesofarterra.model.Location;
import byui.cit260.talesofarterra.exceptions.MapControlException;
import byui.cit260.talesofarterra.exceptions.SceneControlException;
import byui.cit260.talesofarterra.model.Map;
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
          + "\n*     KEY TO PRESS                           ACTION             *"
          + "\n*---------------------------------------------------------------*"
          + "\n*       \"D\"..................................REPLAY DIALOGUE   *"
          + "\n*       \"X\"..................................EXPLORE           *"
          + "\n*       \"R\"..................................REST              *"
          + "\n*       \"I\"..................................LIST INVENTORY    *"
          + "\n*       \"C\"..................................CHECK CHARACTER   *"
          + "\n*       \"L\"..................................GO TO: LOCATION   *"
          + "\n*       \"J\"..................................DISPLAY JOURNAL   *"
          + "\n*       \"B\"..................................DISPLAY SPELLS    *"
          + "\n*       \"S\"..................................SAVE GAME         *"
          + "\n*       \"Q\"..................................QUIT GAME         *"
          + "\n*---------------------------------------------------------------*"
          + "\n*       \"T\"..................................TEST MAP          *"
          + "\n*       \"E\"..................................Store Test        *"
          + "\n*       \"H\"..................................HELP              *"                    
          + "\n*****************************************************************");
    
   }

@Override
public boolean doAction(String choice) {
        choice = choice.toUpperCase();
        
           switch(choice)
           {
            
            case "D": 
                this.displayDialogue();
                break;
           
            case "X": 
                this.displayMap();
                break;
           
            case "R": 
                this.rest(); 
                break;
            
            case "I": 
                this.bagContent();
                break;
            
            case "C": 
                this.charSheet();
                break; 
                
            case "L": 
                this.goTo();
                break;
            
            case "J": 
                this.displayJournal();
                break;
                
            case "B":
                this.spellBook();
                break;
            
            case "S": 
                this.saveGame();
                break;
           
            case "Q": 
                return true;
            
            case "T": 
                this.testMap();
                break;
                
            case "E":
                this.storeMenu(); 
                break;
            case "H": 
                this.displayHelp();
                break;                                              
            default: 
                this.console.println( "ERROR: That is not a valid choice!" );
            }
           
           return false;

    }

    private void displayMap() {
        Game game = TalesofArterra.getGame();
        
        // get the map's dimensions
        MapControl mc = new MapControl();
        Location[][] locs;
        try {
            locs = mc.createMap(game.getCurrentMap());
            this.console.println(game.getCurrentMap().name() + "\n");
            this.console.print("|");
            for (int j = 0; j < locs[0].length; j++) {
                this.console.print("--");
            }
            this.console.print("\n");
            for (int i = 0; i < locs.length; i++) {
                this.console.print("|");
                for (int j = 0; j < locs[0].length; j++) {
                    // print location ID if a location is on the map
                    if (locs[i][j] == null) {
                        this.console.print(" ");
                    }
                    else {
                        // print X if current location
                        if (locs[i][j] != game.getCurrentLocation()) {
                            this.console.print(locs[i][j].getLocationID());
                        }
                        else {
                            this.console.print("X");
                        }
                    }
                    // print a column separator
                    this.console.print("|");
                    // print end line
                    if (j == locs[0].length - 1) {
                        this.console.print("\n");
                    }
                }
                // print row separator
                this.console.print("|");
                for (int j = 0; j < locs[0].length; j++) {
                    this.console.print("--");
                }
                this.console.print("\n");
            }
        
            for (int i = 0; i < locs.length; i++) {
                for (int j = 0; j < locs[0].length; j++) {
                    if (locs[i][j] != game.getCurrentLocation() && locs[i][j] != null) {
                        this.console.println(locs[i][j].getLocationID() 
                                + " - " 
                                + locs[i][j].getDescription());
                    }
                }
            }
        } catch (MapControlException ex) {
            ErrorView.display(this.getClass().getName(), "Error reading input: " + ex.getMessage());
        }
    }

    private void rest() {
        RestView restView = new RestView();
        restView.display();
        restView.doAction("playerChar.ser");
    }
    private void bagContent() {
        
        this.console.println("bag stuff");
        /*GameControl bag = new GameControl();
        bag.createBagList();
        
        StringBuilder line;
        
        Game game = TalesofArterra.getGame();
        BagItem[] bag = game.getBag();
        
        */
        
    }

    private void charSheet() {
        CharacterRecord charSheet = new CharacterRecord();
        charSheet.display();
    }

    private void goTo() {
        GoToLocation gtl = new GoToLocation();
        gtl.display();
    }

    private void displayJournal() {
        JournalView jv = new JournalView();
        jv.display();
    }
    
    private void saveGame() {
        this.console.println("Enter the name of the save file.");
        String fileName = this.getInput();
        try {
            GameControl.saveGame(TalesofArterra.getGame(), fileName);
        } catch(Exception ex) {
            ErrorView.display("GameMenuView",ex.getMessage());
        } finally {
            this.console.println("Your game saved successfully.");
        }
    }

    private void displayHelp() {
        this.console.println("\n*** displayHelp stub function called ***");
    }

    private void spellBook() {
        SpellListView slv = new SpellListView();
        slv.display();
    }

    private void testMap() {
        Game game = TalesofArterra.getGame();
        game.setCurrentMap(Map.NonWorking);
        TalesofArterra.setGame(game);
        displayMap();
        
        game.setCurrentMap(Map.NoLocations);
        TalesofArterra.setGame(game);
        displayMap();
    }
    
    private void storeMenu() {
        StoreView sc = new StoreView();    
        sc.display();
        try {
            sc.storeInventory();
            //SceneControl.storeInventory();
        } catch(SceneControlException sce) {
            ErrorView.display(this.getClass().getName(), "Error reading input: " + sce.getMessage());
        }
    }

    private void displayDialogue() {
        DisplayDialog dd = new DisplayDialog();
        DisplayDialog.display();
    }
}
