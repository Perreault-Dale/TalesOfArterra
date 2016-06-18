/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.talesofarterra.view;

/**
 *
 * @author Portal
 */
public class GameMenuView extends View {

    public GameMenuView() {
            
       super("n"
          +  "\n*****************************************************************"
          + "\n*                      GAME MENU                                *"
          + "\n*===============================================================*"
          + "\nMAP"
          + "\n*     KEY TO PRESS                           ACTION             *"
          + "\n*---------------------------------------------------------------*"
          + "\n*       \"X\"..................................EXPLORE          *"
          + "\n*       \"R\"..................................REST             *"
          + "\n*       \"T\"..................................TALK TO          *"
          + "\n*       \"B\"..................................LIST INVENTORY   *"
          + "\n*       \"W\"..................................CHECH CHARACTER  *"
          + "\n*       \"C\"..................................CHECK HENCHMEN   *"
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
        
       /* do
        {
           System.out.print( "Please enter an option: " );
           Scanner reader = new Scanner(System.in);
           choice = reader.next(".").charAt(0);
           */
           switch(choice)
           {
            
            case "X": 
                this.explore();
                break;
           
            case "R": 
                this.rest(); 
                break;
            
            case "T": 
                this.talkto();
                break;
            
            case "B": 
                this.bagContent();
                break;
            
            case "W": 
                this.charSheet();
                break;                          
            
            case "C": 
                this.checkHenchmen();
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

    private void explore() {
        System.out.println("\n*** createNewGame stub function called ***");
    }

    private void rest() {
        System.out.println("\n*** createNewGame stub function called ***");
    }

    private void talkto() {
        System.out.println("\n*** createNewGame stub function called ***");
    }

    private void bagContent() {
        System.out.println("\n*** createNewGame stub function called ***");
    }

    private void charSheet() {
        CharacterRecord charSheet = new CharacterRecord();
        charSheet.display();
    }

    private void checkHenchmen() {
        System.out.println("\n*** createNewGame stub function called ***");
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
