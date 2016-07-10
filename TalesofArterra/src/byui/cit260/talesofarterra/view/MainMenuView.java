/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.talesofarterra.view;

import byui.cit260.talesofarterra.control.GameControl;
import byui.cit260.talesofarterra.exceptions.CharacterControlException;
import java.io.File;
import java.io.FilenameFilter;
import talesofarterra.TalesofArterra;

/**
 *
 * @author Portal
 */
public class MainMenuView extends View {
    
    public MainMenuView(){

        //local variables.

        super("\n"

                + "\n--------------------------------------------"
                + "\n|  Main Menu                                |"
                + "\n--------------------------------------------"
                +"\nN - Start new game"
                +"\nG - Get and start saved game"
                +"\nH - Get help on how to play the game"
                +"\nS - Save game"
                +"\nQ - Quit"
                +"\n---------------------------------------------"
                +"\n ## Test Area menu options                 ##"
                +"\nB - Battle view test"
                +"\nM - Game Menu Test                           "
                +"\n                          "                
                +"\n---------------------------------------------");
    }
    

    @Override
    public boolean doAction(String choice) {

        
        choice = choice.toUpperCase();
       
        switch (choice) {
            case "N":
                this.startNewGame();
                return true;
            case "G":
                this.startExistingGame();
                return true;
            case "H":
                this.displayHelpMenu();
                break;
            case "S":
                this.saveGame();
                break;
            case "B":
                this.startBattleView();
                return true;
            case "M":
                this.startGameMenu();
                break;
            default:
                this.console.println("\n*** Invalid selection *** Try again");
                break;
            }
        return false;
        }

    private void startNewGame() {
        
        CharacterCreateView ccv = new CharacterCreateView();
        ccv.display();
        GenderView genderView = new GenderView();
        genderView.display();
        AbilitiesMenuView abv = new AbilitiesMenuView(30);
        abv.display();
        SkillsView skillView = new SkillsView();
        skillView.display();
        FeatsMenuView featsView = new FeatsMenuView();
        featsView.display();
        
        GameControl gameControlObject = new GameControl();
        try {
            gameControlObject.createNewGame(TalesofArterra.getPlayer());
        } catch (CharacterControlException ex) {
            ErrorView.display(this.getClass().getName(), "Error reading input: " + ex.getMessage());
        }
        
        GameMenuView gameMenu = new GameMenuView();
        gameMenu.display();
        }

    private void startExistingGame() {
        File folder = new File(".");
        File [] files = folder.listFiles(new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {
                return name.endsWith(".sav");
            }
        });
        for (File saveGame : files) {
            this.console.println(saveGame);
        }
        this.console.println("Please type the name of the game you wish to restart:");
        String saveFile = this.getInput();
        
        try {
            GameControl.loadGame(saveFile);
        } catch(Exception ex) {
            ErrorView.display("MainMenuView", ex.getMessage());
        }
        
        GameMenuView gameMenu = new GameMenuView();
        gameMenu.display();
    }

    private void displayHelpMenu() {
        HelpMenuView getMeHelp = new HelpMenuView();
        getMeHelp.display();
    }

    private void saveGame() {
        this.console.println("\n*** saveGame function called ***");
    }
    
    private void startBattleView() {
        BattleView battleViewObject = new BattleView();
        battleViewObject.display();
    }
    private void startGameMenu() {
        
        GameMenuView gameMenuViewObject = new GameMenuView ();
        gameMenuViewObject.display();
    }
}


